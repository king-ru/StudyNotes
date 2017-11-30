/*
异常：
是什么？是对问题的描述。将问题进行对象的封装。
----------
异常体系：
				Throwable
				|--Error
				|--Exception
					|--RuntimeException
异常体系的特点：异常体系中的所有类以及建立的对象都具有可抛行。
							也就是说可以被throw和throws关键字操作。
							只有异常体系具备这个特点。
--------------

throw和throws的用法：

throw定义在函数内部，用于抛出异常对象。
throws定义在函数上，用于抛出异常类。可以抛出多个，用逗号隔开。
-------------

当函数内有throw抛出异常对象，并未进行try处理，必须要在函数上声明，否则编译失败。
注意：RuntimeException除外。也就是说，函数内如果抛出的是RuntimeException，函数上可以不用声明。

如果函数声明了异常，调用者必须进行处理。处理方法可抛可try。
-------------

异常有两种：
		编译时被检测异常
			该异常在编译时如果没有处理（没抛没try），那么编译失败。
			该异常被标识，代表这可以被处理。
		运行时异常（编译时不检测）
			在编译时，不需要处理，编译器不检查。
			该异常的发生，建议不处理，让程序停止，需要对代码进行修正。
-----------------
异常处理的语句
try
{
	需要被检测的代码；
}
catch（）
{
	处理异常的代码；
}
finally
{
	一定会执行的代码；
}

有三种结合格式：
try
{
}
catch()
{
}
2.
try
{
}
catch()
{
}
finally
{
}
3.
try
{
}
finally
{
}

注意：
1.finally中定义的通常是 关闭资源代码，因为资源必须释放。（不管程序执行错误还是正确，finally里面的东西都要执行）
finally代码块就算是在return下面，也会被执行的。

2.finally只有一种情况不会执行。当执行到
 System.exit(0);//系统退出。jvm结束。
 finally代码块在这种情况下不会执行。
--------------
 自定义异常：
		定义类继承Exception或者RuntimeException
		1.为了让该自定义类具备可抛行。
		2.让该类具备操作异常的共性方法。
		
		当要定义自定义异常的信息时，可以使用父类已经定义好的功能。
		异常信息传递给父类的构造函数。
		class MyException extends Exception
		{
			MyExcepyion(String message)
			{
				super(message);
			}
		}

自定义异常，按照Java的面向对象思想。将程序中出现的特有问题进行封装。

异常的好处：
	1.将问题进行封装。
	2.将正常流程代码和问题处理代码相分离，方便于阅读。

异常的处理原则：
	1.处理方式有两种：try或者throws。
	2.调用到抛出异常的功能时，抛出几个，就处理几个。
		出现一个try对应多个catch的情况。
	3.多个catch，父类的catch放在最下面。
	4.catch内，需要定义针对性的处理方式。不要简单地定义printStackTrace，输出语句。
	  也不要不写。
	  当捕获到的异常，本功能处理不了时	，可以继续在catch中抛出。
	  try
	  {
			throw new AException();
	  }
	  catch(AException e)
	  {
			throw e;
	  }

	  如果该异常处理不了，但并不属于该功能出现的异常。
	  可以将异常转换后，再抛出和该功能相关的异常。

	  或者异常可以处理，但需要将异常产生的和本功能相关的问题提供出去。
	  让调用者知道并处理。
	  也可以将捕获异常处理后，转换新的异常。
	  try
	  {
		  throw new AException();
	  }
	  catch(AException e)
	  {
		  //对AException进行处理。
		  throw new BExcepyion();//将转换后的异常暴露出去，让调用者知道。
	  }
	  比如：汇款的例子：
	  张三给李四转账，没转成功。李四没收到钱。
	  1.张三先处理异常：将钱先存入自己的账户中。（和银行之间的事情）
	  2.处理之后通知系统错误。转换为新的异常。让调用者知道。

异常的处理事项：
	在字父类覆盖时：
	1.子类抛出的异常必须是父类异常的子类或者子集。
	2.如果父类或者接口没有异常抛出时，子类覆盖出现异常，只能try，不能抛。（即子类不能比父类多抛）


*/


class  
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
