package date;
import java.util.Calendar;
import java.util.Date;
/**
 * java.util.Calendr
 * �����࣬ʹ����������Զ�ʱ�����һϵ�еĲ�����Date��
 * �ֲ���ʱ��ķ�����������Ϊ��ʱ�ģ�ȡ����֮��Ҳ��ʹ��
 * Calendar����ز�����
 * 
 * Calendar��һ�������࣬���������������ʱ��Ĺ��ܣ���
 * ��ʵ����Ϊ��java.util.GregorianCalendar,��������
 * 
 * Calendar�ṩ��һ����̬������getInstance���÷������Ի�ȡ
 * һ����ǰϵͳ���ڵ������õ�ʵ���࣬�󲿷ֵ������ص�Ҳ��
 * ����ʵ���ࡣ
 * @author tarena
 *
 */
public class CalendarDemo1 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		/*
		 * CalendarĬ�ϴ���Ҳ��ʾ��ǰϵͳʱ�䡣
		 * ����toString���ص��ַ�������ֱ�۵����֡�
		 */
		System.out.println(calendar);
		/*
		 * Calendar�ṩ����Dtae֮�以ת�ķ���
		 * Date getTime()
		 * ����ǰCalendar��ʾ��������Dateʵ����ʽ���ء�
		 * 
		 * void setTime(Date date)
		 * ʹ��ǰCalendar��ʾ������Date����ʾ������
		 */
		Date date = calendar.getTime();
		System.out.println(date);
		
		calendar.setTime(date);
	}
}
