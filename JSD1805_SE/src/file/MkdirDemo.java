package file;

import java.io.File;

/**
 * ����һ��Ŀ¼
 * @author tarena
 *
 */
public class MkdirDemo {
	public static void main(String[] args){
		/*
		 * �ڵ�ǰĿ¼�д���һ��Ŀ¼��demo
		 */
		File dir = new File("demo");
		if(!dir.exists()){
			dir.mkdir();
			System.out.println("Ŀ¼�Ѵ���");
		}else{
			System.out.println("Ŀ¼�Ѵ���");
		}
	}
}
