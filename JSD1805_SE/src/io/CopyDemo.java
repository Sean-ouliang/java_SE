package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ʹ���ļ��������ļ�
 * @author tarena
 *
 */
public class CopyDemo {
	public static void main(String[] args) throws IOException{
		/*
		 * 1�������ļ�����������ȡԭ�ļ�
		 * 2�������ļ�����������ļ�д
		 * 3��˳���ԭ�ļ���ȡ�ֽ�д�븴���ļ�����ɸ��Ʋ�����
		 */
		FileInputStream fis = new FileInputStream("linux.exe");
		FileOutputStream fos = new FileOutputStream("linux_copy.exe");//�ڴ���ʱ�ŻḲ�ǣ��������ǲ��Ḳ�ǵģ�Ҳ����д��true��
		byte[] data = new byte[1024*10];
		int len = -1;
		while((len=fis.read(data))!=-1){
			fos.write(data,0,len);
		}
		System.out.println("������ϣ�");
		fis.close();
		fos.close();
	}
}
