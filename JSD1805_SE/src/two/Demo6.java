package two;

public class Demo6 {
	public static void main(String[] args) {
		/*
		 * ��ʾ��&����
		 * ���þ���ġ�������㡱��ȡn�ĺ�8λ����k
		 */
		int n = 0x76a943f5;
		int m = 0x3f;
		int k = n&m;
		System.out.println(Integer.toBinaryString(n));
		System.out.println(Integer.toBinaryString(m));
		System.out.println(Integer.toBinaryString(k));
	}
}
