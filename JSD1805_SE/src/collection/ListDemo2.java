package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * List�ṩ��һ��get,set����
 * @author tarena
 *
 */
public class ListDemo2 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		System.out.println(list);
		
		/*
		 * E get(int index)
		 * ���ظ����±괦��Ӧ��Ԫ��
		 * String str = list.get[i];
		 * String str = array[i];
		 */
		//�鿴�ڶ���Ԫ��
		String str = list.get(1);
		System.out.println(str);
		
		for(int i=0;i<list.size();i++){
			str = list.get(i);
			System.out.println(str);
		}
		
		/*
		 * E set(int index,E e)
		 * ������Ԫ�����õ�ָ��λ�ã�����ֵΪԭλ�ö�Ӧ��
		 * Ԫ�أ��滻Ԫ�ز�����
		 */
		String old = list.set(2,"3");
		System.out.println("���滻��Ԫ�أ�"+old);
		System.out.println(list);
	}
}
