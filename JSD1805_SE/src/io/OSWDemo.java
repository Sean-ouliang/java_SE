package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * �ַ���
 * java���ն�д��λ��������Ϊ���ֽ������ַ���
 * 
 * �ַ����Ķ�д��λ�����ַ�Ϊ��λ�ġ����ײ�ʵ����Ҫ
 * ת��Ϊ�ֽڽ���д���������߽���ȡ�����ֽ�ת��Ϊ�ַ���
 * ���ʻ��Ƕ�д�ֽڡ�
 * 
 * ת������
 * java.io.OutputStreamWriter
 * java.io.InputStreamReader
 * �������ַ�����һ�Գ���ʵ���࣬����ʵ�ʿ����к���ֱ��ʹ��
 * ���ǣ���������������������Ҫ��һ��
 * @author tarena
 *
 */
public class OSWDemo {
	public static void main(String[] args) throws IOException{
		FileOutputStream fos = new FileOutputStream("osw.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
		osw.write("��ûѧ�ã�����ƨ��");
		System.out.println("д����ϣ�");
		osw.close(); 
	}
}
