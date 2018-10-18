package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合转换为数组
 * 
 * Collection提供了方法toArray，可以将当前集合转换为
 * 一个数组。
 * @author tarena
 *
 */
public class CollectionToArrayDemo {
	public static void main(String[] args) {
		Collection<String> c = new<String> ArrayList();
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		c.add("five");
		System.out.println(c);
		
//		Object[] array = c.toArray();
		/*
		 * 该toArray方法要求传入一个数组，若该数组可用（长度
		 * 可以存放集合所有元素）则使用该数组，若不可用则会
		 * 自行创建一个与集合size一样的数组。
		 */
		String[] arr = c.toArray(new String[c.size()]);
		System.out.println(arr.length);
		for(String str:arr){
			System.out.println(str);
		}
	}
}














