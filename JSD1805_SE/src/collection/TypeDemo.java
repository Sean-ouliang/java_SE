package collection;

public class TypeDemo {
	public static void main(String[] args) {
		/*
		 * ���͵�ԭ�;���Object
		 * ʹ��ʱ��Ҫָ�����͵�ʵ������
		 */
		Pointers<Integer> p1 = new Pointers<Integer>(1,2);
		//���������ʵ�������Ƿ��Ϸ���Ҫ��
		p1.setX(3);
		//��ȡ����ֵʱ�����������ڱ���������
		/*
		 * �������ᱻ��������Ϊ��
		 * int x1 = (Integer)p1.getX();
		 * (ʵ���ϻ��ᴥ���Զ��������ԣ������ոı�Ϊ)
		 * int x1 = ((Integer)p1.getX()).intValue();
		 */
		int x1 = p1.getX();
		System.out.println("x1:"+x1);
		System.out.println("p1:"+p1);
		
		Pointers<Double> p2 = new Pointers<Double>(2.2,3.3);
		p2.setX(4.4);
		double x2 = p2.getX();
		System.out.println("x2:"+x2);
		System.out.println("p2:"+p2);
		
		/*
		 * ����ʹ��ʱ��ָ�����͵�ʵ�����ͣ���ô��ʹ��ԭ��
		 * Object.���Ƽ�������������������Ҳ����ʾ���档
		 */
		Pointers<String> p3 = new Pointers<String>("һ","��");
		p3.setX("��");
		String x3 = p3.getX();
		System.out.println("x3:"+x3);
		System.out.println("p3:"+p3);
	} 
}
