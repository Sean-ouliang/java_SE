package io;

import java.io.Serializable;
import java.util.Arrays;

/**
 * 使用当前类的实例测试对象流的读写操作
 * @author tarena
 *
 */
public class Person implements Serializable{
	/**
	 * 当一个类实现了Serializable接口后，应当定义一个
	 * 常量：serialVersionUID序列化版本号
	 * 序列化版本号直接影响反序列化对象的结果是否成功
	 * 
	 * 当对象输入流反序列化一个对象时，会检测该对象的
	 * 版本号是否与当前类版本号一致，若不一致则直接抛出
	 * 反序列化失败异常，若版本号一致，则采用兼容模式，
	 * 即：若反序列化的对象与当前类结构不完全一致时，所有
	 * 可以还原的属性都还原。若结构一致则直接还原。
	 * 
	 * 若我们没有定义序列化版本号，则编译器在编译当前
	 * 类时会根据结构生成一个版本号，弊端是只要当前类的
	 * 结构发生改变，版本号一定改变。
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private String gender;
	/*
	 * 当一个属性被transient修饰后，那么当前类实例在
	 * 序列化时，该属性值会被忽略。
	 * 忽略不需要保存的属性可以达到对象瘦身的功能
	 */
	private transient String[] otherInfo;
	public Person(String name, int age, String gender, String[] otherInfo) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.otherInfo = otherInfo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String[] getOtherInfo() {
		return otherInfo;
	}
	public void setOtherInfo(String[] otherInfo) {
		this.otherInfo = otherInfo;
	}
	
	public String toString() {
		return  name+","+age+","+gender+","+Arrays.toString(otherInfo);
	}
	
}
