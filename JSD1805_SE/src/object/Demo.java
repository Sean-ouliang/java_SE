package object;
/**
 * 测试Point重写的Object相关方法
 * @author tarena
 *
 */
public class Demo {
	public static void main(String[] args){
		Point p = new Point();
		p.setX(1);
		p.setY(2);
		/*
		 * Object常用的方法一：
		 * String toString()
		 * 该方法的意义是将当前对象转换为一个字符串
		 * Object实现的该方法返回的字符串内容为当前
		 * 对象的句柄（地址），实际意义不大。通常我们
		 * 使用一个对象的toString方法时就应当重写
		 * 它，返回的字符串应当包含当前对象有效信息。
		 * JAVA的API很多情况下也会调用toString方法
		 */
		String str = p.toString();
		System.out.println(str);
		/*
		 * System.out.pritnln(OBject o)
		 * 该方法是将给定对象的toString方法返回的字符串
		 * 输出到控制台。
		 */
		System.out.println(p);//按照对象输出
		
		Point p1 = new Point();
		p1.setX(1);
		p1.setY(2);
		System.out.println(p1);
		System.out.println(p1==p);
		/*
		 * Object提供了equals方法，意义是比较两个对象
		 * 的内容是否相同。但是本身Object提供的该方法
		 * 是直接使用“==”比较的，所以若不重写该方法，
		 * 没有实际意义。
		 */
		System.out.println(p1.equals(p));
	}
}

















