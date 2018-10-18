package file;

import java.io.File;

/**
 * java.io.file
 * File��ÿһ��ʵ�����ڱ�ʾ�ļ�ϵͳ�ģ�Ӳ���У��ϵ�һ���ļ�
 * ��Ŀ¼
 * ʹ��File���ԣ�
 * 1������������Ϣ�����֣����ȣ��޸�ʱ��ȣ�
 * 2�������ļ���Ŀ¼��������ɾ���ȣ�
 * 3����ȡһ��Ŀ¼����ҳ
 * ���ǲ��ܷ����ļ�����
 * @author tarena
 *
 */
public class fileDemo {
	public static void main(String[] args){
		/*
		 * Fileû���޲ι��췽������Ҫ����һ���ַ�����
		 * ���ַ�������Ϊ·����ע�⣬·��ͨ������ʹ��
		 * ����·������Ϊ��ͬϵͳ�ľ���·�����岻ͬ��
		 * ����ֿ�ƽ̨����
		 * ���·���ĺô����ڲ����ڿ�ƽ̨���⣬�������
		 * ��·��ͨ�������л���������ʵ�ʿ����бȽϳ�ʹ
		 * �õ������·��
		 * ��eclipse�У�ͨ����ԡ���ǰĿ¼������ǰĿ¼ֵ��
		 * �ǵ��ڳ���������Ŀ����ĿĿ¼
		 */
		File file = new File("./demo.txt");
		/*
		 * ��ȡ����
		 */
		String name = file.getName();
		System.out.println(name);
		/*
		 * ��ȡ�ļ��ĳ��ȣ��ֽ�����
		 */
		long length = file.length();
		System.out.println(length+"�ֽ�");
		boolean cr = file.canRead();
		boolean cw = file.canWrite();
		System.out.println("�ɶ���"+cr);
		System.out.println("��д��"+cw);
		
		boolean ih = file.isHidden();
		System.out.println("�Ƿ����أ�"+ih);
	}
}
