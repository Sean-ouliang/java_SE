package io;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * �����ַ���
 * java.io.BufferedWriter
 * java.io.BufferedReader
 * �����ַ������Կ��д�������ص��ǿ��԰��ж�д�ַ���
 * 
 * java.io.PrintWriter
 * �����Զ���ˢ�µĻ����ַ�����������ڲ�����BufferedWriter
 * ��Ϊ���幦��
 * @author tarena
 *
 */
public class PWDemo {
	public static void main(String[] args) throws IOException{
		/*
		 * ���ļ���д���ַ��� 
		 */
//		PrintWriter pw = new PrintWriter("pw.txt");
		PrintWriter pw = new PrintWriter("pw.txt","UTF-8");//��������������Ϊʲô���뿴Դ��
		pw.println("���ʾ�����ô����");
		pw.println("������ҧ���ʿ���");
		System.out.println("д����ϣ�");
		pw.close();
	}
}
