class Fu
{
	void method1()
	{
		System.out.println("fu method1");
	}
	void method2()
	{
		System.out.println("fu method2");
	}
	static void method4()
	{
		System.out.println("fu method4");
	}
}
class Zi extends Fu
{
	void method1()
	{
		System.out.println("zi method1");
	}
	void method3()
	{
		System.out.println("zi method3");
	}
	static void method4()
	{
		System.out.println("zi method4");
	}
}
class  DuoTaiDemo4
{
	public static void main(String[] args) 
	{
		//Fu f=new Zi();//f为引用型变量，多态化体现(父类引用指向子类对象)
		//f.method1();
		//f.method2();//显示的都是子类的内容，因为对象是主体，函数通过对象被调用。
		//f.method3();//f有其method的功能才可以被调用，才可以冒充去讲课。。
		Fu f=new Zi();
		f.method2();
		

		Zi z=new Zi();
		z.method2();
	
	}
}


/*
###在多态中成员(非静态)函数的特点：
在编译时期，参阅引用型变量（即f所属的Fu类中）所属的类中是否有调用的方法，如果有，编译通过，如果没有编译失败。
在运行时期，参阅对象所属的类中（即Zi类中）是否有调用的方法。
简单总结就是：成员函数在多态调用时，编译看左边，运行看右边。
*/


/*
面试小点：

在多态中，成员变量的特点：
无论编译和运行，都参考左边（引用型变量所属的类）。。

在多态中，静态成员函数,成员变量的特点：
无论编译和运行，都参考左边。
*/
