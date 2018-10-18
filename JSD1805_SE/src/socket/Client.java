package socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;


/**
 * 聊天室客户端
 * @author tarena
 *
 */
public class Client {
	/*
	 * Socket 中文翻译：套接字
	 * Socket封装了TCP协议的通讯细节，为我们提供了简洁
	 * 的实现过程，通过操作两个流来完成与远端计算机之间
	 * 的数据传输。
	 */
	private Socket socket;
	
	/**
	 * 构造方法，用来初始化客户端
	 */
	public Client(){
		try {
			/*
			 * 实例化Socket时需要传入两个参数，并且实例
			 * 化的过程就是与远端计算机建立连接的过程。
			 * 若远端计算机没有响应，会抛出异常。
			 * 参数1：远端计算机地址信息（IP）
			 * 参数2：远端计算机开启的端口
			 */
			System.out.println("正在连接服务端...");
			socket = new Socket("localhost",8088);
			System.out.println("与服务端建立连接！");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 客户端开始工作的方法
	 */
	public void start(){
		try {
			Scanner scan = new Scanner(System.in);
			/*
			 * Socket提供方法：
			 * outputStream getOutputStream()
			 * 该方法获取一个字节输出流，通过该输出流写
			 * 出的字节会通过网络发送给远端计算机。
			 */
			while(true){
				OutputStream out = socket.getOutputStream();
				OutputStreamWriter osw = new OutputStreamWriter(out,"UTF-8");
				BufferedWriter bw = new BufferedWriter(osw);
				PrintWriter pw = new PrintWriter(bw,true);
				
				ServerHandler handler = new ServerHandler();
				Thread t = new Thread(handler);
				t.start();
				
				//写出即发送给服务端
				System.out.println("请输入内容：");
				while(true){
					String line = scan.nextLine();
					pw.println(line);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args){
		//实例化
		Client client = new Client();
		//启动客户端
		client.start();
	}
	
	private class ServerHandler implements Runnable{
		public void run(){
			try{
				BufferedReader br = new BufferedReader(
						new InputStreamReader(
								socket.getInputStream(),"UTF-8"
						)
				);
				
				String message = null;
				//读取服务端发送回来的一行字符串
				while((message=br.readLine())!=null){
					System.out.println(message);
				}
			}catch(Exception e){
				
			}finally{
				try {
					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
