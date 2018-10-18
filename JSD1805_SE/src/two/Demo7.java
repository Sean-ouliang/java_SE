package two;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Demo7 {
	public static void main(String[] args) throws IOException {
		int n = 0x4abdefeb;
		int m = n>>>1;
		int k = n>>>2;
		int j = n>>>8;
		System.out.println(Integer.toBinaryString(n));
		System.out.println(Integer.toBinaryString(m));
		System.out.println(Integer.toBinaryString(k));
		System.out.println(Integer.toBinaryString(j));
		
		int b1 = n&0xff;
		int b2 = n>>>8&0xff;
		int b3 = n>>>16&0xff;
		int b4 = n>>>24&0xff;
		System.out.println("b1:"+Integer.toBinaryString(b1));
		System.out.println("b2:"+Integer.toBinaryString(b2));
		System.out.println("b3:"+Integer.toBinaryString(b3));
		System.out.println("b4:"+Integer.toBinaryString(b4));
		
		int i = 0xef9ac85d;
		int d1 = i>>>24&0xff;
		int d2 = i>>>16&0xff;
		int d3 = i>>>8&0xff;
		int d4 = i&0xff;
		System.out.println(Integer.toBinaryString(i));
		System.out.println(Integer.toBinaryString(d1));
		System.out.println(Integer.toBinaryString(d2));
		System.out.println(Integer.toBinaryString(d3));
		System.out.println(Integer.toBinaryString(d4));
		
		RandomAccessFile raf = new RandomAccessFile("myfile.dat","rw");
		raf.write(d1);
		raf.write(d2);
		raf.write(d3);
		raf.write(d4);
		
		raf.seek(0);
		
		int i1 = raf.read()<<24;
		int i2 = raf.read()<<16;
		int i3 = raf.read()<<8;
		int i4 = raf.read();
		System.out.println(Integer.toBinaryString(i1 | i2 | i3 | i4));
		
		raf.close();
	}
}
