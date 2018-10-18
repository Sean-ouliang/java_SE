package map;

import java.util.HashMap;
import java.util.Map;

/**
 * 判断当前Map是否包含给定的key或value
 * @author tarena
 *
 */
public class ContainsDemo {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("语文",95);
		map.put("数学",96);
		map.put("英语",97);
		map.put("物理",99);
		map.put("化学",96);
		System.out.println(map);
		
		/*
		 * boolean containsKey(K k)
		 * boolean containsValue(V v)
		 */
		boolean ck = map.containsKey("语文");
		System.out.println("是否包含k:"+ck);
		
		boolean cv = map.containsValue(96);
		System.out.println("是否包含v:"+cv);
	}
}
