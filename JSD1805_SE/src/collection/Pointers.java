package collection;
/**
 * ����
 * JDK1.5֮���Ƴ���һ���µ����ԣ�����Ҳ��Ϊ���������ͣ���ͼ
 * ���ڽ�һ���������ԣ���������������ֵ�����͵Ķ���Ȩ������
 * ʹ���ߣ������������˴��������ԡ�
 * ���͵�ԭ����Object��������ʹ��ʱ������ȷָ�����͵�ʵ������
 * ʱ����Ĭ�ϰ���ԭ��Objectʹ�á�
 * @author tarena
 *
 * @param <T>
 */
public class Pointers<T> {
	private T x;
	private T y;
	public Pointers(T x, T y) {
		super();
		this.x = x;
		this.y = y;
	}
	public T getX() {
		return x;
	}
	public void setX(T x) {
		this.x = x;
	}
	public T getY() {
		return y;
	}
	public void setY(T y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "("+x+","+y+")";
	}
}
