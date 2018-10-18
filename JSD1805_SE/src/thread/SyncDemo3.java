package thread;
/**
 * 静态方法若使用synchronized修饰后，那么该方法一定具有
 * 同步效果。
 * 实际上静态方法的同步监视器对象为当前类的类对象。
 * 类对象后面在学习反射的知识是介绍。
 * @author tarena
 *
 */
public class SyncDemo3 {
	public static void main(String[] args) {
		Boo b1 = new Boo();
		Boo b2 = new Boo();
		Thread t1 = new Thread(){
			public void run(){
				b1.dosoem();
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				b2.dosoem();
			}
		};
		t1.start();
		t2.start();
		
		
//		Thread t1 = new Thread(){
//			public void run(){
//				Boo.dosoem();
//			}
//		};
//		Thread t2 = new Thread(){
//			public void run(){
//				Boo.dosoem();
//			}
//		};
//		t1.start();
//		t2.start();
	}
}
class Boo{
	public static synchronized void dosoem(){
		Thread t = Thread.currentThread();
		try {
			System.out.println(t.getName()+":正在执行dosome方法");
			Thread.sleep(5000);
			System.out.println(t.getName()+":dosome方法执行完毕");
		} catch (Exception e) {
		}
	}
}
