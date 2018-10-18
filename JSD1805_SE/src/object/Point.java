package object;
/**
 * java�����е��඼�Ǽ̳���Object
 * ��һ����û��ʹ��extends�����̳�ĳ����ʱ��Ĭ�Ͼͼ̳� 
 * ��Object�����������ڱ������ʱ���䣺extends Object��
 * @author tarena
 *
 */
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
}

















