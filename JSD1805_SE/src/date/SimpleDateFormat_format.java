package date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java.text.SimpleDateFormat
 * SDF��������String��Date֮���໥ת����API
 * SDFת���ǻ���һ�����������ڸ�ʽ
 * @author tarena
 *
 */
public class SimpleDateFormat_format {
	public static void main(String[] args){
		Date now = new Date();
		System.out.println(now);
		/*
		 * 2018-07-23 10:32:21
		 * yyyy-MM-dd HH:mm:ss E a
		 */
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E a");
		/*
		 * String format(Date date)
		 * �÷����Ὣ������Date���յ�ǰSDFָ�������ڸ�ʽ
		 * ת��Ϊ��Ӧ���ַ���  Date->String
		 */
		String line = sdf.format(now);
		System.out.println(line);
	}
}
