package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 通过反射调用方法
 * @author tarena
 *
 */
public class ReflectDemo3 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		/*
		 * 使用反射调用方法
		 * 1.加载对应的类
		 * 2.获取该类定义的要调用的方法
		 * 3.实例化该类
		 * 4.调用该方法
		 */
		//1
		Class cls = Class.forName("reflect.Person");
		/*
		 * 2
		 * Method的每一个实例用于表示一个类中定义的一个方法
		 * 通过Method可以获取与表示的方法相关的信息，比如：
		 * 方法的返回值类型，方法名，参数，访问修饰符等等
		 * 甚至可以调用该方法。
		 * 下面的例子：
		 * method实例表示的是Person类的成员方法sayHello()
		 */
		Method method = cls.getDeclaredMethod("sayHello",null);
		/*
		 * 3 实例化Person的实例
		 */
		Object o = cls.newInstance();
		/*
		 * 4 调用成员方法sayHello
		 * o.sayHello()
		 */
		method.invoke(o,null);
		System.out.println(method);
	}
}
