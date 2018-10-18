package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * ���ϲ���
 * @author tarena
 *
 */
public class CollectionDemo5 {
	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		c1.add("java");
		c1.add("c");
		c1.add("c++");
		System.out.println(c1);
		
		Collection c2 = new HashSet();
		c2.add("android");
		c2.add("ios");
		System.out.println(c2);
		/*
		 * boolean addAll(Collection c)
		 * �����������е�����Ԫ����ӵ���ǰ�����С���Ӻ�
		 * ��ǰ����Ԫ�ط����ı��򷵻�true��
		 */
		c1.addAll(c2);
		System.out.println(c1);
		/*
		 * boolean containsAll(Collection c)
		 * �жϵ�ǰ�����Ƿ�������������е�����Ԫ��
		 */
		Collection c3 = new ArrayList();
		c3.add("java");
		c3.add("ios");
//		c3.add("php");
		boolean contains = c1.containsAll(c3);
		System.out.println("ȫ������"+contains);
		/*
		 * boolean removeAll(Collection c)
		 */
		c1.removeAll(c3);
		System.out.println(c1);
	}
}

















