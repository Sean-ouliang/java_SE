package file;

import java.io.File;
import java.io.FileFilter;

/**
 * File�ṩ��һ�����ص�listFiles���������Դ���һ��
 * �ļ���������Ȼ�����ʾ��Ŀ¼�����������Ҫ���
 * ����ء�
 * 
 * File[] listFiles(FileFilter filter)
 * 
 * @author tarena
 *
 */
public class ListFileDemo2 {
	public static void main(String[] args){
		File dir = new File(".");//��.����ʾ��ǰ�ļ�Ŀ¼
		/*
		 * ��ȡ��ǰĿ¼�����������ԡ�.����ͷ������
		 */
//		FileFilter filter = new FileFilter(){
//			public boolean accept(File file) {
//				return file.getName().startsWith(".");
//			}
//		};
		FileFilter filter = new FileFilter(){
			public boolean accept(File file) {
				return file.isFile();
			}
		};
		File[] subs = dir.listFiles(filter);
		for(int i=0;i<subs.length;i++){
			System.out.println(subs[i].getName());
		}
	}
}
