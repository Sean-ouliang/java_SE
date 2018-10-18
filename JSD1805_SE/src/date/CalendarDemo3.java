package date;

import java.util.Calendar;

/**
 * void set(int filed,int value)
 * ����ָ����ʱ�����
 * @author tarena
 *
 */
public class CalendarDemo3 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTime());
		/*
		 * ��ʾ2008-08-08 20:08:08
		 */
//		calendar.set(year, month, date, hourOfDay, minute, second);
		//������
		calendar.set(Calendar.YEAR,2008);
		//������
		calendar.set(Calendar.MONTH,Calendar.AUGUST);
		//������
		calendar.set(Calendar.DATE,8);
		System.out.println(calendar.getTime());
		
		//����ʱ
		calendar.set(Calendar.HOUR_OF_DAY,20);
		//���÷�
		calendar.set(Calendar.MINUTE,8);
		//������
		calendar.set(Calendar.SECOND,8);
		System.out.println(calendar.getTime());
		
		//����Ϊ����
		calendar.set(Calendar.DAY_OF_WEEK,Calendar.WEDNESDAY);
		System.out.println(calendar.getTime());
	}
}
