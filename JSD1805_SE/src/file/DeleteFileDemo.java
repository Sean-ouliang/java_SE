package file;

import java.io.File;

/**
 * 删除一个文件
 * @author tarena
 *
 */
public class DeleteFileDemo {
	public static void main(String[] args){
		/*
		 * 将当前目录下的test.txt文件删除
		 * 
		 * “./”不写，默认也是在当前目录中
		 */
		File file  =new File("test.txt");
		if(file.exists()){
			file.delete();
			System.out.println("文件已删除");
		}else{
			System.out.println("文件不存在");
		}
	}
}
