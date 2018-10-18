package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 计算商品促销日期
 * 输入一个商品的生产日期，格式：yyyy-MM-dd
 * 再输入该商品的保质期，天数
 * 经过程序的计算，输出该商品的促销日期，格式：yyyy-MM-dd
 * 促销日期规则：该商品过期日期前两周的周三
 * @author tarena
 *
 */
public class Test2 {
	public static void main(String[] args) throws ParseException {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入一个商品的生产日期(格式: yyyy-MM-dd)");
		String str = scan.nextLine();
		System.out.println("保质期");
		int days = Integer.parseInt(scan.nextLine());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse(str);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		//加上保质期
		calendar.add(Calendar.DAY_OF_YEAR,days);
		//前两周
		calendar.add(Calendar.DAY_OF_YEAR,-14);
		//本周的周三
		calendar.set(Calendar.DAY_OF_WEEK,Calendar.WEDNESDAY);
		date = calendar.getTime();
		String line = sdf.format(date);
		System.out.println("促销日期:"+line);
		
	}
}
