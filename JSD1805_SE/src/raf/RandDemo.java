package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ��ȡһ���ֽ�
 * @author tarena
 *
 */
public class RandDemo {
	public static void main(String[] args) throws IOException{
		RandomAccessFile raf = new RandomAccessFile("raf.dat","r");
		/*
		 * int read()
		 * ���ļ���ǰָ��λ�ö�ȡ1���ֽڣ���ȡ����int
		 * ��ʽ���ء�����ȡ���ļ�ĩβ���򷵻�ֵΪ-1.
		 * 
		 * 00000000 00000000 00000000 00000001
		 */
		int d = raf.read();
		System.out.println(d);
		//��ͼ��ȡ�ڶ����ֽ�
		d = raf.read();
		System.out.println(d);
		raf.close();
	}
}
