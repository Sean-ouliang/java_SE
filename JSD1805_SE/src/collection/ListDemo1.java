package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * java.util.List
 * List���ϣ����ظ��������������ص��ǿ���ͨ���±����Ԫ��
 * ����ʵ���ࣺ
 * java.util.ArrayList���ڲ�������ʵ�֣���ѯ���ܸ���
 * java.util.LinkedList:�ڲ�������ʵ�֣���ɾԪ�����ܸ��ã�
 * 						������β��ɾԪ�ء�
 * @author tarena
 *
 */
public class ListDemo1 {
	public static void main(String[] args) {
		/*
		 * void add(int index,E e)
		 * ������Ԫ����ӵ�ָ��λ��
		 */
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		System.out.println(list);
		
		list.add(1,"2");
		System.out.println(list);
		
		/*
		 * E remove(int index)
		 * ɾ��ָ��λ���ϵ�Ԫ�أ������䷵��
		 */
		String old = list.remove(2);
		System.out.println("old:"+old);
		System.out.println(list);
		
		
	}
}


















