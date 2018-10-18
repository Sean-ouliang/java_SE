package two;

public class Demo9 {
	public static void main(String[] args) {
		int n = 0x1f2afbe2;
		int m = n<<1;
		int k = n<<2;
		int j = n<<3;
		int a = n<<8;
		System.out.println(Integer.toBinaryString(n));
		System.out.println(Integer.toBinaryString(m));
		System.out.println(Integer.toBinaryString(k));
		System.out.println(Integer.toBinaryString(j));
		System.out.println(Integer.toBinaryString(a));
	}
}
