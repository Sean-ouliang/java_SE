package collection;
/**
 * 泛型
 * JDK1.5之后推出的一个新的特性，泛型也称为参数化类型，意图
 * 在于将一个类中属性，方法参数，返回值等类型的定义权交给了
 * 使用者，这样大大提高了代码的灵活性。
 * 泛型的原型是Object，即：在使用时若不明确指定泛型的实际类型
 * 时，则默认按照原型Object使用。
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
