/*
匿名内部类：
总结：1.方法少可以采用这种形式，可以简化书写。
			要是方法多的话，只能继承重写，建立对象，调用方法。
		  2.重点：什么情况下使用内部类？
			当一个函数传入的参数类型是接口类型时，当该接口的抽象方法不超过3个时，
			定义一个匿名内部类，将该匿名内部类作为参数传入。
	
1.匿名内部类其实就是内部类的简写格式。
2.定义匿名内部类的前提：
   内部类必须是继承一个类或者实现接口
3.匿名内部类的格式：new 父类或者接口（构造函数）{定义子类的内容}
4.其实匿名内部类就是一个匿名子类对象，而且这个对象有点胖，可以理解为带内容的对象，就是把方法体和建立对象融为一体
5.匿名内部类中定义的方法一般不超过三个。
*/
abstract class AbsDemo//抽象类不能创建对象
{
	abstract void show();
}
class Outer
{
	int x=3;
	/*
	class Inner extends AbsDemo
	{
		void show()
		{
			System.out.println(x);
		}
		void method()
		{
			System.out.println("method:"+x);
		}
	
	}*/
	public void function()
	{
		//new Inner().show();
		//在没有内部类的情况下，将注释代码简化为匿名内部类的形式
		//没有Inner的情况下如何创建对象？---创建父类对象，调用方法
		//Inner in=new Inner();
		//in.show();
		//in.abc();

		//匿名内部类：：：：
		AbsDemo d=new AbsDemo()//是一个AbsDemo的子类对象，这就实现了代码的简写
		//父类引用指向子类对象，多态的引用
		{
			void show() 
			{
				System.out.println("x="+x);
			}
			void abc()
			{
				System.out.println("abc");
			}
		};//.show()或者.abc();对象调用show函数,abc函数，不能同时调用
		//匿名对象只能调用一次函数

		d.show();
	}
	//多态引用调用方法时只能调用父类中存在的被子类对象所复写掉的方法，所以不能调用abc方法
	
	//d.abc();不能调用，编译失败
}
class InnerClassDemo4
{
	public static void main(String[] args) 
	{
		new Outer().function();
	}
}
