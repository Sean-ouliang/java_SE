package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 调用有参方法
 * @author tarena
 *
 */
public class ReflectDemo5 {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
		Class cls = Class.forName("reflect.Person");
		/*
		 * 获取有参方法
		 * getDeclaredMethod第二个参数是一个Class类型的
		 * 数组。数组的每个元素用于指定该方法的参数类型。
		 * 数组元素的顺序必须与获取的方法的参数顺序一致
		 * 例如：
		 * 获取sayName(String name)
		 */
		Method method = cls.getDeclaredMethod("sayName",new Class[]{String.class});
		Object o = cls.newInstance();
		/*
		 * invoke方法在调用方法时，第二个参数为Object类型
		 * 数组，数组每个元素为调用该方法时传入的一个实际
		 * 参数
		 * p.sayName("张三");
		 * "张三"就是实际参数
		 */
		method.invoke(o,new Object[]{"张三"});
	}
}
