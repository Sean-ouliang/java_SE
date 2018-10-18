package collection;
/**
 * 作为集合元素测试Collections的排序
 * 
 * Collections的sort(List list)方法要求集合元素必须实现
 * Comparable接口。
 * 
 * 当排序含有自定义类型元素的集合时，不建议使用上述的sort
 * 方法，而应当使用重载的需要传入额外比较器的sort方法：
 * static void sort(List list,Comparator com)
 * 因为该方法不要求集合元素必须实现Comparator接口，那么
 * 该方法对我们集合与元素Point就没有侵入性。
 * 侵入性：当我们需要调用某个功能方法时，该方法要求我们的
 * 程序为其修改其他的额外代码，修改的越多，侵入性越强。
 * 侵入性对后期系统维护不利，在开发中应当尽量避免。
 * @author tarena
 *
 */
//public class Point implements Comparable<Point>{//不推荐这样实现排序接口
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
	/**
	 * this compareTo o
	 * 当实现了Comparable接口后，就必须重写抽象方法
	 * compareTo，该方法的作用是定义当前对象与参数对象
	 * 的比较大小规则。
	 * 该方法的返回值为int值，该值不关心具体取值，关心
	 * 的是取值范围。
	 * 当返回值>0:当前对象大于参数对象 
	 * 				this>0
	 * 当返回值<0:当前对象小于参数对象
	 * 当返回值=0:两个对象相等
	 */
//	@Override
//	public int compareTo(Point o) {
//		/*
//		 * 点到原点距离长的大
//		 */
//		int len = this.x*this.x+this.y*this.y;
//		int olen = o.x*o.x+o.y*o.y;
//		return len-olen;
//	}
	
}

















