package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ��һ���ַ�������ΪDate
 * @author tarena
 *
 */
public class SimpleDateFormat_parse {
	public static void main(String[] args) throws ParseException {
		String str = "2018-07-23 10:46:45";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		/*
		 * Date parse(String str)
		 * ���������ַ������յ�ǰSDFָ�������ڸ�ʽ����Ϊ
		 * Date����
		 */
		Date date = sdf.parse(str);
		System.out.println(date);
	}
}
