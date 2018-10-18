package string;
/**
 * String substring(int start,int end)
 * 截取当前字符串指定范围内的字符串
 * 需要注意，java API有个特点，通常使用两个数字表示
 * 范围时，都是“含头不含尾”的
 * @author tarena
 *
 */
public class SubtringDemo {
	public static void main(String[] args){
		//            0123456789012
		String str = "www.baidu.com";
		//截取baidu
		String sub = str.substring(4,9);
		System.out.println("sub:"+sub);
		
		System.out.println(getName("www.sohu.com"));
		System.out.println(getName("http://www.sina.com"));
	}
	
	//获取域名
	public static String getName(String loc){
		int start = loc.indexOf(".")+1;
		int end = loc.indexOf(".",start);//从指定位置的下一个位置开始比对
		String sub = loc.substring(start,end);
		return sub;
	}
}
