package exception;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

/**
 * throws�������ڷ����������÷������ܻ��׳����쳣��Ҫ��
 * �����߱��봦����쳣��
 * ��������д���ຬ��throws�����쳣�׳��ķ���ʱ��throws
 * ����д��������
 * @author tarena
 *
 */
public class ThrowsDemo {
	public void dosome()throws IOException,AWTException{
		
	}
}
class Son extends ThrowsDemo{
	//�׳��̳е������쳣
//	public void dosome()throws IOException,AWTException{
//		
//	}
	
	//���׳������쳣
//	public void dosome()throws IOException{
//		
//	}
	
	//�����׳��κ��쳣
//	public void dosome(){
//		
//	}
	
	//���׳����෽���׳��쳣���������쳣
//	public void dosome()throws FileNotFoundException{
//		
//	}
	
	//�������׳������쳣
//	public void dosome() throws SQLException{
//		
//	}
	
	//�������׳����෽���׳��쳣�ĸ������쳣
//	public void dosome() throws Exception{
//		
//	}
}
