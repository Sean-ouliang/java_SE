package string;
/**
 * char charAt(int index)
 * ���ص�ǰ�ַ����и���λ�ö�Ӧ���ַ�
 * @author tarena
 *
 */
public class CharAtDemo {
	public static void main(String[] args){
		//            01234567890123456
		String str = "thinking in java";
		char c = str.charAt(9);
		System.out.println(c);
		
		/*
		 * ���ļ��
		 */
		String line = "�Ϻ�����ˮ���Ժ���";
		for(int i=0;i<line.length()/2;i++){
			if(line.charAt(i)!=line.charAt(line.length()-1-i)){
				System.out.println("���ǻ���");
				return;
			}
		}
		System.out.println("�ǻ���");
		
	}
}
