package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * 测试动态调用方法
 * @author tarena
 *
 */
public class ReflectDemo4 {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入要加载的类:");
		String className = scan.nextLine();
		System.out.println("请输入要调用的方法:");
		String methodName = scan.nextLine();
		Class cls = Class.forName(className);
		Method method = cls.getDeclaredMethod(methodName,null);
		Object o = cls.newInstance();
		method.invoke(o,null);
	}
}
