//线程间通讯，代码优化。
class Res
{
	private String name;
	private String sex;
	private boolean flag;
	public synchronized void set(String name,String sex)
	{
		if(flag)
				try{this.wait();} catch(Exception e){}
		this.name=name;
		this.sex=sex;
		flag=true;
		this.notify();
	}
	public  synchronized void out()
	{
		if(!flag)
			try{this.wait();} catch(Exception e){}
		System.out.println(name+"...."+sex);
		flag=false;
		this.notify();
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
			
				if(x==0)
				
					r.set("mike","man");
				
				else
				
					r.set("丽丽","女");
				
				x=(x+1)%2;//实现切换。
				
			
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
			r.out();
		}
	}
}   
class  InputOutputDemo2
{
	public static void main(String[] args) 
	{
		Res r=new Res();
		new Thread(new Input(r)).start();
		new Thread(new Output(r)).start();
	}
}
