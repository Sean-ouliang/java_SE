package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 编写一段代码，要求用户输入自己的生日，格式：yyyy-MM-dd
 * 然后经过程序计算，输出到今天为止一共活了多少天。
 * 再输出其出生10000天的纪念日是哪天？格式同上。
 * @author tarena
 *
 */
public class Test {
	public static void main(String[] args) throws ParseException {
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入自己的生日（格式：2018-07-23）");
		String str = scan.nextLine();
		Date date = sdf.parse(str);
		long time = now.getTime()-date.getTime();
		time = time/1000/60/60/24;
		System.out.println("到今天为止一共活了"+time+"天");
		/*
		 * 傻逼，请记住long型需要加“L”
		 */
		time = date.getTime()+1000L*60*60*24*10000;
		date.setTime(time);
		String line = sdf.format(date);
		System.out.println("10000天的纪念日是:"+line);
	}
}
