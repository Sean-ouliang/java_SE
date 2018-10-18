package exception;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

/**
 * throws是用来在方法上声明该方法可能会抛出的异常，要求
 * 调用者必须处理该异常。
 * 子类在重写父类含有throws声明异常抛出的方法时对throws
 * 的重写规则如下
 * @author tarena
 *
 */
public class ThrowsDemo {
	public void dosome()throws IOException,AWTException{
		
	}
}
class Son extends ThrowsDemo{
	//抛出继承的所有异常
//	public void dosome()throws IOException,AWTException{
//		
//	}
	
	//仅抛出部分异常
//	public void dosome()throws IOException{
//		
//	}
	
	//不再抛出任何异常
//	public void dosome(){
//		
//	}
	
	//可抛出父类方法抛出异常的子类型异常
//	public void dosome()throws FileNotFoundException{
//		
//	}
	
	//不允许抛出额外异常
//	public void dosome() throws SQLException{
//		
//	}
	
	//不允许抛出父类方法抛出异常的父类型异常
//	public void dosome() throws Exception{
//		
//	}
}
