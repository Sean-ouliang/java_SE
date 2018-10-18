package string;
/**
 * char charAt(int index)
 * 返回当前字符串中给定位置对应的字符
 * @author tarena
 *
 */
public class CharAtDemo {
	public static void main(String[] args){
		//            01234567890123456
		String str = "thinking in java";
		char c = str.charAt(9);
		System.out.println(c);
		
		/*
		 * 回文检测
		 */
		String line = "上海自来水来自海上";
		for(int i=0;i<line.length()/2;i++){
			if(line.charAt(i)!=line.charAt(line.length()-1-i)){
				System.out.println("不是回文");
				return;
			}
		}
		System.out.println("是回文");
		
	}
}
