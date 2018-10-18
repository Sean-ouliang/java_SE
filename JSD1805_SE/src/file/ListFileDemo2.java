package file;

import java.io.File;
import java.io.FileFilter;

/**
 * File提供了一个重载的listFiles方法，可以传入一个
 * 文件过滤器，然后将其表示的目录中满足过滤器要求的
 * 子项返回。
 * 
 * File[] listFiles(FileFilter filter)
 * 
 * @author tarena
 *
 */
public class ListFileDemo2 {
	public static void main(String[] args){
		File dir = new File(".");//“.”表示当前文件目录
		/*
		 * 获取当前目录中所有名字以“.”开头的子项
		 */
//		FileFilter filter = new FileFilter(){
//			public boolean accept(File file) {
//				return file.getName().startsWith(".");
//			}
//		};
		FileFilter filter = new FileFilter(){
			public boolean accept(File file) {
				return file.isFile();
			}
		};
		File[] subs = dir.listFiles(filter);
		for(int i=0;i<subs.length;i++){
			System.out.println(subs[i].getName());
		}
	}
}
