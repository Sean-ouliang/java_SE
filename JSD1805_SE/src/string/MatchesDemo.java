package string;
/**
 * �ַ���֧��������ʽ����һ��
 * boolean matches(String str)
 * ʹ�ø�����������ʽ��֤��ǰ�ַ����Ƿ������ʽҪ��
 * ע�⣺����������ʽ�Ƿ���˱߽�ƥ�������^������$��������
 * ȫƥ����֤��
 * @author tarena
 *
 */
public class MatchesDemo {
	public static void main(String[] args){
		String mail = "fan_cq@tedu.cn";
		String regex = "\\w+@\\w+(\\.[a-zA-Z]+)+";
		boolean match = mail.matches(regex);
		if(match){
			System.out.println("������");
		}else{
			System.out.println("��������");
		}
	}
}
