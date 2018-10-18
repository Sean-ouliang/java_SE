package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * ������Ʒ��������
 * ����һ����Ʒ���������ڣ���ʽ��yyyy-MM-dd
 * ���������Ʒ�ı����ڣ�����
 * ��������ļ��㣬�������Ʒ�Ĵ������ڣ���ʽ��yyyy-MM-dd
 * �������ڹ��򣺸���Ʒ��������ǰ���ܵ�����
 * @author tarena
 *
 */
public class Test2 {
	public static void main(String[] args) throws ParseException {
		Scanner scan = new Scanner(System.in);
		System.out.println("������һ����Ʒ����������(��ʽ: yyyy-MM-dd)");
		String str = scan.nextLine();
		System.out.println("������");
		int days = Integer.parseInt(scan.nextLine());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse(str);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		//���ϱ�����
		calendar.add(Calendar.DAY_OF_YEAR,days);
		//ǰ����
		calendar.add(Calendar.DAY_OF_YEAR,-14);
		//���ܵ�����
		calendar.set(Calendar.DAY_OF_WEEK,Calendar.WEDNESDAY);
		date = calendar.getTime();
		String line = sdf.format(date);
		System.out.println("��������:"+line);
		
	}
}
