package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Collection��sort(List list)�����ǰ��ռ���Ԫ�������
 * �ȽϹ���ȽϺ���С�����������ġ�����ʱ����Ԫ���Ѿ�ʵ��
 * �˱ȽϹ��򣬵��Ǹù�������������������
 * 
 * Collection�ṩ��һ�����ص�sort������
 * static void sort��List list,Comparator com)
 * �����򷽷�Ҫ���ڴ���һ���������ò�����һ���Ƚ������÷���
 * ��ʹ�øñȽ����ıȽϹ���Լ���Ԫ�ؽ��бȽϰ��ձȽϵ�
 * �����������
 * 
 * @author tarena
 *
 */
public class SortListDemo3 {
	public static void main(String[] args){
		List<String> list = new ArrayList<String>();
		list.add("����ʦ");
		list.add("����");
		list.add("С����ʦ");
		System.out.println(list);
		
//		MyComparator com = new MyComparator();
		
		//ͨ��ʹ�������ڲ��ഴ���Ƚ���
		Comparator<String> com = new Comparator<String>(){
			public int compare(String o1, String o2) {
				return o1.length()-o2.length();
			}
		};
		//����
		Collections.sort(list,com);
		System.out.println(list);
	}
}

/**
 * �Ƚ���
 * @author tarena
 *
 */
class MyComparator implements Comparator<String>{
	/*
	 * ����ֵ>0:o1����o2
	 * ����ֵ<0:o1С��o2
	 * ����ֵ=0:o1����o2
	 * (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	public int compare(String o1, String o2) {
		return o1.length()-o2.length();
	}
}
