package string;
/**
 * String trim
 * È¥³ýµ±Ç°×Ö·û´®Á½±ßµÄ¿Õ°××Ö·û
 * @author tarena
 *
 */
public class TrimDemo {
	public static void main(String[] args){
		String str = "    hello			";
		System.out.println("str:"+str);
		
		String trim = str.trim();
		System.out.println("trim:"+trim);
	}
}
