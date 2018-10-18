package date;

import java.util.Calendar;

/**
 * Calendar�ṩ��һ��������
 * int get(int field)
 * �÷������Ի�ȡ��ǰCalendar������ʱ���������Ӧ��ֵ
 * 
 * ��ͬ����ʱ�������Ӧ�����ֲ�ͬ�����������ס��Щ���֣�
 * ��ΪCalendarΪ��Щ�����ṩ�˶�Ӧ�ĳ���.
 * @author tarena
 *
 */
public class CalendarDemo2 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		//��ȡ��
		int year = calendar.get(Calendar.YEAR);
		/*
		 * ��Ҫע�⣬�´�0��ʼ����0��ʾ1�£�1��ʾ2��...
		 */
		int month = calendar.get(Calendar.MONTH);
		/*
		 * �롰�족��ص�ʱ������У�
		 * DATE�����е���
		 * DAY_OF_MONTH�������죬��DATEһ��
		 * DAY_OF_WEEK�����е���
		 * DAY_OF_YEAR�����е���
		 */
//		int day = calendar.get(Calendar.DATE);
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		System.out.println(year+"-"+month+"-"+day);
		
		int h = calendar.get(Calendar.HOUR_OF_DAY);
		int m = calendar.get(Calendar.MINUTE);
		int s = calendar.get(Calendar.SECOND);
		System.out.println(h+":"+m+":"+s);
		
		//�������ܼ�
		int dow = calendar.get(Calendar.DAY_OF_WEEK);
		String[] date = {"��","һ","��","��","��","��","��"};
		System.out.println("��"+date[dow-1]);
//		int week = dow<=0?7:dow-1;
//		System.out.println("��"+week);
		
		//�鿴����һ�������죿
		int d = calendar.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println("���깲:"+d+"��");
		
		d = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("���¹�:"+d+"��");
	}
}
