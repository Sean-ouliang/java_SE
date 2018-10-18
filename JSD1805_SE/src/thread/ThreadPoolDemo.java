package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * �̳߳�
 * �̳߳���Ҫ���������ã�
 * 1.�����߳�����
 * 2.�����߳�
 * �߳���������ᵼ���ڴ����Ĵ󣬲��һ����CPU�����л�����
 * ���岢�����ܽ��͵����⡣����Ƶ���Ĵ��������߳�Ҳ���ϵͳ
 * ����������Ϊ����ʵ�ʿ����г���������������Ƕ�Ӧ��ʹ��
 * �̳߳��������̡߳�
 * @author tarena
 *
 */
public class ThreadPoolDemo {
	public static void main(String[] args) {
		//�����̶���С���̳߳�(�߳�����Ϊ2)
		ExecutorService threadPool = Executors.newFixedThreadPool(2);
		for(int i=0;i<5;i++){
			Runnable runn = new Runnable(){
				public void run() {
					Thread t = Thread.currentThread();
					try{
						System.out.println(t.getName()+"��������....");
						Thread.sleep(5000);
						System.out.println(t.getName()+"�������");
					}catch(Exception e){
						e.printStackTrace();
					}
				}
				
			};
			//�����񽻸��̳߳�
			threadPool.execute(runn);
			System.out.println("ָ����һ��������̳߳�");
		}
		/*
		 * ֹͣ�̳߳�
		 * shutdown()�����ú��̳߳ز�������ֹͣ����ʱ���߳�
		 * �ز��ٽ����µ����񣬲��һὲ�������Ѿ����̳߳��е�����
		 * ȫ��ִ����Ϻ�ֹͣ
		 * shutdownNow():�̳߳ػ�ǿ���ж������������е��̲߳�����ֹͣ
		 */
		threadPool.shutdown();
		System.out.println("�̳߳عر���");
	}
}
