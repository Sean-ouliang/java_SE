package thread;
/**
 * ��Ч����Сͬ����Χ�����ڱ�֤������ȫ��ǰ������߲���
 * ��Ч�ʡ�
 * 
 * ͬ������Ը�׼ȷ�Ŀ�����Ҫͬ�����еĴ���Ƭ�Σ��﷨��
 * 
 * synchronized��ͬ������������{
 * 	��Ҫͬ�����еĴ���Ƭ��
 * }
 * @author tarena
 *
 */
public class SyncDemo2 {
	public static void main(String[] args) {
		Shop shop = new Shop();
		Thread t1 = new Thread(){
			public void run(){
				shop.buy();
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				shop.buy();
			}
		};
		
		t1.start();
		t2.start();
		/*
		 * ��������һ���������ڲ�����ȫ����
		 * 
		Shop shop1 = new Shop();
		Shop shop2 = new Shop();
		Thread t1 = new Thread(){
			public void run(){
				shop1.buy();
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				shop2.buy();
			}
		};
		
		t1.start();
		t2.start();
		*/
	}
}
class Shop{
	public void buy(){
		Thread t = Thread.currentThread();
		try {
			System.out.println(t.getName()+":�������·�");
			Thread.sleep(5000);
			/*
			 * ʹ��ͬ���龫ȷ�Ŀ�����Ҫͬ���Ĵ���ƬƬ�Ρ�
			 * ��Ҫע�⣬�����ö���߳�ͬ�����п��ƵĴ���Ƭ��
			 * ���뱣֤ͬ���������������߳̿�������ͬһ����
			 */
//			synchronized(new Object()){//���̵߳���ʱ���´���һ��ʵ������
			synchronized(this){
				System.out.println(t.getName()+":�������·�");
				Thread.sleep(5000);
			}
			
			System.out.println(t.getName()+":�����뿪");
		} catch (Exception e) {
		}
	}
}