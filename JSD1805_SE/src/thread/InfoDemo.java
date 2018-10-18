package thread;
/**
 * 获取线程相关信息的一组方法
 * @author tarena
 *
 */
public class InfoDemo {
	public static void main(String[] args) {
		//获取main线程
		Thread main = Thread.currentThread();
		//获取线程名字
		String name = main.getName();
		System.out.println(name);
		//获取唯一标识
		long id = main.getId();
		System.out.println(id);
		//获取线程优先级
		int priority = main.getPriority();
		System.out.println("优先级："+priority);
		
		//是否处于活动状态
		boolean isAlive = main.isAlive();
		//判断线程是否为守护线程
		boolean isDaemon = main.isDaemon();
		//线程是否被中断
		boolean isInterrupted = main.isInterrupted();
		System.out.println("isAlive:"+isAlive);
		System.out.println("isDaemon:"+isDaemon);
		System.out.println("isInterruoted:"+isInterrupted);
	}
}
