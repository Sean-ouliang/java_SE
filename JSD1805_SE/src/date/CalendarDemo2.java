package date;

import java.util.Calendar;

/**
 * Calendar提供了一个方法：
 * int get(int field)
 * 该方法可以获取当前Calendar给定的时间分量所对应的值
 * 
 * 不同的是时间分量对应的数字不同，但是无需记住这些数字，
 * 因为Calendar为这些数字提供了对应的常量.
 * @author tarena
 *
 */
public class CalendarDemo2 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		//获取年
		int year = calendar.get(Calendar.YEAR);
		/*
		 * 需要注意，月从0开始，即0表示1月，1表示2月...
		 */
		int month = calendar.get(Calendar.MONTH);
		/*
		 * 与“天”相关的时间分量有：
		 * DATE：月中的天
		 * DAY_OF_MONTH：月中天，与DATE一致
		 * DAY_OF_WEEK：周中的天
		 * DAY_OF_YEAR：年中的天
		 */
//		int day = calendar.get(Calendar.DATE);
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		System.out.println(year+"-"+month+"-"+day);
		
		int h = calendar.get(Calendar.HOUR_OF_DAY);
		int m = calendar.get(Calendar.MINUTE);
		int s = calendar.get(Calendar.SECOND);
		System.out.println(h+":"+m+":"+s);
		
		//今天是周几
		int dow = calendar.get(Calendar.DAY_OF_WEEK);
		String[] date = {"日","一","二","三","四","五","六"};
		System.out.println("周"+date[dow-1]);
//		int week = dow<=0?7:dow-1;
//		System.out.println("周"+week);
		
		//查看今年一共多少天？
		int d = calendar.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println("今年共:"+d+"天");
		
		d = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("当月共:"+d+"天");
	}
}
