package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ת����
 * java.io.InputStreamReader��ȡ�ַ�
 * @author tarena
 *
 */
public class ISRDemo {
	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream("osw.txt");
		InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
		int d = -1;
		while((d=isr.read())!=-1){
			char c = (char)d;
			System.out.print(c);
		}
		isr.close();
	}
}
