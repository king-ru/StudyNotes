//???
/*
ͬ�������õ�����һ�����أ�
������Ҫ��������ã���ô��������һ�������������ã�����this��
����ͬ������ʹ�õ�����this��

ͨ���ó��������֤��

ʹ�������߳�����Ʊ��
һ���߳���ͬ��������С�
һ���߳���ͬ�������С�
����ִ����Ʊ������


���ͬ����������̬���κ�ʹ�õ�����ʲô�أ�

ͨ����֤�����ֲ���this����Ϊ��̬�����в����Զ���this��

��̬���ڴ�ʱ���ڴ���û�б�����󣬵���һ���и����Ӧ���ֽ����ļ�����
����.class �ö����������class��

��̬��ͬ��������ʹ�õ����Ǹ÷�����������ֽ����ļ����󡣼�����.class��

����Ƕ��ʹ��ʱ����������������󡣼���������
*/ 
class Ticket implements Runnable//extends Thread
{
	private int tic=100;
	Object obj=new Object();
	boolean flag=true;
	public void  run()//��synchronized���ں��������Ͼ��ú���Ҳ�߱���ͬ�������ʡ����������synchronized��Ч����һ����
	{
		if (flag)
		{
				while(true)
			{
				synchronized(this)
				{
				
					if(tic>0)
					{
						try{Thread.sleep(10);}catch(Exception e){}//�����ֻ��try�������ף���Ϊ����ķ�����ʵ�ֽӿ��еġ�
						System.out.println(Thread.currentThread().getName()+"...code:"+tic--);
					}
				}
			}
		}

		else 
			while(true)
				show();
		
	}
	public synchronized void show()
	{
			if(tic>0)
				{
					try{Thread.sleep(10);}catch(Exception e){}//�����ֻ��try�������ף���Ϊ����ķ�����ʵ�ֽӿ��еġ�
					System.out.println(Thread.currentThread().getName()+"...show:"+tic--);
				}
		
		
	}
}
class  ThisLockDemo
{
	public static void main(String[] args) 
	{
		Ticket t=new Ticket();
		Thread t1=new Thread(t);//������һ���߳�
		Thread t2=new Thread(t);//������һ���߳�
		//Thread t3=new Thread(t);//������һ���߳�
		//Thread t4=new Thread(t);//������һ���߳�
		t1.start();
		try{Thread.sleep(10);}catch(Exception e){}
	    t.flag=false;
		t2.start();
		//t3.start();
		//t4.start();
		
	}
}
