package date;

import java.util.Date;
/**
 * java.util.Date
 * Date��ÿһ��ʵ�����ڱ�ʾһ�������ʱ�䡣
 * ����Date����ʱ���Ѽ�ǧ������⣬���Դ󲿷ַ�����1.1�汾
 * �ͱ�����Ϊ��ʱ�ġ�
 * 
 * ����ʹ��Dateͨ�������ڱ�ʾʱ�䡣
 * @author tarena
 *
 */
public class DateDemo {
	public static void main(String[] args){
		Date date = new Date();
		System.out.println(date);
		/*
		 * long getTime()
		 * �÷�������һ��longֵ����ֵ���ǵ�ǰDate�ڲ�
		 * ά����longֵ����ʾ��1970��1��1�� 00:00:00
		 * ����ǰDate��ʾ��ʱ��֮���������ĺ���
		 */
		long time = date.getTime();
		System.out.println(time);
		//��ʾ������һ��
		time = time+1000*60*60*24;
		//Ҳ��������һ��longֵ����Date��ʾ��ʱ��
		date.setTime(time);
		System.out.println(date);
	}
}
