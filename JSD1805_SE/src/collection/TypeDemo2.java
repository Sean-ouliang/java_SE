package collection;
/**
 * �����Ǳ������Ͽɣ���������������Գ�������
 * @author tarena
 *
 */
public class TypeDemo2 {
	public static void main(String[] args) {
		Pointers<Integer> p1 = new Pointers<Integer>(1,2);
		p1.setX(2);//���������ʵ���Ƿ���Ϸ���Ҫ��
		int x1 = p1.getX();//�������������
		System.out.println("x1:"+x1);
		System.out.println("p1:"+p1);
		//p2Ҳ����p1ָ����ʵ��
		Pointers p2 = p1;
		System.out.println("p2:"+p2);
		p2.setX("��");
		System.out.println("p2:"+p2);
		x1 = p1.getX();//�׳��������쳣
		System.out.println("x1:"+x1);//ִ�в���
	}
}
