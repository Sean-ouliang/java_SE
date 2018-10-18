package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ���ļ���д���ַ���
 * @author tarena
 *
 */
public class WriteStringDemo {
	public static void main(String[] args) throws IOException{
		RandomAccessFile raf = new RandomAccessFile("raf.txt","rw");
		String str = "��һ�ź��ݺ��ݺ��ݺ��ݣ��沨Ʈҡ��";
		/*
		 * �ַ����ṩ��ת��Ϊ�ֽڵķ�����
		 * byte[] getBytes()
		 * ����ǰ�ַ�������ϵͳĬ���ַ���ת��Ϊһ���ֽ�
		 * 
		 * byte[] getBytes(string csn)
		 * ʹ��ָ�����ַ������ַ���ת��Ϊ��Ӧ��һ���ֽ�
		 * �����ַ�����
		 * GBK:���ʱ��룬Ӣ��1�ֽڣ�����2�ֽ�
		 * UTF-8:unicode��һ���ַ�����Ҳ��Ϊ����룬����
		 *       ���������е����Զ�Ӧ���ַ�
		 *       Ӣ��1�ֽڣ�����3�ֽڡ�
		 * ISO8859-1:ŷ�޵�һ���ַ�������֧������
		 */
//		byte[] data = str.getBytes();
		byte[] data = str.getBytes("UTF-8");
		raf.write(data);
		System.out.println("д����ϣ�");
		raf.close();
	}
}
