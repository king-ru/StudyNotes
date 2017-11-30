/*
集合框架的工具类，collections：
直接调用collection工具类的方法，实现字符串的排序；
集合为list.size();数组为array.length();
*/
import java.util.*;
class  CollectionsDemo
{
	public static void main(String[] args) 
	{
		sortDemo();
	}
	public static void sortDemo()
	{
		List<String> list=new ArrayList<String>();//这是一个String类型的list集合。

		list.add("abcde");
		list.add("aaa");
		list.add("z");
		list.add("kkkkk");
		list.add("qq");

		sop(list);
		//Collections.sort(list);//调用该方法，按默认方法完成排序。
		Collections.sort(list,new StrLenComparator());
		sop(list);
		//String max=Collections.max(list);//该方法直接实现最大值

		/*
		下面实现二分查找binarySearch();前提是该集合必须是有限集合。
		主函数传入：int index=halfSearch(list,"aaa");
		int index=Collections.binary(list,"aaa");（如果是“aaaa”，则index=-2；返回值为插入点乘以-1，即如果返回值为负数的话，说明不存在。）；
		sop(index);
		//二分查找的实现（前提：元素具有比较性，并且按照自然排序）
		
		public static int halfSearch(List<String> list,String key)
		{
			int max,min,mid;
			max=list.size()-1;
			min=0;
			while(min<=max)
			{
				mid=(max+min)>>1;   // /2
				String str=list.get(mid);//根据中间角标找元素
				int num=str.compareTo(key);
				if(num>0)
					max=mid-1;
				else if(num<0)
					min=mid+1;
				else 
					return mid;//当有了返回值后就不执行后面的程序。
			}
			return -min-1;//(-(min+1))//min后面位置即为要插入的结点，该返回值功能比较完善。
		}

		*/

		/*
		下面是元素不具有比较性或者按照自己的方式来进行排序
		(传入比较器，实现comparator)
		主函数传入 int index=halfSearch1(list,"aaa",new StrLenComparator());
		public static int halfSearch1(List<String> list,String key,Comparator<String> cmp)
		{
			int max,min,mid;
			max=list.size()-1;
			min=0;
			while(min<=max)
			{
				mid=(max+min)>>1;   // /2
				String str=list.get(mid);//根据中间角标找元素
				//int num=str.compareTo(key);(换成调用比较器的方法)
				int num=cmp.compare(str,key);
				if(num>0)
					max=mid-1;
				else if(num<0)
					min=mid+1;
				else 
					return mid;//当有了返回值后就不执行后面的程序。
			}
			return -min-1;//(-(min+1))//min后面位置即为要插入的结点，该返回值功能比较完善。
		}
		*/
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
class StrLenComparator implements Comparator<String>//要想实现比较，就一定要实现comparator类
{
	public int compare(String s1,String s2)
	{
		if(s1.length()>s2.length())
			return 1;
		if(s1.length()<s2.length())
			return -1;
		else 
			return s1.compareTo(s2);//表示如果长度一样就按照字母排序。
	}
}
