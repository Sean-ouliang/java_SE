package map;

import java.util.HashMap;
import java.util.Map;

/**
 * java.util.Map
 * Map查找表，常用的数据结构，体现的样子为一个多行两列
 * 的表格。
 * 常用的实现类:HashMap
 * 
 * java.util.HashMap：散列表，使用散列算法实现的Map，当今
 * 查询速度最快的数据结构，也称为哈希表
 * @author tarena
 *
 */
public class MapDemo1 {
	public static void main(String[] args) {
		/*
		 * Map分两列，左列称为key，右列称为value
		 * key通常保存的是查询条件，value保存的是对应
		 * 的值。
		 */
		Map<String,Integer> map = new HashMap<String,Integer>();
		/*
		 * V put(K k,V v)
		 * 将给定的一组键值对存入到Map中
		 * 注意，Map有一个要求，key在Map中不允许重复，
		 * 是否重复是依靠key元素自身eqyuals比较的结果。
		 * 若使用的重复的key存入新的value，那么该操作为
		 * 替换value操作，这是put方法返回值为被替换的
		 * 原value，若put的key在Map中不存在，则直接保存
		 * 该组键值对并且返回值为null
		 * 
		 * 需要注意，若value的类型是一个包装类，那么在
		 * 接put方法的返回值时不要用其对应的基本类型
		 * 接收，避免出现自动拆箱。因为若put方法返回值
		 * 为null时自动拆箱会引发空指针异常。
		 */
		Integer value = map.put("语文",95);
		System.out.println("value:"+value);
		map.put("数学",96);
		map.put("英语",97);
		map.put("物理",99);
		map.put("化学",96);
		System.out.println(map);
		
		value = map.put("语文",77);
		System.out.println(map);
		System.out.println("value:"+value);
		
		/*
		 * V get(K k)
		 * 根据给定的key获取对应的value
		 * 若给定的key在Map中不存在，则返回值为null
		 */
		value = map.get("数学");
		System.out.println("数学:"+value);
		value = map.get("体育");
		System.out.println("体育:"+value);
		
		/*
		 * V remove(K k)
		 * 删除给定的key所对应的这组键值对，返回值为该
		 * key所对应的value。
		 */
		value = map.remove("语文");
		System.out.println(map);
		System.out.println("value:"+value);
		
	}
}
















