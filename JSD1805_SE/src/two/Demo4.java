package two;

public class Demo4 {
	public static void main(String[] args) {
		/*
		 * »œ ∂≤π¬Î
		 */
		int i = -1;
		System.out.println(Integer.toBinaryString(i));
		long l = -1L;
		System.out.println(Long.toBinaryString(l));
		
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		System.out.println(Integer.toBinaryString(max));
		System.out.println(Integer.toBinaryString(min));
		
		max = 0x7fffffff;
		min = 0x80000000;
		System.out.println(Integer.toBinaryString(max));
		System.out.println(Integer.toBinaryString(min));
	}
}
