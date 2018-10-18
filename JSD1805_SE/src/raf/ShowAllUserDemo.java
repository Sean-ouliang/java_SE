package raf;
import java.io.IOException;
import java.io.RandomAccessFile;
/**
 * ��ʾ����ע���û���Ϣ
 * @author tarena
 *
 */
public class ShowAllUserDemo {
	public static void main(String[] args) throws IOException{
		RandomAccessFile raf = new RandomAccessFile("user.dat","rw");
		for(int i=0;i<raf.length()/100;i++){
			//���û���
			byte[] data = new byte[32];
			raf.read(data);//һ���Զ�ȡ32�ֽ�
			String name = new String(data,"UTF-8").trim();
			//��ȡ����
			raf.read(data);
			String password = new String(data,"UTF-8").trim();
			//��ȡ�ǳ�
			raf.read(data);
			String nickname = new String(data,"UTF-8").trim();
			//��ȡ����
			int age = raf.readInt();
			System.out.println(name+","+password+","+nickname+","+age);
		}
		raf.close();
	}
}
