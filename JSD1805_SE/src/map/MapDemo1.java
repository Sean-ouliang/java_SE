package map;

import java.util.HashMap;
import java.util.Map;

/**
 * java.util.Map
 * Map���ұ����õ����ݽṹ�����ֵ�����Ϊһ����������
 * �ı��
 * ���õ�ʵ����:HashMap
 * 
 * java.util.HashMap��ɢ�б�ʹ��ɢ���㷨ʵ�ֵ�Map������
 * ��ѯ�ٶ��������ݽṹ��Ҳ��Ϊ��ϣ��
 * @author tarena
 *
 */
public class MapDemo1 {
	public static void main(String[] args) {
		/*
		 * Map�����У����г�Ϊkey�����г�Ϊvalue
		 * keyͨ��������ǲ�ѯ������value������Ƕ�Ӧ
		 * ��ֵ��
		 */
		Map<String,Integer> map = new HashMap<String,Integer>();
		/*
		 * V put(K k,V v)
		 * ��������һ���ֵ�Դ��뵽Map��
		 * ע�⣬Map��һ��Ҫ��key��Map�в������ظ���
		 * �Ƿ��ظ�������keyԪ������eqyuals�ȽϵĽ����
		 * ��ʹ�õ��ظ���key�����µ�value����ô�ò���Ϊ
		 * �滻value����������put��������ֵΪ���滻��
		 * ԭvalue����put��key��Map�в����ڣ���ֱ�ӱ���
		 * �����ֵ�Բ��ҷ���ֵΪnull
		 * 
		 * ��Ҫע�⣬��value��������һ����װ�࣬��ô��
		 * ��put�����ķ���ֵʱ��Ҫ�����Ӧ�Ļ�������
		 * ���գ���������Զ����䡣��Ϊ��put��������ֵ
		 * Ϊnullʱ�Զ������������ָ���쳣��
		 */
		Integer value = map.put("����",95);
		System.out.println("value:"+value);
		map.put("��ѧ",96);
		map.put("Ӣ��",97);
		map.put("����",99);
		map.put("��ѧ",96);
		System.out.println(map);
		
		value = map.put("����",77);
		System.out.println(map);
		System.out.println("value:"+value);
		
		/*
		 * V get(K k)
		 * ���ݸ�����key��ȡ��Ӧ��value
		 * ��������key��Map�в����ڣ��򷵻�ֵΪnull
		 */
		value = map.get("��ѧ");
		System.out.println("��ѧ:"+value);
		value = map.get("����");
		System.out.println("����:"+value);
		
		/*
		 * V remove(K k)
		 * ɾ��������key����Ӧ�������ֵ�ԣ�����ֵΪ��
		 * key����Ӧ��value��
		 */
		value = map.remove("����");
		System.out.println(map);
		System.out.println("value:"+value);
		
	}
}
















