package raf;

import java.util.Scanner;
import java.io.RandomAccessFile;
import java.io.IOException;

/**
 * ���׼��±�����
 * ����������Ҫ���û������ļ�����Ȼ��Ը��ļ�����
 * д������
 * ֮��ӿ���̨�����ÿ���ַ�����˳��д�뵽���ļ��С�
 * ���û�����exitʱ�������˳�����exit��Ҫд���ļ���
 * 
 * @author tarena
 *
 */
public class Note {
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		System.out.println("�������ļ���:");
		String nameFile = scan.nextLine();
		RandomAccessFile raf = new RandomAccessFile(nameFile+".txt","rw");
		System.out.println("����������:");
		while(true){
			String line = scan.nextLine();
			if("exit".equals(line)){
				System.out.println("д�����!");
				break;
			}
			raf.write(line.getBytes("UTF-8"));
		}
		raf.close();
	}
}
