package file;

import java.io.File;

/**
 * ��ȡһ��Ŀ¼�е�����
 * @author tarena
 *
 */
public class ListfilesDemo {
	public static void main(String[] args){
		/*
		 * ��ȡ��ǰĿ¼�е���������
		 */
		File dir = new File(".");
		/*
		 * boolean isFile()
		 * �жϵ�ǰfile�Ƿ��ʾ�����ļ�
		 * 
		 * boolean isDirectory()
		 * �ж��Ƿ��ʾ����Ŀ¼
		 */
		if(dir.isDirectory()){
			File[] subs = dir.listFiles();
			System.out.println("sub:"+subs.length);
			for(int i=0;i<subs.length;i++){
				System.out.println(subs[i].getName());
			}
		}
	}
}
