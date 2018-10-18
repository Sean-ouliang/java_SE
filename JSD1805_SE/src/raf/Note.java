package raf;

import java.util.Scanner;
import java.io.RandomAccessFile;
import java.io.IOException;

/**
 * 简易记事本工具
 * 程序启动后，要求用户输入文件名，然后对该文件进行
 * 写操作。
 * 之后从控制台输入的每行字符串都顺序写入到该文件中。
 * 当用户输入exit时，程序退出。（exit不要写入文件）
 * 
 * @author tarena
 *
 */
public class Note {
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入文件名:");
		String nameFile = scan.nextLine();
		RandomAccessFile raf = new RandomAccessFile(nameFile+".txt","rw");
		System.out.println("请输入内容:");
		while(true){
			String line = scan.nextLine();
			if("exit".equals(line)){
				System.out.println("写出完毕!");
				break;
			}
			raf.write(line.getBytes("UTF-8"));
		}
		raf.close();
	}
}
