package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * java.io.RandomAccessFile
 * RAF��ר��������д�ļ����ݵ��࣬������ָ����ж�д��
 * �ɶ��ļ����ݽ��б༭������
 * @author tarena
 *
 */
public class RAFDemo {
	public static void main(String[] args) throws IOException{
		/*
		 * RandomAccessFile���ù��췽����
		 * RandomAccessFile(File file,String mode)
		 * RandomAccessFile(String path,String mode)
		 * ��һ����������ָ��Ҫ���ж�д�������ļ�
		 * �ڶ�������Ϊ����ģʽ�����ã�
		 * r��ֻ��ģʽ�������ļ����ж�ȡ����
		 * rw����дģʽ�����ļ����ݿɶ�Ҳ��д
		 */
		RandomAccessFile raf = new RandomAccessFile("./raf.dat","rw");
		/*
		 * void write(int d)
		 * ���ļ���д��һ���ֽڣ���������intֵ����Ӧ��
		 * 2���ƵĵͰ�Ϊд���ļ�
		 *                            vvvvvvvv
		 * 00000000 00000000 00000000 00000001
		 */
		raf.write(1);
		System.out.println("д����ϣ�");
		raf.close();
	}
}
