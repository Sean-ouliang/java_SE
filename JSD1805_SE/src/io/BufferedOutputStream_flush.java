package io;

import java.io.IOException;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;

/**
 * ����������Ļ���������
 * @author tarena
 *
 */
public class BufferedOutputStream_flush {
	public static void main(String[] args) throws IOException{
		FileOutputStream fos = new FileOutputStream("bos.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		String str = "ʦ�����Ҽ�ֲ�ס�ˣ�";
		byte[] data = str.getBytes("UTF-8");
		bos.write(data);
		/*
		 * void flush()
		 * �������ṩ��ǿ����ջ������Ĳ�����ǿ��flush
		 * �Ὣ��ǰ�������Ѿ�������ֽ�һ����д��
		 */
		bos.flush();
		System.out.println("д����ϣ�");
		bos.close();
	}
}
