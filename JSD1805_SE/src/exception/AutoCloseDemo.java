package exception;

import java.io.FileOutputStream;

/**
 * ��JDK1.7֮���Ƴ���һ���µ����ԣ��Զ��رա�
 * @author tarena
 *
 */
public class AutoCloseDemo {
	public static void main(String[] args) {
		try(
			/*
			 * ʵ����AutoCloseable�ӿڵĶ��������
			 * ���տ��Ա��Զ��ر�
			 * ʵ��������Ĵ���ᱻ�������ڱ���ʱ�޸�
			 * Ϊ���ƣ�FinallyDemo2���������
			 */
			FileOutputStream fos = new FileOutputStream("fos.dat");	
		){
			fos.write(1);
		}catch(Exception e){
			System.out.println("�����ˣ�");
		}
	}
}
