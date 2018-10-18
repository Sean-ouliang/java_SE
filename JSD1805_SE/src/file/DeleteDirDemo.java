package file;

import java.io.File;

/**
 * 删除一个目录
 * @author tarena
 *
 */
public class DeleteDirDemo {
	public static void main(String[] args){
		File dir = new File("demo");
		if(dir.exists()){
			/*
			 * 删除目录的前提条件是，该目录必须是一个
			 * 空目录
			 */
			dir.delete();
			System.out.println("删除完毕");
		}else{
			System.out.println("目录不存在");
		}
	}
}
