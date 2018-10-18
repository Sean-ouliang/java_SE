package thread;
/**
 * sleep����Ҫ����봦���ж��쳣��InterruptedException
 * �����ǵ���һ���̵߳�interrupException����ʱ�������ж�һ��
 * �������е��̣߳����������߳����ڴ�������ʱ����ô����
 * �÷���ʱ�������жϿ��̣߳��������ж�������״̬����ʱ
 * ���׳��ж��쳣��֪ͨ������̵߳�����״̬���жϡ�
 * @author tarena
 *
 */
public class SleepDemo2 {
	public static void main(String[] args) {
		Thread lin = new Thread(){
			public void run(){
				try{
					Thread.sleep(10000000);
				}catch(InterruptedException e){
					System.out.println("�֣������أ������أ������أ������أ���������");
				}
				System.out.println("�֣�����");
			}
		};
		Thread huang = new Thread(){
			public void run(){
				System.out.println("��ʼ��ǽ��");
				for(int i=0;i<5;i++){
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("80!");
				}
				System.out.println("�۵���");
				System.out.println("�ƣ��㶨��");
				/*
				 * ����lin�̴߳�������������жϵĻ���lin��sleep
				 * �������׳��ж��쳣
				 */
				lin.interrupt();
			}
		};
		lin.start();
		huang.start();
	}
}
