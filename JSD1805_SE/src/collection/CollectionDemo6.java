package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * �����ڼ�����ʹ�ù㷺������Լ�������е�Ԫ�����͡�
 * @author tarena
 *
 */
public class CollectionDemo6 {
	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		//c.add(1);//�ڴ����������Ͳ���ʱ���벻ͨ��
		
		/*
		 * ��ѭ����������������Object����Ԫ����
		 */
		for(String str:c){
			System.out.println(str);
		}
		
		System.out.println("ʹ�õ������������ϣ�");
		/*
		 * ������Ҳ֧�ַ��ͣ�ʵ��������������ļ��ϵķ���
		 * һ�¼���
		 */
		Iterator<String> it = c.iterator();
		while(it.hasNext()){
			String str = it.next();
			System.out.println(str);
		}
	}
}
