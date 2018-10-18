package thread;
/**
 * ��ȡ�߳������Ϣ��һ�鷽��
 * @author tarena
 *
 */
public class InfoDemo {
	public static void main(String[] args) {
		//��ȡmain�߳�
		Thread main = Thread.currentThread();
		//��ȡ�߳�����
		String name = main.getName();
		System.out.println(name);
		//��ȡΨһ��ʶ
		long id = main.getId();
		System.out.println(id);
		//��ȡ�߳����ȼ�
		int priority = main.getPriority();
		System.out.println("���ȼ���"+priority);
		
		//�Ƿ��ڻ״̬
		boolean isAlive = main.isAlive();
		//�ж��߳��Ƿ�Ϊ�ػ��߳�
		boolean isDaemon = main.isDaemon();
		//�߳��Ƿ��ж�
		boolean isInterrupted = main.isInterrupted();
		System.out.println("isAlive:"+isAlive);
		System.out.println("isDaemon:"+isDaemon);
		System.out.println("isInterruoted:"+isInterrupted);
	}
}
