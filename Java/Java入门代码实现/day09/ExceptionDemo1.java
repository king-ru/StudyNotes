/*
在函数上声明异常：
便于提高安全性，让调用函数进行处理，不处理编译失败
	//有两种方式：throws Exception，交给虚拟机以自己默认的方式去解决。
	//进行自己的处理方式


对多异常的处理：
最优方法：几个方法几个catch块，针对性分别处理！！！
1.声明异常时，建议声明更为具体的异常，这样处理的可以更具体。

2.对方声明几个异常，就对应几个catch块，不要定义多余的catch块。
	如果多个catch中的异常出现继承关系，父类异常catch块放在最下面。

3.建议在进行catch处理时，catch中一定要定义具体处理方式，
	不要简单得定义一句：e.printStackTrace();
	也不要简单的就书写一条输出语句。本代码只是方便演示。

	//stack堆栈  trace 追踪，踪迹

*/
class Demo
{
	int div(int a,int b) throws ArithmeticException,ArrayIndexOutOfBoundsException//在功能上通过throws的关键字声明了该功能可能出现问题
	{
		//index  角标，索引，指针	
		//bound 限制，范围，受约束的
		int[] arr=new int[a];
		System.out.println(arr[4]);
		//抛给执行者，即调用者，在在这里为主函数
		return a/b;
		//产生了一个问题，将问题封装为一个对象
		//new AritchmaticExpection()
	}
}
class  ExceptionDemo1 
{
	public static void main(String[] args) 
	//有两种方式：throws Exception，交给虚拟机以自己默认的方式去解决。
	//进行自己的处理方式

	{
		Demo d=new Demo();
		try
		{
			int x=d.div(4,0);
			System.out.println("x="+x);
		}
		catch (Exception e)
		{
			System.out.println(e.toString());
		}
		//检测到一个程序就会停止，其实是多态的体现
		/*
		catch (ArithmeticException e)
		{
			System.out.println(e.toString());
			System.out.println("被0除了");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.toString());
			System.out.println("角标越界了");
		}
		*/
		//一个问题出现后程序就会停止，即出现越界arr[4]后程序停止，a/b就不会运行。
		//即不能同时检测到
		System.out.println("over");
	}	
}
