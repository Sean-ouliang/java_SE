package two;

public class Demo8 {
	public static void main(String[] args) {
		int n = 0xce;
		int m = 0xef00;
		int k = n | m;
		System.out.println(Integer.toBinaryString(k));
	}
}
