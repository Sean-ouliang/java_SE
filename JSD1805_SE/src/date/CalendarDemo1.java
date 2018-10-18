package date;
import java.util.Calendar;
import java.util.Date;
/**
 * java.util.Calendr
 * 日历类，使用日历类可以对时间进行一系列的操作。Date大部
 * 分操作时间的方法都被声明为过时的，取而代之的也是使用
 * Calendar的相关操作。
 * 
 * Calendar是一个抽象类，定义了日历类操作时间的功能，常
 * 用实现类为：java.util.GregorianCalendar,即：阳历
 * 
 * Calendar提供了一个静态方法：getInstance，该方法可以获取
 * 一个当前系统所在地区适用的实现类，大部分地区返回的也是
 * 阳历实现类。
 * @author tarena
 *
 */
public class CalendarDemo1 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		/*
		 * Calendar默认创建也表示当前系统时间。
		 * 但是toString返回的字符串不能直观的体现。
		 */
		System.out.println(calendar);
		/*
		 * Calendar提供了与Dtae之间互转的方法
		 * Date getTime()
		 * 将当前Calendar表示的日期以Date实例形式返回。
		 * 
		 * void setTime(Date date)
		 * 使当前Calendar表示给定的Date所表示的日期
		 */
		Date date = calendar.getTime();
		System.out.println(date);
		
		calendar.setTime(date);
	}
}
