package thread;
/**
 * 使用匿名内部类创建形式完成两种线程的创建方式
 * @author tarena
 *
 */
public class ThreadDemo3 {
	public static void main(String[] args) {
		//方式1
		Thread t1 = new Thread(){//匿名内部类没有类名，直接创建对象即可
			public void run(){
				for(int i=0;i<1000;i++){
					System.out.println("你是谁啊？");
				}
			}
		};
				
		//方式2
		Runnable r2 = new Runnable(){
			public void run(){
				for(int i=0;i<1000;i++){
					System.out.println("我是查水表的！");
				}
			}
		};
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
	}
}
