package thread;
/**
 * ���̲߳�����ȫ����
 * ������̲߳�������ͬһ��Դʱ�������߳��л�ʵ�ʲ�ȷ��
 * ���³���δ�������Ҫ���˳��ִ�ж��������߼����ҡ�
 * ����ʱ���ܵ���ϵͳ̱����
 * 
 * ������̲߳�����ȫ����ķ�ʽ�����ö���߳��Ŷӷ��ʸ�
 * ��Դ�������첽������Ϊͬ��������
 * 
 * @author tarena
 *
 */
public class SyncDemo {
	public static void main(String[] args) {
		Table table = new Table();
		Thread t1 = new Thread(){
			public void run(){
				while(true){
					int d = table.getBeans();
					Thread.yield();
					System.out.println(getName()+":"+d);
				}
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				while(true){
					int d = table.getBeans();
					Thread.yield();
					System.out.println(getName()+":"+d);
				}
			}
		};
		t1.start();
		t2.start();
	}
}
class Table{
	private int beans = 20;
	/**
	 * ��һ��������synchronzied���κ���ô�÷�����Ϊ
	 * ͬ����������������̲߳���ͬʱ���뷽���ڲ�ִ�У�
	 * ֻ��һ���߳�ִ���꣬�����߳��ڽ���ִ�С�
	 * ���첽������Ϊͬ�������ͽ���˲�����ȫ���⡣
	 * 
	 * ��Ա������ʹ��synchronized����ôͬ��������
	 * ������ǵ�ǰ�����������󣬼������п�����this
	 */
	public synchronized int getBeans(){
		if(beans==0){
			throw new RuntimeException("û�ж�����");
		}
		Thread.yield();//ģ���̷߳����л�(��������CPUʱ��Ƭ)
		return beans--;
	}
}