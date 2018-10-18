package thread;
/**
 * 互斥锁
 * 当使用synchronized控制多段代码，而这些同步块使用的
 * 同步监视器对象时同一个时，那么控制的这些代码片段之间
 * 就是互斥关系，多个线程不能同时执行它们。
 * @author tarena
 *
 */
public class SyncDemo4 {
	public static void main(String[] args) {
		Foo foo = new Foo();
		Thread t1 = new Thread(){
			public void run(){
				foo.methodA();
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				foo.methodB();
			}
		};
		t1.start();
		t2.start();
	}
}
class Foo{
	public synchronized void methodA(){
		Thread t = Thread.currentThread();
		try {
			System.out.println(t.getName()+":正在执行A方法");
			Thread.sleep(5000);
			System.out.println(t.getName()+":A方法执行完毕");
		} catch (Exception e) {
		}
	}
	
	public synchronized void methodB(){
		Thread t = Thread.currentThread();
		try {
			System.out.println(t.getName()+":正在执行B方法");
			Thread.sleep(5000);
			System.out.println(t.getName()+":B方法执行完毕");
		} catch (Exception e) {
		}
	}
}

