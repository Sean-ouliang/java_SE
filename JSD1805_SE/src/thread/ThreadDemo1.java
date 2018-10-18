package thread;
/**
 * 多线程
 * 多线程可以实现多段代码“同时运行”的效果。实际上是
 * 并发运行的。
 * 
 * 创建线程有两种方式
 * 方式1.继承Thread并重写run方法。run方法的作用是定义
 *      该线程要执行的任务。
 * @author tarena
 *
 */
public class ThreadDemo1 {
	public static void main(String[] args) {
		Thread t1 = new MyThread1();
		Thread t2 = new MyThread2();
		/*
		 * 启动线程要调用start方法，而不是直接调用run方法
		 * 当一个线程的start方法调用完毕后，该线程会纳入到
		 * 线程调度中，一旦被分配CPU时间片，该线程会自动的
		 * 执行其run方法开始运行任务。所以一个线程的start
		 * 方法执行后run方法会很快的被运行起来。
		 */
		t1.start();
		t2.start();
		System.out.println("两个线程运行了!");
	}
}
/**
 * 第一种创建线程的方式比较简单，适合使用匿名内部类快速
 * 创建临时线程跑任务。
 * 但是它也存在两种设计不足
 * 1.由于需要继承Thread，而java又是单继承的，这就导致若
 *   继承了Thread就无法再继承其他类去复用方法。这在实际
 *   开发中是出现比较多的矛盾。
 * 2.继承Thread后需要重写run方法来定义任务，这就导致了
 *   线程与线程要执行的任务之间存在一个必然的耦合关系
 *   导致线程重用性变差。
 * @author tarena
 *
 */
class MyThread1 extends Thread{
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("你是谁啊？");
		}
	}
}
class MyThread2 extends Thread{
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("我是查水表的！");
		}
	}
}