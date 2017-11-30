import java.util.*;

/*
|--Set:元素是无序的（存入和取出的顺序不一定一致）；元素不可以重复。
	常见的子类：HashSet：底层数据结构是哈希表。（哈希表是按哈希值的大小进行排序的。）
						HashSet是如何保证元素唯一性的呢？
						是通过元素的两个方法，hashcode和equals来完成。
						如果元素的hashcode值相同，才会判断equals是否为true。
						如果元素的hashcode值不同，才会调用equals。


java对象中值相同的话，hashCode不一定相同的，但是也有相同的。比如String类的hashCode如果两个String字面值一样，
								   那么hashCode一定是相同的，因为String类重写了hashCode()方法 ；

								   hashcode和地址的联系：是地址的一个映射。hashcode相同，地址不一定相同（如字符串）；地址不相同，hashcode一定不相同。
						TreeSet：
Set集合的功能和Collection是一致的。

*/
class Person
{
	private String name;
	private int age;
	Person()
	{
		this.name=name;
		this.age=age;
	}
	//定义自己的hashcode方法
	public int hashCode()
	{
		System.out.println(this.name+"...hashcode");
		return name.hashCode+age;
	}

	public boolean equals(Object obj)
	{
		if(!obj instanceof Person)
			return false;
		Person p=(Person)obj;
		System.out.println(this.name+"...equals..."p.name);

		return this.name.equals(p.name) && this.age==p.age;
	}
}
 
class  HashSetDemo
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
	public static void main(String[] args) 
	{
		HashSet hs=new HashSet();
		sop(hs.add("java01"));//返回值为布尔型，增加进去就为true，否则就为false。
		sop(hs.add("java01"));
		hs.add("java01");
		hs.add("java02");
		hs.add("java02");
		hs.add("java03");
		hs.add("java04");

		Iterator it=hs.iterator();//只能用迭代器取出元素。
		while(it.hasNext())
		{
			sop(it.next());
		}

	}
}
