/*
���󣺼򵥵���Ʊ����
�������ͬʱ��Ʊ��


�����̵߳ĵڶ�����ʽ��ʵ��Runnable�ӿ�

���裺
1.������ʵ��Runnable�ӿڡ�
2.����Runnable�ӿ��е�run������
	���߳�Ҫ���еĴ�������run�����С�

3.ͨ��Thread����״�·�ߣ��ཨ���̶߳���
4.��Runnable�ӿڵ����������Ϊʵ�ʲ������ݸ�Thread��Ĺ��캯����
	ԭ��
	��Ϊ���Զ����run���������Ķ�����Runnable�ӿڵ��������
	����Ҫ���߳�ִ��ָ�������run�������ͱ�����ȷ��run������������

5.����Thread���start���������̲߳�����Runnable�ӿ������run������

***ʵ�ַ�ʽ�ͼ̳з�ʽ��ʲô�����أ�

1.ʵ�ַ�ʽ�ô��������˵��̳еľ����ԡ�����Java��ֻ֧�ֵ��̳У���һ����ֻ�ܼ̳�һ���ࣩ
�ڶ����߳�ʱ������ʹ��ʵ�ַ�ʽ��

2.���ַ�ʽ�����𣺣�������λ�ò�һ����
�̳�Thread���̴߳�������Thread�����run�����С�
ʵ��Runnable���̴߳������ڽӿ������run�����С�
*/
class Ticket implements Runnable//extends Thread
{
	private int tic=100;//��һ�ַ�ʽ��������static����//Ϊʲô����static�ͳ����ĸ�������100��Ʊ��
	public void run()
	{
		while(true)
		{
			if(tic>0)
			{
				System.out.println(Thread.currentThread().getName()+"...sale:"+tic--);
			} 
		}
	}
}
class  TicketDemo
{
	public static void main(String[] args) 
	{
		Ticket t=new Ticket();
		Thread t1=new Thread(t);//������һ���߳�
		Thread t2=new Thread(t);//������һ���߳�
		Thread t3=new Thread(t);//������һ���߳�
		Thread t4=new Thread(t);//������һ���߳�
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		/*
		Ticket t1=new Ticket();
		Ticket t2=new Ticket();
		Ticket t3=new Ticket();
		Ticket t4=new Ticket();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		*/

	}
}
