package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Map�ı�����Ϊ����
 * 1.�������е�key
 * 2.����ÿ���ֵ��
 * 3.�������е�value(��Բ�����)
 * @author tarena
 *
 */
public class IntegerMapDemo {
	public static void main(String[] args) {
		Map<String,Integer> map = 
//				new HashMap<String,Integer>();
				new LinkedHashMap<String,Integer>();
		/*
		 * LinkedHashMap�������Map������ʱ��˳�������
		 * putԪ��ʱ��˳��һ�¡�
		 */
		map.put("����",99);
		map.put("��ѧ",98);
		map.put("Ӣ��",97);
		map.put("����",99);
		map.put("��ѧ",96);
		System.out.println(map);
		
		/*
		 * Set<k> keySet()
		 * ����ǰMap�����е�key��һ��Set������ʽ����
		 * ������Set���ϵ��ڱ��������е�key
		 */
		Set<String> keySet = map.keySet();
		for(String key:keySet){
			System.out.println("key:"+key);
		}
		
		/*
		 * ����ÿһ���ֵ��
		 * java.util.Map.Entry
		 * Entry��������Map��ÿһ���ֵ�ԣ�����ÿ��ʵ��
		 * ��ʾһ������ļ�ֵ�ԡ�
		 * Entry�ṩ�˻�ȡ���ʾ�ļ�ֵ����key��value��
		 * ����
		 * K getKey()
		 * V getValue()
		 * 
		 * Map�ṩ�˱�����ֵ�Եķ���:
		 * Set<Entry> entrySet()
		 * ����ǰMap��ÿ���ֵ��(Entryʵ��)����Set����
		 * ������
		 */
		Set<Entry<String,Integer>> entrySet = map.entrySet();
		for(Entry<String,Integer> entry:entrySet){
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key+":"+value);
		}
		
		/*
		 * �������е�value
		 * Collection values()
		 * �����е�value����һ�����Ϻ󷵻�
		 */
		Collection<Integer> values = map.values();
		for(Integer v:values){
			System.out.println("value:"+v);
		}
	}
	
}
