package io;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * �ڴ���PrintWriterʱ�������췽����һ������Ϊ�����ֽ���
 * �ַ������ɣ�����ô�ù��췽����֧��һ�����أ������ڴ���
 * �ڶ����������ò���Ϊboolean�ͣ���ֵΪtrueʱ���������
 * �Զ���ˢ�¹��ܡ�����ÿ������println������ע�⣬���ǵ���
 * print��������������ͻ��Զ���ˢ�£������ַ���ʵ��д����
 * ���Ǹù��ܻή��дЧ�ʣ���Ϊ�����д������������������
 * ����ʱ��ʱ���÷��������á�
 * 
 * ���׼��±�����
 * ����������Ҫ���û������ļ�����Ȼ��Ը��ļ�����
 * д������
 * ֮��ӿ���̨�����ÿ���ַ���������д�뵽���ļ��С�
 * ʹ��PrintWriter�������ӷ�ʽ���С�
 * ���û�����exitʱ�������˳�����exit��Ҫд���ļ���
 * @author tarena
 *
 */
public class NoteDemo_PW_Auto_Flush {
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		System.out.println("������ļ���:");
		String fileName = scan.nextLine();
		FileOutputStream fos = new FileOutputStream(fileName+".txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);
		PrintWriter pw = new PrintWriter(bw,true);
		System.out.println("���������ݣ�");
		while(true){
			String data = scan.nextLine();
			if("exit".equals(data)){
				break;
			}
			pw.println(data);
		}
		System.out.println("д����ϣ�");
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("�������ļ�����");
//		String fileName = scan.nextLine();
//		FileOutputStream fos = new FileOutputStream(fileName+".txt");
//		OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
//		BufferedWriter bw = new BufferedWriter(osw);
//		PrintWriter pw = new PrintWriter(bw,true);//�Զ���ˢ��
//		System.out.println("���������ݣ�");
//		String line = null;
//		while(true){
//			line = scan.nextLine();
//			if("exit".equals(line)){
//				System.out.println("д����ϣ�");
//				break;
//			}
//			pw.println(line);
//		}
//		pw.close();
	}
}
