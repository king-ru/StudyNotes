/*
this������ö������ڹ��캯��֮�以����á�
�����캯��֮�����ֻ����this��䡣 
ע��this���ֻ�ܶ����ڹ��캯���ĵ�һ�С���Ϊ��ʼ��Ҫ��ִ�С�
*/
class Person
{
	private int age;
	private String name; 
	Person()
	{
		//this("haha");
	}
	Person(int age)
	{
		this.age=age;
	}
	Person(String name)
	{
		//this();
		this.name=name;
	}
	Person(String name,int age)
	{
		//this.age=age;
		//Person(age); ����д���Ǵ����
		//this(age);//��p�����age�ڵ����������
		this.name=name;
	}

}
class PersonDemo4 
{
	public static void main(String[] args) 
	{
		Person p=new Person("chenru",30);
		System.out.println("name="+name+"age="+age);
	}
}
