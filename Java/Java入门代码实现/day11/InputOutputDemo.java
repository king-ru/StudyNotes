/*
�̼߳�ͨѶ��
��ʵ���Ƕ���߳��ڲ���ͬһ����Դ��
���ǲ����Ķ�����ͬ��


�ȴ����ѻ��ơ�������

�������顣
     ���ã������ж�����г�ʼ����
     ����һ���������У����������ڹ��캯��ִ�С�
�͹��캯��������
     ���������Ǹ����ж������ͳһ��ʼ����
     �����캯���Ǹ���Ӧ�Ķ����ʼ����
     ���������ж�����ǲ�ͬ�����Եĳ�ʼ�����ݡ�


�����߳̾�Ҫ������ͬ������顣������synchronized��
������Ĭ��ֵ��false��

����������������� ͬ��
*/
class Res
{
	private String name;
	private String sex;
	private boolean flag;
	public synchronized void set(String name,String sex)
	{
		if(flag)

		this.name=name;
		this.sex=sex;
	}
	public void out()
	{
		System.out.println(name+"...."+sex);
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
			if(r.flag)
				try{r.wait();} catch(Exception e){}
			synchronized(r)
			{
				if(x==0)
				{
					r.name="mike";
					r.sex="man";
				}
				else
				{
					r.name="����";
					r.sex="Ů";
				}
				x=(x+1)%2;//ʵ���л���
				r.flag=true;
				r.notify();
			}
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
			synchronized(r)
				{
					if(!r.flag)
						try{r.wait();} catch(Exception e){}
					System.out.println(r.name+"...."+r.sex);
					r.flag=false;
					r.notify();//���붨������ĸ���
				}
		}
	}
}   
class  InputOutputDemo
{
	public static void main(String[] args) 
	{
		Res r=new Res();//����һ��������Ϊ�������빹�캯�����ǵ�input��output����r��
		Input in=new Input(r);
		Output out=new Output(r);

		Thread t1=new Thread(in);
		Thread t2=new Thread(out);

		t1.start();
		t2.start();
		
	}
}

//notifyAll();
/*
wait();
notify();
notifyall();

��ʹ����ͬ���У���ΪҪ�Գ��м��������������̲߳�����
����Ҫʹ����ͬ���У���Ϊֻ��ͬ���ž�������

Ϊʲô��Щ�����̵߳ķ���Ҫ������object�����أ�
��Ϊ��Щ�����ڲ���ͬ�����߳�ʱ���������ʶ�����������߳���ֻ�е�����
ֻ��ͬһ�����ϵĵȴ��̣߳����Ա�ͬһ�����ϵ�notify���ѡ�
�����Ա���ͬ���е��̻߳��ѡ�

Ҳ����˵���ȴ��ͻ��ѱ�����ͬһ������

��������������������Կ��������������õķ���������Object���С�
*/