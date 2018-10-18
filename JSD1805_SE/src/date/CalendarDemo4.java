package date;

import java.util.Calendar;

/**
 * Calendar计算时间的操作：
 * void add(int field,int amount)
 * 对指定的时间分量加上给定的值，若给定的值为负数，则是
 * 减去给定的时间。
 * @author tarena
 *
 */
public class CalendarDemo4 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTime());
		/*
		 * 查看3年2个月零25天以后是哪天？
		 */
		//加3年
		calendar.add(Calendar.YEAR,3);
		//加2个月
		calendar.add(Calendar.MONTH,2);
		//加25天
		calendar.add(Calendar.DAY_OF_YEAR,25);
		System.out.println(calendar.getTime());
		
		//减去7天
		calendar.add(Calendar.DAY_OF_YEAR,-7);
		System.out.println(calendar.getTime());
		
		//那周的周三
		calendar.set(Calendar.DAY_OF_WEEK,Calendar.WEDNESDAY);
		System.out.println(calendar.getTime());
	}
}
