/*
��̬����顣
static
{
    ��̬������е�ִ����䡣
}

�ص㣺������ļ��ض�ִ�У�ִֻ��һ�Ρ�������������������Ϊû���֡�
���ڸ�����г�ʼ����

*/
class  StaticCode
{
	int num=0;
	StaticCode()
	{
		System.out.println("b");
	}
     static//��̬����������г�ʼ����
	{
		System.out.println("a");
	}
	 //�������飬��������г�ʼ����
	{
		System.out.println("c");
	}
	StaticCode(int x)//���캯��������Ӧ������г�ʼ����
	{
		System.out.println("d"+this.num);
	}
	public static void show()
	{
		System.out.println("show run");
	}
}
class  StaticCodeDemo
{
	static
	{
		//System.out.println("b");
	}
	public static void main(String[] args) 
	{
		//new StaticCode();
		//new StaticCode();//���ᱻִ�С���
		//System.out.println("over!");
		//StaticCode.show();//����ֱ�ӵ��þ�̬�������õ����е�������Ż���ء�
	    new StaticCode(4);//a c d
	}
    static
	{
		//System.out.println("c");
	}
}
