package exception;
/**
 * 异常常用方法
 * @author tarena
 *
 */
public class ExceptionApiDemo {
	public static void main(String[] args){
		System.out.println("程序开始了");
		try{
			String str = "a";
			int a =Integer.parseInt(str);
		}catch(Exception e){
			System.out.println("出错了！");
			//输出错误堆栈信息，有助于调整错误
//			e.printStackTrace();
			
			//获取错误消息，但不是所有异常都有
			String message = e.getMessage();
			System.out.println(message);
		}
		System.out.println("程序结束了");
	}
}
