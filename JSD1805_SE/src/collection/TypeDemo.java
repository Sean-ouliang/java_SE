package collection;

public class TypeDemo {
	public static void main(String[] args) {
		/*
		 * 泛型的原型就是Object
		 * 使用时，要指定泛型的实际类型
		 */
		Pointers<Integer> p1 = new Pointers<Integer>(1,2);
		//编译器检测实参类型是符合泛型要求
		p1.setX(3);
		//获取泛型值时，编译器会在编译后加造型
		/*
		 * 下面代码会被编译器改为：
		 * int x1 = (Integer)p1.getX();
		 * (实际上还会触发自动拆箱特性，并最终改变为)
		 * int x1 = ((Integer)p1.getX()).intValue();
		 */
		int x1 = p1.getX();
		System.out.println("x1:"+x1);
		System.out.println("p1:"+p1);
		
		Pointers<Double> p2 = new Pointers<Double>(2.2,3.3);
		p2.setX(4.4);
		double x2 = p2.getX();
		System.out.println("x2:"+x2);
		System.out.println("p2:"+p2);
		
		/*
		 * 若在使用时不指定泛型的实际类型，那么就使用原型
		 * Object.不推荐这样的做法。编译器也会提示警告。
		 */
		Pointers<String> p3 = new Pointers<String>("一","二");
		p3.setX("三");
		String x3 = p3.getX();
		System.out.println("x3:"+x3);
		System.out.println("p3:"+p3);
	} 
}
