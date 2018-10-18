package exception;
/**
 * java异常处理机制中的try-catch
 * 语法：
 * try{
 * 代码
 * }catch(Exception e){
 * 处理XXException的代码段
 * }
 * 或
 * try{
 * ...
 * }finally{
 * ...
 * }
 * 
 * @author tarena
 *
 */
public class TryCatchDemo {
	public static void main(String[] args){
		System.out.println("程序开始了");
		try{
			String str = "a";
			System.out.println(str.length());
			System.out.println(str.charAt(0));
			System.out.println(Integer.parseInt(str));
			/*
			 * 在try语句块中出错的代码以下内容都不会
			 * 被执行
			 */
			System.out.println("!!!!!!");
			/*
			 * 如果try语句中的代码没有出现异常，那么
			 * catch语句块是不执行的
			 */
		}catch(NullPointerException e){
			System.out.println("出现了空指针！");
		}catch(StringIndexOutOfBoundsException e){
			System.out.println("字符串下标越界了");
		/*
		 * 应当养成一个好习惯，在最后一个catch上捕获
		 * Exception，避免因为try代码块中一个未捕获的
		 * 异常导致程序中断。
		 */
		}catch(Exception e){
			System.out.println("反正就是出了个错");
		}
		System.out.println("程序结束了");
	}
}
