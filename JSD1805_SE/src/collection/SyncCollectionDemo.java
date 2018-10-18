package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * 线程安全的集合
 * 集合常用的实现类有：ArrayList,LinkedList,HashSet
 * 它们都不是线程安全的，在多线程并发操作时会出现并发安全
 * 问题。
 * Collection提供了一组静态方法，可以将现有的集合转换为
 * 一个线程安全的。
 * @author tarena
 *
 */
public class SyncCollectionDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		System.out.println(list);
		//将给定的list集合转换为一个线程安全的list
		list = Collections.synchronizedList(list);
		System.out.println(list);
		
		//hashset不是线程安全的
		Set<String> set = new HashSet<String>(list);
		System.out.println(set);
		//先给定的set集合转换为线程安全的
		set = Collections.synchronizedSet(set);
		System.out.println(set);
		
		/*
		 * API手册上也有说明，对于一个线程安全的集合而言
		 * 也不与迭代器遍历该集合的操作做互斥。所以若存在
		 * 多个线程遍历以及增删元素同时操作的情况，要自行
		 * 维护遍历与增删元素的互斥
		 */
		
		/*
		 * 阻塞队列，双缓冲队列
		 * 阻塞队列是并发安全的队列，在多线程情况下使用。
		 * 并且由于内部由双缓冲实现，并发效率比较好。
		 * BlockingQueue
		 * 常用实现类:
		 * ArrayBlockingQueue
		 * LinkedBlockingQueue
		 */
		LinkedBlockingQueue<String> queue = new LinkedBlockingQueue<String>();
		queue.offer("one");
		queue.offer("two");
		System.out.println(queue);
		
		String str = queue.poll();
		System.out.println(str);
		System.out.println(queue);
		
		/*
		 * 阻塞式入队
		 */
		try {
			/*
			 * 对于有界队列，有可能会存在队列满了存不进去的情况，
			 * 这时间可以使用阻塞入队操作，指定超时时间以及
			 * 时间单位，在规定时间内若可以将元素入队则方法执行
			 * 完毕，否则会抛出超时异常。在等待的过程中会发生
			 * 该线程阻塞现象。
			 */
			queue.offer("four",500,TimeUnit.MICROSECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}



















