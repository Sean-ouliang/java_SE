package reflect;
/**
 * 通过Class实例化其表示的类的一个实例
 * @author tarena
 *
 */
public class ReflectDemo2 {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		//利用反射机制实例化
		//1加载Person的类对象
		Class cls = Class.forName("reflect.Person");
		/*
		 * 2.通过类对象实例化其表示的类的实例
		 * Class提供了一个newInstance()方法，该方法
		 * 调用其表示的无参构造方法实例化它。
		 */
		Object o = cls.newInstance();
		System.out.println(o);
	}
}
