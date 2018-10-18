package io;

import java.io.Serializable;
import java.util.Arrays;

/**
 * ʹ�õ�ǰ���ʵ�����Զ������Ķ�д����
 * @author tarena
 *
 */
public class Person implements Serializable{
	/**
	 * ��һ����ʵ����Serializable�ӿں�Ӧ������һ��
	 * ������serialVersionUID���л��汾��
	 * ���л��汾��ֱ��Ӱ�췴���л�����Ľ���Ƿ�ɹ�
	 * 
	 * �����������������л�һ������ʱ������ö����
	 * �汾���Ƿ��뵱ǰ��汾��һ�£�����һ����ֱ���׳�
	 * �����л�ʧ���쳣�����汾��һ�£�����ü���ģʽ��
	 * �����������л��Ķ����뵱ǰ��ṹ����ȫһ��ʱ������
	 * ���Ի�ԭ�����Զ���ԭ�����ṹһ����ֱ�ӻ�ԭ��
	 * 
	 * ������û�ж������л��汾�ţ���������ڱ��뵱ǰ
	 * ��ʱ����ݽṹ����һ���汾�ţ��׶���ֻҪ��ǰ���
	 * �ṹ�����ı䣬�汾��һ���ı䡣
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private String gender;
	/*
	 * ��һ�����Ա�transient���κ���ô��ǰ��ʵ����
	 * ���л�ʱ��������ֵ�ᱻ���ԡ�
	 * ���Բ���Ҫ��������Կ��Դﵽ��������Ĺ���
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
