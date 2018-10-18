package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * List提供了获取子集的方法：
 * 
 * List sunList(int start,int end)
 * 获取当前集合中指定范围的子集
 * @author tarena
 *
 */
public class ListDemo3 {
	public static void main(String[] args){
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<10;i++){
			list.add(i);
		}
		System.out.println(list);
		/*
		 * 获取子集3-7
		 */
		List<Integer> subList = list.subList(3,8);
		System.out.println(subList);
		
		/*
		 * 将子集元素扩大10倍
		 */
		for(int i=0;i<subList.size();i++){
			subList.set(i,subList.get(i)*10);
		}
		System.out.println(subList);
		/*
		 * 对子集操作是对原集合对应元素的操作
		 */
		System.out.println(list);
		
		/*
		 * 删除list集合2-8
		 */
		list.subList(2,9).clear();
		System.out.println(list);
 	}
}












