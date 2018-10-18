package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ����ת��Ϊ����
 * 
 * Arrays������Ĺ����࣬���ṩ��һ����̬������asList
 * �÷������Խ�����������ת��Ϊһ��List���ϡ�
 */
public class ArrayToListDemo {
	public static void main(String[] args){
		String[] array = {"one","two","three","four","five"};
		
		List<String> list = Arrays.asList(array);
		System.out.println(list.size());
		System.out.println(list);
		/*
		 * �Լ���Ԫ�صĲ������Ƕ�����ӦԪ�صĲ���
		 */
		list.set(1,"2");
		System.out.println(list);
		
		for(String str:array){
			System.out.println(str);
		}
		/*
		 * ���������Ƕ����ģ����иü��ϲ�������ɾԪ�ء�
		 * ������׳��쳣
		 */
//		list.add("six");
//		for(String str:array){
//			System.out.println(str);
//		}
		
		/*
		 * ����Լ��ϲ�������Ҫ���д���һ�����ϲ���������
		 * ת���ļ���������Ԫ�ؼ��ɡ�
		 */
		//�ù��췽�����Դ�����ǰ����ʱ������������Ԫ��
		List<String> list2 = new ArrayList<String>(list);
		System.out.println("list2:"+list2);
		list2.add("six");
		System.out.println("list2:"+list2);
	}
}














