package string;
/**
 * 字符串支持正则表达式方法一：
 * boolean matches(String str)
 * 使用给定的正则表达式验证当前字符串是否满足格式要求
 * 注意：无论正则表达式是否加了边界匹配符：“^”，“$”都是做
 * 全匹配验证。
 * @author tarena
 *
 */
public class MatchesDemo {
	public static void main(String[] args){
		String mail = "fan_cq@tedu.cn";
		String regex = "\\w+@\\w+(\\.[a-zA-Z]+)+";
		boolean match = mail.matches(regex);
		if(match){
			System.out.println("是邮箱");
		}else{
			System.out.println("不是邮箱");
		}
	}
}
