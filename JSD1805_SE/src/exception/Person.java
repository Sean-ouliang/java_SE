package exception;
/**
 * ʹ�õ�ǰ������쳣���׳����֪ʶ
 * @author tarena
 *
 */
public class Person {
	private int age;

	public int getAge() {
		return age;
	}

	/**
	 * ʹ��throw�ڷ������׳�һ���쳣ͨ����һ�����������
	 * 1�������﷨�����ǲ�����ҵ���߼�ʱ�����Ե����쳣�׳�
	 *   �������ߡ�
	 * 2��ȷʵ������һ���쳣�����Ǹ��쳣��Ӧ������ǰ����
	 *   �������ʱ�����׳��������ߡ�
	 * @throws Exception 
	 */
	public void setAge(int age) throws IllegalAgeException {
		if(age<0 || age>100){
			/*
			 * ͨ��������ʹ��throwsʲô�쳣����Ҫ�ڷ���
			 * ������ͬʱʹ��throws�������쳣���׳���
			 * ֻ��RuntimeException���������쳣����Ҫ��
			 */
			throw new IllegalAgeException("���䲻�Ϸ���");
		}
		this.age = age;
	}
}
