package raf;

import java.io.IOException;
import java.io.RandomAccessFile;
/**
 * 读取字符串
 * @author tarena
 *
 */
public class ReadStringDemo {
	public static void main(String[] args) throws IOException{
		RandomAccessFile raf = new RandomAccessFile("raf.txt","r");
		byte[] data = new byte[(int)raf.length()];
		raf.read(data);
		//将给定的字节数组中所有字节按照指定字符集还原为字符串
		String str = new String(data,"UTF-8");
		System.out.println(str);
		raf.close();
	}
}
