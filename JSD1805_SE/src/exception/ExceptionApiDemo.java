package exception;
/**
 * �쳣���÷���
 * @author tarena
 *
 */
public class ExceptionApiDemo {
	public static void main(String[] args){
		System.out.println("����ʼ��");
		try{
			String str = "a";
			int a =Integer.parseInt(str);
		}catch(Exception e){
			System.out.println("�����ˣ�");
			//��������ջ��Ϣ�������ڵ�������
//			e.printStackTrace();
			
			//��ȡ������Ϣ�������������쳣����
			String message = e.getMessage();
			System.out.println(message);
		}
		System.out.println("���������");
	}
}
