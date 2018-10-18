package string;
/**
 * int indexOf(String str)
 * 查找给定字符串在当前字符串中的位置。若当前字符串中
 * 不含有该内容则返回值为-1
 * @author tarena
 *
 */
public class IndexOfDemo {
	public static void main(String[] args){
		//            0123456789012345
		String str = "thinking in java";
		//查找第一次出现“in”的位置
		int  index = str.indexOf("in");
		System.out.println("index:"+index);
		
		//重载方法，从指定位置开始查找第一次出现的位置
		index = str.indexOf("in",3);
		System.out.println("index:"+index);
		
		//查找最后一次出现给定字符的位置
		index = str.lastIndexOf("in");
		System.out.println("index:"+index);
		
		index = str.lastIndexOf("in",8);
		System.out.println("index:"+index);
	}
}
