/*
Collection 
		|--List：元素是有序的，元素可以重复。因为该集合体系有索引。
				|--ArrayList：底层数据结构使用的是数组结构。  特点：查询数据较快，但增删元素较慢，元素越多越明显。线程不同步。
				|--LinkedList：底层使用的是链表数据结构。		 特点：查询数据较慢，但增删元素较快。
				|--Vector：底层数据结构使用的是数组结构。		 特点：线程同步，被ArrayList替代。查询以及增删速度都较慢。


		
		|--Set：元素无序，元素不能重复。

List：
	特有方法：凡是可以操作角标的方法都是该体系特有的方法。

增：
	add(index,element)
	addAll(index,Collection)

删：
	remove(index,element)
改：
	set(index,element)
查：
	get(index)
	subList(from,to)
	ListIterator();


操作元素的方式有两种：1.集合  2.迭代器

List集合特有的迭代器：ListIterator是Iterator的子接口。

在迭代时，不可以通过集合对象的方法操作集合中的元素。
因为会发生ConcurrentModificationException异常。modification，修改。（并发修改异常）
只能用迭代器的方法操作元素。

所以，在使用迭代器时，只能用迭代器的方法操作元素，可是Iterator方法时有限的。
只能对元素进行判断，取出，删除的操作。
如果想要实现其他的操作如：添加，修改等，就需要使用其子接口，ListIterator。这个里面才有所需方法。

该接口只能通过List集合的ListIterator方法获取。


*/
import java.util.*;
class  ListDemo
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
	
	public static void method()
	{
		ArrayList al=new ArrayList();
		//添加元素
		al.add("java 01");
		al.add("java 02");
		al.add("java 03");
		//在指定位置添加元素
		al.add(1,"java 09");
		//删除指定位置元素
		al.remove(2);
		//修改元素
		al.set(2,"java 007");
		//通过角标获取元素。
		al.get(1);
		sop(al);
		//获取所有元素
		for(int x=0;x<al.size();x++)
		{
			System.out.println("al("+x+")="+al.get(x));
		}
		
		Iterator it=al.iterator();
		while(it.hasNext())
		{
			sop("next:"+it.next());
		}
		//通过indexOf获取对象的位置。
		sop("index="+al.indexOf("java 02"));

		List sub=al.subList(1,3);//含首不含尾,不需要通过循环，直接就可以打印出来。

		sop("sub="+sub);
	}
	
	public static void main(String[] args) 
	{
		//演示列表迭代器。
		ArrayList al=new ArrayList();
		//添加元素
		al.add("java 01");
		al.add("java 02");
		al.add("java 03");
		sop(al);
		ListIterator li=al.ListIterator();
		while(li.hasNext())
		{
			Object obj=li.next();
			if(obj.equals("java 02"))
				li.add("java 09");
		}
		sop(al);
		/*
		//在迭代过程中，准备添加或者删除元素
		Iterator it=al.iterator();
		while(it.hasNext())
		{
			Object obj=it.next();
			if(obj.equals("java 02"))
				//al.add("java 08");这样就会发生异常，迭代器方法和集合方法不能同时使用。只能用一种。
				it.remove();
			sop(obj);//操作元素的方式有两种：1.集合  2.迭代器
			//此时还会出现“Java 02”，虽然已经将它从集合中删除，但在内存中依然存在（？？），object仍然能引用到它。
		}
		sop(al);
		*/
	}
}
