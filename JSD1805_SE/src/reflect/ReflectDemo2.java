package reflect;
/**
 * ͨ��Classʵ�������ʾ�����һ��ʵ��
 * @author tarena
 *
 */
public class ReflectDemo2 {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		//���÷������ʵ����
		//1����Person�������
		Class cls = Class.forName("reflect.Person");
		/*
		 * 2.ͨ�������ʵ�������ʾ�����ʵ��
		 * Class�ṩ��һ��newInstance()�������÷���
		 * �������ʾ���޲ι��췽��ʵ��������
		 */
		Object o = cls.newInstance();
		System.out.println(o);
	}
}
