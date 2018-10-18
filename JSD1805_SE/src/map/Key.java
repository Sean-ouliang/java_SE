package map;
/**
 * HashMap֮�����ǲ�ѯ�ٶ��������ݽṹ������ΪHashMap��
 * ��Ҳ��������ʵ�֣�����������key��hashcodeֵ�������Ӧ
 * �������λ�ò������ţ�����������key����ʱҲֱ�Ӹ�����
 * hashcodeֵ�����±���ٶ�λ�������Ӧλ�ü�����Ӧ��value
 * ����ʡȥ�˱�������Ĳ������Ӷ��������ݴ�СӰ���ѯ���ܡ�
 * 
 * ����Key���ԣ���hashcode������equals����ֱ��Ӱ������HashMap
 * �ڲ������λ�ã�����Ҫ������д�����������������������в���
 * ���������Ӱ��ɢ�б��ѯ���ܡ�
 * 
 * ���������ԭ��֮һ:������Key��hashcodeֵ��ͬʱ�������Ӧ��
 * �����±�λ����ͬ������������Key��equals��ͬ(����ͬһ��key,
 * ��equals��ͬMap����Ϊ����ͬ��key����ô�����滻value������)
 * ��ʱ�ͻ��������λ�ô���������
 * 
 * java�ṩ���඼���Ƶ���д��equals��hashcode������Object��
 * ���������д���򣬵����������Զ����������Ҫ��дequals����
 * ʱӦ��һͬ��дhashcode������API�ֲ�������ȷ˵����
 * 
 * ��д����:
 * 1:�ɶ���д����:��������дһ�����equals����ʱ��Ӧ����ͬ
 *   ��дhashcode������
 * 2:һ����,��:�����������equals�Ƚ�Ϊtrueʱ��hashcode����
 *   �����ֱ�����ȡ���֮��Ȼ���Ǳ���ģ��������ҲҪ��֤��
 *   ��������hashcode���ʱ��equals�Ƚ�ҲΪtrue���������
 *   HashMap����Ϊkeyʹ��ʱ��������Ӱ���ѯ���ܡ�
 * 3:�ȶ���,��:������equals�Ƚϵ�����ֵû�з����ı��ǰ���£�
 *   ��ε���hashcode�������ص����ֲ��ܸı䡣
 * @author tarena
 *
 */
public class Key {
	private int x;
	private int y;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Key other = (Key) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
	
}



