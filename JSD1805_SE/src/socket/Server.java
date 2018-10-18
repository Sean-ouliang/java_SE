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
 * �����ҷ����
 * @author tarena
 *
 */
public class Server {
	/*
	 * java.net.ServerSocket
	 * �����ڷ���˵�ServerSocket��Ҫ����������
	 * 1������������ϵͳ����һ������˿�
	 *   �ͻ��˾���ͨ������˿������˽������ӵ�
	 * 2�������÷���˿ڣ�һ��һ���ͻ���ͨ���ö˿���
	 *   ����˽������ӣ���ôServerSocket�ͻ��Զ���
	 *   ����һ��Socket��ͻ��˽���ͨѶ��
	 */
	private ServerSocket server;
	/*
	 * ��������ClientHandler��������������������֮��
	 * ת����Ϣ���пͻ���ʹ��
	 * �����ڲ�����Է����ⲿ������ԣ����е�ClientHandler
	 * ������Serverʵ���������ģ���ô��ЩClientHandler
	 * �����Կ���������飬���ԣ������Ǹ��Զ�Ӧ�Ŀͻ��˵�
	 * ������������飬��ô�����ĸ�ClientHandler����
	 * ������鶼���Եõ����пͻ��˵���������Ӷ�����Ϣ
	 * ���͸����пͻ��ˡ�
	 */
	private PrintWriter[] allOut = {};
	
	/**
	 * ���췽��
	 */
	public Server(){
		try {
			/*
			 * ʵ����ServerSocket��ͬʱҪָ����ϵͳ
			 * ����ķ���˿ڡ�ע�⣬�ö˿ڲ����뵱ǰ
			 * ϵͳ����Ӧ�ó�������Ķ˿ں�һ�£�����
			 * ���׳��˿ڱ�ռ�õ��쳣��
			 */
			System.out.println("�������������...");
			server = new ServerSocket(8088);
			System.out.println("�����������ϣ�");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * �������������
	 */
	public void start(){
		try {
			/*
			 * ServerSocket�ṩ�ķ�����
			 * Socket accept()
			 * �÷�����һ���������������ú����˿�ʼ
			 * ��������˿ڣ�һ��һ���ͻ���ͨ���ö˿�
			 * �������ӣ��ͻᴴ��������һ��Socketʵ��
			 * ͨ�����Socket�Ϳ�����ս������ӵ����
			 * �ͻ��˽���ͨѶ�ˡ�
			 */
			while(true){
				System.out.println("�ȴ��ͻ�������...");
				Socket socket = server.accept();
				System.out.println("һ���ͻ��������ˣ�");
				//����һ���߳���ÿͻ��˽���
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
		//��ǰ�߳�ͨ����Socket��ָ���ͻ��˽���
		private Socket socket;
		//��¼�ͻ��˵�ַ��Ϣ
		private String host;
		
		//����ʱ��Ҫ��Socket���룬�Ա�Ըÿͻ��˽���
		public ClientHandler(Socket socket){
			this.socket = socket;
			//ͨ��socket��ȡԶ�ˣ��ͻ��ˣ��ĵ�ַ��Ϣ
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
				
				//ͨ��Socket��ȡ����������ڻظ��ͻ�����Ϣ
				pw = new PrintWriter(
						new BufferedWriter(
								new OutputStreamWriter(
										socket.getOutputStream(),"UTF-8"
								)
						),true
				);
				synchronized(allOut){
					//��������
					allOut = Arrays.copyOf(allOut,allOut.length+1);
					//����������浽�������һ��λ��
					allOut[allOut.length-1] = pw;
					System.out.println(host+"�����ˣ���ǰ����"+allOut.length+"��");
				}
				/*
				 * ͨ����������ȡԶ�˼�������͹�������Ϣʱ
				 * br.readLine�������ڲ�ͬϵͳ�Ŀͻ��˶Ͽ�
				 * ʱ�ķ�Ӧ��һ����
				 * windows�Ŀͻ��˶Ͽ�ʱ����ֱ���׳��쳣
				 * linux�Ŀͻ��˶Ͽ�ʱ���᷵��null
				 */
				/*
				 * socket.getInputStream:�÷���Ϊ����������
				 * ����br.readLine()�γ����������Բ�������whileѭ��
				 */
				while((message=br.readLine())!=null){
					System.out.println(host+"˵:"+message);
					synchronized(allOut){
						//�����������飬�����пͻ��˻ظ�
						for(PrintWriter out:allOut){
							out.println(host+"˵:"+message);
						}
					}
				}
			} catch (Exception e) {
			} finally {
				//�����ﴦ��ͻ��˶Ͽ����Ӻ�Ĳ���
				
				/*
				 * 1�Ƚ��ÿͻ��˵��������allOut��ɾ��
				 * ����������ClientHandler�ڶ�ȡ����Ϣ
				 * ��Ͳ��ᷢ�͸�����ͻ�����
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
				System.out.println(host+"�����ˣ���ǰ����"+allOut.length+"��");
				/*
				 * 2���ÿͻ��˶Ͽ����ӣ���ô��������
				 * ҲӦ���Ѷ�Ӧ��Socket�رգ��ͷ���Դ
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
