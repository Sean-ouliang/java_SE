package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 对象流
 * java.io.ObjectOutputStream
 * java.io.ObjectInputStream
 * 对象流是一对高级流，可以方便的读写java中任何对象
 * 
 * 当一个类的实例希望被对象流读写，那么该类必须实现：
 * java.io.Serializable接口
 * 否则在序列化时会抛出异常
 * 
 * 当我们实现Serializable接口后，该类被编译器编译时
 * 会多出一个方法，作用是将当前类实例转换为一组字节。
 * 但是源码中不体现，由于不实现该接口，编译器不会给类
 * 添加这个方法，这就是为什么对象流在序列化时要求必须
 * 实现该接口的原因。否则无法将对象转换为一组字节
 * @author tarena
 *
 */
public class ObjectOutputStreamDemo {
	public static void main(String[] args) throws IOException{
		String name = "苍老师";
		int age = 18;
		String gender = "女";
		String[] otherInfo = {"德艺双馨","有容乃大"};
		
		Person p = new Person(name,age,gender,otherInfo);
		System.out.println(p);
		
		FileOutputStream fos = new FileOutputStream("person.obj");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		/*
		 * 对象输出流提供了写出对象的方法：
		 * void writeObject(Object obj)
		 * 将给定的对象转换为一组字节后写出
		 * 
		 * 这里通过oos将给定对象写入文件，实际经历了
		 * 两个操作：
		 * 1、oos将给定的对像转换为了一组字节
		 *   这个过程为：对象序列化
		 * 2、fos将给定字节写入到文件中（硬盘上）
		 *   这个过程称为：数据持久化
		 */
		oos.writeObject(p);
		System.out.println("写出完毕！");
		
		oos.close();
	}
}
