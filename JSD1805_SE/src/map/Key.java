package map;
/**
 * HashMap之所以是查询速度最快的数据结构，是因为HashMap本
 * 身也是由数组实现，但是它根据key的hashcode值计算出其应
 * 在数组的位置并将其存放，这样当根据key查找时也直接根据其
 * hashcode值计算下标快速定位到数组对应位置检索对应的value
 * 这样省去了遍历数组的操作，从而不受数据大小影响查询性能。
 * 
 * 对于Key而言，其hashcode方法与equals方法直接影响其在HashMap
 * 内部数组的位置，所以要妥善重写这两个方法，避免在数组中产生
 * 链表，否则会影响散列表查询性能。
 * 
 * 产生链表的原因之一:当两个Key的hashcode值相同时，计算对应的
 * 数组下标位置相同，但是这两个Key的equals不同(不是同一个key,
 * 若equals相同Map会认为是相同的key，那么就做替换value操作了)
 * 这时就会在数组该位置处产生链表。
 * 
 * java提供的类都妥善的重写了equals与hashcode，包括Object类
 * 都满足该重写规则，但是若我们自定义的类若需要重写equals方法
 * 时应当一同重写hashcode，这在API手册上有明确说明。
 * 
 * 重写规则:
 * 1:成对重写，即:当我们重写一个类的equals方法时就应当连同
 *   重写hashcode方法。
 * 2:一致性,即:当两个对象的equals比较为true时，hashcode返回
 *   的数字必须相等。反之虽然不是必须的，但是最好也要保证当
 *   两个对象hashcode相等时，equals比较也为true。否则会在
 *   HashMap中作为key使用时产生链表，影响查询性能。
 * 3:稳定性,即:当参与equals比较的属性值没有发生改变的前提下，
 *   多次调用hashcode方法返回的数字不能改变。
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



