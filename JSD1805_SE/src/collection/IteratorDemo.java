package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * ��������
 * ����Collection���������ԣ�����ļ���ʵ���಻��������
 * �ģ������޷�ͨ�������������Ĳ����±�������Ԫ�ء�
 * Collection�ṩ��ͳһ�ı�������Ԫ�صķ�ʽ��������ģʽ
 * 
 * Iterater iterator()
 * �÷������Ի�ȡһ�����ڱ�����ǰ���ϵĵ�����ʵ���ࡣ
 * 
 * java.util.Iterator()
 * �������ӿڣ��涨�˵������������ϵ���ز�����������ͬ��
 * ���϶�ʵ����һ�����ڱ�������Ԫ�صĵ�����ʵ���ࡣ��������
 * ��ס��Щʵ��������֣��ö�̬�ĽǶȵ�������Iterator����
 * ���ɡ�
 * �������������ϵĹ���Ϊ���ʣ�ȡ��ɾ
 * ����ɾ��Ԫ�ز��Ǳ��������
 * @author tarena
 *
 */
public class IteratorDemo {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("one");
		c.add("#");
		c.add("two");
		c.add("#");
		c.add("three");
		c.add("#");
		c.add("four");
		c.add("#");
		c.add("five");
		System.out.println(c);

		/*
		 * ���������÷�����
		 * boolean hasNext()
		 * �жϵ�ǰ�����Ƿ���Ԫ�ؿ��Ե���
		 * 
		 * E next()
		 * ȡ����һ��Ԫ��
		 */
		Iterator it = c.iterator();
		while(it.hasNext()){
			String str = (String)it.next();
			if("#".equals(str)){
				/*
				 * ������Ҫ���ڱ����Ĺ����в�Ҫͨ�����ϡ��ķ�����ɾԪ�أ�������׳��쳣
				 */
//				c.remove(str);
				/*
				 * ��������remove����ɾ������ͨ��next
				 * ����ȡ����Ԫ��
				 */
				it.remove();
			}
			System.out.println(str);
		}
		System.out.println(c);
	}
}
