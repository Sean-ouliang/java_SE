package io;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * 流连接中使用PrintWriter
 * @author tarena
 *
 */
public class PWDemo2 {
	public static void main(String[] args) throws IOException{
		FileOutputStream fos = new FileOutputStream("pw.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);
		PrintWriter pw = new PrintWriter(bw);
		pw.println("没办法，我就是这么强大");
		pw.println("哈哈哈哈哈哈哈哈哈哈哈");
		System.out.println("写出完毕");
		pw.close();
	}
}
