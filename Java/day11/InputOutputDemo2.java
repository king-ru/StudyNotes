//�̼߳�ͨѶ�������Ż���
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
	Input(Res r)//���캯�������ڸ������ʼ����
	{
		this.r=r;
	}
	public void run()
	{
		int x=0;
		while(true)//ʵ��ѭ����
		{
			
				if(x==0)
				
					r.set("mike","man");
				
				else
				
					r.set("����","Ů");
				
				x=(x+1)%2;//ʵ���л���
				
			
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
