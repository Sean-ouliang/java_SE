package two;

public class Demo6 {
	public static void main(String[] args) {
		/*
		 * 演示：&计算
		 * 利用经典的“掩码计算”截取n的后8位数到k
		 */
		int n = 0x76a943f5;
		int m = 0x3f;
		int k = n&m;
		System.out.println(Integer.toBinaryString(n));
		System.out.println(Integer.toBinaryString(m));
		System.out.println(Integer.toBinaryString(k));
	}
}
