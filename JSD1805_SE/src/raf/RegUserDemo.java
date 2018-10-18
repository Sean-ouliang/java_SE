package raf;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;
/**
 * ʹ��RAFʵ���û�ע�Ṧ��
 * ����������Ҫ���û�����������Ϣ��
 * �û��������룬�ǳƣ����䡣����������intֵ����������
 * �ַ�����
 * Ȼ�󽫸��û���Ϣд��user.dat�ļ��б��档
 * 
 * ÿ����¼ռ�ù̶�100�ֽڡ�
 * �����û��������룬�ǳƸ�ռ32�ֽڣ�������intֵ�̶���
 * 4���ֽڡ�
 * �ַ������׿��Է���ı༭�ַ������ݣ�����ÿ����¼�ĸ�ʽ
 * Ҳͳһ��
 * @author tarena
 *
 */
public class RegUserDemo {
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		System.out.println("��ӭע��");
		System.out.println("�������û�����");
		String name = scan.nextLine();
		System.out.println("���������룺");
		String password = scan.nextLine();
		System.out.println("�������ǳƣ�");
		String nickname = scan.nextLine();
		System.out.println("���������䣺");
		int age = Integer.parseInt(scan.nextLine());
		RandomAccessFile raf = new RandomAccessFile("user.dat","rw");
		raf.seek(raf.length());
		//д�û���
		byte[] data = name.getBytes("UTF-8");
		data = Arrays.copyOf(data,32);
		raf.write(data);
		//д����
		data = password.getBytes("UTF-8");
		data = Arrays.copyOf(data,32);
		raf.write(data);
		//д�ǳ�
		data = nickname.getBytes("UTF-8");
		data = Arrays.copyOf(data,32);
		raf.write(data);
		//д����
		raf.writeInt(age);
		System.out.println("pos:"+raf.getFilePointer());
		raf.close();
	}
}
