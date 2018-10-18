package raf;
import java.util.Arrays;
import java.util.Scanner;
import java.io.IOException;
import java.io.RandomAccessFile;
/**
 * 修改昵称操作
 * 
 * 要求输入要修改昵称的用户名，以及新昵称，然后将其修改。
 * 若输入的用户名无效，则提示没有此用户
 * @author tarena
 *
 */
public class UpdateNicknameDemo {
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入用户名：");
		String name = scan.nextLine();
		System.out.println("请输入昵称：");
		String nickname = scan.nextLine();
		RandomAccessFile raf = new RandomAccessFile("user.dat","rw");
		for(int i=0;i<raf.length()/100;i++){
			raf.seek(i*100);
			byte[] data = new byte[32];
			raf.read(data);
			String username = new String(data,"UTF-8").trim();
			if(username.equals(name)){
				raf.seek(i*100+64);
				data = nickname.getBytes("UTF-8");
				data = Arrays.copyOf(data,32);
				raf.write(data);
				System.out.println("修改成功");
				return;
			}
		}
		System.out.println("没有此用户");
		raf.close();
	}
}
