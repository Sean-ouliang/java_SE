package string;
/**
 * �ַ���֧��������ʽ����
 * String[] split(String regex)
 * �������������������ʽ�Ĳ��ֽ��в�ֵ�ǰ�ַ�����
 * ����ֺ��ÿ������������ʽ���ء�
 * @author tarena
 *
 */
public class SplitDemo {
	public static void main(String[] args){
		String str = "abc123def456ghi789jkl";
		/*
		 * �������ֲ��ֲ���ַ�������ֳ�������ĸ����
		 */
		String[] array = str.split("[0-9]+");
		System.out.println("len:"+array.length);
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
		test();
	}
	/**
	 * ͼƬ������
	 */
	public static void test(){
		String imgName = "1254.jpg";
		String[] name = imgName.split("\\.");
		imgName = System.currentTimeMillis()+"."+name[1];
		System.out.println("��ͼƬ����"+imgName);
	}
}
