package file;

import java.io.File;

/**
 * 1����дһ�δ��룬���1+2+3+4....10��������
 *   ����δ����в��ܳ���for��while�ؼ���
 *   
 * 
 * 2������ˮ�����⣬1��Ǯ��1ƿ��ˮ��2����ƿ���Ի�1ƿ
 *   ��ˮ��3��ƿ�ǿ��Ի�1ƿ��ˮ����20��Ǯ�ܹ����Եõ�
 *   ����ƿ��ˮ
 * 
 * 
 * ɾ������File��ʾ���ļ���Ŀ¼
 * @author tarena
 *
 */
public class Test {
	public static void main(String[] args){
		File file = new File("a");
		delete(file);
	}
	/**
	 * ��������File��ʾ���ļ���Ŀ¼ɾ��
	 */
	public static void delete(File file){
		/*
		 * �����жϸ�file���ļ�����Ŀ¼
		 * ����Ŀ¼��Ҫ�Ƚ���������ɾ������ո�Ŀ¼��
		 * Ȼ���ٽ���Ŀ¼ɾ��
		 * �����ļ���ֱ��ɾ��
		 */
		if(file.isDirectory()){
			File[] subs = file.listFiles();
			for(File sub:subs){
				/*
				 * �ݹ����
				 * �ڵ�ǰ�����ڲ��ٴε��õ�ǰ����������
				 * ��Ϊ�ݹ����
				 */
				delete(sub);
			}
		}
		file.delete();
	}
}
