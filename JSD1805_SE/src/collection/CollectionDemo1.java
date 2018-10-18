package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * java.util.Collection
 * 集合
 * 集合是一组数据结构，与数组一样，用来保存一组元素。
 * 集合提供了一系列操作元素的相关方法，使用更方便。
 * 
 * Collection是所有集合的顶级接口，规定了所有集合都应当
 * 具备的方法。
 * 有两个常用的派生接口：
 * java.util.List:可重复集且有序
 * java.util.Set：不可重复集
 * 元素是否重复是依靠元素自身的equals比较的结果。
 * @author tarena
 *
 */
public class CollectionDemo1 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		/*
		 * boolean add(E e)
		 * 向当前集合中添加给定元素，当该元素成功添加则
		 * 返回true
		 * 由于Set集合是不可重复集，所以添加重复元素是会
		 * 放回false的，List集合不存在该情况
		 */
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		c.add("five");
		System.out.println(c);
		/*
		 * int size()
		 * 返回当前集合的元素个数
		 */
		int size = c.size();
		System.out.println("size:"+size);
		
		/*
		 * boolean isEmpty()
		 * 判断当前集合是否为空集（不含有任何元素）
		 */
		boolean empty = c.isEmpty();
		System.out.println("是否为空集："+empty);
		//清空集合
		c.clear();
		System.out.println("集合已清空");
		System.out.println("size:"+c.size());
		System.out.println("是否为空集："+c.isEmpty());
	}
}
