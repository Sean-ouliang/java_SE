package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * ��дһ�δ��룬Ҫ���û������Լ������գ���ʽ��yyyy-MM-dd
 * Ȼ�󾭹�������㣬���������Ϊֹһ�����˶����졣
 * ����������10000��ļ����������죿��ʽͬ�ϡ�
 * @author tarena
 *
 */
public class Test {
	public static void main(String[] args) throws ParseException {
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Scanner scan = new Scanner(System.in);
		System.out.println("�������Լ������գ���ʽ��2018-07-23��");
		String str = scan.nextLine();
		Date date = sdf.parse(str);
		long time = now.getTime()-date.getTime();
		time = time/1000/60/60/24;
		System.out.println("������Ϊֹһ������"+time+"��");
		/*
		 * ɵ�ƣ����סlong����Ҫ�ӡ�L��
		 */
		time = date.getTime()+1000L*60*60*24*10000;
		date.setTime(time);
		String line = sdf.format(date);
		System.out.println("10000��ļ�������:"+line);
	}
}
