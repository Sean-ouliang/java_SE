package two;

public class Demo3 {
	public static void main(String[] args) {
		int i = 0x2e62f3b7;//16����
		System.out.println("2���ƣ�"+Integer.toBinaryString(i));
		System.out.println("16���ƣ�"+Integer.toHexString(i));
		System.out.println("8���ƣ�"+Integer.toOctalString(i));
		System.out.println("2���ƣ�"+Integer.toString(i,2));
		System.out.println("10���ƣ�"+Integer.toString(i));
		System.out.println("10���ƣ�"+Integer.toString(i,10));
	}
}
