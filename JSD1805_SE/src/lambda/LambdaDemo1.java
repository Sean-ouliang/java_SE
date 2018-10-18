package lambda;
/**
 * lambda表达式
 * JDK8推出的一个特性，可用来快速便捷的创建匿名内部类
 * 
 * 语法：
 * ([arg1,arg2...])->{
 * 	方法体
 * }
 * 
 * lambda表达式在创建一个匿名内部类时有一个要求，就是
 * 其对应接口必须有且只能有一个抽象方法时才可以使用。
 * 如果存在多个方法时使用编译是不通过的。
 * @author tarena
 *
 */
public class LambdaDemo1 {
	public static void main(String[] args) {
		Runnable r1 = new Runnable(){
			public void run(){
				System.out.println("hello");
			}
		};
		
		Runnable r2 = ()->{
			System.out.println("hello");
		};
		
		Thread t = new Thread(()->{
			System.out.println("ok");
		});
		t.start();
		/*
		 * 若重写的方法中只有一句代码，那么该方法的“{}”
		 * 是可以省略的。
		 */
		Runnable r4 = ()->System.out.println("hello");
	}
	
}
