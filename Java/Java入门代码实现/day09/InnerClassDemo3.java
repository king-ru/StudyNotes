/*
内部类定义在局部时：
1.不可以被成员修饰符（static）
2.可以直接访问外部类中的成员，因为还持有外部类中的引用
   但是不可以访问它所在的局部中的变量，只能访问被final修饰的局部变量
*/
class Outer
{
	int x=3;
	void method(final int a)//必须通过对象调用
	{
		final int y=4;///总结：final使a局限于在该方法中不能被操作
		//在该方法中a不能再被改值，因为有final修饰；

		//在创建对象时，可以通过创建不同对象操作传入参数的不同
		//也可以通过一个对象多次调用method函数时传入的参数不同
		class Inner//静态只能修饰成员，不能修饰类，但是private就可以修饰类
		{
			void function()//不能被static修饰，因为内部类不能被static修饰
			{
				System.out.println(Outer.this.x);//为什么输不出结果？
				System.out.println(y);
				System.out.println(a);

			}
		}
		new Inner().function();//不能在类Inner的前面创建对象，因为此时还未加载类：：：function必须通过创建Inner对象调用
	}
}
class InnerClassDemo3 
{
	public static void main(String[] args) 
	{
		new Outer().method(7);
		new Outer().method(8);
		Outer outer=new Outer();
		outer.method(7);
		outer.method(8);
	}
}
