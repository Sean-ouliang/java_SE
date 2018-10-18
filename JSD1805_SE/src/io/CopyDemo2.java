package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ������
 * java.io.BufferedOutputStream
 * java.io.BufferedInputStream
 * 
 * ��������һ�Ը߼��������Լӿ��д���ݵ�Ч�ʡ���������
 * ͨ�����������е��������д���ǿ��д�����ն��ᱻ������
 * ת��Ϊ���д������
 * @author tarena
 *
 */
public class CopyDemo2 {
	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream("linux.exe");
		BufferedInputStream bis = new BufferedInputStream(fis);
		FileOutputStream fos = new FileOutputStream("linux_cp1.exe");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		int d = -1;
		while((d=bis.read())!=-1){
			bos.write(d);
		}
		System.out.println("������ϣ�");
		bis.close();
		bos.close();
	}
}
