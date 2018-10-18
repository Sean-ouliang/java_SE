package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Map的遍历分为三种
 * 1.遍历所有的key
 * 2.遍历每组键值对
 * 3.遍历所有的value(相对不常用)
 * @author tarena
 *
 */
public class IntegerMapDemo {
	public static void main(String[] args) {
		Map<String,Integer> map = 
//				new HashMap<String,Integer>();
				new LinkedHashMap<String,Integer>();
		/*
		 * LinkedHashMap是有序的Map，遍历时的顺序可以与
		 * put元素时的顺序一致。
		 */
		map.put("语文",99);
		map.put("数学",98);
		map.put("英语",97);
		map.put("物理",99);
		map.put("化学",96);
		System.out.println(map);
		
		/*
		 * Set<k> keySet()
		 * 将当前Map中所有的key以一个Set集合形式返回
		 * 遍历该Set集合等于遍历了所有的key
		 */
		Set<String> keySet = map.keySet();
		for(String key:keySet){
			System.out.println("key:"+key);
		}
		
		/*
		 * 遍历每一组键值对
		 * java.util.Map.Entry
		 * Entry用来定义Map中每一组键值对，即：每个实例
		 * 表示一个具体的键值对。
		 * Entry提供了获取其表示的键值对中key与value的
		 * 方法
		 * K getKey()
		 * V getValue()
		 * 
		 * Map提供了遍历键值对的方法:
		 * Set<Entry> entrySet()
		 * 将当前Map中每组键值对(Entry实例)存入Set集合
		 * 并返回
		 */
		Set<Entry<String,Integer>> entrySet = map.entrySet();
		for(Entry<String,Integer> entry:entrySet){
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key+":"+value);
		}
		
		/*
		 * 遍历所有的value
		 * Collection values()
		 * 将所有的value存入一个集合后返回
		 */
		Collection<Integer> values = map.values();
		for(Integer v:values){
			System.out.println("value:"+v);
		}
	}
	
}
