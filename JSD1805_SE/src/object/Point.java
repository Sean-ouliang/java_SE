package object;
/**
 * java中所有的类都是继承自Object
 * 当一个类没有使用extends标明继承某个类时，默认就继承 
 * 自Object（编译器会在编译该类时补充：extends Object）
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
	 * 重写Object的toString方法。返回的字符串格式上
	 * 没有要求，按照将来实际开发需求而定，原则上应当
	 * 包含当前对象的有效信息（属性值）。
	 */
	public String toString(){
		return "("+x+","+y+")";
	}
	/**
	 * 通常我们需要使用一个对象的equals方法就应当重写
	 * 它（java提供的类不需要，已经重写好了）。
	 * 重写equals的目的是比较两个对象this和参数o的内容
	 * 是否相同。而比较也并非要求必须所有属性值都相同。
	 * 可结合实际开发需求而定。
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

















