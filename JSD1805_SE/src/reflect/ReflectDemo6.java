package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 调用多个参数的方法
 * @author tarena
 *
 */
public class ReflectDemo6 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		/*
		 * 调用Person的sayInfo()方法
		 */
		Class cls = Class.forName("reflect.Person");
		Method method = cls.getDeclaredMethod("sayInfo",new Class[]{String.class,int.class});
		Object o = cls.newInstance();
		method.invoke(o,new Object[]{"张三",21});
	}
}
