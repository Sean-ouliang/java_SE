package string;
/**
 * �����ַ�������Ƽ��Ż�����������ԣ������ַ������ʺ�
 * Ƶ���޸�
 * java�����һ��ר������ַ����޸Ĳ������ࣺ
 * StringBuilder���ڲ�ά��һ���ɱ���ַ����飬ʹ�����޸�
 * �ַ������㣬���ҿ���С
 * @author tarena
 *
 */
public class StringBuilderDemo {
	public static void main(String[] args){
		String str = "Ŭ��ѧϰjava";
		StringBuilder builder = new StringBuilder(str);
		/*
		 * ׷������
		 * Ŭ��ѧϰjava��Ϊ���Ҹ��ù���
		 */
		builder.append(",Ϊ���Ҹ��ù�����");
		System.out.println(builder.toString());
		/*
		 * �޸�����
		 * Ŭ��ѧϰjava������Ϊ�˸ı����磡
		 */
		builder.replace(9,16,"����Ϊ�˸ı�����");
		System.out.println(builder.toString());
		/*
		 * ɾ�����ݣ�
		 * ������Ϊ�˸ı����磡
		 */
		builder.delete(0,8);
		System.out.println(builder.toString());
		/*
		 * �������ݣ�
		 * ���ţ�����Ϊ�˸ı����磡
		 */
		builder.insert(0,"����");
		System.out.println(builder.toString());
		
	}
}







