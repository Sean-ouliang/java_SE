package date;

import java.util.Calendar;

/**
 * Calendar����ʱ��Ĳ�����
 * void add(int field,int amount)
 * ��ָ����ʱ��������ϸ�����ֵ����������ֵΪ����������
 * ��ȥ������ʱ�䡣
 * @author tarena
 *
 */
public class CalendarDemo4 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTime());
		/*
		 * �鿴3��2������25���Ժ������죿
		 */
		//��3��
		calendar.add(Calendar.YEAR,3);
		//��2����
		calendar.add(Calendar.MONTH,2);
		//��25��
		calendar.add(Calendar.DAY_OF_YEAR,25);
		System.out.println(calendar.getTime());
		
		//��ȥ7��
		calendar.add(Calendar.DAY_OF_YEAR,-7);
		System.out.println(calendar.getTime());
		
		//���ܵ�����
		calendar.set(Calendar.DAY_OF_WEEK,Calendar.WEDNESDAY);
		System.out.println(calendar.getTime());
	}
}
