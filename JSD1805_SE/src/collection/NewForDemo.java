package collection;
/**
 * JDK1.5֮���Ƴ���һ���µ����ԣ���ǿforѭ��
 * Ҳ��Ϊ��ѭ����for each
 * ��ȡ����ͳforѭ���Ĺ�������ѭ��ֻ�����������ϻ�����ʹ��
 * @author tarena
 *
 */
public class NewForDemo {
	public static void main(String[] args) {
		String[] array = {"one","two","three","four","five"};
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
		/*
		 * ��ѭ�������µ��﷨���������Ͽɶ�����JVM�Ͽ�
		 * �������ڱ���Դ����ʱ������ʹ����ѭ����������ʱ
		 * �Ὣ�����Ϊʹ����ͨforѭ������
		 */
		for(String str:array){
			System.out.println(str);
		}
	}
}
