package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 遍历集合
 * 对于Collection这个层面而言，下面的集合实现类不都是有序
 * 的，所有无法通过如数组那样的操作下标来遍历元素。
 * Collection提供了统一的遍历集合元素的方式：迭代器模式
 * 
 * Iterater iterator()
 * 该方法可以获取一个用于遍历当前集合的迭代器实现类。
 * 
 * java.util.Iterator()
 * 迭代器接口，规定了迭代器遍历集合的相关操作方法，不同的
 * 集合都实现了一个用于遍历自身元素的迭代器实现类。我们无需
 * 记住这些实现类的名字，用多态的角度当他们是Iterator看待
 * 即可。
 * 迭代器遍历集合的规则为：问，取，删
 * 其中删除元素不是必须操作。
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
		 * 迭代器常用方法：
		 * boolean hasNext()
		 * 判断当前集合是否还有元素可以迭代
		 * 
		 * E next()
		 * 取出下一个元素
		 */
		Iterator it = c.iterator();
		while(it.hasNext()){
			String str = (String)it.next();
			if("#".equals(str)){
				/*
				 * 迭代器要求在遍历的过程中不要通过集合、的方法增删元素，否则会抛出异常
				 */
//				c.remove(str);
				/*
				 * 迭代器的remove方法删除的是通过next
				 * 方法取出的元素
				 */
				it.remove();
			}
			System.out.println(str);
		}
		System.out.println(c);
	}
}
