package lambda;

import java.io.File;
import java.io.FileFilter;

/**
 * 
 * @author tarena
 *
 */
public class LambdaDemo2 {
	public static void main(String[] args) {
		//获取当前目录下所有的文本文件
		File file = new File(".");
		/*
		 * 重写方法若含有参数，参数类型可以忽略。编译器
		 * 会结合上下文判定参数类型。
		 */
		FileFilter Filter = (f)->{
			return f.getName().endsWith(".txt");
		};
		/*
		 * 若可以忽略方法的“{}”，那么当这个方法要求返回值
		 * 时，return关键字也必须忽略。
		 */
		FileFilter filter = (f)->f.getName().endsWith(".txt");
		File[] subs = file.listFiles(filter);
		for(File sub:subs){
			System.out.println(sub);
		}
	}
}
