package io;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 在创建PrintWriter时，若构造方法第一个参数为流（字节流
 * 字符流均可），那么该构造方法就支持一个重载，可以在传入
 * 第二个参数，该参数为boolean型，若值为true时，则具有了
 * 自动行刷新功能。即：每当调用println方法（注意，不是调用
 * print方法！！！）后就会自动行刷新，将该字符串实际写出。
 * 但是该功能会降低写效率（因为提高了写次数），但是若考虑
 * 到即时性时，该方法很易用。
 * 
 * 简易记事本工具
 * 程序启动后，要求用户输入文件名，然后对该文件进行
 * 写操作。
 * 之后从控制台输入的每行字符串都按行写入到该文件中。
 * 使用PrintWriter的流连接方式进行。
 * 当用户输入exit时，程序退出。（exit不要写入文件）
 * @author tarena
 *
 */
public class NoteDemo_PW_Auto_Flush {
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		System.out.println("请输出文件名:");
		String fileName = scan.nextLine();
		FileOutputStream fos = new FileOutputStream(fileName+".txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);
		PrintWriter pw = new PrintWriter(bw,true);
		System.out.println("请输入内容：");
		while(true){
			String data = scan.nextLine();
			if("exit".equals(data)){
				break;
			}
			pw.println(data);
		}
		System.out.println("写出完毕！");
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("请输入文件名：");
//		String fileName = scan.nextLine();
//		FileOutputStream fos = new FileOutputStream(fileName+".txt");
//		OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
//		BufferedWriter bw = new BufferedWriter(osw);
//		PrintWriter pw = new PrintWriter(bw,true);//自动行刷新
//		System.out.println("请输入内容：");
//		String line = null;
//		while(true){
//			line = scan.nextLine();
//			if("exit".equals(line)){
//				System.out.println("写出完毕！");
//				break;
//			}
//			pw.println(line);
//		}
//		pw.close();
	}
}
