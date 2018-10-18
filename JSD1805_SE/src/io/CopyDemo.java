package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用文件流复制文件
 * @author tarena
 *
 */
public class CopyDemo {
	public static void main(String[] args) throws IOException{
		/*
		 * 1、创建文件流输入流读取原文件
		 * 2、创建文件输出流向复制文件写
		 * 3、顺序从原文件读取字节写入复制文件中完成复制操作。
		 */
		FileInputStream fis = new FileInputStream("linux.exe");
		FileOutputStream fos = new FileOutputStream("linux_copy.exe");//在创建时才会覆盖，不创建是不会覆盖的，也不用写“true”
		byte[] data = new byte[1024*10];
		int len = -1;
		while((len=fis.read(data))!=-1){
			fos.write(data,0,len);
		}
		System.out.println("复制完毕！");
		fis.close();
		fos.close();
	}
}
