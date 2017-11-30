/*
Arrays:用于操作数组的工具类，里面都是静态方法。

asList:将数组变成list集合。

当一个类中没有构造函数的话，说明不能直接创建对象，里面的方法都是静态方法。
单例设计模式保证了一个类中对象的唯一性。
*/
import java.util.*;
class  ArraysDemo
{
	public static void main(String[] args) 
	{
		/*
		int[] arr={2,34,4};
		System.out.println(Arrays.toString(arr));
		*/
		String[] arr={"aaa","bbb","ccc"};
		//把数组变成list集合有什么好处？
		/*
		可以使用集合中的思想和方法来操作数组中的元素。
		注意：将数组变成几何，不可以使用集合的增删方法，
		因为数组的长度是固定的，否则发生UNSupportOperationException。
		*/                                     
		List<String> list=Arrays.asList(arr);
		sop("cointains:"+list.contains("fff"));
		sop(list);
		/*
		如果数组的元素都是对象，那么变成集合时，数组中的元素就直接转成集合中的元素。、
				Integer[] num={1,2,3};
				List<Integer>list=Arrays.asList(num);
		
		如果数组中的元素都是基本数据类型，那么会将该数组作为集合中的元素存在。
				int[] num={1,2,3};
				List<int[]>list=Arrays.asList(num);
		
		*/
		

 	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
