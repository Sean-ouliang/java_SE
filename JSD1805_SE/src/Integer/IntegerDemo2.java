package Integer;
/**
 * 6个表示数字类型的包装类，它们都继承自java.lang.Number
 * Number是一个抽象类，提供了在6中类型之间转换数字的相关方法
 * @author tarena
 *
 */
public class IntegerDemo2 {
	public static void main(String[] args){
		/*
		 * 从基本类型变为包装类
		 */
		int d = 128;
		Integer i1 = Integer.valueOf(d);
		Integer i2 = Integer.valueOf(d);
		System.out.println(i1==i2);
		System.out.println(i1.equals(i2));
		
		/*
		 * 包装类转为基本类型
		 */
		d = i1.intValue();
		byte l = i1.byteValue();
		double doub = i1.doubleValue();
		System.out.println("d:"+d);
		System.out.println("l:"+l);
		System.out.println("doub:"+doub);
		
		double b = 123.125;
		Double b1 = Double.valueOf(b);
		Double b2 = Double.valueOf(b);
		System.out.println(b1==b2);
		System.out.println(b1.equals(b2));
		
		b = b1.doubleValue();
		int in = b1.intValue();
		System.out.println("b:"+b);
		System.out.println("in:"+in);
	}
}
