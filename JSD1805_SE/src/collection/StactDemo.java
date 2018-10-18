package collection;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 栈
 * 栈也是一个经典的数据结构，可以保存一组元素，但是存取必须
 * 遵循先进后出原则。
 * 通常使用栈是为了实现“后退”这样的功能。
 * 
 * Deque双端队列可以实现栈操作，并且为栈也提供了对应了的入栈
 * 与出栈方法（push,pop）.
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
		 * 用pop遍历
		 */
		System.out.println("遍历:");
		while(stack.size()>0){
			System.out.println(stack.pop());
		}
		System.out.println(stack);
	}
}
