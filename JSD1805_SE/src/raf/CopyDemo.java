package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * �����ļ�
 * @author tarena
 *
 */
public class CopyDemo {
	public static void main(String[] args) throws IOException{
		/*
		 * ����һ��RAF��ȡԭ�ļ�
		 * ����һ��RAF�����ļ���д
		 * ˳��Ĵ�ԭ�ļ���ȡÿ���ֽ�д�뵽���Ƶ��ļ���
		 */
		RandomAccessFile src = new RandomAccessFile("mymuisc.mp3","r");
		RandomAccessFile desc = new RandomAccessFile("my_cp.mp3","rw");
		long start = System.currentTimeMillis();
		int d = -1;
		while((d=src.read())!=-1){
			desc.write(d);
		}
		long end = System.currentTimeMillis();
		System.out.println("������ϣ���ʱ��"+(end-start)/1000+"s");
		src.close();
		desc.close();
	}
}
