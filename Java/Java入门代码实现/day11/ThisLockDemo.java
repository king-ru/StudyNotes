//???
/*
同步函数用的是哪一个锁呢？
函数需要被对象调用，那么函数都有一个所属对象引用，就是this。
所以同步函数使用的锁是this。

通过该程序进行验证。

使用两个线程来卖票。
一个线程在同步代码块中。
一个线程在同步函数中。
都在执行卖票动作。


如果同步函数被静态修饰后，使用的锁是什么呢？

通过验证，发现不是this。因为静态方法中不可以定义this。

静态进内存时，内存中没有本类对象，但是一定有该类对应的字节码文件对象。
类名.class 该对象的类型是class。

静态的同步方法，使用的锁是该方法所在类的字节码文件对象。即类名.class。

当锁嵌套使用时，会出现死锁的现象。即锁中锁。
*/ 
class Ticket implements Runnable//extends Thread
{
	private int tic=100;
	Object obj=new Object();
	boolean flag=true;
	public void  run()//将synchronized放在函数声明上就让函数也具备了同步的性质。但和下面的synchronized的效果不一样。
	{
		if (flag)
		{
				while(true)
			{
				synchronized(this)
				{
				
					if(tic>0)
					{
						try{Thread.sleep(10);}catch(Exception e){}//在这儿只能try，不能抛，因为这里的方法是实现接口中的。
						System.out.println(Thread.currentThread().getName()+"...code:"+tic--);
					}
				}
			}
		}

		else 
			while(true)
				show();
		
	}
	public synchronized void show()
	{
			if(tic>0)
				{
					try{Thread.sleep(10);}catch(Exception e){}//在这儿只能try，不能抛，因为这里的方法是实现接口中的。
					System.out.println(Thread.currentThread().getName()+"...show:"+tic--);
				}
		
		
	}
}
class  ThisLockDemo
{
	public static void main(String[] args) 
	{
		Ticket t=new Ticket();
		Thread t1=new Thread(t);//创建了一个线程
		Thread t2=new Thread(t);//创建了一个线程
		//Thread t3=new Thread(t);//创建了一个线程
		//Thread t4=new Thread(t);//创建了一个线程
		t1.start();
		try{Thread.sleep(10);}catch(Exception e){}
	    t.flag=false;
		t2.start();
		//t3.start();
		//t4.start();
		
	}
}
