package Integer;
import object.Point;
/**
 * ��װ��
 * ����java8���������ͣ����ǲ����������������ԣ���ô
 * ��ʵ�ʿ����в���ֱ�Ӳ����������Ŀ�������ܲ�����
 * Ϊ�ˣ�javaΪ8�����������ṩ�˶�Ӧ�İ�װ�ࡣĿ���ǿ���
 * �û��������Զ������ʽ���ڣ��ܹ�����������󿪷���
 * @author tarena
 *
 */
public class IntegerDemo {
	public static void main(String[] args){
		dosome("nihao");
		dosome(new String[] {});
		dosome(new Point());
		int d = 1;
//		dosome(d);//jdk1.5֮ǰ�����������벻ͨ��
		Integer in = new Integer(d);
		dosome(in);
	}
	public static void dosome(Object o){
		
	}
}
