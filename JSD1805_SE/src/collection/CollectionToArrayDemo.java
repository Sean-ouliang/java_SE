package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * ����ת��Ϊ����
 * 
 * Collection�ṩ�˷���toArray�����Խ���ǰ����ת��Ϊ
 * һ�����顣
 * @author tarena
 *
 */
public class CollectionToArrayDemo {
	public static void main(String[] args) {
		Collection<String> c = new<String> ArrayList();
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		c.add("five");
		System.out.println(c);
		
//		Object[] array = c.toArray();
		/*
		 * ��toArray����Ҫ����һ�����飬����������ã�����
		 * ���Դ�ż�������Ԫ�أ���ʹ�ø����飬�����������
		 * ���д���һ���뼯��sizeһ�������顣
		 */
		String[] arr = c.toArray(new String[c.size()]);
		System.out.println(arr.length);
		for(String str:arr){
			System.out.println(str);
		}
	}
}














