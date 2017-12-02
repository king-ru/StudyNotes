/*
jdk1.5.0以上的版本新代码.提供了多线程的升级解决方案。
将同步synchronized转换成现实Lock操作。
将object中的wait，notifyAll，notify，替换成了专门的用于锁的Condition对象调用方法。
好处： 
1.实现了本方只实现唤醒对方的操作。（生产者只能唤醒消费者，消费者只能唤醒生产者）
2.一个锁可以绑定多个condition对象。 


*/
import  java.util.concurrent.locks.*;

class  ProducerConsumerDemo2
{
	public static void main(String[] args) 
	{
		Resourse res=new Resourse();
		Producer pro=new Producer(res);
		Consumer con=new Consumer(res);
			
		Thread t1=new Thread(pro);//括号里为什么要传入参数?一般情况下要传入一个Runnable对象，而Pro作为Runnable的子类对象，也可以传入。
		Thread t2=new Thread(pro);
		Thread t3=new Thread(con);
		Thread t4=new Thread(con);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
class Resourse
{
	private String name;
	private int count=1;
	private boolean flag=false;
	private Lock lock=new ReentrantLock();
	private Condition condition_pro=lock.newCondition();
	private Condition condition_con=lock.newCondition();
	public void  set(String name)throws InterruptedException
	{
		lock.lock();
		try
		{
			while(flag)
					condition_pro.await();
				this.name=name+"---"+count++;
				System.out.println(Thread.currentThread().getName()+"....生产者..."+this.name);
				flag=true;
				condition_con.signal();
			
		}	
		
		finally
		{
			lock.unlock();//必须要执行的代码块
		}
		
	
	}

	public void  out() throws InterruptedException 
	{
		lock.lock();
		try
		{
			while(!flag)
			    condition_con.await();
			System.out.println(Thread.currentThread().getName()+".......消费者............"+this.name);
			flag=false;
			condition_pro.signal();
		}
		finally
		{
			lock.unlock();
		}
	}
}
class Producer implements Runnable
{
	private Resourse res;
	Producer(Resourse res)
	{
		this.res=res;
	}
	public void run()
	{
		while(true)
			try
			{
				res.set("+商品+");
			}
			catch (InterruptedException e ){}
			
		
	}
}
class Consumer implements Runnable
{
	private Resourse res;
	Consumer(Resourse res)
	{
		this.res=res;
	}
	public void run()
	{
		while(true)
			try
			{
				res.out();
			}
			catch (InterruptedException e ){}
			
	}
}