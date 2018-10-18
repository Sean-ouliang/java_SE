package thread;
/**
 * ����߳�֮�����첽���д���ģ����Դ�������֮�䲻����
 * �Ⱥ��ϵ�����ɸ��ģ�
 * ͬ�����У�ִ�����Ⱥ�˳��ͨ�����߳����д�����ͬ����
 * �첽���У����ɸ��ģ����߳�ִ�о����첽ִ��
 * 
 * �߳��ṩ�ˣ�
 * void join()
 * �÷�������һ���߳���join���������̺߳���ȴ���ֱ��
 * ���߳�ִ����Ϻ��ټ������С�����ʹ��join����Э���߳�
 * ֮��ͬ�����д��롣
 * @author tarena
 *
 */
public class JoinDemo {
	//��ʾͼƬ�Ƿ��������
	public static boolean isFinish = false;
	public static void main(String[] args) {
		Thread download = new Thread(){
			public void run(){
				System.out.println("down:��ʼ����ͼƬ...");
				for(int i=0;i<=100;i++){
					System.out.println("down:"+i+"%");
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
					}
				}
				System.out.println("down:ͼƬ������ϣ�");
				isFinish = true;
			}
		};
		Thread show = new Thread(){
			public void run(){
				System.out.println("show:��ʼ��ʾͼƬ...");
				//ģ�����ͼƬʧ��
				/*
				 * ����ͼƬǰӦ���ȴ������߳̽�ͼƬ�������
				 */
				try {
					/*
					 * JDK1.8֮ǰ��һ��Ҫ��Դ��JVM�ڴ����
					 * ���⣩����һ�������ľֲ��ڲ��൱��������
					 * �÷����������ֲ�����ʱ���ñ���������final
					 * �ġ�
					 * ����main�����ľֲ��ڲ���show����������
					 * download,��download������main������һ��
					 * �ֲ���������ô�ñ����ͱ�����final��
					 */
					download.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if(!isFinish){
					/*
					 * ��һ���̵߳�run�����׳���һ���쳣��
					 * ��ζ�Ÿ��߳̾ͻ����
					 */
					throw new RuntimeException("ͼƬ����ʧ�ܣ�");
				}
				System.out.println("show:��ʾͼƬ��ϣ�");
			}
		};
		download.start();
		show.start();
	}
}
