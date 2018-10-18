package file;

import java.io.IOException;
import java.io.File;
/**
 * 使用File创建一个文件
 * @author tarena
 *
 */
public class CreatenewFileDemo {
	public static void main(String[] args) throws IOException{
		/*
		 * 在当前目录下创建test.txt文件
		 */
		File file = new File("./test.txt");
		/*
		 * boolean exists()
		 * 判断当前File表示的文件或目录是否存在
		 */
		if(!file.exists()){
			/*
			 * 将当前File表示的文件创建
			 */
			file.createNewFile();
			System.out.println("文件已创建");
		}else{
			System.out.println("文件已存在");
		}
	}
}
