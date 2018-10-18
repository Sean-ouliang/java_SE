package file;

import java.io.File;

/**
 * java.io.file
 * File的每一个实例用于表示文件系统的（硬盘中）上的一个文件
 * 或目录
 * 使用File可以：
 * 1：访问属性信息（名字，长度，修改时间等）
 * 2：操作文件或目录（创建，删除等）
 * 3：获取一个目录的子页
 * 但是不能访问文件数据
 * @author tarena
 *
 */
public class fileDemo {
	public static void main(String[] args){
		/*
		 * File没有无参构造方法，需要传入一个字符串，
		 * 该字符串内容为路径。注意，路径通常不会使用
		 * 绝对路径，因为不同系统的绝对路径定义不同，
		 * 会出现跨平台问题
		 * 相对路径的好处在于不存在跨平台问题，但是相对
		 * 的路径通常有运行环境而定。实际开发中比较常使
		 * 用的类加载路径
		 * 在eclipse中，通常相对“当前目录”，当前目录值的
		 * 是当期程序所在项目的项目目录
		 */
		File file = new File("./demo.txt");
		/*
		 * 获取名字
		 */
		String name = file.getName();
		System.out.println(name);
		/*
		 * 获取文件的长度（字节量）
		 */
		long length = file.length();
		System.out.println(length+"字节");
		boolean cr = file.canRead();
		boolean cw = file.canWrite();
		System.out.println("可读："+cr);
		System.out.println("可写："+cw);
		
		boolean ih = file.isHidden();
		System.out.println("是否隐藏："+ih);
	}
}
