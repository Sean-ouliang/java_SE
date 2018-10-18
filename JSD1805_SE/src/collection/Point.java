package collection;
/**
 * ��Ϊ����Ԫ�ز���Collections������
 * 
 * Collections��sort(List list)����Ҫ�󼯺�Ԫ�ر���ʵ��
 * Comparable�ӿڡ�
 * 
 * ���������Զ�������Ԫ�صļ���ʱ��������ʹ��������sort
 * ��������Ӧ��ʹ�����ص���Ҫ�������Ƚ�����sort������
 * static void sort(List list,Comparator com)
 * ��Ϊ�÷�����Ҫ�󼯺�Ԫ�ر���ʵ��Comparator�ӿڣ���ô
 * �÷��������Ǽ�����Ԫ��Point��û�������ԡ�
 * �����ԣ���������Ҫ����ĳ�����ܷ���ʱ���÷���Ҫ�����ǵ�
 * ����Ϊ���޸������Ķ�����룬�޸ĵ�Խ�࣬������Խǿ��
 * �����ԶԺ���ϵͳά���������ڿ�����Ӧ���������⡣
 * @author tarena
 *
 */
//public class Point implements Comparable<Point>{//���Ƽ�����ʵ������ӿ�
public class Point{
	private int x;
	private int y;
	public Point(){
		
	}
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	/**
	 * ��дObject��toString���������ص��ַ�����ʽ��
	 * û��Ҫ�󣬰��ս���ʵ�ʿ������������ԭ����Ӧ��
	 * ������ǰ�������Ч��Ϣ������ֵ����
	 */
	public String toString(){
		return "("+x+","+y+")";
	}
	/**
	 * ͨ��������Ҫʹ��һ�������equals������Ӧ����д
	 * ����java�ṩ���಻��Ҫ���Ѿ���д���ˣ���
	 * ��дequals��Ŀ���ǱȽ���������this�Ͳ���o������
	 * �Ƿ���ͬ�����Ƚ�Ҳ����Ҫ�������������ֵ����ͬ��
	 * �ɽ��ʵ�ʿ������������
	 */
	public boolean equals(Object o){
		if(o == null){
			return false;
		}
		if(o == this){
			return true;
		}
		if(o instanceof Point){
			Point p = (Point)o;
			return this.x == p.x && this.y == p.y;
		}
		return false;
	}
	/**
	 * this compareTo o
	 * ��ʵ����Comparable�ӿں󣬾ͱ�����д���󷽷�
	 * compareTo���÷����������Ƕ��嵱ǰ�������������
	 * �ıȽϴ�С����
	 * �÷����ķ���ֵΪintֵ����ֵ�����ľ���ȡֵ������
	 * ����ȡֵ��Χ��
	 * ������ֵ>0:��ǰ������ڲ������� 
	 * 				this>0
	 * ������ֵ<0:��ǰ����С�ڲ�������
	 * ������ֵ=0:�����������
	 */
//	@Override
//	public int compareTo(Point o) {
//		/*
//		 * �㵽ԭ����볤�Ĵ�
//		 */
//		int len = this.x*this.x+this.y*this.y;
//		int olen = o.x*o.x+o.y*o.y;
//		return len-olen;
//	}
	
}

















