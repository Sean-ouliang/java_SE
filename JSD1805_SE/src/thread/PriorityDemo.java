package thread;
/**
 * 线程的优先级
 * 线程在并发运行时对于线程调度的工作是不可控的，即：
 * 不能主动获取CPU时间片，只能被动的被分配。但是线程调度
 * 会尽可能均匀的将时间片分配给所有并发运行的线程，但不能
 * 保证每个线程“一个一次”
 * 通过调整线程的优先级可以最大程度的改善获取CPU时间片的
 * 次数。理论上，线程优先级越高的线程获取CPU时间片的次数
 * 越多。
 * @author tarena
 *
 */
public class PriorityDemo {
	public static void main(String[] args) {
		Thread max = new Thread(){
			public void run(){
				for(int i=0;i<10000;i++){
					System.out.println("max");
				}
			}
		};
		Thread norm = new Thread(){
			public void run(){
				for(int i=0;i<10000;i++){
					System.out.println("nor");
				}
			}
		};
		Thread min = new Thread(){
			public void run(){
				for(int i=0;i<10000;i++){
					System.out.println("min");
				}
			}
		};
		/*
		 * 线程优先级有10个等级，分别用整数1-10表示
		 * 其中1为最低，10为最高，5为默认
		 */
		max.setPriority(Thread.MAX_PRIORITY);
		min.setPriority(Thread.MIN_PRIORITY);
		max.start();
		norm.start();
		min.start();
	}
}
