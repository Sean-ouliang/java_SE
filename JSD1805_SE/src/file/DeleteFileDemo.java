package file;

import java.io.File;

/**
 * ɾ��һ���ļ�
 * @author tarena
 *
 */
public class DeleteFileDemo {
	public static void main(String[] args){
		/*
		 * ����ǰĿ¼�µ�test.txt�ļ�ɾ��
		 * 
		 * ��./����д��Ĭ��Ҳ���ڵ�ǰĿ¼��
		 */
		File file  =new File("test.txt");
		if(file.exists()){
			file.delete();
			System.out.println("�ļ���ɾ��");
		}else{
			System.out.println("�ļ�������");
		}
	}
}
