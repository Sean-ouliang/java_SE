package exception;
/**
 * fianlly块
 * finally块只能定义在异常处理机制的最后。即：直接跟在
 * try之后或者最后一个catch之后。
 * finally块可以保证只要程序执行到try语句中，那么finally
 * 块中的代码必定执行。
 * 所以通常将无关乎程序是否出异常都要执行的代码放在这里，例如
 * IO操作完毕后的流关闭。
 * @author tarena
 *
 */
public class FinallyDemo {
	public static void main(String[] args) {
		System.out.println("程序开始了");
		try{
			String str = "";
			System.out.println(str.length());
			return;
		}catch(Exception e){
			System.out.println("出错了");
		}finally{
			System.out.println("finally中的代码运行了");
		}
		System.out.println("程序结束了");
	}
}
