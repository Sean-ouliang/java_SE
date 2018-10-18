package reflect;
/**
 * 使用当前类测试反射机制
 * @author tarena
 *
 */
public class Person {
	public void sayHello(){
		System.out.println("大家好！");
	}
	
	public void sayHi(){
		System.out.println("Hi,艾维巴蒂！");
	}
	
	public void sayName(String name){
		System.out.println("我的名字叫:"+name);
	}
	
	public void sayInfo(String name,int age){
		System.out.println("我的名字叫:"+name+",我今年:"+age+"岁");
	}
	
	private void dosome(){
		System.out.println("我是私有方法！！！！");
	}
}
