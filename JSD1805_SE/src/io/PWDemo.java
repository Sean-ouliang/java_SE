package io;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * 缓冲字符流
 * java.io.BufferedWriter
 * java.io.BufferedReader
 * 缓冲字符流可以块读写，并且特点是可以按行读写字符串
 * 
 * java.io.PrintWriter
 * 具有自动行刷新的缓冲字符流输出流，内部连接BufferedWriter
 * 作为缓冲功能
 * @author tarena
 *
 */
public class PWDemo {
	public static void main(String[] args) throws IOException{
		/*
		 * 向文件中写出字符串 
		 */
//		PrintWriter pw = new PrintWriter("pw.txt");
		PrintWriter pw = new PrintWriter("pw.txt","UTF-8");//如果不明白这儿是为什么，请看源码
		pw.println("劳资就是这么吊！");
		pw.println("不服来咬劳资咯！");
		System.out.println("写出完毕！");
		pw.close();
	}
}
