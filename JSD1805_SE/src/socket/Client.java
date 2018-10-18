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
 * �����ҿͻ���
 * @author tarena
 *
 */
public class Client {
	/*
	 * Socket ���ķ��룺�׽���
	 * Socket��װ��TCPЭ���ͨѶϸ�ڣ�Ϊ�����ṩ�˼��
	 * ��ʵ�ֹ��̣�ͨ�������������������Զ�˼����֮��
	 * �����ݴ��䡣
	 */
	private Socket socket;
	
	/**
	 * ���췽����������ʼ���ͻ���
	 */
	public Client(){
		try {
			/*
			 * ʵ����Socketʱ��Ҫ������������������ʵ��
			 * ���Ĺ��̾�����Զ�˼�����������ӵĹ��̡�
			 * ��Զ�˼����û����Ӧ�����׳��쳣��
			 * ����1��Զ�˼������ַ��Ϣ��IP��
			 * ����2��Զ�˼���������Ķ˿�
			 */
			System.out.println("�������ӷ����...");
			socket = new Socket("localhost",8088);
			System.out.println("�����˽������ӣ�");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * �ͻ��˿�ʼ�����ķ���
	 */
	public void start(){
		try {
			Scanner scan = new Scanner(System.in);
			/*
			 * Socket�ṩ������
			 * outputStream getOutputStream()
			 * �÷�����ȡһ���ֽ��������ͨ���������д
			 * �����ֽڻ�ͨ�����緢�͸�Զ�˼������
			 */
			while(true){
				OutputStream out = socket.getOutputStream();
				OutputStreamWriter osw = new OutputStreamWriter(out,"UTF-8");
				BufferedWriter bw = new BufferedWriter(osw);
				PrintWriter pw = new PrintWriter(bw,true);
				
				ServerHandler handler = new ServerHandler();
				Thread t = new Thread(handler);
				t.start();
				
				//д�������͸������
				System.out.println("���������ݣ�");
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
		//ʵ����
		Client client = new Client();
		//�����ͻ���
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
				//��ȡ����˷��ͻ�����һ���ַ���
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
