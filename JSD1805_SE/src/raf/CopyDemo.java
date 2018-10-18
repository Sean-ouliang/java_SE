package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 复制文件
 * @author tarena
 *
 */
public class CopyDemo {
	public static void main(String[] args) throws IOException{
		/*
		 * 创建一个RAF读取原文件
		 * 创建一个RAF向复制文件中写
		 * 顺序的从原文件读取每个字节写入到复制的文件中
		 */
		RandomAccessFile src = new RandomAccessFile("mymuisc.mp3","r");
		RandomAccessFile desc = new RandomAccessFile("my_cp.mp3","rw");
		long start = System.currentTimeMillis();
		int d = -1;
		while((d=src.read())!=-1){
			desc.write(d);
		}
		long end = System.currentTimeMillis();
		System.out.println("复制完毕！耗时："+(end-start)/1000+"s");
		src.close();
		desc.close();
	}
}
