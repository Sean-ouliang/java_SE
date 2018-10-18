package reflect;
/**
 * java反射机制
 * 反射机制允许我们的程序在运行时动态加载一个类并实例
 * 化，或者获取其定义的相关信息（属性，方法等），甚至可以
 * 动态调用这些方法。而非传统的在编码期间形式实例
 * 化或调用方法等。
 * 这样做大大的提高了代码的灵活性。但是反射也是一把双刃
 * 剑，过程的使用会降低系统性能。
 * @author tarena
 *
 */
public class ReflectDemo1 {
	public static void main(String[] args) throws ClassNotFoundException {
		/*
		 * Class类
		 * Class类的每一个实例是用来表示一个被JAM加载
		 * 的类。通过它可以了解到其表示的类相关信息，
		 * 比如有哪些属性，构造方法，方法等等。
		 * 所以我们也称Class的实例叫做类的类对象。
		 * 
		 * 在JVM内部，每个被加载的类都有且只有唯一的一个
		 * Class的实例表示它。那么这个Class的实例是在JVM
		 * 加载一个类的时候创建的。
		 * 
		 * 想获取一个类的类对象可以通过下面几种方式得到：
		 * 1.每个类都有一个静态属性class，可以得到这个类
		 *   的类对象
		 *   例如：
		 *   Class cls = Person.class;
		 *   通过这个cls可以获取所有有关Person的信息
		 *   比如Person有哪些方法，哪些属性，构造方法等
		 *   等信息。
		 * 2.通过Class的静态方法forName()加载指定的类并
		 *   得到其类对象。
		 *   例如：
		 *   Class cls = Class.forName("object.Person");
		 *   加载object包下的Person类，需要注意，这里的
		 *   参数必须写类的完全限名（包名，类名）
		 *   
		 * 3.还可以通过类加载器加载一个类。
		 */
		
		/*
		 * 获取reflect包下的Person类的类对象
		 */
//		Class cls = Person.class;
		
		//加载指定的类
		Class cls = Class.forName("reflect.Person");
		//获取类名
		String name = cls.getName();
		System.out.println(name);
		
	}
}




















