package thread;
/**
 * ʹ�������ڲ��ഴ����ʽ��������̵߳Ĵ�����ʽ
 * @author tarena
 *
 */
public class ThreadDemo3 {
	public static void main(String[] args) {
		//��ʽ1
		Thread t1 = new Thread(){//�����ڲ���û��������ֱ�Ӵ������󼴿�
			public void run(){
				for(int i=0;i<1000;i++){
					System.out.println("����˭����");
				}
			}
		};
				
		//��ʽ2
		Runnable r2 = new Runnable(){
			public void run(){
				for(int i=0;i<1000;i++){
					System.out.println("���ǲ�ˮ��ģ�");
				}
			}
		};
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
	}
}
