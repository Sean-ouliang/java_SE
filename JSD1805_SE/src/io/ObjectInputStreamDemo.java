package io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

/**
 * 对象反序列化
 * @author tarena
 *
 */
public class ObjectInputStreamDemo {
	public static void main(String[] args) throws ClassNotFoundException,IOException{
		FileInputStream fis = new FileInputStream("person.obj");
		ObjectInputStream ois = new ObjectInputStream(fis);
		/*
		 * 对象输入流提供了对象反序列化方法：
		 * Object readObject()
		 * 需要注意，该方法在读取字节时，必须保证读取到
		 * 的字节时对象输出流将一个对象序列化的字节，否
		 * 则会抛出ClassNotFoundException
		 */
		Person p = (Person)ois.readObject();
		System.out.println(p);
		
		ois.close();
	}
}
