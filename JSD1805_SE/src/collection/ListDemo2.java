package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * List提供了一对get,set方法
 * @author tarena
 *
 */
public class ListDemo2 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		System.out.println(list);
		
		/*
		 * E get(int index)
		 * 返回给定下标处对应的元素
		 * String str = list.get[i];
		 * String str = array[i];
		 */
		//查看第二个元素
		String str = list.get(1);
		System.out.println(str);
		
		for(int i=0;i<list.size();i++){
			str = list.get(i);
			System.out.println(str);
		}
		
		/*
		 * E set(int index,E e)
		 * 将给定元素设置到指定位置，返回值为原位置对应的
		 * 元素（替换元素操作）
		 */
		String old = list.set(2,"3");
		System.out.println("被替换的元素："+old);
		System.out.println(list);
	}
}
