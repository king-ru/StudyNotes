/*
argument意为参数

Exception中有一个特殊的子类异常RuntimeException运行时异常。

如果在函数内部抛出该异常，函数上可以不用声明，编译一样能通过。

如果在函数上声明了该异常，调用者可以不用进行处理，编译一样通过。

之所以不用在函数上声明，是因为不需要让调用者处理。
当该异常发生，希望程序停止。因为在运行时，出现了无法继续运算情况，希望停止程序后，
对代码进行修改。


//runtime的出现会引发程序的停止，发现异常并且进行修正。


对于异常分为两种：
1.编译时被检测的异常；

在函数抛出时，上面没有标识，就被视为有安全隐患的，编译不能通过。让调用者处理该异常，调用者必须给出处理方式（要么抛，要么以自己的方式进行处理）

2.编译时不被检测的异常（运行时异常，就是Runtime以及子类，在运行时出现异常停止程序）


所以，发生异常时，判断该异常能不能被处理，如果可以，给出处理方法；如果不行，用Runtime以及子类使其发现问题，停止程序。

自定义异常时，如果该异常的发生，无法再继续进行运算。
就让自定义异常继承RuntimeException。
*/
class FuShuException extends RuntimeException
{
	FuShuException(String msg)
		{
			super(msg);
		}
}
class Demo
{
	int div(int a,int b)//throws ArithmeticException
	{
		if (b<0)
				throw new FuShuException("出现负数");
		if (b==0)
				throw new ArithmeticException("被0除啦");
		return a/b;
	}
}
class  ExceptionDemo4
{
	public static void main(String[] args) 
	{
		Demo d=new Demo();
		int x=d.div(4,-1);
		System.out.println("x="+x);
		System.out.println("over");
	}
}