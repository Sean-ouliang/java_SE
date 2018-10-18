package collection;

import java.util.ArrayList;
import java.util.Collection;

import object.Point;

/**
 * 集合提供了判断是否包含给定元素的方法
 * boolena contains(E e)
 * 若集合包含当前元素则返回true,否则返回false
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
		//c.add(p）;
		/*
		 * contains方法用参数对象与集合现有元素顺序
		 * 进行equals比较（元素自身的equals方法），若有
		 * 返回值为true的则集合认为包含该元素。
		 * 所以元素自身equals方法直接决定了集合判断包含
		 * 该元素的结果。
		 */
		boolean contains = c.contains(p);
		System.out.println("是否包含:"+contains);
	}
}
