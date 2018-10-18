package io;

import java.io.IOException;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;

/**
 * 缓冲输出流的缓冲区问题
 * @author tarena
 *
 */
public class BufferedOutputStream_flush {
	public static void main(String[] args) throws IOException{
		FileOutputStream fos = new FileOutputStream("bos.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		String str = "师傅，我坚持不住了！";
		byte[] data = str.getBytes("UTF-8");
		bos.write(data);
		/*
		 * void flush()
		 * 缓冲流提供了强制清空缓冲区的操作，强调flush
		 * 会将当前缓冲区已经缓冲的字节一次性写出
		 */
		bos.flush();
		System.out.println("写出完毕！");
		bos.close();
	}
}
