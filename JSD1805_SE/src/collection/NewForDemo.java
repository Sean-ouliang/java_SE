package collection;
/**
 * JDK1.5之后推出了一个新的特性：增强for循环
 * 也称为新循环，for each
 * 不取代传统for循环的工作，新循环只用来遍历集合或数组使用
 * @author tarena
 *
 */
public class NewForDemo {
	public static void main(String[] args) {
		String[] array = {"one","two","three","four","five"};
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
		/*
		 * 新循环并非新的语法，编译器认可而不是JVM认可
		 * 编译器在编译源程序时若发现使用新循环遍历数组时
		 * 会将代码改为使用普通for循环遍历
		 */
		for(String str:array){
			System.out.println(str);
		}
	}
}
