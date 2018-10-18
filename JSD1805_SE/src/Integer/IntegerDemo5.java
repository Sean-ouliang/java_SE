package Integer;
/**
 * 自JDK1.5之后，推出了一个特性：自动拆装箱
 * 该特性是编译器认可，而不是虚拟机。编译器在编译源程序
 * 时若发现有基于类型和包装类互相赋值使用时会自动补全它们
 * @author tarena
 *
 */
public class IntegerDemo5 {
	public static void main(String[] args){
		/*
		 * 触发自动拆箱特性：
		 * 编译器会将代码改变为：
		 * int d = new Integer(123).intValue()
		 */
		int d = new Integer(123);
		/*
		 * 触发自动装箱特性：
		 * 编译器会将代码改变为：
		 * Ineger in = Integer.valueOf(123);
		 */
		Integer in = 123;
	}
}
