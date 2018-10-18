package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * java.io.RandomAccessFile
 * RAF是专门用来读写文件数据的类，它基于指针进行读写。
 * 可对文件内容进行编辑操作。
 * @author tarena
 *
 */
public class RAFDemo {
	public static void main(String[] args) throws IOException{
		/*
		 * RandomAccessFile常用构造方法：
		 * RandomAccessFile(File file,String mode)
		 * RandomAccessFile(String path,String mode)
		 * 第一个参数用于指定要进行读写操作的文件
		 * 第二个参数为操作模式，常用：
		 * r：只读模式，仅对文件进行读取操作
		 * rw：读写模式，对文件数据可读也可写
		 */
		RandomAccessFile raf = new RandomAccessFile("./raf.dat","rw");
		/*
		 * void write(int d)
		 * 向文件中写入一个字节，将给定的int值所对应的
		 * 2进制的低八为写入文件
		 *                            vvvvvvvv
		 * 00000000 00000000 00000000 00000001
		 */
		raf.write(1);
		System.out.println("写出完毕！");
		raf.close();
	}
}
