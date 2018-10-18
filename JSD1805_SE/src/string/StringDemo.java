package string;
/**
 * String是不变对象，即：字符串对象一旦创建，内容不可
 * 改变，想改变内容一定创建新对象。
 * @author tarena
 *
 */
public class StringDemo {
	public static void main(String[] args){
		/*
		 * java建议创建字符串对象时使用字面量形式直接
		 * 赋值。因为这样创建时java会重用已经创建过的
		 * 字符串对象
		 * 使用字面量创建字符串对象时，JVM会首先检查
		 * 常量池是否已经缓存过该内容的字符串对象，若有
		 * 则直接重用该对象，若没有才创建该字符串对象并
		 * 缓存它。
		 */
		String s1 = "123abc";
		String s2 = "123abc";
		String s3 = new String("123abc");
		System.out.println(s1==s2);//true
		System.out.println(s1==s3);//false
		System.out.println(s1.equals(s3));//true
		/*
		 * 编译器有一个优化措施：当编译器在编译代码时
		 * 发现一个计算表达式的参数都是字面量时，那么
		 * 会直接计算，并将结果编译到class文件中。
		 * 所以下面的代码会被编译器改为：
		 * String s5 = "123abc"
		 */
		String s5 = "123"+"abc";
		System.out.println(s3==s5);
		System.out.println("s5:"+s5);
		String s = "123";
		String s6 = s + "abc";
		System.out.println(s3==s6);
		System.out.println("s6:"+s6);
	}
}
