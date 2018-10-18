package thread;
/**
 * Thread提供了一个静态方法：
 * 
 * static Thread currentThread()
 * 该方法可以获取到运行该方法的线程并将其返回
 * 
 * 后面会有一个很重要的API：ThreadLocal，就是利用这个
 * 方法解决问题的。包括后期spring中使用aop管理事务时
 * 就用到了这个操作。
 * 
 * @author tarena
 *
 */
public class CurrentThreadDemo {
	public static void main(String[] args) {
		//获取运行main方法的线程
		Thread main = Thread.currentThread();
		System.out.println("运行main方法的线程是："+main);
		dosome();
		
		Thread t = new Thread(){
			public void run(){
				Thread t = Thread.currentThread();
				System.out.println("自定义线程："+t);
				dosome();
			}
		};
		t.start();
	}
	public static void dosome(){
		//获取运行dosome方法的线程
		Thread t = Thread.currentThread();
		System.out.println("获取运行dosome方法的线程是："+t);
	}
}
