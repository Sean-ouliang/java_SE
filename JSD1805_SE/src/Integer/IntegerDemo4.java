package Integer;
/**
 * 包装类提供了一个非常实用的静态方法：parseXXX（String str）
 * 可以将字符串转换为对应的基本类型
 * @author tarena
 *
 */
public class IntegerDemo4 {
	public static void main(String[] args){
		/*
		 * 包装类将字符串转换为基本类型的前提条件是
		 * 该字符串要正确描述基本类型可以保存的值。
		 */
		String str = "123";
		
		int d = Integer.parseInt(str);
		System.out.println(d+1);
		
		double dou = Double.parseDouble(str);
		System.out.println(dou+1);
	}
}
