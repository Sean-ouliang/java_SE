package reflect;
/**
 * ʹ�õ�ǰ����Է������
 * @author tarena
 *
 */
public class Person {
	public void sayHello(){
		System.out.println("��Һã�");
	}
	
	public void sayHi(){
		System.out.println("Hi,��ά�͵٣�");
	}
	
	public void sayName(String name){
		System.out.println("�ҵ����ֽ�:"+name);
	}
	
	public void sayInfo(String name,int age){
		System.out.println("�ҵ����ֽ�:"+name+",�ҽ���:"+age+"��");
	}
	
	private void dosome(){
		System.out.println("����˽�з�����������");
	}
}
