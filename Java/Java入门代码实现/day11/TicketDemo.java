/*
需求：简单的卖票程序。
多个窗口同时买票。


创建线程的第二个方式，实现Runnable接口

步骤：
1.定义类实现Runnable接口。
2.覆盖Runnable接口中的run方法。
	将线程要运行的代码存放在run方法中。

3.通过Thread（线状物，路线）类建立线程对象。
4.将Runnable接口的子类对象作为实际参数传递给Thread类的构造函数。
	原因：
	因为，自定义的run方法所属的对象是Runnable接口的子类对象。
	所以要让线程执行指定对象的run方法。就必须明确该run方法所属对象。

5.调用Thread类的start方法开启线程并调用Runnable接口子类的run方法。

***实现方式和继承方式有什么区别呢？

1.实现方式好处：避免了单继承的局限性。（在Java中只支持单继承，即一个类只能继承一个类）
在定义线程时，建议使用实现方式。

2.两种方式的区别：（代码存放位置不一样）
继承Thread：线程代码存放在Thread子类的run方法中。
实现Runnable：线程代码存放在接口子类的run方法中。
*/
class Ticket implements Runnable//extends Thread
{
	private int tic=100;//第一种方式这里必须加static？？//为什么用了static就成了四个对象共有100张票。
	public void run()
	{
		while(true)
		{
			if(tic>0)
			{
				System.out.println(Thread.currentThread().getName()+"...sale:"+tic--);
			} 
		}
	}
}
class  TicketDemo
{
	public static void main(String[] args) 
	{
		Ticket t=new Ticket();
		Thread t1=new Thread(t);//创建了一个线程
		Thread t2=new Thread(t);//创建了一个线程
		Thread t3=new Thread(t);//创建了一个线程
		Thread t4=new Thread(t);//创建了一个线程
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		/*
		Ticket t1=new Ticket();
		Ticket t2=new Ticket();
		Ticket t3=new Ticket();
		Ticket t4=new Ticket();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		*/

	}
}
