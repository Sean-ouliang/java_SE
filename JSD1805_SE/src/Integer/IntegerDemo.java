package Integer;
import object.Point;
/**
 * 包装类
 * 由于java8个基本类型，它们不具有面向对象的特性，那么
 * 在实际开发中不能直接参与面向对象的开发，这很不方便
 * 为此，java为8个基本类型提供了对应的包装类。目的是可以
 * 让基本类型以对象的形式存在，能够参与面向对象开发中
 * @author tarena
 *
 */
public class IntegerDemo {
	public static void main(String[] args){
		dosome("nihao");
		dosome(new String[] {});
		dosome(new Point());
		int d = 1;
//		dosome(d);//jdk1.5之前，这样做编译不通过
		Integer in = new Integer(d);
		dosome(in);
	}
	public static void dosome(Object o){
		
	}
}
