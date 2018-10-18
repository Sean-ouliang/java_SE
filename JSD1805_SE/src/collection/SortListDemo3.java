package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Collection的sort(List list)方法是按照集合元素自身的
 * 比较规则比较后由小到大进行排序的。而有时集合元素已经实现
 * 了比较规则，但是该规则不满足我们排序需求。
 * 
 * Collection提供了一个重载的sort方法：
 * static void sort（List list,Comparator com)
 * 该排序方法要求在传入一个参数，该参数是一个比较器，该方法
 * 会使用该比较器的比较规则对集合元素进行比较按照比较的
 * 结果进行排序。
 * 
 * @author tarena
 *
 */
public class SortListDemo3 {
	public static void main(String[] args){
		List<String> list = new ArrayList<String>();
		list.add("苍老师");
		list.add("传奇");
		list.add("小泽老师");
		System.out.println(list);
		
//		MyComparator com = new MyComparator();
		
		//通常使用匿名内部类创建比较器
		Comparator<String> com = new Comparator<String>(){
			public int compare(String o1, String o2) {
				return o1.length()-o2.length();
			}
		};
		//排序
		Collections.sort(list,com);
		System.out.println(list);
	}
}

/**
 * 比较器
 * @author tarena
 *
 */
class MyComparator implements Comparator<String>{
	/*
	 * 返回值>0:o1大于o2
	 * 返回值<0:o1小于o2
	 * 返回值=0:o1等于o2
	 * (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	public int compare(String o1, String o2) {
		return o1.length()-o2.length();
	}
}
