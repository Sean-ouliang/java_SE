package file;

import java.io.File;

/**
 * ɾ��һ��Ŀ¼
 * @author tarena
 *
 */
public class DeleteDirDemo {
	public static void main(String[] args){
		File dir = new File("demo");
		if(dir.exists()){
			/*
			 * ɾ��Ŀ¼��ǰ�������ǣ���Ŀ¼������һ��
			 * ��Ŀ¼
			 */
			dir.delete();
			System.out.println("ɾ�����");
		}else{
			System.out.println("Ŀ¼������");
		}
	}
}
