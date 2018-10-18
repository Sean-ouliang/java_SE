package raf;

import java.io.RandomAccessFile;

/**
 * RAF�ṩ�˶�д�����������ݵ���ط������Լ�����ָ���
 * ��ط���
 * RAF�ǻ���ָ����ж�д���ݵģ�����RAF������ָ��ָ��
 * ���ļ��ֽ�λ�ý����Ǹ�����д�����Ҷ�д��ָ����Զ����
 * �ƶ���һ�¸��ֽ�׼����д
 * @author tarena
 *
 */
public class RAFDemo2 {
	public static void main(String[] args){
		try{
			RandomAccessFile raf = new RandomAccessFile("raf.dat","rw");
			long pos = raf.getFilePointer();
			System.out.println("pos��"+pos);
					
			/*
			 * λ������
			 * >>>  ��2�������������ƶ�ָ��λ��
			 */
			int d = Integer.MAX_VALUE;
			raf.write(d>>>24);
			System.out.println("pos:"+raf.getFilePointer());
			raf.write(d>>>16);
			raf.write(d>>>8);
			raf.write(d);
			System.out.println("pos:"+raf.getFilePointer());
			/*
			 * RAF�ṩ�˷���ֱ��д�������������ݵ���ط���:
			 * 
			 * void writeInt(int d)
			 * ����д��4���ֽڣ�����intֵд��
			 */
			raf.writeInt(d);
			System.out.println("pos:"+raf.getFilePointer());
			//һ����д��8�ֽڣ���longֵд��
			raf.writeLong(123L);
			//һ����д��8�ֽڣ���doubleֵд��
			raf.writeDouble(123.123);
			System.out.println("pos:"+raf.getFilePointer());
			System.out.println("д����ϣ�");
			/*
			 * void seek(long pos)
			 * ��ָ���ƶ���ָ��λ��
			 * 
			 * �ƶ�����һ���ֽڵ�λ��
			 */
			//��ȡ��һ��intֵ
			raf.seek(0);
			System.out.println("pos:"+raf.getFilePointer());
			System.out.println(raf.readInt());
			//��ȡlongֵ
			raf.seek(8);
			System.out.println("pos:"+raf.getFilePointer());
			System.out.println(raf.readLong());
			//��ȡ�ڶ���intֵ
			raf.seek(4);
			System.out.println("pos:"+raf.getFilePointer());
			System.out.println(raf.readInt());
			//��ȡdoubleֵ
			raf.seek(16);
			System.out.println("pos:"+raf.getFilePointer());
			System.out.println(raf.readDouble());
			
			System.out.println(raf.read());
			//�޸�longֵ
			
			
			
			raf.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
