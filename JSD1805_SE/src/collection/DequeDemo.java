package collection;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 双端队列java.util.Deque
 * Deque接口继承自Queue，双端队列是两端都可以做进出对操作
 * 的队列。并且提供了明确方向的进出队列方法
 * 常见实现类：java.util.LinkedList
 * 
 * @author tarena
 *
 */
public class DequeDemo {
	public static void main(String[] args) {
		Deque<String> deque = new LinkedList<String>();
		deque.offer("one");
		deque.offer("two");
		System.out.println(deque);
		
		deque.offerFirst("three");
		System.out.println(deque);
		
		deque.offerLast("four");
		System.out.println(deque);
		
		String str = deque.poll();
		System.out.println(str);
		System.out.println(deque);
		
		str = deque.pollFirst();
		System.out.println(str);
		System.out.println(deque);
		
		str = deque.pollLast();
		System.out.println(str);
		System.out.println(deque);
	}
}
