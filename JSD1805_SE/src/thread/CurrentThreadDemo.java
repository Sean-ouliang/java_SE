package thread;
/**
 * Thread�ṩ��һ����̬������
 * 
 * static Thread currentThread()
 * �÷������Ի�ȡ�����и÷������̲߳����䷵��
 * 
 * �������һ������Ҫ��API��ThreadLocal�������������
 * �����������ġ���������spring��ʹ��aop��������ʱ
 * ���õ������������
 * 
 * @author tarena
 *
 */
public class CurrentThreadDemo {
	public static void main(String[] args) {
		//��ȡ����main�������߳�
		Thread main = Thread.currentThread();
		System.out.println("����main�������߳��ǣ�"+main);
		dosome();
		
		Thread t = new Thread(){
			public void run(){
				Thread t = Thread.currentThread();
				System.out.println("�Զ����̣߳�"+t);
				dosome();
			}
		};
		t.start();
	}
	public static void dosome(){
		//��ȡ����dosome�������߳�
		Thread t = Thread.currentThread();
		System.out.println("��ȡ����dosome�������߳��ǣ�"+t);
	}
}
