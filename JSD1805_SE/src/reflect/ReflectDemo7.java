package reflect;

import java.lang.reflect.Method;

/**
 * 反射调用私有方法
 * @author tarena
 *
 */
public class ReflectDemo7 {
	public static void main(String[] args) throws Exception{
		Class cls = Class.forName("reflect.Person");
		Method method = cls.getDeclaredMethod("dosome",null);
		Object o = cls.newInstance();
		//私有方法在设置强制方法后，是可以执行的
		method.setAccessible(true);
		method.invoke(o,null);
	}
}
