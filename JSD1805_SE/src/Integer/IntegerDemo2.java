package Integer;
/**
 * 6����ʾ�������͵İ�װ�࣬���Ƕ��̳���java.lang.Number
 * Number��һ�������࣬�ṩ����6������֮��ת�����ֵ���ط���
 * @author tarena
 *
 */
public class IntegerDemo2 {
	public static void main(String[] args){
		/*
		 * �ӻ������ͱ�Ϊ��װ��
		 */
		int d = 128;
		Integer i1 = Integer.valueOf(d);
		Integer i2 = Integer.valueOf(d);
		System.out.println(i1==i2);
		System.out.println(i1.equals(i2));
		
		/*
		 * ��װ��תΪ��������
		 */
		d = i1.intValue();
		byte l = i1.byteValue();
		double doub = i1.doubleValue();
		System.out.println("d:"+d);
		System.out.println("l:"+l);
		System.out.println("doub:"+doub);
		
		double b = 123.125;
		Double b1 = Double.valueOf(b);
		Double b2 = Double.valueOf(b);
		System.out.println(b1==b2);
		System.out.println(b1.equals(b2));
		
		b = b1.doubleValue();
		int in = b1.intValue();
		System.out.println("b:"+b);
		System.out.println("in:"+in);
	}
}
