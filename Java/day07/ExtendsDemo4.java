/*
3,�ַ����еĹ��캯����

�ڶ����������г�ʼ��ʱ������Ĺ��캯��Ҳ�����У�
��Ϊ����Ĺ��캯��Ĭ�ϵ�һ����һ����ʽ�����super()��
super��������ʸ����пղ����Ĺ��캯�����������������еĹ��캯��Ĭ�ϵ�һ�ж���super������

Ϊʲô����һ��Ҫ���ʸ����еĹ��캯����

��Ϊ�����е������������ֱ�ӻ�ȡ��������������ڽ���ʱ����Ҫ�Ȳ鿴��������ζ���Щ���ݽ��г�ʼ���ġ�
���������ڶ����ʼ��ʱ��Ҫ�ȷ���һ�¸����еĹ��캯����
���Ҫ���ʸ�����ָ���Ĺ��캯������Ҫ�ֶ�ͨ��super���ʡ�

ע�⣺super���һ��Ҫ���������ຯ���ĵ�һ�У�˭��super˭�����ࣻ

�����ʵ�������̡�
���ۣ�
�������еĹ��캯��Ĭ�϶�����ʸ����пղ����Ĺ��캯����
��Ϊ����ÿһ�����캯���ڵĵ�һ�ж���һ����ʽsuper������

��������û�пղ����Ĺ��캯��ʱ����������ֶ�ͨ��super�����ʽ��ָ��Ҫ���ʸ����еĹ��캯����
��Ȼ�����๹�캯����һ��Ҳ�����ֶ�ָ��this��������ʱ����еĹ��캯�������������ٻ���һ�����캯������ʸ����еĹ��캯����
*/
class Fu//extends object
{
   int num=2; 
	Fu()//���캯������������һ��������ʼ���Ժ���ԭ�е�Ĭ�Ϲ��캯���Ͳ������ˡ�
	{
		
	  num=60;
		System.out.println("fu run");
	}
	
	Fu(int x)
	{
		System.out.println("fu..."+x);
	}
	
}

class Zi extends Fu
{
	Zi()
	{
		//super();Ĭ�ϵ�
		//super(4);
		System.out.println("Zi run");
	}
	//super()��һ���ǿղ�����
	Zi(int x)
	{
		this();//��ʱ������Ĭ�ϵ�super���� 
		System.out.println("zi.."+x );
	}
}
class ExtendsDemo4 
{
	public static void main(String[] args) 
	{
		Zi z=new Zi();
		//Zi z1=new Zi(4);
		System.out.println(z.num);
	}
}
/*
class Person
{
	private String name;
	Person(String name)
	{
		this.name=name;
	}
	void show()
	{}
}
class Student extends Person
{
	Student(String name)
	{
		super(name);//������ø��๹�캯����ʽ
	}
	void method()
	{
		super.show();//������ø���һ�㺯����ʽ
	}
}
*/
