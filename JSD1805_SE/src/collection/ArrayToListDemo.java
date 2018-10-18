package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 数组转换为集合
 * 
 * Arrays是数组的工具类，其提供了一个静态方法：asList
 * 该方法可以将给定的数组转换为一个List集合。
 */
public class ArrayToListDemo {
	public static void main(String[] args){
		String[] array = {"one","two","three","four","five"};
		
		List<String> list = Arrays.asList(array);
		System.out.println(list.size());
		System.out.println(list);
		/*
		 * 对集合元素的操作就是对数组应元素的操作
		 */
		list.set(1,"2");
		System.out.println(list);
		
		for(String str:array){
			System.out.println(str);
		}
		/*
		 * 由于数组是定长的，所有该集合不允许增删元素。
		 * 否则会抛出异常
		 */
//		list.add("six");
//		for(String str:array){
//			System.out.println(str);
//		}
		
		/*
		 * 若想对集合操作，需要自行创建一个集合并包含数组
		 * 转换的集合中所有元素即可。
		 */
		//该构造方法可以创建当前集合时包含给定集合元素
		List<String> list2 = new ArrayList<String>(list);
		System.out.println("list2:"+list2);
		list2.add("six");
		System.out.println("list2:"+list2);
	}
}














