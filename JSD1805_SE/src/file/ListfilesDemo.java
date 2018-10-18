package file;

import java.io.File;

/**
 * 获取一个目录中的子项
 * @author tarena
 *
 */
public class ListfilesDemo {
	public static void main(String[] args){
		/*
		 * 获取当前目录中的所有子项
		 */
		File dir = new File(".");
		/*
		 * boolean isFile()
		 * 判断当前file是否表示的是文件
		 * 
		 * boolean isDirectory()
		 * 判断是否表示的是目录
		 */
		if(dir.isDirectory()){
			File[] subs = dir.listFiles();
			System.out.println("sub:"+subs.length);
			for(int i=0;i<subs.length;i++){
				System.out.println(subs[i].getName());
			}
		}
	}
}
