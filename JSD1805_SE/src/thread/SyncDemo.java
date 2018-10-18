package thread;
/**
 * 多线程并发安全问题
 * 当多个线程并发操作同一资源时，由于线程切换实际不确定
 * 导致程序未按照设计要求的顺序执行而出现了逻辑混乱。
 * 严重时可能导致系统瘫痪。
 * 
 * 解决多线程并发安全问题的方式就是让多个线程排队访问该
 * 资源。江将异步操作变为同步操作。
 * 
 * @author tarena
 *
 */
public class SyncDemo {
	public static void main(String[] args) {
		Table table = new Table();
		Thread t1 = new Thread(){
			public void run(){
				while(true){
					int d = table.getBeans();
					Thread.yield();
					System.out.println(getName()+":"+d);
				}
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				while(true){
					int d = table.getBeans();
					Thread.yield();
					System.out.println(getName()+":"+d);
				}
			}
		};
		t1.start();
		t2.start();
	}
}
class Table{
	private int beans = 20;
	/**
	 * 当一个方法被synchronzied修饰后，那么该方法称为
	 * 同步方法，即：多个线程不能同时进入方法内部执行，
	 * 只能一个线程执行完，其他线程在进来执行。
	 * 将异步操作改为同步操作就解决了并发安全问题。
	 * 
	 * 成员方法上使用synchronized，那么同步监视器
	 * 对象就是当前方法所属对象，即方法中看到的this
	 */
	public synchronized int getBeans(){
		if(beans==0){
			throw new RuntimeException("没有豆子了");
		}
		Thread.yield();//模拟线程发生切换(主动放弃CPU时间片)
		return beans--;
	}
}