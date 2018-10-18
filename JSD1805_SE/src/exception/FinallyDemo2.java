package exception;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * fianlly��IO�е�Ӧ��
 * @author tarena
 *
 */
public class FinallyDemo2 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		try{
			fos = new FileOutputStream("fos.dat");
			fos.write(1);
		}catch(Exception e){
			System.out.println("�����ˣ�");
		}finally{
			try {
				if(fos!=null){
					fos.close();
				}
			} catch (IOException e) {
			}
		}
	}
}
