package thread;
/**
 * ���߳�
 * ���߳̿���ʵ�ֶ�δ��롰ͬʱ���С���Ч����ʵ������
 * �������еġ�
 * 
 * �����߳������ַ�ʽ
 * ��ʽ1.�̳�Thread����дrun������run�����������Ƕ���
 *      ���߳�Ҫִ�е�����
 * @author tarena
 *
 */
public class ThreadDemo1 {
	public static void main(String[] args) {
		Thread t1 = new MyThread1();
		Thread t2 = new MyThread2();
		/*
		 * �����߳�Ҫ����start������������ֱ�ӵ���run����
		 * ��һ���̵߳�start����������Ϻ󣬸��̻߳����뵽
		 * �̵߳����У�һ��������CPUʱ��Ƭ�����̻߳��Զ���
		 * ִ����run������ʼ������������һ���̵߳�start
		 * ����ִ�к�run������ܿ�ı�����������
		 */
		t1.start();
		t2.start();
		System.out.println("�����߳�������!");
	}
}
/**
 * ��һ�ִ����̵߳ķ�ʽ�Ƚϼ򵥣��ʺ�ʹ�������ڲ������
 * ������ʱ�߳�������
 * ������Ҳ����������Ʋ���
 * 1.������Ҫ�̳�Thread����java���ǵ��̳еģ���͵�����
 *   �̳���Thread���޷��ټ̳�������ȥ���÷���������ʵ��
 *   �������ǳ��ֱȽ϶��ì�ܡ�
 * 2.�̳�Thread����Ҫ��дrun����������������͵�����
 *   �߳����߳�Ҫִ�е�����֮�����һ����Ȼ����Ϲ�ϵ
 *   �����߳������Ա�
 * @author tarena
 *
 */
class MyThread1 extends Thread{
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("����˭����");
		}
	}
}
class MyThread2 extends Thread{
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("���ǲ�ˮ��ģ�");
		}
	}
}