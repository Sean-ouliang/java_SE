package io;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * �ļ�������
 * @author tarena
 *
 */
public class FileInputStreamDemo {
	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream("fos.txt");
		byte[] data = new byte[100];
		int len = fis.read(data);
		System.out.println("ʵ�ʶ�ȡ��"+len+"���ֽ�");
		String str = new String(data,0,len,"UTF-8");
		System.out.println(str);
		fis.close();
	}
}
