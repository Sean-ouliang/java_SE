package thread;
/**
 * static void sleep(long ms)
 * �߳��ṩ��sleep�������������и÷������̴߳�������
 * ״ָ̬�����룬����ʱ���̻߳��Զ��ص�RUNNABLE״̬
 * �ȴ��ٴη���ʱ��Ƭ�������С�
 * ��һ���̴߳���BLOCK��������״̬ʱ��CPU�������ͷ���ʱ��Ƭ
 * ��ȥִ�������߳�
 * @author tarena
 *
 */
public class SleepDemo {
	public static void main(String[] args) {
		System.out.println("����ʼ�ˣ�");
		
		try {
			//Thread.sleep(5000);
			for(int i=100;i>0;i--){
				Thread.sleep(1000);
				System.out.println(i);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("��������ˣ�");
	}
}
