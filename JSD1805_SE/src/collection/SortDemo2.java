package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 排序自定义类型元素的List集合
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
		 * sort方法要求集合元素必须实现Comparble接口，否则
		 * 编译不通过
		 */
//		Comparator<Point> com = new Comparator<Point>(){
//			public int compare(Point o1, Point o2) {
//				//两个点进行排序
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
