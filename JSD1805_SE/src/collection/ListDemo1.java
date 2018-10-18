package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * java.util.List
 * List集合：可重复集，并且有序，特点是可以通过下标操作元素
 * 常用实现类：
 * java.util.ArrayList：内部由数组实现，查询性能更好
 * java.util.LinkedList:内部由链表实现，增删元素性能更好，
 * 						尤其首尾增删元素。
 * @author tarena
 *
 */
public class ListDemo1 {
	public static void main(String[] args) {
		/*
		 * void add(int index,E e)
		 * 将给定元素添加到指定位置
		 */
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		System.out.println(list);
		
		list.add(1,"2");
		System.out.println(list);
		
		/*
		 * E remove(int index)
		 * 删除指定位置上的元素，并将其返回
		 */
		String old = list.remove(2);
		System.out.println("old:"+old);
		System.out.println(list);
		
		
	}
}


















