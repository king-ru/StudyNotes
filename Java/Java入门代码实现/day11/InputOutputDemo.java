/*
线程间通讯：
其实就是多个线程在操作同一个资源。
但是操作的动作不同。


等待唤醒机制。。。。

构造代码块。
     作用：给所有对象进行初始化。
     对象一建立就运行，而且优先于构造函数执行。
和构造函数的区别：
     构造代码块是给所有对象进行统一初始化，
     而构造函数是给对应的对象初始化。
     构造代码快中定义的是不同对象共性的初始化内容。


两个线程就要有两个同步代码块。即两个synchronized。
布尔型默认值是false。

对象监视器即：有锁 同步
*/
class Res
{
	private String name;
	private String sex;
	private boolean flag;
	public synchronized void set(String name,String sex)
	{
		if(flag)

		this.name=name;
		this.sex=sex;
	}
	public void out()
	{
		System.out.println(name+"...."+sex);
	}
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
			if(r.flag)
				try{r.wait();} catch(Exception e){}
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
				r.flag=true;
				r.notify();
			}
		}
	}
}
class Output implements Runnable
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
				{
					if(!r.flag)
						try{r.wait();} catch(Exception e){}
					System.out.println(r.name+"...."+r.sex);
					r.flag=false;
					r.notify();//必须定义操作哪个锁
				}
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

//notifyAll();
/*
wait();
notify();
notifyall();

都使用在同步中，因为要对持有监视器（锁）的线程操作。
所以要使用在同步中，因为只有同步才具有锁。

为什么这些操作线程的方法要定义在object类中呢？
因为这些方法在操作同步中线程时，都必须标识他们所操作线程中只有的锁。
只有同一个锁上的等待线程，可以被同一个锁上的notify唤醒。
不可以被不同锁中的线程唤醒。

也就是说，等待和唤醒必须是同一个锁。

而锁可以是任意对象，所以可以在任意对象调用的方法定义在Object类中。
*/