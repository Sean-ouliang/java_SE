package collection;

import java.util.Deque;
import java.util.LinkedList;

/**
 * ջ
 * ջҲ��һ����������ݽṹ�����Ա���һ��Ԫ�أ����Ǵ�ȡ����
 * ��ѭ�Ƚ����ԭ��
 * ͨ��ʹ��ջ��Ϊ��ʵ�֡����ˡ������Ĺ��ܡ�
 * 
 * Deque˫�˶��п���ʵ��ջ����������ΪջҲ�ṩ�˶�Ӧ�˵���ջ
 * ���ջ������push,pop��.
 * @author tarena
 *
 */
public class StactDemo {
	public static void main(String[] args){
		Deque<String> stack = new LinkedList<String>();
		stack.push("one");
		stack.push("two");
		stack.push("three");
		stack.push("four");
		System.out.println(stack);
		String str = stack.pop();
		System.out.println(str);
		System.out.println(stack);
		
		for(String s:stack){
			System.out.println(s);
		}
		
		/*
		 * ��pop����
		 */
		System.out.println("����:");
		while(stack.size()>0){
			System.out.println(stack.pop());
		}
		System.out.println(stack);
	}
}
