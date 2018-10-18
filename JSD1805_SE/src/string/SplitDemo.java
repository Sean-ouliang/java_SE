package string;
/**
 * 字符串支持正则表达式二：
 * String[] split(String regex)
 * 按照满足给定的正则表达式的部分进行拆分当前字符串。
 * 将拆分后的每部分以数组形式返回。
 * @author tarena
 *
 */
public class SplitDemo {
	public static void main(String[] args){
		String str = "abc123def456ghi789jkl";
		/*
		 * 按照数字部分拆分字符串，拆分出所有字母部分
		 */
		String[] array = str.split("[0-9]+");
		System.out.println("len:"+array.length);
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
		test();
	}
	/**
	 * 图片重命名
	 */
	public static void test(){
		String imgName = "1254.jpg";
		String[] name = imgName.split("\\.");
		imgName = System.currentTimeMillis()+"."+name[1];
		System.out.println("新图片名："+imgName);
	}
}
