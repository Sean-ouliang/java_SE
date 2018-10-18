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
 * �̰߳�ȫ�ļ���
 * ���ϳ��õ�ʵ�����У�ArrayList,LinkedList,HashSet
 * ���Ƕ������̰߳�ȫ�ģ��ڶ��̲߳�������ʱ����ֲ�����ȫ
 * ���⡣
 * Collection�ṩ��һ�龲̬���������Խ����еļ���ת��Ϊ
 * һ���̰߳�ȫ�ġ�
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
		//��������list����ת��Ϊһ���̰߳�ȫ��list
		list = Collections.synchronizedList(list);
		System.out.println(list);
		
		//hashset�����̰߳�ȫ��
		Set<String> set = new HashSet<String>(list);
		System.out.println(set);
		//�ȸ�����set����ת��Ϊ�̰߳�ȫ��
		set = Collections.synchronizedSet(set);
		System.out.println(set);
		
		/*
		 * API�ֲ���Ҳ��˵��������һ���̰߳�ȫ�ļ��϶���
		 * Ҳ��������������ü��ϵĲ��������⡣����������
		 * ����̱߳����Լ���ɾԪ��ͬʱ�����������Ҫ����
		 * ά����������ɾԪ�صĻ���
		 */
		
		/*
		 * �������У�˫�������
		 * ���������ǲ�����ȫ�Ķ��У��ڶ��߳������ʹ�á�
		 * ���������ڲ���˫����ʵ�֣�����Ч�ʱȽϺá�
		 * BlockingQueue
		 * ����ʵ����:
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
		 * ����ʽ���
		 */
		try {
			/*
			 * �����н���У��п��ܻ���ڶ������˴治��ȥ�������
			 * ��ʱ�����ʹ��������Ӳ�����ָ����ʱʱ���Լ�
			 * ʱ�䵥λ���ڹ涨ʱ���������Խ�Ԫ������򷽷�ִ��
			 * ��ϣ�������׳���ʱ�쳣���ڵȴ��Ĺ����лᷢ��
			 * ���߳���������
			 */
			queue.offer("four",500,TimeUnit.MICROSECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}



















