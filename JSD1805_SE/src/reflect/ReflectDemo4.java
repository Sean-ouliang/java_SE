package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * ���Զ�̬���÷���
 * @author tarena
 *
 */
public class ReflectDemo4 {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.println("������Ҫ���ص���:");
		String className = scan.nextLine();
		System.out.println("������Ҫ���õķ���:");
		String methodName = scan.nextLine();
		Class cls = Class.forName(className);
		Method method = cls.getDeclaredMethod(methodName,null);
		Object o = cls.newInstance();
		method.invoke(o,null);
	}
}
