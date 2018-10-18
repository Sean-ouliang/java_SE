package exception;
/**
 * finally常见面试题
 * 
 * 请简述：final,finally,finalize
 * 
 * finalize是Object定义的方法。当GC要释放一个对象时会
 * 调用该方法。该方法执行完毕意味着其即将被释放。
 * 该方法不应当有耗时操作。
 * 
 * 
 * @author tarena
 *
 */
public class FinallyDemo3 {
	public static void main(String[] args) {
		System.out.println(test("0")+","+test(null)+","+test(""));
	}
	public static int test(String str){
		try {
			return str.charAt(0)-'0';
		} catch (NullPointerException e) {
			return 1;
		} catch (Exception e){
			return 2;
		} finally {
			return 3;
		}
	}
	
	//GC
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
}
