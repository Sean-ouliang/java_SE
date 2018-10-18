package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 泛型在集合中使用广泛，用于约束集合中的元素类型。
 * @author tarena
 *
 */
public class CollectionDemo6 {
	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		//c.add(1);//在传入其他类型参数时编译不通过
		
		/*
		 * 新循环遍历就无需再用Object接收元素了
		 */
		for(String str:c){
			System.out.println(str);
		}
		
		System.out.println("使用迭代器遍历集合：");
		/*
		 * 迭代器也支持泛型，实际类型与其遍历的集合的泛型
		 * 一致即可
		 */
		Iterator<String> it = c.iterator();
		while(it.hasNext()){
			String str = it.next();
			System.out.println(str);
		}
	}
}
