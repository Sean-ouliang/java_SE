package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * ʹ����ѭ����������
 * @author tarena
 *
 */
public class NewForDemo2 {
	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
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
		 * ��ѭ���������ϣ��ᱻ��������Ϊʹ�õ�����
		 * ���뼯�ϡ�
		 * ������ʹ����ѭ���������Ϲ����У���Ҫͨ������
		 * �ķ�����ɾԪ�ء�������ѭ���������ϻ��׳��쳣
		 */
		for(String str:c){
			System.out.println(str);
		}
	}
}
