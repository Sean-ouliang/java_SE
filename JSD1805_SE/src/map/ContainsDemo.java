package map;

import java.util.HashMap;
import java.util.Map;

/**
 * �жϵ�ǰMap�Ƿ����������key��value
 * @author tarena
 *
 */
public class ContainsDemo {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("����",95);
		map.put("��ѧ",96);
		map.put("Ӣ��",97);
		map.put("����",99);
		map.put("��ѧ",96);
		System.out.println(map);
		
		/*
		 * boolean containsKey(K k)
		 * boolean containsValue(V v)
		 */
		boolean ck = map.containsKey("����");
		System.out.println("�Ƿ����k:"+ck);
		
		boolean cv = map.containsValue(96);
		System.out.println("�Ƿ����v:"+cv);
	}
}
