package exception;
/**
 * 使用当前类测试异常的抛出相关知识
 * @author tarena
 *
 */
public class Person {
	private int age;

	public int getAge() {
		return age;
	}

	/**
	 * 使用throw在方法中抛出一个异常通常在一下情况发生：
	 * 1、符合语法，但是不符合业务逻辑时，可以当成异常抛出
	 *   给调用者。
	 * 2、确实发生了一个异常，但是该异常不应当被当前方法
	 *   解决，这时可以抛出给调用者。
	 * @throws Exception 
	 */
	public void setAge(int age) throws IllegalAgeException {
		if(age<0 || age>100){
			/*
			 * 通常方法中使用throws什么异常，就要在方法
			 * 声明的同时使用throws声明该异常的抛出。
			 * 只有RuntimeException及其子类异常不需要。
			 */
			throw new IllegalAgeException("年龄不合法！");
		}
		this.age = age;
	}
}
