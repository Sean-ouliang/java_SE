package exception;

public class ThrowDemo {
	public static void main(String[] args) {
		Person p = new Person();
			/*
			 * ������һ������throws�����쳣�׳��ķ���ʱ
			 * ���봦����쳣��������벻ͨ����
			 * �����쳣�ķ�ʽ�����֣�
			 * 1.ʹ��try-catch���񲢴�����쳣
			 * 2.�ڵ�ǰ�����ϼ���ʹ��throws�������쳣
			 *   ���׳���
			 */
			try {
				p.setAge(200);
			} catch (IllegalAgeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println("���䣺"+p.getAge());
	}
}
