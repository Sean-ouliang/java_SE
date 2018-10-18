package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 集合的排序
 * 
 * java.util.Collections是集合的工具类，提供了一系列操作
 * 集合的静态方法。其中sort方法可以对List集合进行自然排序
 * 即：从小到大排序集合元素
 * @author tarena
 *
 */
public class SortListDemo1 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<10;i++){
			list.add((int)(Math.random()*100));
		}
		System.out.println(list);
		//排序
		Collections.sort(list);
		System.out.println(list);
		//乱序
		Collections.shuffle(list);
		System.out.println(list);
	}
}
