/*
3,字符类中的构造函数。

在对子类对象进行初始化时，父类的构造函数也会运行，
因为子类的构造函数默认第一行有一条隐式的语句super()；
super（）会访问父类中空参数的构造函数。而且子类中所有的构造函数默认第一行都是super（）；

为什么子类一定要访问父类中的构造函数？

因为父类中的数据子类可以直接获取。所以子类对象在建立时，需要先查看父类是如何对这些数据进行初始化的。
所以子类在对象初始化时，要先访问一下父类中的构造函数。
如果要访问父类中指定的构造函数，需要手动通过super访问。

注意：super语句一定要定义在子类函数的第一行；谁用super谁是子类；

子类的实例化过程。
结论：
子类所有的构造函数默认都会访问父类中空参数的构造函数。
因为子类每一个构造函数内的第一行都有一句隐式super（）；

当父类中没有空参数的构造函数时，子类必须手动通过super语句形式来指定要访问父类中的构造函数。
当然，子类构造函数第一行也可以手动指定this语句来访问本类中的构造函数。子类中至少会有一个构造函数会访问父类中的构造函数。
*/
class Fu//extends object
{
   int num=2; 
	Fu()//构造函数和类名名称一样，当初始化以后，最原有的默认构造函数就不存在了。
	{
		
	  num=60;
		System.out.println("fu run");
	}
	
	Fu(int x)
	{
		System.out.println("fu..."+x);
	}
	
}

class Zi extends Fu
{
	Zi()
	{
		//super();默认的
		//super(4);
		System.out.println("Zi run");
	}
	//super()；一定是空参数的
	Zi(int x)
	{
		this();//此时不存在默认的super函数 
		System.out.println("zi.."+x );
	}
}
class ExtendsDemo4 
{
	public static void main(String[] args) 
	{
		Zi z=new Zi();
		//Zi z1=new Zi(4);
		System.out.println(z.num);
	}
}
/*
class Person
{
	private String name;
	Person(String name)
	{
		this.name=name;
	}
	void show()
	{}
}
class Student extends Person
{
	Student(String name)
	{
		super(name);//子类调用父类构造函数形式
	}
	void method()
	{
		super.show();//子类调用父类一般函数形式
	}
}
*/
