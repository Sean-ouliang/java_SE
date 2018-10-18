package thread;
/**
 * 多个线程之间是异步运行代码的（各自代码运行之间不存在
 * 先后关系，各干各的）
 * 同步运行：执行有先后顺序，通常单线程运行代码是同步的
 * 异步运行：各干各的，多线程执行就是异步执行
 * 
 * 线程提供了：
 * void join()
 * 该方法允许一个线程在join方法所属线程后面等待，直到
 * 该线程执行完毕后再继续运行。所以使用join可以协调线程
 * 之间同步运行代码。
 * @author tarena
 *
 */
public class JoinDemo {
	//表示图片是否下载完毕
	public static boolean isFinish = false;
	public static void main(String[] args) {
		Thread download = new Thread(){
			public void run(){
				System.out.println("down:开始下载图片...");
				for(int i=0;i<=100;i++){
					System.out.println("down:"+i+"%");
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
					}
				}
				System.out.println("down:图片下载完毕！");
				isFinish = true;
			}
		};
		Thread show = new Thread(){
			public void run(){
				System.out.println("show:开始显示图片...");
				//模拟加载图片失败
				/*
				 * 加载图片前应当等待下载线程将图片下载完毕
				 */
				try {
					/*
					 * JDK1.8之前有一个要求（源自JVM内存分配
					 * 问题）：当一个方法的局部内部类当中想引用
					 * 该方法的其他局部变量时，该变量必须是final
					 * 的。
					 * 这里main方法的局部内部类show当中想引用
					 * download,而download本身是main方法的一个
					 * 局部变量，那么该变量就必须是final的
					 */
					download.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if(!isFinish){
					/*
					 * 当一个线程的run方法抛出了一个异常，
					 * 意味着该线程就会结束
					 */
					throw new RuntimeException("图片加载失败！");
				}
				System.out.println("show:显示图片完毕！");
			}
		};
		download.start();
		show.start();
	}
}
