package exception;
/**
 * java�쳣��������е�try-catch
 * �﷨��
 * try{
 * ����
 * }catch(Exception e){
 * ����XXException�Ĵ����
 * }
 * ��
 * try{
 * ...
 * }finally{
 * ...
 * }
 * 
 * @author tarena
 *
 */
public class TryCatchDemo {
	public static void main(String[] args){
		System.out.println("����ʼ��");
		try{
			String str = "a";
			System.out.println(str.length());
			System.out.println(str.charAt(0));
			System.out.println(Integer.parseInt(str));
			/*
			 * ��try�����г���Ĵ����������ݶ�����
			 * ��ִ��
			 */
			System.out.println("!!!!!!");
			/*
			 * ���try����еĴ���û�г����쳣����ô
			 * catch�����ǲ�ִ�е�
			 */
		}catch(NullPointerException e){
			System.out.println("�����˿�ָ�룡");
		}catch(StringIndexOutOfBoundsException e){
			System.out.println("�ַ����±�Խ����");
		/*
		 * Ӧ������һ����ϰ�ߣ������һ��catch�ϲ���
		 * Exception��������Ϊtry�������һ��δ�����
		 * �쳣���³����жϡ�
		 */
		}catch(Exception e){
			System.out.println("�������ǳ��˸���");
		}
		System.out.println("���������");
	}
}
