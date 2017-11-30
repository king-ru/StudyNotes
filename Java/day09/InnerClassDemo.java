/*
内部类的访问规则：
1.内部类可以直接访问外部类中的成员，包括私有（因为私有在本类中有效）
   之所以可以直接访问外部类中的成员，是因为内部类中持有了一个外部类中的引用，格式：外部类名.this
2.外部类要访问内部类，必须要建立内部类对象。


访问格式：
1.当内部类定义在外部类的成员位置上，而且非私有，可以在外部其他类中直接建立内部类对象。
格式：
		外部类名.内部类名 变量名=外部类对象（new Outer()）.内部类对象；
		Outer.Inner in=new Outer().new Inner();
2.当内部类在成员位置上，就可以被成员修饰符所修饰。
	比如，private：将内部类在外部类中进行封装。
			  static：内部类就具备了static的特性。
			  当内部类被static修饰后，只能直接访问外部类中的static成员，出现了访问权限。
			  

			  在外部其他类中，如何直接访问静态内部类中的非静态成员呢？
			  new Outer.Inner().function();
			  在外部其他类中，如何直接访问静态内部类中的静态成员呢？
			  Outer.Inner.function();


	注意：当内部类中定义了静态成员，该内部类中必须是静态的。
			  当外部类中的静态方法访问内部类时，内部类也必须是static的。（不清楚原因）


当描述事物时，事物的内部还有事物，该事物用内部类来描述。
因为内部事物在使用外部事物的内容。

例：描述人体

class Body
{
	private class XinZang//直接访问外部类的性质
	{
	}
	public void show()
	{
		new XinZang();//私有类如何对外提供访问的方法
	}
}


重点：：一般在类中定义了内部类后，就要将内部类封装私有，使其不能被外部访问，仅仅对外提供访问的方法。
*/
class Outer 
{
	private static int x=3;
    static class Inner//当内部类在外部类充当成员时可以用private修饰，其他情况下class不能用private修饰。
	{
		int x=4;
		void function()
		{
			int x=6;
			System.out.println(this.x);//外部类中的x
		}
		
	}
	void method()
	{
		Inner in=new Inner();
		in.function();
	}
	class Inner2
	{
		void show()
		{
			System.out.println("inner2 show");
		}
	}
	public static void method1()
    {
		new Inner2().show();//出现无法从静态上下文中引用非静态方法。
	}
}
class InnerClassDemo//外部其他类
{
	public static void main(String[] args) 
	{
		Outer.method();
		//Outer.Inner.function();
		//new Outer.Inner().function();
		//Outer out=new Outer();
		//out.method();

		//直接访问内部类中的成员
		//Outer.Inner in=new Outer().new Inner();//外部对象.内部对象
		//in.function();
	}
}

	