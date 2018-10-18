package date;

import java.util.Calendar;

/**
 * void set(int filed,int value)
 * 设置指定的时间分量
 * @author tarena
 *
 */
public class CalendarDemo3 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTime());
		/*
		 * 表示2008-08-08 20:08:08
		 */
//		calendar.set(year, month, date, hourOfDay, minute, second);
		//设置年
		calendar.set(Calendar.YEAR,2008);
		//设置月
		calendar.set(Calendar.MONTH,Calendar.AUGUST);
		//设置天
		calendar.set(Calendar.DATE,8);
		System.out.println(calendar.getTime());
		
		//设置时
		calendar.set(Calendar.HOUR_OF_DAY,20);
		//设置分
		calendar.set(Calendar.MINUTE,8);
		//设置秒
		calendar.set(Calendar.SECOND,8);
		System.out.println(calendar.getTime());
		
		//设置为周三
		calendar.set(Calendar.DAY_OF_WEEK,Calendar.WEDNESDAY);
		System.out.println(calendar.getTime());
	}
}
