package date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java.text.SimpleDateFormat
 * SDF是用来在String与Date之间相互转换的API
 * SDF转换是基于一个给定的日期格式
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
		 * 该方法会将给定的Date按照当前SDF指定的日期格式
		 * 转换为对应的字符串  Date->String
		 */
		String line = sdf.format(now);
		System.out.println(line);
	}
}
