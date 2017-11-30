/*
通过分析发现，打印出0,-1，-2等错票。

多线程的运行出现了安全问题。

问题的原因：

		当多条语句在操作同一个线程共享数据时，一个线程对多条语句只执行了一部分，还没有执行完。
		另一个线程参与进来执行。导致共享数据的错误。

解决方法：
		对多条操作共享数据的语句，只能让一个线程都执行完，在执行过程中，其他线程不可以参与执行。

Java对于多线程的安全问题提供了专业的解决方式。

就是同步代码块。

synchronized（同步的）（对象）
{
	需要被同步的代码 。
}

对象如同锁，持有锁的线程可以在同步中执行。
没有持有锁的线程即使获取了CPU的执行权，也进不去，因为没有获取锁。

火车上的卫生间--经典实例。

同步的前提：
1.必须要有两个或者两个以上的线程（即多线程）
2.必须是多个线程使用同一个锁（即共享数据）

必须保证同步中只能有一个线程在运行。

好处：解决多线程的安全问题。

弊端：多个线程都需要判断锁，较为消耗资源。越安全越麻烦。


目的：判断一个程序是有安全问题，如果有，如何解决问题？
1.明确哪些代码是多线程运行代码。
2.明确共享数据。
3.明确多线程运行代码中哪些语句是操作共享数据（一般成员都是共享数据）。


*/
class Ticket implements Runnable//extends Thread
{
	private int tic=100;//第一种方式这里必须加static？？//为什么用了static就成了四个对象共有100张票。
	Object obj=new Object();
	public synchronized void  run()//将synchronized放在函数声明上就让函数也具备了同步的性质。但和下面的synchronized的效果是不一样的。
	{
		while(true)
		{
			
					//synchronized(obj)
			//{
					if(tic>0)
				{
					try{Thread.sleep(10);}catch(Exception e){}//在这儿只能try，不能抛，因为这里的方法是实现接口中的。
					System.out.println(Thread.currentThread().getName()+"...sale:"+tic--);
				}
			// }
		}
	}
}
class  TicketDemo1
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
		
	}
}
