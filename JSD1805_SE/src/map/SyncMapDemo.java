package map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * HashMap并线程安全的，同样可以使用Collections将一个
 * Map转换为线程安全的
 * @author tarena
 *
 */
public class SyncMapDemo {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("语文",99);
		map.put("数学",98);
		map.put("英语",97);
		System.out.println(map);
		
		map = Collections.synchronizedMap(map);
		System.out.println(map);
	}
}
