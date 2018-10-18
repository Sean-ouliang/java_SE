package raf;

import java.io.RandomAccessFile;

/**
 * RAF提供了读写基本类型数据的相关方法。以及操作指针的
 * 相关方法
 * RAF是基于指针进行读写数据的，即：RAF总是在指针指向
 * 的文件字节位置金子那个读或写，并且读写后指针会自动向后
 * 移动到一下个字节准备读写
 * @author tarena
 *
 */
public class RAFDemo2 {
	public static void main(String[] args){
		try{
			RandomAccessFile raf = new RandomAccessFile("raf.dat","rw");
			long pos = raf.getFilePointer();
			System.out.println("pos："+pos);
					
			/*
			 * 位操作符
			 * >>>  将2进制整体向右移动指定位数
			 */
			int d = Integer.MAX_VALUE;
			raf.write(d>>>24);
			System.out.println("pos:"+raf.getFilePointer());
			raf.write(d>>>16);
			raf.write(d>>>8);
			raf.write(d);
			System.out.println("pos:"+raf.getFilePointer());
			/*
			 * RAF提供了方便直接写出基本类型数据的相关方法:
			 * 
			 * void writeInt(int d)
			 * 连续写出4个字节，将该int值写出
			 */
			raf.writeInt(d);
			System.out.println("pos:"+raf.getFilePointer());
			//一次性写出8字节，将long值写出
			raf.writeLong(123L);
			//一次性写出8字节，将double值写出
			raf.writeDouble(123.123);
			System.out.println("pos:"+raf.getFilePointer());
			System.out.println("写出完毕！");
			/*
			 * void seek(long pos)
			 * 将指针移动到指定位置
			 * 
			 * 移动到第一个字节的位置
			 */
			//读取第一个int值
			raf.seek(0);
			System.out.println("pos:"+raf.getFilePointer());
			System.out.println(raf.readInt());
			//读取long值
			raf.seek(8);
			System.out.println("pos:"+raf.getFilePointer());
			System.out.println(raf.readLong());
			//读取第二个int值
			raf.seek(4);
			System.out.println("pos:"+raf.getFilePointer());
			System.out.println(raf.readInt());
			//读取double值
			raf.seek(16);
			System.out.println("pos:"+raf.getFilePointer());
			System.out.println(raf.readDouble());
			
			System.out.println(raf.read());
			//修改long值
			
			
			
			raf.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
