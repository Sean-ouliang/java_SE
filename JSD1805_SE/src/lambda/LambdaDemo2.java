package lambda;

import java.io.File;
import java.io.FileFilter;

/**
 * 
 * @author tarena
 *
 */
public class LambdaDemo2 {
	public static void main(String[] args) {
		//��ȡ��ǰĿ¼�����е��ı��ļ�
		File file = new File(".");
		/*
		 * ��д���������в������������Ϳ��Ժ��ԡ�������
		 * �����������ж��������͡�
		 */
		FileFilter Filter = (f)->{
			return f.getName().endsWith(".txt");
		};
		/*
		 * �����Ժ��Է����ġ�{}������ô���������Ҫ�󷵻�ֵ
		 * ʱ��return�ؼ���Ҳ������ԡ�
		 */
		FileFilter filter = (f)->f.getName().endsWith(".txt");
		File[] subs = file.listFiles(filter);
		for(File sub:subs){
			System.out.println(sub);
		}
	}
}
