package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程池
 * 线程池主要有两个作用：
 * 1.控制线程数量
 * 2.重用线程
 * 线程数量过多会导致内存消耗大，并且会产生CPU过度切换导致
 * 整体并发性能降低的问题。并且频繁的创建销毁线程也会给系统
 * 带来负担。为此在实际开发中出现上述情况是我们都应当使用
 * 线程池来管理线程。
 * @author tarena
 *
 */
public class ThreadPoolDemo {
	public static void main(String[] args) {
		//创建固定大小的线程池(线程数量为2)
		ExecutorService threadPool = Executors.newFixedThreadPool(2);
		for(int i=0;i<5;i++){
			Runnable runn = new Runnable(){
				public void run() {
					Thread t = Thread.currentThread();
					try{
						System.out.println(t.getName()+"正在运行....");
						Thread.sleep(5000);
						System.out.println(t.getName()+"运行完毕");
					}catch(Exception e){
						e.printStackTrace();
					}
				}
				
			};
			//将任务交给线程池
			threadPool.execute(runn);
			System.out.println("指派了一个任务给线程池");
		}
		/*
		 * 停止线程池
		 * shutdown()：调用后，线程池不会马上停止，这时的线程
		 * 池不再接收新的任务，并且会讲话所有已经在线程池中的任务
		 * 全部执行完毕后停止
		 * shutdownNow():线程池会强制中断所有正在运行的线程并立即停止
		 */
		threadPool.shutdown();
		System.out.println("线程池关闭了");
	}
}
