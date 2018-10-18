package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 将一个字符串解析为Date
 * @author tarena
 *
 */
public class SimpleDateFormat_parse {
	public static void main(String[] args) throws ParseException {
		String str = "2018-07-23 10:46:45";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		/*
		 * Date parse(String str)
		 * 将给定的字符串按照当前SDF指定的日期格式解析为
		 * Date对象。
		 */
		Date date = sdf.parse(str);
		System.out.println(date);
	}
}
