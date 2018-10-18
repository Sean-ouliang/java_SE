package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 通过提供每次读写的数据量，减少实际读写的次数，可以提供
 * 高读写效率。
 * 随机读写：单字节读写
 * 块读写：一组一组字节读写
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
			 * RAF提供的块读写操作的方法
			 * 块读：
			 * int read(byte[] data)
			 * 通过当前RAF一次性读取给定的字节数组总长度的
			 * 字节量，并装入到该数组中。返回值为实际读取到
			 * 的字节量。若返回值为-1，则表示本次没有读取到
			 * 任何数据（已经是文件末尾了）
			 * 
			 * 块写：
			 * void write(byte[] data)
			 * 通过RAF将给定字节数组所有字节一次性写出
			 * 
			 * void write(byte[] data,int offset,int len)
			 * 将给定的字节数组从下标offset处的连续len个字节
			 * 一次性写出
			 */
			//记录每次实际读取到的字节量
			int len = -1;
			//10KB
			byte[] data = new byte[1024*10];
			long start = System.currentTimeMillis();
			while((len=src.read(data))!=-1){
				desc.write(data,0,len);
			}
			long end = System.currentTimeMillis();
			System.out.println("复制完毕！耗时："+(end-start)+"ms");
			src.close();
			desc.close();
		}catch(IOException e){
			e.printStackTrace();
		}
			
	}
}

















