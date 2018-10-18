package lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 1.8֮�󣬼��Ϻ�Map�Ƴ���Ϊlambda��ʾʽʵ�ֵı���
 * ���������Ҷ���һ���̰߳�ȫ�ļ��ϻ�Map���ԣ�ʹ������
 * ������ʽ�ǿ��Ա�֤������ȫ�ġ�����ǰʹ�õ���������
 * ��֤����Ҫ����ά��������ȫ��
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
		
		//lambda��ʽ
		list.forEach((str)->System.out.println(str));
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("����",99);
		map.put("��ѧ",98);
		map.put("Ӣ��",97);
		map.put("����",96);
		map.put("��ѧ",99);
		
		map.forEach((k,v)->System.out.println(k+":"+v));
	}
}
