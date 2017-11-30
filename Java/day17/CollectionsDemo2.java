import java.util.*;
//目的：将迭代器反向排序，按自己的方式排序
class StrComparator implements Comparator<String>
{
	public int compare(String s1,String s2)
	{
		/*
		int num=s1.compareTo(s2);
		if(num>0)
			return -1;
		if(num<0)
			return 1;
		else 
			return num;
		*/
		return s2.compareTo(s1);
	}
}
class CollectionsDemo2
{
	public static void main(String[] args) 
	{
		orderDemo();
	}
	public static void orderDemo()
	{
		//TreeSet<String> ts=new TreeSet<String>(new StrComparator());
		TreeSet<String> ts=new TreeSet<String>(Collections.reverseOrder());
		//Collections.reverseOrder()返回值为一个比较器，强行逆转了Comparable接口的对象collection的自然顺序。
		//TreeSet<String> ts=new TreeSet<String>(new StrLenComparator());按从短到长的顺序排列
		//TreeSet<String> ts=new TreeSet<String>(collections.reverseOrder(new StrLenComparator()));按从长到短的顺序排列。
		ts.add("abcde");
		ts.add("bde");
		ts.add("abde");
		ts.add("ad");
		//迭代器的结果：按自然排序
		Iterator it=ts.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
