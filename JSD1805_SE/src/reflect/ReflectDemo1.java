package reflect;
/**
 * java�������
 * ��������������ǵĳ���������ʱ��̬����һ���ಢʵ��
 * �������߻�ȡ�䶨��������Ϣ�����ԣ������ȣ�����������
 * ��̬������Щ���������Ǵ�ͳ���ڱ����ڼ���ʽʵ��
 * ������÷����ȡ�
 * ��������������˴��������ԡ����Ƿ���Ҳ��һ��˫��
 * �������̵�ʹ�ûή��ϵͳ���ܡ�
 * @author tarena
 *
 */
public class ReflectDemo1 {
	public static void main(String[] args) throws ClassNotFoundException {
		/*
		 * Class��
		 * Class���ÿһ��ʵ����������ʾһ����JAM����
		 * ���ࡣͨ���������˽⵽���ʾ���������Ϣ��
		 * ��������Щ���ԣ����췽���������ȵȡ�
		 * ��������Ҳ��Class��ʵ��������������
		 * 
		 * ��JVM�ڲ���ÿ�������ص��඼����ֻ��Ψһ��һ��
		 * Class��ʵ����ʾ������ô���Class��ʵ������JVM
		 * ����һ�����ʱ�򴴽��ġ�
		 * 
		 * ���ȡһ�������������ͨ�����漸�ַ�ʽ�õ���
		 * 1.ÿ���඼��һ����̬����class�����Եõ������
		 *   �������
		 *   ���磺
		 *   Class cls = Person.class;
		 *   ͨ�����cls���Ի�ȡ�����й�Person����Ϣ
		 *   ����Person����Щ��������Щ���ԣ����췽����
		 *   ����Ϣ��
		 * 2.ͨ��Class�ľ�̬����forName()����ָ�����ಢ
		 *   �õ��������
		 *   ���磺
		 *   Class cls = Class.forName("object.Person");
		 *   ����object���µ�Person�࣬��Ҫע�⣬�����
		 *   ��������д�����ȫ������������������
		 *   
		 * 3.������ͨ�������������һ���ࡣ
		 */
		
		/*
		 * ��ȡreflect���µ�Person��������
		 */
//		Class cls = Person.class;
		
		//����ָ������
		Class cls = Class.forName("reflect.Person");
		//��ȡ����
		String name = cls.getName();
		System.out.println(name);
		
	}
}




















