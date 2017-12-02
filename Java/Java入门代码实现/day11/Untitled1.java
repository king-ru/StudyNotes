/*
线程间通讯：
其实就是多个线程在操作同一个资源。
但是操作的动作不同。

构造代码块。
     作用：给所有对象进行初始化。
     对象一建立就运行，而且优先于构造函数执行。
和构造函数的区别：
     构造代码块是给所有对象进行统一初始化，
     而构造函数是给对应的对象初始化。
     构造代码快中定义的是不同对象共性的初始化内容。


两个线程就要有两个同步代码块。即两个synchronized。
*/
class Res
{
	String name;
	String sex;
}
class Input implements Runnable
{
	private Res r;
	Input(Res r)//构造函数，用于给对象初始化。
	{
		this.r=r;
	}
	public void run()
	{
		int x=0;
		while(true)//实现循环。
		{
			synchronized(r)
			{
				if(x==0)
				{
					r.name="mike";
					r.sex="man";
				}
				else
				{
					r.name="丽丽";
					r.sex="女";
				}
				x=(x+1)%2;//实现切换。
		}
	}
}
class Output
{
	private Res r;
	Output(Res r)
	{
		this.r=r;
	}
	public void run()
	{
		while(true)
		{
			synchronized(r)
				System.out.println(r.name+"...."+r.sex);
		}
	}
}   
class  InputOutputDemo
{
	public static void main(String[] args) 
	{
		Res r=new Res();//建立一个对象，作为参数传入构造函数，是的input和output共享r。
		Input in=new Input(r);
		Output out=new Output(r);

		Thread t1=new Thread(in);
		Thread t2=new Thread(out);

		t1.start();
		t2.start();
		
	}
}
