package two;

public class Demo5 {
	public static void main(String[] args) {
		/*
		 * 验证：补码互补对称公式
		 * -n = ~n + 1;
		 */
		int n = 58;
		int m = ~n + 1;
		System.out.println(m);
		System.out.println(Integer.toBinaryString(n));
		System.out.println(Integer.toBinaryString(~n));
		System.out.println(Integer.toBinaryString(57));
		System.out.println(Integer.toBinaryString(~n+1));
		System.out.println(n);
		System.out.println(~n);
		System.out.println(~n+1);
	}
}
