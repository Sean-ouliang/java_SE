package collection;

import java.util.ArrayList;
import java.util.Collection;

import object.Point;

/**
 * ���ϴ�ŵ���Ԫ�ص�����
 * @author tarena
 *
 */
public class CollectionDemo4 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		Point p = new Point(1,2);
		c.add(p);
		System.out.println("p:"+p);
		System.out.println("c:"+c);
		
		p.setX(2);
		System.out.println("p:"+p);
		System.out.println("c:"+c);
	}
}
