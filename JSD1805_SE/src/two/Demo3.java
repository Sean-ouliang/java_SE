package two;

public class Demo3 {
	public static void main(String[] args) {
		int i = 0x2e62f3b7;//16进制
		System.out.println("2进制："+Integer.toBinaryString(i));
		System.out.println("16进制："+Integer.toHexString(i));
		System.out.println("8进制："+Integer.toOctalString(i));
		System.out.println("2进制："+Integer.toString(i,2));
		System.out.println("10机制："+Integer.toString(i));
		System.out.println("10进制："+Integer.toString(i,10));
	}
}
