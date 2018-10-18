package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ͨ���ṩÿ�ζ�д��������������ʵ�ʶ�д�Ĵ����������ṩ
 * �߶�дЧ�ʡ�
 * �����д�����ֽڶ�д
 * ���д��һ��һ���ֽڶ�д
 * 
 * 
 * 
 * @author tarena
 *
 */
public class CopyDemo2 {
	public static void main(String[] args){
		try{
			RandomAccessFile src = new RandomAccessFile("linux.exe","r");
			RandomAccessFile desc = new RandomAccessFile("linux_copy.exe","rw");
			/*
			 * RAF�ṩ�Ŀ��д�����ķ���
			 * �����
			 * int read(byte[] data)
			 * ͨ����ǰRAFһ���Զ�ȡ�������ֽ������ܳ��ȵ�
			 * �ֽ�������װ�뵽�������С�����ֵΪʵ�ʶ�ȡ��
			 * ���ֽ�����������ֵΪ-1�����ʾ����û�ж�ȡ��
			 * �κ����ݣ��Ѿ����ļ�ĩβ�ˣ�
			 * 
			 * ��д��
			 * void write(byte[] data)
			 * ͨ��RAF�������ֽ����������ֽ�һ����д��
			 * 
			 * void write(byte[] data,int offset,int len)
			 * ���������ֽ�������±�offset��������len���ֽ�
			 * һ����д��
			 */
			//��¼ÿ��ʵ�ʶ�ȡ�����ֽ���
			int len = -1;
			//10KB
			byte[] data = new byte[1024*10];
			long start = System.currentTimeMillis();
			while((len=src.read(data))!=-1){
				desc.write(data,0,len);
			}
			long end = System.currentTimeMillis();
			System.out.println("������ϣ���ʱ��"+(end-start)+"ms");
			src.close();
			desc.close();
		}catch(IOException e){
			e.printStackTrace();
		}
			
	}
}

















