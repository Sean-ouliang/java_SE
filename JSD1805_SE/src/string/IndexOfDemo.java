package string;
/**
 * int indexOf(String str)
 * ���Ҹ����ַ����ڵ�ǰ�ַ����е�λ�á�����ǰ�ַ�����
 * �����и������򷵻�ֵΪ-1
 * @author tarena
 *
 */
public class IndexOfDemo {
	public static void main(String[] args){
		//            0123456789012345
		String str = "thinking in java";
		//���ҵ�һ�γ��֡�in����λ��
		int  index = str.indexOf("in");
		System.out.println("index:"+index);
		
		//���ط�������ָ��λ�ÿ�ʼ���ҵ�һ�γ��ֵ�λ��
		index = str.indexOf("in",3);
		System.out.println("index:"+index);
		
		//�������һ�γ��ָ����ַ���λ��
		index = str.lastIndexOf("in");
		System.out.println("index:"+index);
		
		index = str.lastIndexOf("in",8);
		System.out.println("index:"+index);
	}
}
