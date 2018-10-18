package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 向文件中写入字符串
 * @author tarena
 *
 */
public class WriteStringDemo {
	public static void main(String[] args) throws IOException{
		RandomAccessFile raf = new RandomAccessFile("raf.txt","rw");
		String str = "像一颗海草海草海草海草，随波飘摇。";
		/*
		 * 字符串提供了转换为字节的方法：
		 * byte[] getBytes()
		 * 将当前字符串按照系统默认字符集转换为一组字节
		 * 
		 * byte[] getBytes(string csn)
		 * 使用指定的字符集将字符串转换为对应的一组字节
		 * 常见字符集：
		 * GBK:国际编码，英文1字节，中文2字节
		 * UTF-8:unicode的一种字符集，也成为万国码，包含
		 *       世界上流行的语言对应的字符
		 *       英文1字节，中文3字节。
		 * ISO8859-1:欧洲的一种字符集，不支持中文
		 */
//		byte[] data = str.getBytes();
		byte[] data = str.getBytes("UTF-8");
		raf.write(data);
		System.out.println("写出完毕！");
		raf.close();
	}
}
