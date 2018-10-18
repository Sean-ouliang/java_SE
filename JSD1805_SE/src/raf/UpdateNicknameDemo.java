package raf;
import java.util.Arrays;
import java.util.Scanner;
import java.io.IOException;
import java.io.RandomAccessFile;
/**
 * �޸��ǳƲ���
 * 
 * Ҫ������Ҫ�޸��ǳƵ��û������Լ����ǳƣ�Ȼ�����޸ġ�
 * ��������û�����Ч������ʾû�д��û�
 * @author tarena
 *
 */
public class UpdateNicknameDemo {
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		System.out.println("�������û�����");
		String name = scan.nextLine();
		System.out.println("�������ǳƣ�");
		String nickname = scan.nextLine();
		RandomAccessFile raf = new RandomAccessFile("user.dat","rw");
		for(int i=0;i<raf.length()/100;i++){
			raf.seek(i*100);
			byte[] data = new byte[32];
			raf.read(data);
			String username = new String(data,"UTF-8").trim();
			if(username.equals(name)){
				raf.seek(i*100+64);
				data = nickname.getBytes("UTF-8");
				data = Arrays.copyOf(data,32);
				raf.write(data);
				System.out.println("�޸ĳɹ�");
				return;
			}
		}
		System.out.println("û�д��û�");
		raf.close();
	}
}
