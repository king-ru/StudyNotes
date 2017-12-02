import java.util.*;

/*
1. add方法的参数类型是Object，以便于接受任意类型对象。

2.集合中存储的都是对象的引用（地址）

什么是迭代器呢？
其实就是集合的取出元素的方式。迭代动作。
例子：娃娃机，夹子就是迭代器。虽然有不同的夹子，但有共性内容，即取出的功能，操纵杆操纵，操纵杆为接口，娃娃的排列为元素。


*/
class  Collection
{
	public static void main(String[] args) 
	{
		//method_2();
		method_get();
	}
	public static void method_2()
	{
		ArrayList al1=new ArrayList();
		al1.add("java 01");
		al1.add("java 02");
		al1.add("java 03");
		al1.add("java 04");

		ArrayList al2=new ArrayList();
		al2.add("java 01");
		al2.add("java 02");
		al2.add("java 05");
		al2.add("java 06");

		//al1.retainAll(al2);//取交集，al1中只会保留两者的交集。
		al1.removeAll(al2);//去掉交集
		sop(al1);
		sop(al2);//al2中为原来的。
	}
	public static void method_1()
	{
		//创建一个集合容器，使用Collection接口的子类，ArrayList。
		ArrayList al=new ArrayList();
		//1.添加元素
		al.add("java 01");//add(Object obj);
		al.add("java 02");
		al.add("java 03");
		al.add("java 04");
		
		//打印原集合
		sop(al);

		//2.获取个数，集合长度
		//sop("size="+al.size());

		//3.删除元素
		//al.remove("java 02");
		//al.clear()；清空集合
		//打印改变后的集合
		sop(al);

		//4.判断元素
		sop("java 03是否存在"+al.contains("java 03"));
		sop("集合是否为空"+al.isEmpty());
	}
	public static void method_get()
	{
		ArrayList al=new ArrayList();
		al.add("java 01");
		al.add("java 02");
		al.add("java 03");
		al.add("java 04");

		Iterator it=al.iterator();//获取迭代器用于取出集合中的元素。
		while(it.hasNext())
		{
			sop(it.next());
		}
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
