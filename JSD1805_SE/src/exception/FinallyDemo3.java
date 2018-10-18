package exception;
/**
 * finally����������
 * 
 * �������final,finally,finalize
 * 
 * finalize��Object����ķ�������GCҪ�ͷ�һ������ʱ��
 * ���ø÷������÷���ִ�������ζ���伴�����ͷš�
 * �÷�����Ӧ���к�ʱ������
 * 
 * 
 * @author tarena
 *
 */
public class FinallyDemo3 {
	public static void main(String[] args) {
		System.out.println(test("0")+","+test(null)+","+test(""));
	}
	public static int test(String str){
		try {
			return str.charAt(0)-'0';
		} catch (NullPointerException e) {
			return 1;
		} catch (Exception e){
			return 2;
		} finally {
			return 3;
		}
	}
	
	//GC
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
}
