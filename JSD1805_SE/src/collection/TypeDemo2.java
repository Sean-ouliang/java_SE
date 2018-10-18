package collection;
/**
 * 泛型是编译器认可，而非虚拟机，面试常见问题
 * @author tarena
 *
 */
public class TypeDemo2 {
	public static void main(String[] args) {
		Pointers<Integer> p1 = new Pointers<Integer>(1,2);
		p1.setX(2);//编译器检测实参是否符合泛型要求
		int x1 = p1.getX();//编译后会添加造型
		System.out.println("x1:"+x1);
		System.out.println("p1:"+p1);
		//p2也引用p1指定的实例
		Pointers p2 = p1;
		System.out.println("p2:"+p2);
		p2.setX("三");
		System.out.println("p2:"+p2);
		x1 = p1.getX();//抛出类造型异常
		System.out.println("x1:"+x1);//执行不到
	}
}
