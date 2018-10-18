package file;

import java.io.File;

/**
 * 创建一个多级目录
 * @author tarena
 *
 */
public class MkDirsDemo {
	public static void main(String[] args){
		/*
		 * 在当前目录下创建：a/b/c/d/e/f
		 */
		File dirs = new File("a/b/c/e/f");
		/*
		 * mkdir在创建目录是要求其所在父目录必须存在
		 * mkdirs则会将所有不存在的父目录一同创建出来
		 */
		if(!dirs.exists()){
			dirs.mkdirs();
			System.out.println("创建完毕");
		}else{
			System.out.println("目录已存在");
		}
	}
}
