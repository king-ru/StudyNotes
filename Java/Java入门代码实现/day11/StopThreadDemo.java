/*
stop方法已经过时。

如何停止线程？
只有一种，run方法结束。
开启多线程运行，运行代码通常是循环结构。

只要控制循环，就可以让run方法结束，也就是线程结束。

特殊情况：当线程处于冻结状态，就不会读取到标记，那么线程就不会结束。
当没有指定的方式让冻结的线程恢复到运行状态时，这时需要对冻结状态进行清除。（interrupt函数）
强制让线程恢复到运行状态中来，这样就可以操作标记让线程结束。

Thread类中提供了该方法 interrupt（）方法。

另外的方法：：：
1.join（）
当A线程执行到了B线程的.join()方法时，A就会等待，等线程B执行完，A才会执行。

join可以用来临时加入线程执行。

2.toString（）

*/
class StopThread implements Runnable
{
	private boolean flag=true;
	public synchronized void run()
	{
		while(flag)
		{
			try
			{
				wait();
			}
			catch (InterruptedException e)
			{
				System.out.println(Thread.currentThread().getName()+"....exception");
				flag=false;
			}
			System.out.println(Thread.currentThread().getName()+"....run");
		}
	}
	public void changeFlag()
	{
		flag=false;
	}
}
class  StopThreadDemo
{
	public static void main(String[] args) 
	{
		StopThread st=new StopThread();
		Thread t1=new Thread(st);
		Thread t2=new Thread(st);
		t1.start();
		t2.start();
		int num=0;
		while(true)
		{
			if(num++==60)
			{
				//st.changeFlag();
				t1.interrupt();
				t2.interrupt();
				break;
			}
			System.out.println(Thread.currentThread().getName()+"....main");
		}
	}
}
