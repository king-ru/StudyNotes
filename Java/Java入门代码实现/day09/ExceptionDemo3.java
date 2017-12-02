/*
因为项目中会出现特有的问题。
而这些问题并不被Java所描述并封装对象。
所以对于这些特有的问题可以按照Java对问题封装的思想，
对特有的问题，进行自定义的异常封装。


自定义异常：
需求：在本程序中，对于除数为负数，也视为是错误的，是无法进行运算的。
		  那么就需要对这个问题进行自定义的描述。

当在函数内部出现了throw抛出异常对象，那么必须要给出对应的处理动作。
要么在内部try catch处理。
要么在函数上声明让调用者处理。


一般情况下，函数内出现异常，函数上需要用throws声明。


发现打印的结果中只有异常的名称，没有异常的信息。
因为自定义的异常并未定义信息。

如何定义异常信息呢？
因为父类中已经把异常信息的操作都完成了。
所以子类只要在构造时，把异常信息传递给父类通过super语句。
那么就可以直接通过getMessage的方法获取自定义的异常信息。


自定义异常：
必须是自定义类继承Exception。


继承Exception原因：
异常体系有一个特点：因为异常类和异常对象都被抛出。
他们都具备可抛行，这个可抛性是Throwable这个体系中的独有特点。


只有这个体系中中的对象才可以被throw和throws操作。
Throwable体系中包括的成员  Exception 和Error，只有Throwable体系中的成员才可以被抛出去。



throws和throw的区别：
1.位置：throws使用在函数上。（跟在函数名称后面，在小括号与大括号之间）
			throw使用在函数内部。
2. 所跟内容：throws后面的异常类，可以跟很多个，用逗号隔开。
					throw后面跟的是异常对象。


throw存在时，后面不要再加函数执行语句，因为一旦被抛，该大函数就停止运行了。
可以考虑将另一个函数放在前面。
*/

//自定义异常，有自己独特的方法，也有对父类的复写。
class FuShuException extends Exception//getMessage();
{
	private int vaule;
	private String msg;
	
	FuShuException(String msg,int vaule)//将getMessage函数复写
	{
		super(msg);
		this.vaule=vaule;
	}
	public int getVaule()
	{
		return vaule;
	}
	

}
class Demo
{
	int div(int a,int b)throws FuShuException
	{
		if(b<0)
			throw new FuShuException("除数出现负数",b);//手动通过throw关键字抛出一个自定义异常对象。
		return a/b;
	}
}
class  ExceptionDemo3
{
	public static void main(String[] args) 
	{
		Demo d=new Demo();
		try
		{
			int x=d.div(4,-1);
			System.out.println("x="+x);
		}
		catch (FuShuException e)
		{
			System.out.println(e.toString());
			System.out.println("出现错误的数是："+e.getVaule()); 
		}
	
	}
}