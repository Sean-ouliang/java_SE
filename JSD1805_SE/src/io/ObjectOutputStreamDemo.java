package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * ������
 * java.io.ObjectOutputStream
 * java.io.ObjectInputStream
 * ��������һ�Ը߼��������Է���Ķ�дjava���κζ���
 * 
 * ��һ�����ʵ��ϣ������������д����ô�������ʵ�֣�
 * java.io.Serializable�ӿ�
 * ���������л�ʱ���׳��쳣
 * 
 * ������ʵ��Serializable�ӿں󣬸��౻����������ʱ
 * ����һ�������������ǽ���ǰ��ʵ��ת��Ϊһ���ֽڡ�
 * ����Դ���в����֣����ڲ�ʵ�ָýӿڣ��������������
 * �����������������Ϊʲô�����������л�ʱҪ�����
 * ʵ�ָýӿڵ�ԭ�򡣷����޷�������ת��Ϊһ���ֽ�
 * @author tarena
 *
 */
public class ObjectOutputStreamDemo {
	public static void main(String[] args) throws IOException{
		String name = "����ʦ";
		int age = 18;
		String gender = "Ů";
		String[] otherInfo = {"����˫ܰ","�����˴�"};
		
		Person p = new Person(name,age,gender,otherInfo);
		System.out.println(p);
		
		FileOutputStream fos = new FileOutputStream("person.obj");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		/*
		 * ����������ṩ��д������ķ�����
		 * void writeObject(Object obj)
		 * �������Ķ���ת��Ϊһ���ֽں�д��
		 * 
		 * ����ͨ��oos����������д���ļ���ʵ�ʾ�����
		 * ����������
		 * 1��oos�������Ķ���ת��Ϊ��һ���ֽ�
		 *   �������Ϊ���������л�
		 * 2��fos�������ֽ�д�뵽�ļ��У�Ӳ���ϣ�
		 *   ������̳�Ϊ�����ݳ־û�
		 */
		oos.writeObject(p);
		System.out.println("д����ϣ�");
		
		oos.close();
	}
}
