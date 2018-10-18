package collection;

import java.util.LinkedList;
import java.util.Queue;

/**
 * java.util.Queue
 * ����
 * ����ʱ��������ݽṹ�����Ա���һ��Ԫ�أ����Ǵ�ȡԪ��
 * ������ѭ�Ƚ��ȳ�ԭ��
 * @author tarena
 *
 */
public class QueueDemo {
	public static void main(String[] args){
		/*
		 * LinkedListʵ���˶��нӿڣ���Ϊ��������Ա���
		 * һ��Ԫ�أ������ص�����β��ɾԪ��Ч�ʸߣ�������
		 * ��������ص㡣
		 */
		Queue<Integer> queue = new LinkedList<Integer>();
		/*
		 * boolean offer(E e)
		 * ��Ӳ�����������Ԫ����ӵ�����ĩβ
		 */
		for(int i=0;i<10;i++){
			queue.offer(i);
		}
		queue.offer(10);
		System.out.println(queue);
		/*
		 * E poll()
		 * ���Ӳ���
		 * ��ȡ����Ԫ�أ���ȡ���Ԫ�ؼ������б�ɾ��
		 */
		Integer i = queue.poll();
		System.out.println(i);
		System.out.println(queue);
		/*
		 * E peek()
		 * ���ö���Ԫ��
		 */
		i = queue.peek();
		System.out.println(i);
		System.out.println(queue);
		/*
		 * ���ڶ��нӿڼ̳���Collection�����Կ���ʹ��
		 * �������������У����Ҳ���Ӱ������е�Ԫ��
		 */
		for(Integer q:queue){
			System.out.println(q);
		}
		System.out.println(queue);
		/*
		 * ��poll������������Ԫ��
		 */
		while(queue.size()>0){
			System.out.println(queue.poll());
		}
		System.out.println(queue);
	}
}
