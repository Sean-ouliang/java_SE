package string;
/**
 * String substring(int start,int end)
 * ��ȡ��ǰ�ַ���ָ����Χ�ڵ��ַ���
 * ��Ҫע�⣬java API�и��ص㣬ͨ��ʹ���������ֱ�ʾ
 * ��Χʱ�����ǡ���ͷ����β����
 * @author tarena
 *
 */
public class SubtringDemo {
	public static void main(String[] args){
		//            0123456789012
		String str = "www.baidu.com";
		//��ȡbaidu
		String sub = str.substring(4,9);
		System.out.println("sub:"+sub);
		
		System.out.println(getName("www.sohu.com"));
		System.out.println(getName("http://www.sina.com"));
	}
	
	//��ȡ����
	public static String getName(String loc){
		int start = loc.indexOf(".")+1;
		int end = loc.indexOf(".",start);//��ָ��λ�õ���һ��λ�ÿ�ʼ�ȶ�
		String sub = loc.substring(start,end);
		return sub;
	}
}
