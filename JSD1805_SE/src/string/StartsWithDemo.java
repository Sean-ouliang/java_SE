package string;
/**
 * boolean startsWith(String str)
 * boolean endsWith(String str)
 * �ж��ַ����Ƿ����Ը������ַ�����ʼ�������
 * @author tarena
 *
 */
public class StartsWithDemo {
	public static void main(String[] args){
		String str = "thinking in java";
		
		boolean starts = str.startsWith("thi");
		System.out.println("starts:"+starts);
		
		boolean ends = str.endsWith("ava");
		System.out.println("ends:"+ends);
	}
}
