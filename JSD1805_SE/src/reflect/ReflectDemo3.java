package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * ͨ��������÷���
 * @author tarena
 *
 */
public class ReflectDemo3 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		/*
		 * ʹ�÷�����÷���
		 * 1.���ض�Ӧ����
		 * 2.��ȡ���ඨ���Ҫ���õķ���
		 * 3.ʵ��������
		 * 4.���ø÷���
		 */
		//1
		Class cls = Class.forName("reflect.Person");
		/*
		 * 2
		 * Method��ÿһ��ʵ�����ڱ�ʾһ�����ж����һ������
		 * ͨ��Method���Ի�ȡ���ʾ�ķ�����ص���Ϣ�����磺
		 * �����ķ���ֵ���ͣ����������������������η��ȵ�
		 * �������Ե��ø÷�����
		 * ��������ӣ�
		 * methodʵ����ʾ����Person��ĳ�Ա����sayHello()
		 */
		Method method = cls.getDeclaredMethod("sayHello",null);
		/*
		 * 3 ʵ����Person��ʵ��
		 */
		Object o = cls.newInstance();
		/*
		 * 4 ���ó�Ա����sayHello
		 * o.sayHello()
		 */
		method.invoke(o,null);
		System.out.println(method);
	}
}
