package socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

/**
 * 聊天室服务端
 * @author tarena
 *
 */
public class Server {
	/*
	 * java.net.ServerSocket
	 * 运行在服务端的ServerSocket主要有两个作用
	 * 1、向服务端所在系统申请一个服务端口
	 *   客户端就是通过这个端口与服务端建立连接的
	 * 2、监听该服务端口，一旦一个客户端通过该端口与
	 *   服务端建立连接，那么ServerSocket就会自动的
	 *   创建一个Socket与客户端进行通讯。
	 */
	private ServerSocket server;
	/*
	 * 保存所有ClientHandler里面的输出流，用于它们之间
	 * 转发消息所有客户端使用
	 * 由于内部类可以访问外部类的属性，所有的ClientHandler
	 * 都是有Server实例化出来的，那么这些ClientHandler
	 * 都可以看到这个数组，所以，将他们各自对应的客户端的
	 * 输出流放入数组，那么无论哪个ClientHandler遍历
	 * 这个数组都可以得到所有客户端的输出流，从而将消息
	 * 发送给所有客户端。
	 */
	private PrintWriter[] allOut = {};
	
	/**
	 * 构造方法
	 */
	public Server(){
		try {
			/*
			 * 实例化ServerSocket的同时要指定向系统
			 * 申请的服务端口。注意，该端口不能与当前
			 * 系统其它应用程序申请的端口号一致，否则
			 * 会抛出端口被占用的异常。
			 */
			System.out.println("正在启动服务端...");
			server = new ServerSocket(8088);
			System.out.println("服务端启动完毕！");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 服务端启动方法
	 */
	public void start(){
		try {
			/*
			 * ServerSocket提供的方法：
			 * Socket accept()
			 * 该方法是一个阻塞方法，调用后服务端开始
			 * 监听服务端口，一旦一个客户端通过该端口
			 * 请求连接，就会创建并返回一个Socket实例
			 * 通过这个Socket就可以与刚建立连接的这个
			 * 客户端进行通讯了。
			 */
			while(true){
				System.out.println("等待客户端连接...");
				Socket socket = server.accept();
				System.out.println("一个客户端连接了！");
				//创建一个线程与该客户端交互
				ClientHandler handler = new ClientHandler(socket);
				Thread t = new Thread(handler);
				t.start();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args){
		Server server = new Server();
		server.start();
	}
	
	private class ClientHandler implements Runnable{
		//当前线程通过该Socket与指定客户端交互
		private Socket socket;
		//记录客户端地址信息
		private String host;
		
		//创建时需要将Socket传入，以便对该客户端交互
		public ClientHandler(Socket socket){
			this.socket = socket;
			//通过socket获取远端（客户端）的地址信息
			InetAddress address = socket.getInetAddress();
			host = address.getHostAddress();
		}
		public void run(){
			PrintWriter pw = null;
			try {
				InputStream in = socket.getInputStream();
				InputStreamReader isr = new InputStreamReader(in,"UTF-8");
				BufferedReader br = new BufferedReader(isr);
				String message = null;
				
				//通过Socket获取输出流，用于回复客户端消息
				pw = new PrintWriter(
						new BufferedWriter(
								new OutputStreamWriter(
										socket.getOutputStream(),"UTF-8"
								)
						),true
				);
				synchronized(allOut){
					//数组扩容
					allOut = Arrays.copyOf(allOut,allOut.length+1);
					//将该输出流存到数组最后一个位置
					allOut[allOut.length-1] = pw;
					System.out.println(host+"上线了，当前在线"+allOut.length+"人");
				}
				/*
				 * 通过输入流读取远端计算机发送过来的信息时
				 * br.readLine方法对于不同系统的客户端断开
				 * 时的反应不一样。
				 * windows的客户端断开时，会直接抛出异常
				 * linux的客户端断开时，会返回null
				 */
				/*
				 * socket.getInputStream:该方法为阻塞方法，
				 * 导致br.readLine()形成阻塞，所以不会跳出while循环
				 */
				while((message=br.readLine())!=null){
					System.out.println(host+"说:"+message);
					synchronized(allOut){
						//遍历共享数组，给所有客户端回复
						for(PrintWriter out:allOut){
							out.println(host+"说:"+message);
						}
					}
				}
			} catch (Exception e) {
			} finally {
				//在这里处理客户端断开连接后的操作
				
				/*
				 * 1先将该客户端的输出流从allOut中删除
				 * 这样其他的ClientHandler在读取到消息
				 * 后就不会发送给这个客户端了
				 */
				synchronized(allOut){
					for(int i=0;i<allOut.length;i++){
						if(allOut[i]==pw){
							allOut[i] = allOut[allOut.length-1];
							allOut = Arrays.copyOf(allOut,allOut.length-1);
							break;
						}
					}
				}
				System.out.println(host+"下线了，当前在线"+allOut.length+"人");
				/*
				 * 2当该客户端断开连接，那么服务端这边
				 * 也应当把对应的Socket关闭，释放资源
				 */
				try {
					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
