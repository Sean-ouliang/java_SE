package object;
/**
 * ����Point��д��Object��ط���
 * @author tarena
 *
 */
public class Demo {
	public static void main(String[] args){
		Point p = new Point();
		p.setX(1);
		p.setY(2);
		/*
		 * Object���õķ���һ��
		 * String toString()
		 * �÷����������ǽ���ǰ����ת��Ϊһ���ַ���
		 * Objectʵ�ֵĸ÷������ص��ַ�������Ϊ��ǰ
		 * ����ľ������ַ����ʵ�����岻��ͨ������
		 * ʹ��һ�������toString����ʱ��Ӧ����д
		 * �������ص��ַ���Ӧ��������ǰ������Ч��Ϣ��
		 * JAVA��API�ܶ������Ҳ�����toString����
		 */
		String str = p.toString();
		System.out.println(str);
		/*
		 * System.out.pritnln(OBject o)
		 * �÷����ǽ����������toString�������ص��ַ���
		 * ���������̨��
		 */
		System.out.println(p);//���ն������
		
		Point p1 = new Point();
		p1.setX(1);
		p1.setY(2);
		System.out.println(p1);
		System.out.println(p1==p);
		/*
		 * Object�ṩ��equals�����������ǱȽ���������
		 * �������Ƿ���ͬ�����Ǳ���Object�ṩ�ĸ÷���
		 * ��ֱ��ʹ�á�==���Ƚϵģ�����������д�÷�����
		 * û��ʵ�����塣
		 */
		System.out.println(p1.equals(p));
	}
}

















