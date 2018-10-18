package thread;
/**
 * 有效的缩小同步范围可以在保证并发安全的前提下提高并发
 * 的效率。
 * 
 * 同步块可以更准确的控制需要同步运行的代码片段，语法：
 * 
 * synchronized（同步监视器对象）{
 * 	需要同步运行的代码片段
 * }
 * @author tarena
 *
 */
public class SyncDemo2 {
	public static void main(String[] args) {
		Shop shop = new Shop();
		Thread t1 = new Thread(){
			public void run(){
				shop.buy();
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				shop.buy();
			}
		};
		
		t1.start();
		t2.start();
		/*
		 * 两个对象不一样，不存在并发安全问题
		 * 
		Shop shop1 = new Shop();
		Shop shop2 = new Shop();
		Thread t1 = new Thread(){
			public void run(){
				shop1.buy();
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				shop2.buy();
			}
		};
		
		t1.start();
		t2.start();
		*/
	}
}
class Shop{
	public void buy(){
		Thread t = Thread.currentThread();
		try {
			System.out.println(t.getName()+":正在挑衣服");
			Thread.sleep(5000);
			/*
			 * 使用同步块精确的控制需要同步的代码片片段。
			 * 需要注意，若想让多个线程同步运行控制的代码片段
			 * 必须保证同步监视器对象多个线程看到的是同一个。
			 */
//			synchronized(new Object()){//当线程调用时会新创建一个实例变量
			synchronized(this){
				System.out.println(t.getName()+":正在试衣服");
				Thread.sleep(5000);
			}
			
			System.out.println(t.getName()+":结账离开");
		} catch (Exception e) {
		}
	}
}