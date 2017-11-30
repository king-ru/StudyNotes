/*
Java里面static一般用来修饰成员变量或函数。
但有一种特殊用法是用static修饰内部类，普通类是不允许声明为静态的，只有内部类才可以。
*/
interface Inter
{
	void method();
}
class Test
{
	//补足代码，通过匿名内部类
	/*
	static class Inner implements Inter//为什么要用static修饰
	{
		public void method()
		{
			System.out.println("method run");
		}
	}
	
	static Inner function()//返回值为inter或者inner类型,因为只有对象才能调用method函数。
	{
		return new Inner();//inner是inter的子类
	}

	*/
	//简单表达形式
	
	static Inter function()
	{
		return new Inter()
		{
				public void method()
			{
				System.out.println("method run");
			}
		}; 
	}
	
}

class InnerClassTest 
{
	public static void main(String[] args) 
	{
		//Test.function():Test类中有一个静态的方法function
		//.method：function这个方法运算后的结果是一个inter类型的对象
		//因为只有是Inter类型的对象，才可以调用method方法
		Test.function().method();
		//用类直接调用方法判断为静态方法，接着调用method判断为inner对象
		


	//等价为  Inter in=Test.function();
	//in.method();
	
	show(new Inter()
	{
		public void method()
		{
			System.out.println("haha");
		}
	});
	
  
  }
	/*
	重点：什么情况下使用内部类？
	当一个函数传入的参数类型是接口类型时，当该接口的抽象方法不超过3个时，
	定义一个匿名内部类，将该匿名内部类作为参数传入。
	*/
	public static void show(Inter in)//为什么要这样写？不能写在主函数中吗？
	{
		in.method();
	}
}
//没有接口，没有父类，可以创建内部类吗？：：可以
class InnerTest
{
	public static void main(String[] args) 
	{
		new Object()//子类对象
		{
			public void function()
			{

			}
		}.function();//直接子类对象可以调用，不能创建对象，因为父类引用中不含有function方法
	}
}