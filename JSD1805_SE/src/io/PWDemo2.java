package io;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * ��������ʹ��PrintWriter
 * @author tarena
 *
 */
public class PWDemo2 {
	public static void main(String[] args) throws IOException{
		FileOutputStream fos = new FileOutputStream("pw.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);
		PrintWriter pw = new PrintWriter(bw);
		pw.println("û�취���Ҿ�����ôǿ��");
		pw.println("����������������������");
		System.out.println("д�����");
		pw.close();
	}
}
