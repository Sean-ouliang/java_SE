package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * 字符流
 * java按照读写单位将流划分为：字节流和字符流
 * 
 * 字符流的读写单位是以字符为单位的。但底层实际是要
 * 转换为字节进行写操作，或者将读取到的字节转换为字符。
 * 本质还是读写字节。
 * 
 * 转换流：
 * java.io.OutputStreamWriter
 * java.io.InputStreamReader
 * 它们是字符流的一对常用实现类，将来实际开发中很少直接使用
 * 它们，但它们在流链接中是重要的一环
 * @author tarena
 *
 */
public class OSWDemo {
	public static void main(String[] args) throws IOException{
		FileOutputStream fos = new FileOutputStream("osw.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
		osw.write("我没学好，关你屁事");
		System.out.println("写出完毕！");
		osw.close(); 
	}
}
