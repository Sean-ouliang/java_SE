package collection;

import java.util.LinkedList;
import java.util.Queue;

/**
 * java.util.Queue
 * 队列
 * 队列时经典的数据结构，可以保存一组元素，但是存取元素
 * 必须遵循先进先出原则。
 * @author tarena
 *
 */
public class QueueDemo {
	public static void main(String[] args){
		/*
		 * LinkedList实现了队列接口，因为链表本身可以保存
		 * 一组元素，并且特点是首尾增删元素效率高，这正好
		 * 满足队列特点。
		 */
		Queue<Integer> queue = new LinkedList<Integer>();
		/*
		 * boolean offer(E e)
		 * 入队操作，将给定元素添加到队列末尾
		 */
		for(int i=0;i<10;i++){
			queue.offer(i);
		}
		queue.offer(10);
		System.out.println(queue);
		/*
		 * E poll()
		 * 出队操作
		 * 获取队首元素，获取后该元素即队列中被删除
		 */
		Integer i = queue.poll();
		System.out.println(i);
		System.out.println(queue);
		/*
		 * E peek()
		 * 引用队首元素
		 */
		i = queue.peek();
		System.out.println(i);
		System.out.println(queue);
		/*
		 * 由于队列接口继承自Collection，所以可以使用
		 * 迭代器遍历队列，并且不会影响队列中的元素
		 */
		for(Integer q:queue){
			System.out.println(q);
		}
		System.out.println(queue);
		/*
		 * 用poll方法遍历队列元素
		 */
		while(queue.size()>0){
			System.out.println(queue.poll());
		}
		System.out.println(queue);
	}
}
