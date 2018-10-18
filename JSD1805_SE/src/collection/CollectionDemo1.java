package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * java.util.Collection
 * ����
 * ������һ�����ݽṹ��������һ������������һ��Ԫ�ء�
 * �����ṩ��һϵ�в���Ԫ�ص���ط�����ʹ�ø����㡣
 * 
 * Collection�����м��ϵĶ����ӿڣ��涨�����м��϶�Ӧ��
 * �߱��ķ�����
 * ���������õ������ӿڣ�
 * java.util.List:���ظ���������
 * java.util.Set�������ظ���
 * Ԫ���Ƿ��ظ�������Ԫ�������equals�ȽϵĽ����
 * @author tarena
 *
 */
public class CollectionDemo1 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		/*
		 * boolean add(E e)
		 * ��ǰ��������Ӹ���Ԫ�أ�����Ԫ�سɹ������
		 * ����true
		 * ����Set�����ǲ����ظ�������������ظ�Ԫ���ǻ�
		 * �Ż�false�ģ�List���ϲ����ڸ����
		 */
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		c.add("five");
		System.out.println(c);
		/*
		 * int size()
		 * ���ص�ǰ���ϵ�Ԫ�ظ���
		 */
		int size = c.size();
		System.out.println("size:"+size);
		
		/*
		 * boolean isEmpty()
		 * �жϵ�ǰ�����Ƿ�Ϊ�ռ����������κ�Ԫ�أ�
		 */
		boolean empty = c.isEmpty();
		System.out.println("�Ƿ�Ϊ�ռ���"+empty);
		//��ռ���
		c.clear();
		System.out.println("���������");
		System.out.println("size:"+c.size());
		System.out.println("�Ƿ�Ϊ�ռ���"+c.isEmpty());
	}
}
