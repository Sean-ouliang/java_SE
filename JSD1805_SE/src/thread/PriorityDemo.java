package thread;
/**
 * �̵߳����ȼ�
 * �߳��ڲ�������ʱ�����̵߳��ȵĹ����ǲ��ɿصģ�����
 * ����������ȡCPUʱ��Ƭ��ֻ�ܱ����ı����䡣�����̵߳���
 * �ᾡ���ܾ��ȵĽ�ʱ��Ƭ��������в������е��̣߳�������
 * ��֤ÿ���̡߳�һ��һ�Ρ�
 * ͨ�������̵߳����ȼ��������̶ȵĸ��ƻ�ȡCPUʱ��Ƭ��
 * �����������ϣ��߳����ȼ�Խ�ߵ��̻߳�ȡCPUʱ��Ƭ�Ĵ���
 * Խ�ࡣ
 * @author tarena
 *
 */
public class PriorityDemo {
	public static void main(String[] args) {
		Thread max = new Thread(){
			public void run(){
				for(int i=0;i<10000;i++){
					System.out.println("max");
				}
			}
		};
		Thread norm = new Thread(){
			public void run(){
				for(int i=0;i<10000;i++){
					System.out.println("nor");
				}
			}
		};
		Thread min = new Thread(){
			public void run(){
				for(int i=0;i<10000;i++){
					System.out.println("min");
				}
			}
		};
		/*
		 * �߳����ȼ���10���ȼ����ֱ�������1-10��ʾ
		 * ����1Ϊ��ͣ�10Ϊ��ߣ�5ΪĬ��
		 */
		max.setPriority(Thread.MAX_PRIORITY);
		min.setPriority(Thread.MIN_PRIORITY);
		max.start();
		norm.start();
		min.start();
	}
}
