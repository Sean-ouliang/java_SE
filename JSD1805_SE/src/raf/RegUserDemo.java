package raf;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;
/**
 * 使用RAF实现用户注册功能
 * 程序启动后，要求用户输入以下信息：
 * 用户名，密码，昵称，年龄。其中年龄是int值，其他都是
 * 字符串。
 * 然后将该用户信息写入user.dat文件中保存。
 * 
 * 每条记录占用固定100字节。
 * 其中用户名，密码，昵称各占32字节，年龄是int值固定的
 * 4个字节。
 * 字符串留白可以方便的编辑字符串内容，而且每条记录的格式
 * 也统一。
 * @author tarena
 *
 */
public class RegUserDemo {
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		System.out.println("欢迎注册");
		System.out.println("请输入用户名：");
		String name = scan.nextLine();
		System.out.println("请输入密码：");
		String password = scan.nextLine();
		System.out.println("请输入昵称：");
		String nickname = scan.nextLine();
		System.out.println("请输入年龄：");
		int age = Integer.parseInt(scan.nextLine());
		RandomAccessFile raf = new RandomAccessFile("user.dat","rw");
		raf.seek(raf.length());
		//写用户名
		byte[] data = name.getBytes("UTF-8");
		data = Arrays.copyOf(data,32);
		raf.write(data);
		//写密码
		data = password.getBytes("UTF-8");
		data = Arrays.copyOf(data,32);
		raf.write(data);
		//写昵称
		data = nickname.getBytes("UTF-8");
		data = Arrays.copyOf(data,32);
		raf.write(data);
		//写年龄
		raf.writeInt(age);
		System.out.println("pos:"+raf.getFilePointer());
		raf.close();
	}
}
