package string;
/**
 * String�ǲ�����󣬼����ַ�������һ�����������ݲ���
 * �ı䣬��ı�����һ�������¶���
 * @author tarena
 *
 */
public class StringDemo {
	public static void main(String[] args){
		/*
		 * java���鴴���ַ�������ʱʹ����������ʽֱ��
		 * ��ֵ����Ϊ��������ʱjava�������Ѿ���������
		 * �ַ�������
		 * ʹ�������������ַ�������ʱ��JVM�����ȼ��
		 * �������Ƿ��Ѿ�����������ݵ��ַ�����������
		 * ��ֱ�����øö�����û�вŴ������ַ�������
		 * ��������
		 */
		String s1 = "123abc";
		String s2 = "123abc";
		String s3 = new String("123abc");
		System.out.println(s1==s2);//true
		System.out.println(s1==s3);//false
		System.out.println(s1.equals(s3));//true
		/*
		 * ��������һ���Ż���ʩ�����������ڱ������ʱ
		 * ����һ��������ʽ�Ĳ�������������ʱ����ô
		 * ��ֱ�Ӽ��㣬����������뵽class�ļ��С�
		 * ��������Ĵ���ᱻ��������Ϊ��
		 * String s5 = "123abc"
		 */
		String s5 = "123"+"abc";
		System.out.println(s3==s5);
		System.out.println("s5:"+s5);
		String s = "123";
		String s6 = s + "abc";
		System.out.println(s3==s6);
		System.out.println("s6:"+s6);
	}
}
