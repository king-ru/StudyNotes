/*
this语句作用二：用于构造函数之间互相调用。
即构造函数之间调用只能用this语句。 
注：this语句只能定义在构造函数的第一行。因为初始化要先执行。
*/
class Person
{
	private int age;
	private String name; 
	Person()
	{
		//this("haha");
	}
	Person(int age)
	{
		this.age=age;
	}
	Person(String name)
	{
		//this();
		this.name=name;
	}
	Person(String name,int age)
	{
		//this.age=age;
		//Person(age); 这种写法是错误的
		//this(age);//是p对象的age在调用这个函数
		this.name=name;
	}

}
class PersonDemo4 
{
	public static void main(String[] args) 
	{
		Person p=new Person("chenru",30);
		System.out.println("name="+name+"age="+age);
	}
}
