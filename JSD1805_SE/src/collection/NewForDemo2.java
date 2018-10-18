package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 使用新循环遍历集合
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
		 * 新循环遍历集合，会被编译器改为使用迭代器
		 * 编译集合。
		 * 所以在使用新循环遍历集合过程中，不要通过集合
		 * 的方法增删元素。否则新循环遍历集合会抛出异常
		 */
		for(String str:c){
			System.out.println(str);
		}
	}
}
