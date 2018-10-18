package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * �����вη���
 * @author tarena
 *
 */
public class ReflectDemo5 {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
		Class cls = Class.forName("reflect.Person");
		/*
		 * ��ȡ�вη���
		 * getDeclaredMethod�ڶ���������һ��Class���͵�
		 * ���顣�����ÿ��Ԫ������ָ���÷����Ĳ������͡�
		 * ����Ԫ�ص�˳��������ȡ�ķ����Ĳ���˳��һ��
		 * ���磺
		 * ��ȡsayName(String name)
		 */
		Method method = cls.getDeclaredMethod("sayName",new Class[]{String.class});
		Object o = cls.newInstance();
		/*
		 * invoke�����ڵ��÷���ʱ���ڶ�������ΪObject����
		 * ���飬����ÿ��Ԫ��Ϊ���ø÷���ʱ�����һ��ʵ��
		 * ����
		 * p.sayName("����");
		 * "����"����ʵ�ʲ���
		 */
		method.invoke(o,new Object[]{"����"});
	}
}
