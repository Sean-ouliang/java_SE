package file;

import java.io.File;

/**
 * ����һ���༶Ŀ¼
 * @author tarena
 *
 */
public class MkDirsDemo {
	public static void main(String[] args){
		/*
		 * �ڵ�ǰĿ¼�´�����a/b/c/d/e/f
		 */
		File dirs = new File("a/b/c/e/f");
		/*
		 * mkdir�ڴ���Ŀ¼��Ҫ�������ڸ�Ŀ¼�������
		 * mkdirs��Ὣ���в����ڵĸ�Ŀ¼һͬ��������
		 */
		if(!dirs.exists()){
			dirs.mkdirs();
			System.out.println("�������");
		}else{
			System.out.println("Ŀ¼�Ѵ���");
		}
	}
}
