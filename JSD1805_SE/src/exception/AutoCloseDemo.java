package exception;

import java.io.FileOutputStream;

/**
 * 在JDK1.7之后，推出了一个新的特性：自动关闭。
 * @author tarena
 *
 */
public class AutoCloseDemo {
	public static void main(String[] args) {
		try(
			/*
			 * 实现了AutoCloseable接口的定义在这里，
			 * 最终可以被自动关闭
			 * 实际上下面的代码会被编译器在编译时修改
			 * 为类似：FinallyDemo2代码的内容
			 */
			FileOutputStream fos = new FileOutputStream("fos.dat");	
		){
			fos.write(1);
		}catch(Exception e){
			System.out.println("出错了！");
		}
	}
}
