package string;
/**
 * String提供了一组静态的valueOf方法，作用是将其他类型
 * 数据转换为字符串。比较常用的是将基本类型转换为字符串
 * @author tarena
 *
 */
public class ValueOfDemo {
	public static void main(String[] args){
		int d = 123;
		String str = String.valueOf(d);
		System.out.println(str);
	}
}
