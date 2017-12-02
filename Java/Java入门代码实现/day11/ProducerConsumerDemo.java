/*
唤醒notify时要看谁先处于线程等待状态。
Thread()和Thread(参数)的区别：
Thread()适用于你的类继承了Thread，Thread(参数）适用于你的类实现了Runnable。
Runnable没有开启线程的方法，需要借助Thread实现。


当出现了多个生产者，多个消费者的 情况下。
为了防止出现唤醒本类对象。
1.将if改为while（每次都会判断，防止数据漏掉）
2.将notify改为notifyAll。 
*/
class  ProducerConsumerDemo
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

	public synchronized void  set(String name)
	{
		while(flag)
			try{this.wait();} catch(Exception e){}
		this.name=name+"---"+count++;
		System.out.println(Thread.currentThread().getName()+"....生产者..."+this.name);
		flag=true;
		this.notifyAll();
	}
	public synchronized void  out()
	{
		while(!flag)
			try{this.wait();} catch(Exception e){}
		System.out.println(Thread.currentThread().getName()+".......消费者............"+this.name);
		flag=false;
		this.notifyAll();
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
		{
			res.set("+商品+");
		}
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
		{
			res.out();
		}
	}
}