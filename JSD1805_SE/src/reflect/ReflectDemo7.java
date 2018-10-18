package reflect;

import java.lang.reflect.Method;

/**
 * �������˽�з���
 * @author tarena
 *
 */
public class ReflectDemo7 {
	public static void main(String[] args) throws Exception{
		Class cls = Class.forName("reflect.Person");
		Method method = cls.getDeclaredMethod("dosome",null);
		Object o = cls.newInstance();
		//˽�з���������ǿ�Ʒ������ǿ���ִ�е�
		method.setAccessible(true);
		method.invoke(o,null);
	}
}
