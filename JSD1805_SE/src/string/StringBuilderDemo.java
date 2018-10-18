package string;
/**
 * 由于字符串的设计及优化是针对重用性，所以字符串不适合
 * 频繁修改
 * java设计了一个专门针对字符串修改操作的类：
 * StringBuilder，内部维护一个可变的字符数组，使用它修改
 * 字符串方便，并且开销小
 * @author tarena
 *
 */
public class StringBuilderDemo {
	public static void main(String[] args){
		String str = "努力学习java";
		StringBuilder builder = new StringBuilder(str);
		/*
		 * 追加内容
		 * 努力学习java，为了找个好工作
		 */
		builder.append(",为了找个好工作！");
		System.out.println(builder.toString());
		/*
		 * 修改内容
		 * 努力学习java，就是为了改变世界！
		 */
		builder.replace(9,16,"就是为了改变世界");
		System.out.println(builder.toString());
		/*
		 * 删除内容：
		 * ，就是为了改变世界！
		 */
		builder.delete(0,8);
		System.out.println(builder.toString());
		/*
		 * 插入内容：
		 * 活着，就是为了改变世界！
		 */
		builder.insert(0,"活着");
		System.out.println(builder.toString());
		
	}
}







