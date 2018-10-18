package thread;
/**
 * 守护线程
 * 守护线程又称为后台线程。默认创建出来的线程都都是前台
 * 线程，后台线程是需要在线程启动前单独进行设置。设置
 * 的方法为：
 * void setDaemon(boolean on)
 * 当参数为true时，该线程被设置为守护线程（后台线程）
 * 
 * 在使用上前台线程与后台线程没有什么区别，但是在结束时机
 * 上有一个不同，即：当进程结束时，所有还在运行的守护线程
 * 都会被强制中断。
 * 进程的结束：当一个进程中的所有前台线程都结束时，进程结束
 * @author tarena
 *
 */
public class DaemonThreadDemo {
	public static void main(String[] args) {
		Thread rose = new Thread(){
			public void run(){
				for(int i=0;i<5;i++){
					System.out.println("rose:let mi go!");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
				}
				System.out.println("rose:啊啊啊啊啊AAAAAA！");
				System.out.println("噗通");
			}		
		};
		Thread jack = new Thread(){
			public void run(){
				while(true){
					System.out.println("jack:you jump!i jump!");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
				}
			}
		};
		rose.start();
		jack.setDaemon(true);
		jack.start();

//		while(true){
			/*
			 * main线程最先结束
			 * 
			 * main方法为前台线程，如果main线程不结束，即便后前台rose线程
			 * 结束了，后台jack线程也不会结束
			 */
//		}
	}
}
