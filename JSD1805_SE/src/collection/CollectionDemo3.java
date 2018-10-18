package collection;

import java.util.ArrayList;
import java.util.Collection;

import object.Point;

/**
 * 删除集合元素
 * boolean remove(E e)
 * 将给定的元素从集合中删除，需要注意，该方法依然是依靠
 * 元素equals比较
 * @author tarena
 *
 */
public class CollectionDemo3 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add(new Point(1,2));
		c.add(new Point(3,4));
		c.add(new Point(5,6));
		c.add(new Point(7,8));
		c.add(new Point(1,2));
		System.out.println(c);
		
		Point p = new Point(1,2);
		c.remove(p);
		System.out.println(c);
	}
}

