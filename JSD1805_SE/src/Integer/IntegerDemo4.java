package Integer;
/**
 * ��װ���ṩ��һ���ǳ�ʵ�õľ�̬������parseXXX��String str��
 * ���Խ��ַ���ת��Ϊ��Ӧ�Ļ�������
 * @author tarena
 *
 */
public class IntegerDemo4 {
	public static void main(String[] args){
		/*
		 * ��װ�ཫ�ַ���ת��Ϊ�������͵�ǰ��������
		 * ���ַ���Ҫ��ȷ�����������Ϳ��Ա����ֵ��
		 */
		String str = "123";
		
		int d = Integer.parseInt(str);
		System.out.println(d+1);
		
		double dou = Double.parseDouble(str);
		System.out.println(dou+1);
	}
}
