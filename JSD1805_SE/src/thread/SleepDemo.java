package thread;
/**
 * static void sleep(long ms)
 * 线程提供的sleep方法可以让运行该方法的线程处于阻塞
 * 状态指定毫秒，当超时后，线程会自动回到RUNNABLE状态
 * 等待再次分配时间片并发运行。
 * 当一个线程处于BLOCK（阻塞）状态时，CPU会立刻释放其时间片
 * ，去执行其他线程
 * @author tarena
 *
 */
public class SleepDemo {
	public static void main(String[] args) {
		System.out.println("程序开始了！");
		
		try {
			//Thread.sleep(5000);
			for(int i=100;i>0;i--){
				Thread.sleep(1000);
				System.out.println(i);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("程序结束了！");
	}
}
