package thread;
/**
 * sleep方法要求必须处理中断异常：InterruptedException
 * 当我们调用一个线程的interrupException方法时，可以中断一个
 * 正在运行的线程，但是若该线程正在处于阻塞时，那么调用
 * 该方法时并不是中断开线程，而仅是中断其阻塞状态，这时
 * 会抛出中断异常，通知程序该线程的阻塞状态被中断。
 * @author tarena
 *
 */
public class SleepDemo2 {
	public static void main(String[] args) {
		Thread lin = new Thread(){
			public void run(){
				try{
					Thread.sleep(10000000);
				}catch(InterruptedException e){
					System.out.println("林：干嘛呢！干嘛呢！干嘛呢！干嘛呢！都破相了");
				}
				System.out.println("林：醒了");
			}
		};
		Thread huang = new Thread(){
			public void run(){
				System.out.println("开始砸墙！");
				for(int i=0;i<5;i++){
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("80!");
				}
				System.out.println("咣当！");
				System.out.println("黄：搞定！");
				/*
				 * 由于lin线程处于阻塞，这边中断的话，lin的sleep
				 * 方法会抛出中断异常
				 */
				lin.interrupt();
			}
		};
		lin.start();
		huang.start();
	}
}
