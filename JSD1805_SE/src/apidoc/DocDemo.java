package apidoc;
/**
 * �ĵ�ע�Ϳ����������ط�ʹ�ã��ࡢ����������
 * ������ʹ�ã�����˵����ǰ������Ŀ�ġ�
 * @author tarena �����ߣ�
 * @version 1.0 ���汾�ţ�
 * @see java.lang.String �����õİ���
 * @since JDK1.5 ��JDK�汾�ţ�
 *
 */
public class DocDemo {
	/**
	 * sayHello�е��ʺ��hello
	 */
	public static final String INFO = "hello";
	
	/**
	 * Ϊָ�����û�����ʺ���
	 * @param name�������� ָ�����û�������
	 * @return ������ֵ�������ʺ�����ַ���
	 */
	public String sayHello(String name){
		return INFO + name;
	}
}
