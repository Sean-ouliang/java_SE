package collection;

import java.util.ArrayList;
import java.util.Collection;

import object.Point;

/**
 * �����ṩ���ж��Ƿ��������Ԫ�صķ���
 * boolena contains(E e)
 * �����ϰ�����ǰԪ���򷵻�true,���򷵻�false
 * @author tarena
 *
 */
public class CollectionDemo2 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add(new Point(1,2));
		c.add(new Point(3,4));
		c.add(new Point(5,6));
		c.add(new Point(7,8));
		System.out.println(c);
		
		Point p = new Point(1,2);
		//c.add(p��;
		/*
		 * contains�����ò��������뼯������Ԫ��˳��
		 * ����equals�Ƚϣ�Ԫ�������equals������������
		 * ����ֵΪtrue���򼯺���Ϊ������Ԫ�ء�
		 * ����Ԫ������equals����ֱ�Ӿ����˼����жϰ���
		 * ��Ԫ�صĽ����
		 */
		boolean contains = c.contains(p);
		System.out.println("�Ƿ����:"+contains);
	}
}
