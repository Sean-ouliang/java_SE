package exception;
/**
 * fianlly��
 * finally��ֻ�ܶ������쳣������Ƶ���󡣼���ֱ�Ӹ���
 * try֮��������һ��catch֮��
 * finally����Ա�ֻ֤Ҫ����ִ�е�try����У���ôfinally
 * ���еĴ���ض�ִ�С�
 * ����ͨ�����޹غ������Ƿ���쳣��Ҫִ�еĴ�������������
 * IO������Ϻ�����رա�
 * @author tarena
 *
 */
public class FinallyDemo {
	public static void main(String[] args) {
		System.out.println("����ʼ��");
		try{
			String str = "";
			System.out.println(str.length());
			return;
		}catch(Exception e){
			System.out.println("������");
		}finally{
			System.out.println("finally�еĴ���������");
		}
		System.out.println("���������");
	}
}
