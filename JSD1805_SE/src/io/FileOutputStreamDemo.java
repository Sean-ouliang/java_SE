package io;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * java标准IO
 * IO指的是输入与输出（Input，Output）
 * java将读写操作按照方向划分为输入流与输出流，其中 输入
 * 流用来读，输出流用来写
 * java.io.InputStream：所有字节输入流的超类，定义了若干
 * 抽象方法，其中规定了读写字节的相关操作。
 * 
 * java.io.OutputSrteam：所有字节输出流的超类。定义了写出
 * 字节的相关方法
 * 
 * 流的两类：
 * 节点流和处理流
 * 
 * 节点流：又称低级流。是实际链接程序与数据源的“管道”，
 *       负责实际数据的搬运工作。读写数据一定是建立在
 *       节点流的基础上进行的，特点：数据源明确
 *       
 * 处理流：又称为高级流。不能独立存在，必须链接在其他流
 *       上，作用是当数据流经该流时，其可以对数据进行
 *       某些加工处理。这样可以简化我们再对数据加工的
 *       操作。
 *       
 * 流的链接：将需要的一组处理流链接在一起，最终链接在节点
 *        流上，可对数据进行“流水线”式的加工并进行读写
 *        这也是IO读写的重点
 *        
 * 文件流，文件流是一组节点流，作用是读写文件。
 * 文件流与RAF都是用来读写文件数据的，但是他们也有各自的
 * 有点与缺点。
 * 文件流：由于流的读写模式是顺序读写，所以文件流也是以该
 * 方式读写文件数据的。所以做不到编辑文件数据（只覆盖文件
 * 特定位置的字节）。读写不能回退操作。但是基于链接操作
 * 可以轻松读写复杂数据。
 * 
 * RAF：基于指针进行读写，所以RAF可以操作指针读写特定位置
 * 的字节，能够编辑文件数据，虽然有提供方便的读写基本类型
 * 数据与字符串等方法，但是读写复杂数据需要自完成。
 * @author tarena
 *
 */
public class FileOutputStreamDemo{
	public static void main(String[] args) throws IOException{
		/*
		 * 文件输出流有两种创建方式：
		 * FileOutputStream（File file）
		 * FileOutputStream（String path）
		 * 以上构造方法创建的文件流是覆盖写操作，即：若
		 * 该文件已经存在，会先将该文件数据清除，然后通过
		 * 这个流写出的内容作为文件数据保存。
		 * 
		 * FileOutputStream（File file，boolean append）
		 * FileOutputStream（String path，boolean append）
		 * 若第二个参数true，则是追加写模式，即：若该
		 * 文件存在，保留该文件所有数据，将通过当前流写出
		 * 的数据追加到文件末尾。
		 * 
		 * 做不到像RAf那样操作指针，覆盖部分内容的操作。
		 */
		FileOutputStream fos = new FileOutputStream("fos.txt",true);
		String str = "，你";
		byte[] data = str.getBytes("UTF-8");
		fos.write(data);
		System.out.println("写出完毕");
		fos.close();
	}
}
