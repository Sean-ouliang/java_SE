package date;

import java.util.Date;
/**
 * java.util.Date
 * Date的每一个实例用于表示一个具体的时间。
 * 由于Date存在时区已及千年虫问题，所以大部分方法在1.1版本
 * 就被声明为过时的。
 * 
 * 现在使用Date通常仅用于表示时间。
 * @author tarena
 *
 */
public class DateDemo {
	public static void main(String[] args){
		Date date = new Date();
		System.out.println(date);
		/*
		 * long getTime()
		 * 该方法返回一个long值，该值就是当前Date内部
		 * 维护的long值，表示自1970年1月1日 00:00:00
		 * 到当前Date表示的时间之间所经过的毫秒
		 */
		long time = date.getTime();
		System.out.println(time);
		//表示明天这一刻
		time = time+1000*60*60*24;
		//也可以设置一个long值，让Date表示该时间
		date.setTime(time);
		System.out.println(date);
	}
}
