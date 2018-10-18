package two;

public class Demo2 {
	public static void main(String[] args) {
		/*
		 * 输出0~63范围的2进制数据
		 */
		for(int i=0;i<63;i++){
			System.out.println(Integer.toBinaryString(i));
		}
	}
}
