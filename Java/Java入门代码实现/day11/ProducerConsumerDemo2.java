/*
jdk1.5.0���ϵİ汾�´���.�ṩ�˶��̵߳��������������
��ͬ��synchronizedת������ʵLock������
��object�е�wait��notifyAll��notify���滻����ר�ŵ���������Condition������÷�����
�ô��� 
1.ʵ���˱���ֻʵ�ֻ��ѶԷ��Ĳ�������������ֻ�ܻ��������ߣ�������ֻ�ܻ��������ߣ�
2.һ�������԰󶨶��condition���� 


*/
import  java.util.concurrent.locks.*;

class  ProducerConsumerDemo2
{
	public static void main(String[] args) 
	{
		Resourse res=new Resourse();
		Producer pro=new Producer(res);
		Consumer con=new Consumer(res);
			
		Thread t1=new Thread(pro);//������ΪʲôҪ�������?һ�������Ҫ����һ��Runnable���󣬶�Pro��ΪRunnable���������Ҳ���Դ��롣
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
				System.out.println(Thread.currentThread().getName()+"....������..."+this.name);
				flag=true;
				condition_con.signal();
			
		}	
		
		finally
		{
			lock.unlock();//����Ҫִ�еĴ����
		}
		
	
	}

	public void  out() throws InterruptedException 
	{
		lock.lock();
		try
		{
			while(!flag)
			    condition_con.await();
			System.out.println(Thread.currentThread().getName()+".......������............"+this.name);
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
				res.set("+��Ʒ+");
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