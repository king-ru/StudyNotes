/*
静态代码块。
static
{
    静态代码块中的执行语句。
}

特点：随着类的加载而执行，只执行一次。并优先于主函数，因为没名字。
用于给类进行初始化。

*/
class  StaticCode
{
	int num=0;
	StaticCode()
	{
		System.out.println("b");
	}
     static//静态代码块给类进行初始化。
	{
		System.out.println("a");
	}
	 //构造代码块，给对象进行初始化。
	{
		System.out.println("c");
	}
	StaticCode(int x)//构造函数，给对应对象进行初始化。
	{
		System.out.println("d"+this.num);
	}
	public static void show()
	{
		System.out.println("show run");
	}
}
class  StaticCodeDemo
{
	static
	{
		//System.out.println("b");
	}
	public static void main(String[] args) 
	{
		//new StaticCode();
		//new StaticCode();//不会被执行。。
		//System.out.println("over!");
		//StaticCode.show();//类名直接调用静态方法。用到类中的内容类才会加载。
	    new StaticCode(4);//a c d
	}
    static
	{
		//System.out.println("c");
	}
}
