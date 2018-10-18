package Integer;
/**
 * 数字类型的包装类都提供了两个常量：MAX_VALUE,MIN_VALUE
 * 用来获取其表示的基本类型的取值范围。
 * @author tarena
 *
 */
public class IntegerDemo3 {
	public static void main(String[] args){
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		System.out.println(max);
		System.out.println(min);
		long lmax = Long.MAX_VALUE;
		System.out.println(lmax);
	}
}
