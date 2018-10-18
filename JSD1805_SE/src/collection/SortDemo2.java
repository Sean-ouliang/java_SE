package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * �����Զ�������Ԫ�ص�List����
 * @author tarena
 *
 */
public class SortDemo2 {
	public static void main(String[] args) {
		List<Point> list = new ArrayList<Point>();
		list.add(new Point(3,4));
		list.add(new Point(1,9));
		list.add(new Point(2,2));
		list.add(new Point(6,3));
		list.add(new Point(7,8));
		list.add(new Point(8,9));
		System.out.println(list);
		/*
		 * sort����Ҫ�󼯺�Ԫ�ر���ʵ��Comparble�ӿڣ�����
		 * ���벻ͨ��
		 */
//		Comparator<Point> com = new Comparator<Point>(){
//			public int compare(Point o1, Point o2) {
//				//�������������
//				int len1 = o1.getX()*o1.getX()+o1.getY()*o1.getY();
//				int len2 = o2.getX()*o2.getX()+o2.getY()*o2.getY();
//				return len1-len2;
//			}
//		};
		
		Collections.sort(list,new Comparator<Point>(){
			public int compare(Point o1, Point o2) {
				int len1 = o1.getX()*o1.getX()+o1.getY()*o1.getY();
				int len2 = o2.getX()*o2.getX()+o2.getY()*o2.getY();
				return len1-len2;
			}
		});
		System.out.println(list);
		
		
	}
}
