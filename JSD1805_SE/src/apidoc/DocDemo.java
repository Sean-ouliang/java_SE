package apidoc;
/**
 * 文档注释可以在三个地方使用：类、方法、常量
 * 在类上使用，用于说明当前类的设计目的。
 * @author tarena （作者）
 * @version 1.0 （版本号）
 * @see java.lang.String （引用的包）
 * @since JDK1.5 （JDK版本号）
 *
 */
public class DocDemo {
	/**
	 * sayHello中的问候语：hello
	 */
	public static final String INFO = "hello";
	
	/**
	 * 为指定的用户添加问候语
	 * @param name（参数） 指定的用户的名字
	 * @return （返回值）含有问候语的字符串
	 */
	public String sayHello(String name){
		return INFO + name;
	}
}
