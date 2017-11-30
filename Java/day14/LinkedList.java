import java.util.*;
/*

ArrayList和LinkedList的选取：
1.ArrayList适用于元素的查询。LinkedList适用于较多数据的增删。
2.一般情况下，数据的增删用的较少，所以ArrayList作为最常用的容器。

LinkedList：特有方法：

addFirst();//在头部位置添加。
addLast();//在尾部位置添加。

getFirst();
getLast();//获取元素，但不删除元素。

removeFirst();
removeLast();//获取元素，但是元素被删除。如果集合中没有元素，会出现NoSuchElementException（移除该元素，并获取到该元素）

在Jdk1.6中出现了替代方法。

offerFirst();//增加
offerLast(0;

peekFirst();//获取
peekLast();
获取元素，元素不被删除，如果集合中没有元素，会返回null。

poolFirst();//删除
poolLast();
获取元素，但是元素被删除，如果集合中没有元素，会返回null。
*/
class  LinkedListDemo
{
	public static void main(String[] args) 
	{
		LinkedList link=new LinkedList();

		link.addFirst("java01");
		link.addFirst("java02");
		link.addFirst("java03");
		link.addFirst("java04");

		sop(link);
		//获取集合中的元素。
		while(!link.isEmpty())
		{
			sop(link.removeFirst());//倒着取换成Last。
		}

	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
	
}
