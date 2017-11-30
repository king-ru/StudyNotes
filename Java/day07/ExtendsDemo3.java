/*
2,子父类中的函数

当子类和父类出现一样的函数时（即函数名称相同）
当子类对象调用该函数，会运行子类函数的内容。
如同父类函数被覆盖一样。

这种情况是函数的另一个特性：重写（也称为覆盖）。

当子类继承了父类，沿袭了父类的功能到子类中，
虽然子类具有该功能，但是功能的内容和父类不一致，
这时，没有必要定义新功能，而是使用覆盖特殊，保留父类的功能定义，并重写功能内容。

覆盖注意事项:
1.子类覆盖父类，必须保证子类权限大于等于父类权限，才可以覆盖，否则编译失败。

2.静态只能覆盖静态。


注意：重载：只看同名函数的参数列表。
		 重写：字父类方法要一模一样。
*/
class Fu
{
   void show()//这是默认权限，介于public和private之间
	{
		System.out.println("Fu show");
		
	}
	void speak()
	{
		System.out.println("vb");
	}
}
class Zi extends Fu
{
	public void show()
	{
		System.out.println("Zi show");
	}
	void speak()
	{
		System.out.println("java");
	}
}
class ExtendsDemo3
{
	public static void main(String[] args)
	{
		Zi zi=new Zi();
		zi.show();
		zi.show();
		zi.speak();
	}
}
class Tel
{
	void show()
	{
		System.out.println("number"); 

	}
}
class NewTel extends Tel
{
    void show()
	{
		 //System.out.println("number");
        super.show();//这是调用父类的函数；
		//如果不加super的话，默认的是this，即自己调用自己，没有条件的调用是死循环，会造成内存溢出。
		 System.out.println("name");
		 System.out.println("pic");
	}
}
	 