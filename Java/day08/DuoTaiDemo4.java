class Fu
{
	void method1()
	{
		System.out.println("fu method1");
	}
	void method2()
	{
		System.out.println("fu method2");
	}
	static void method4()
	{
		System.out.println("fu method4");
	}
}
class Zi extends Fu
{
	void method1()
	{
		System.out.println("zi method1");
	}
	void method3()
	{
		System.out.println("zi method3");
	}
	static void method4()
	{
		System.out.println("zi method4");
	}
}
class  DuoTaiDemo4
{
	public static void main(String[] args) 
	{
		//Fu f=new Zi();//fΪ�����ͱ�������̬������(��������ָ���������)
		//f.method1();
		//f.method2();//��ʾ�Ķ�����������ݣ���Ϊ���������壬����ͨ�����󱻵��á�
		//f.method3();//f����method�Ĺ��ܲſ��Ա����ã��ſ���ð��ȥ���Ρ���
		Fu f=new Zi();
		f.method2();
		

		Zi z=new Zi();
		z.method2();
	
	}
}


/*
###�ڶ�̬�г�Ա(�Ǿ�̬)�������ص㣺
�ڱ���ʱ�ڣ����������ͱ�������f������Fu���У������������Ƿ��е��õķ���������У�����ͨ�������û�б���ʧ�ܡ�
������ʱ�ڣ����Ķ������������У���Zi���У��Ƿ��е��õķ�����
���ܽ���ǣ���Ա�����ڶ�̬����ʱ�����뿴��ߣ����п��ұߡ�
*/


/*
����С�㣺

�ڶ�̬�У���Ա�������ص㣺
���۱�������У����ο���ߣ������ͱ����������ࣩ����

�ڶ�̬�У���̬��Ա����,��Ա�������ص㣺
���۱�������У����ο���ߡ�
*/
