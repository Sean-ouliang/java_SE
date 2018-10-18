package lambda;
/**
 * lambda���ʽ
 * JDK8�Ƴ���һ�����ԣ����������ٱ�ݵĴ��������ڲ���
 * 
 * �﷨��
 * ([arg1,arg2...])->{
 * 	������
 * }
 * 
 * lambda���ʽ�ڴ���һ�������ڲ���ʱ��һ��Ҫ�󣬾���
 * ���Ӧ�ӿڱ�������ֻ����һ�����󷽷�ʱ�ſ���ʹ�á�
 * ������ڶ������ʱʹ�ñ����ǲ�ͨ���ġ�
 * @author tarena
 *
 */
public class LambdaDemo1 {
	public static void main(String[] args) {
		Runnable r1 = new Runnable(){
			public void run(){
				System.out.println("hello");
			}
		};
		
		Runnable r2 = ()->{
			System.out.println("hello");
		};
		
		Thread t = new Thread(()->{
			System.out.println("ok");
		});
		t.start();
		/*
		 * ����д�ķ�����ֻ��һ����룬��ô�÷����ġ�{}��
		 * �ǿ���ʡ�Եġ�
		 */
		Runnable r4 = ()->System.out.println("hello");
	}
	
}
