package thread;
/**
 * ��̬������ʹ��synchronized���κ���ô�÷���һ������
 * ͬ��Ч����
 * ʵ���Ͼ�̬������ͬ������������Ϊ��ǰ��������
 * ����������ѧϰ�����֪ʶ�ǽ��ܡ�
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
			System.out.println(t.getName()+":����ִ��dosome����");
			Thread.sleep(5000);
			System.out.println(t.getName()+":dosome����ִ�����");
		} catch (Exception e) {
		}
	}
}
