package io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * java.io.BufferedReader
 * �����ַ������������԰��ж�ȡ�ַ���
 * @author tarena
 *
 */
public class BufferedReaderDemo {
	public static void main(String[] args) throws IOException{
		/*
		 * ����ǰԴ�����ȡ���������������̨
		 */
		FileInputStream fis = new FileInputStream("src/io/BufferedReaderDemo.java");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		/*
		 * BufferedReader�ṩ������
		 * String readLine����
		 * ˳���ȡ�����ַ���ֱ����ȡ�˻��з�Ϊֹ��Ȼ��
		 * �����з�֮ǰ�������ַ���һ���ַ�����ʽ���ء�
		 * ע�⣬���ص��ַ������ǲ��������Ļ��з��ġ�
		 * ������ֵΪnull����ʾĩβ��
		 */
		String line = null;
		while((line=br.readLine())!=null){
			System.out.println(line);
		}
		br.close();
	}
}
