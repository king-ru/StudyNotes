
/*
？ 通配符，也可以理解为占位符。和定义在方法上的泛型效果是一样的。只不过这种写法更加常见。
泛型的限定：
？ extends E：可以接收E类型或者E类型的子类型。上限。
？ super E：可以接收E类型或者E类型的父类型。下限。

比较器也可用于泛型。

class Comp implements Comparator<Person>(person类比较器)(可用于worker以及Person的子类)
{
	public int compare(Person p1,Person p2)
	{
		return s1.getName.compareTo(s2.getName);
	}
}



comparable---compareTo
comparator----compare

两者的区别
 Comparable & Comparator 都是用来实现集合中元素的比较、排序的，只是 Comparable 是在集合内部定义的方法实现的排序，
 Comparator 是在集合外部实现的排序，
 所以，如想实现排序，
 就需要在集合外定义 Comparator 接口的方法或在集合内实现 Comparable 接口的方法。

 Comparable 是一个对象本身就已经支持自比较所需要实现的接口，
 （如 String、Integer 自己就可以完成比较大小操作，已经实现了Comparable接口）   

 而 Comparator 是一个专用的比较器，当这个对象不支持自比较或者自比较函数不能满足你的要求时，
 你可以写一个比较器来完成两个对象之间大小的比较。
*/

class  GenericDemo5
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
