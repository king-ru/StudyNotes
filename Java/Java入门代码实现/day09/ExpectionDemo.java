/*
1.把问题封装为对象就是异常！！！
	异常：就是程序在运行时出现不正常情况。
	异常出现：问题也是现实生活中一个具体的事物，也可以通过Java的类的形式进行描述，并封装成对象。
				其实就是Java对不正常情况进行描述后的对象体现。

	对于对象的划分：两种：一种是严重的问题，一种是非严重的问题。

	对于严重的：Java通过Error类进行描述。
	对于Error，一般不编写针对性的代码，对其进行处理。
	对于非严重的：Java通过Exception类进行描述。
	对于Exception可以使用针对性的处理方式进行处理。


	无论Error或者Exception都具有一些共性内容。
	比如：不正常情况的信息，引发原因等。

Throwable		Throwable是Java中所有错误或异常的超类
	---Error
	---Exception

2.异常的处理：

Java提供了特有的语句进行处理。

try
{
		需要被检测的代码；
}
catch（异常类 变量）
{
		处理异常的代码；（处理方式）
}
finally
{
		一定会执行的语句；
}

	 
3.对捕获到的异常对象进行常见方法操作
	String getMessage();//获取异常信息
*/
class Demo
{
	int div(int a,int b) //在功能上通过throws的关键字声明了该功能可能出现问题
	{
		return a/b;
		//产生了一个问题，将问题封装为一个对象
		//new ArithmaticExpection()
	}
}
class  ExpectionDemo1
{
	public static void main(String[] args) 
	{
		Demo d=new Demo();
		try
		{
			int x=d.div(4,0);//new ArithmaticExpection()
		    System.out.println("x="+x); //要是放在外面会造成无法访问的错误，因为x是局部变量
		}
		//发现问题才执行catch，否则不执行
		catch (Exception e)//Expection e=new ArithmeticExpection();
		{
			System.out.println("除零啦");
			System.out.println(e.getMessage());//异常方法
			System.out.println(e.toString());//异常信息 异常方法
			e.printStackTrace();//异常信息，异常方法，异常出现的位置。
										//其实jvm默认的异常处理机制，就是在调用printStackTrace方法，打印异常的堆栈的跟踪信息。
		}
		
		System.out.println("over");
	}	
}
