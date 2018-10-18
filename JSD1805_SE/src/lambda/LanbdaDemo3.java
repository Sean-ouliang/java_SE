package lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 1.8之后，集合和Map推出了为lambda表示式实现的遍历
 * 操作。并且对于一个线程安全的集合或Map而言，使用这种
 * 遍历方式是可以保证并发安全的。而以前使用迭代器则不能
 * 保证，需要自行维护并发安全。
 */
public class LanbdaDemo3 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		
		for(String str:list){
			System.out.println(str);
		}
		
		//lambda形式
		list.forEach((str)->System.out.println(str));
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("语文",99);
		map.put("数学",98);
		map.put("英语",97);
		map.put("物理",96);
		map.put("化学",99);
		
		map.forEach((k,v)->System.out.println(k+":"+v));
	}
}
