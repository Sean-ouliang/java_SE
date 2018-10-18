package map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * HashMap���̰߳�ȫ�ģ�ͬ������ʹ��Collections��һ��
 * Mapת��Ϊ�̰߳�ȫ��
 * @author tarena
 *
 */
public class SyncMapDemo {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("����",99);
		map.put("��ѧ",98);
		map.put("Ӣ��",97);
		System.out.println(map);
		
		map = Collections.synchronizedMap(map);
		System.out.println(map);
	}
}
