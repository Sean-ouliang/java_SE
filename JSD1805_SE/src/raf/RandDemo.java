package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 读取一个字节
 * @author tarena
 *
 */
public class RandDemo {
	public static void main(String[] args) throws IOException{
		RandomAccessFile raf = new RandomAccessFile("raf.dat","r");
		/*
		 * int read()
		 * 从文件当前指针位置读取1个字节，读取后以int
		 * 形式返回。若读取到文件末尾，则返回值为-1.
		 * 
		 * 00000000 00000000 00000000 00000001
		 */
		int d = raf.read();
		System.out.println(d);
		//试图读取第二个字节
		d = raf.read();
		System.out.println(d);
		raf.close();
	}
}
