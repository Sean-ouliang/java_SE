package exception;

public class ThrowDemo {
	public static void main(String[] args) {
		Person p = new Person();
			/*
			 * 当调用一个含有throws声明异常抛出的方法时
			 * 必须处理该异常，否则编译不通过。
			 * 处理异常的方式有两种：
			 * 1.使用try-catch捕获并处理该异常
			 * 2.在当前方法上继续使用throws声明该异常
			 *   的抛出。
			 */
			try {
				p.setAge(200);
			} catch (IllegalAgeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println("年龄："+p.getAge());
	}
}
