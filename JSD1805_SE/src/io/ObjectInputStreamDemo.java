package io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

/**
 * �������л�
 * @author tarena
 *
 */
public class ObjectInputStreamDemo {
	public static void main(String[] args) throws ClassNotFoundException,IOException{
		FileInputStream fis = new FileInputStream("person.obj");
		ObjectInputStream ois = new ObjectInputStream(fis);
		/*
		 * �����������ṩ�˶������л�������
		 * Object readObject()
		 * ��Ҫע�⣬�÷����ڶ�ȡ�ֽ�ʱ�����뱣֤��ȡ��
		 * ���ֽ�ʱ�����������һ���������л����ֽڣ���
		 * ����׳�ClassNotFoundException
		 */
		Person p = (Person)ois.readObject();
		System.out.println(p);
		
		ois.close();
	}
}
