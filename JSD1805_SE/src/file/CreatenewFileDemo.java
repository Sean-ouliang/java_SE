package file;

import java.io.IOException;
import java.io.File;
/**
 * ʹ��File����һ���ļ�
 * @author tarena
 *
 */
public class CreatenewFileDemo {
	public static void main(String[] args) throws IOException{
		/*
		 * �ڵ�ǰĿ¼�´���test.txt�ļ�
		 */
		File file = new File("./test.txt");
		/*
		 * boolean exists()
		 * �жϵ�ǰFile��ʾ���ļ���Ŀ¼�Ƿ����
		 */
		if(!file.exists()){
			/*
			 * ����ǰFile��ʾ���ļ�����
			 */
			file.createNewFile();
			System.out.println("�ļ��Ѵ���");
		}else{
			System.out.println("�ļ��Ѵ���");
		}
	}
}
