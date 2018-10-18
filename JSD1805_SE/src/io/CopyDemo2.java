package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 缓冲流
 * java.io.BufferedOutputStream
 * java.io.BufferedInputStream
 * 
 * 缓冲流是一对高级流，可以加快读写数据的效率。无论我们
 * 通过缓冲流进行的是随机读写还是块读写，最终都会被缓冲流
 * 转换为块读写操作。
 * @author tarena
 *
 */
public class CopyDemo2 {
	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream("linux.exe");
		BufferedInputStream bis = new BufferedInputStream(fis);
		FileOutputStream fos = new FileOutputStream("linux_cp1.exe");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		int d = -1;
		while((d=bis.read())!=-1){
			bos.write(d);
		}
		System.out.println("复制完毕！");
		bis.close();
		bos.close();
	}
}
