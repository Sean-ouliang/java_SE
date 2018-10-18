package string;
/**
 * �ַ���֧��������ʽ��������
 * String replacAll(String regex,String str)
 * ����ǰ�ַ���������������ʽ�Ĳ����滻Ϊ�����ַ���
 * @author tarena
 *
 */
public class ReplaceAllDemo {
	public static void main(String[] args){
		String str = "abc123def456ghi789jkl";
		/*
		 * ����ǰ�ַ��������鲿���滻Ϊ����#NUMBER#��
		 * abc#NUMBER#def#NUMBER#ghi#NUMBER#jkl
		 */
		str = str.replaceAll("\\d+","#NUMBER#");
		System.out.println(str);
		test();
	}
	
	public static void test(){
		String regex = "(wqnmlgb|djb|dsb|nc|mmp)";
		String message = "wqnmlgb!�����dsb!����ô��ônc!mmp,�����djb";
		message = message.replaceAll(regex,"****");
		System.out.println(message);
	}
}
