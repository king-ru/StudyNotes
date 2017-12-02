/*
什么时候使用静态？
要从两方面下手：
因为静态修饰的内容有成员变量和函数。
什么时候定义静态变量（类变量）？
当对象中出现共享数据时，必须是共享值，不是共属性。
对象中的特有数据要定义成非静态，存在于堆内存中。


什么时候定义静态函数？
当功能内部没有访问到非静态数据（对象的特有数据），那么该功能可以定义成静态的。
*/
class Person
{
	String name;
	public static void show()
	{
		System.out.println("haha");
	}
}
class  MainDemo1
{
	public static void main(String[] args) 
	{
		Person p=new Person();
		p.show();
	}
}
