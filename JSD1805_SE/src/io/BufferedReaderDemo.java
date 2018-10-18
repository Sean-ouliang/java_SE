package io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * java.io.BufferedReader
 * 缓冲字符输入流，可以按行读取字符串
 * @author tarena
 *
 */
public class BufferedReaderDemo {
	public static void main(String[] args) throws IOException{
		/*
		 * 将当前源代码读取出来并输出到控制台
		 */
		FileInputStream fis = new FileInputStream("src/io/BufferedReaderDemo.java");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		/*
		 * BufferedReader提供方法：
		 * String readLine（）
		 * 顺序读取若干字符，直到读取了换行符为止，然后
		 * 将换行符之前的所有字符以一个字符串形式返回。
		 * 注意，返回的字符串中是不含有最后的换行符的。
		 * 若返回值为null，表示末尾。
		 */
		String line = null;
		while((line=br.readLine())!=null){
			System.out.println(line);
		}
		br.close();
	}
}
