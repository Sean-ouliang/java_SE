package thread;
/**
 * �ػ��߳�
 * �ػ��߳��ֳ�Ϊ��̨�̡߳�Ĭ�ϴ����������̶߳�����ǰ̨
 * �̣߳���̨�߳�����Ҫ���߳�����ǰ�����������á�����
 * �ķ���Ϊ��
 * void setDaemon(boolean on)
 * ������Ϊtrueʱ�����̱߳�����Ϊ�ػ��̣߳���̨�̣߳�
 * 
 * ��ʹ����ǰ̨�߳����̨�߳�û��ʲô���𣬵����ڽ���ʱ��
 * ����һ����ͬ�����������̽���ʱ�����л������е��ػ��߳�
 * ���ᱻǿ���жϡ�
 * ���̵Ľ�������һ�������е�����ǰ̨�̶߳�����ʱ�����̽���
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
				System.out.println("rose:����������AAAAAA��");
				System.out.println("��ͨ");
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
			 * main�߳����Ƚ���
			 * 
			 * main����Ϊǰ̨�̣߳����main�̲߳������������ǰ̨rose�߳�
			 * �����ˣ���̨jack�߳�Ҳ�������
			 */
//		}
	}
}
