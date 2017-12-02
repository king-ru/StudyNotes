/*
����notifyʱҪ��˭�ȴ����̵߳ȴ�״̬��
Thread()��Thread(����)������
Thread()�����������̳���Thread��Thread(�����������������ʵ����Runnable��
Runnableû�п����̵߳ķ�������Ҫ����Threadʵ�֡�


�������˶�������ߣ���������ߵ� ����¡�
Ϊ�˷�ֹ���ֻ��ѱ������
1.��if��Ϊwhile��ÿ�ζ����жϣ���ֹ����©����
2.��notify��ΪnotifyAll�� 
*/
class  ProducerConsumerDemo
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

	public synchronized void  set(String name)
	{
		while(flag)
			try{this.wait();} catch(Exception e){}
		this.name=name+"---"+count++;
		System.out.println(Thread.currentThread().getName()+"....������..."+this.name);
		flag=true;
		this.notifyAll();
	}
	public synchronized void  out()
	{
		while(!flag)
			try{this.wait();} catch(Exception e){}
		System.out.println(Thread.currentThread().getName()+".......������............"+this.name);
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
			res.set("+��Ʒ+");
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