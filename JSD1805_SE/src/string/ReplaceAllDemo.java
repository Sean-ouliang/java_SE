package string;
/**
 * 字符串支持正则表达式方法三：
 * String replacAll(String regex,String str)
 * 将当前字符串中满足正则表达式的部分替换为给定字符串
 * @author tarena
 *
 */
public class ReplaceAllDemo {
	public static void main(String[] args){
		String str = "abc123def456ghi789jkl";
		/*
		 * 将当前字符串中数组部分替换为：“#NUMBER#”
		 * abc#NUMBER#def#NUMBER#ghi#NUMBER#jkl
		 */
		str = str.replaceAll("\\d+","#NUMBER#");
		System.out.println(str);
		test();
	}
	
	public static void test(){
		String regex = "(wqnmlgb|djb|dsb|nc|mmp)";
		String message = "wqnmlgb!你这个dsb!你怎么这么nc!mmp,你这个djb";
		message = message.replaceAll(regex,"****");
		System.out.println(message);
	}
}
