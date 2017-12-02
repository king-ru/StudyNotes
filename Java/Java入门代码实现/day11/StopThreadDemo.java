/*
stop�����Ѿ���ʱ��

���ֹͣ�̣߳�
ֻ��һ�֣�run����������
�������߳����У����д���ͨ����ѭ���ṹ��

ֻҪ����ѭ�����Ϳ�����run����������Ҳ�����߳̽�����

������������̴߳��ڶ���״̬���Ͳ����ȡ����ǣ���ô�߳̾Ͳ��������
��û��ָ���ķ�ʽ�ö�����ָ̻߳�������״̬ʱ����ʱ��Ҫ�Զ���״̬�����������interrupt������
ǿ�����ָ̻߳�������״̬�����������Ϳ��Բ���������߳̽�����

Thread�����ṩ�˸÷��� interrupt����������

����ķ���������
1.join����
��A�߳�ִ�е���B�̵߳�.join()����ʱ��A�ͻ�ȴ������߳�Bִ���꣬A�Ż�ִ�С�

join����������ʱ�����߳�ִ�С�

2.toString����

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
