/*
集合变数组：
Collection接口中的toArray方法。
*/
import java.util.*;
class  CollectionToArray
{
	public static void main(String[] args) 
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("aaa");
		al.add("bbb");
		al.add("ccc");
		/*
		1.指定类型的数组要定义多长呢？
		当指定类型的数组长度小于了集合的size，那么该方法内部就会创建一个新的数组，长度为集合的size，
		当指定类型的数组长度大于了集合的size，那么不会创建新的数组，而是用传递进来的数组。
		所以创建一个刚好的数组最优。

		2.为什么要将集合变成数组？
		为了限定对元素的操作。不需要进行增删。
		*/
		String[] arr=al.toArray(new String[al.size()]);
		System.out.println(Arrays.toString(arr));//为什么还是集合的形式？
	}
}
