package file;

import java.io.File;

/**
 * 1、编写一段代码，完成1+2+3+4....10并输出结果
 *   在这段代码中不能出现for、while关键字
 *   
 * 
 * 2、买汽水的问题，1块钱买1瓶汽水，2个空瓶可以换1瓶
 *   汽水，3个瓶盖可以换1瓶汽水，问20块钱总共可以得到
 *   多少瓶汽水
 * 
 * 
 * 删除给定File表示的文件或目录
 * @author tarena
 *
 */
public class Test {
	public static void main(String[] args){
		File file = new File("a");
		delete(file);
	}
	/**
	 * 将给定的File表示的文件或目录删除
	 */
	public static void delete(File file){
		/*
		 * 首先判断该file是文件还是目录
		 * 若是目录，要先将所有子项删除（清空该目录）
		 * 然后再将该目录删除
		 * 若是文件，直接删除
		 */
		if(file.isDirectory()){
			File[] subs = file.listFiles();
			for(File sub:subs){
				/*
				 * 递归调用
				 * 在当前方法内部再次调用当前方法的现象
				 * 称为递归调用
				 */
				delete(sub);
			}
		}
		file.delete();
	}
}
