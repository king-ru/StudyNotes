class Person//ע���ڴ��������в�Ҫ����
{
	private String name;
	private int age;
	private static String country="cn";
    Person(String name, int age)
	{
		this.name=name;
	    this.age=age;
		
	}
	public void setName(String name)
	{
		this.name=name;
		System.out.println("name="+this.name);
	}
    public void speak()
	{
		System.out.println("name="+this.name+"age="+this.age);
	}
	  public static void showCountry()//��̬���������ڷ������У������ʶ��ڴ��е����ݡ�ͨ������ֱ���ڷ������е��á�
	{
		System.out.println("country="+country);
		method();
		//һ��Ҫע�⣬��̬����û��this����Ϊ��̬�����ڶ�����ڡ�ͨ���������á�countryǰ��ʡ�Ե���Person.
	}
	 public static void method()
	{
		System.out.println("okok");
	}
}
class PersonDemo666 
{
	public static void main(String[] args) 
	{
		Person p=new Person("zhansan",20);
		p.setName("lisi");
	}
}
/*
Person p=new Person("chenru",20);

�þ仰������ʲô���飿
1.��Ϊnew�õ���person.class�������Ȼ��ҵ�Person.class�ļ������ص��ڴ��С�
2.ִ�и����е�static����飬����еĻ�����Person.class����г�ʼ����
   static//��̬����������г�ʼ����
	{
		System.out.println("a");
	}
3.�ڶ��ڴ��п��ٿռ䣬�����ڴ��ַ��
4.�ڶ��ڴ��н���������������ԣ�������Ĭ�ϳ�ʼ����
5.�����Խ�����ʾ��ʼ���������ڳ�ʼ���н��е����Գ�ʼ����
6.�Զ�����й��������ʼ����
//�������飬��������г�ʼ����
	{
		System.out.println("c");
	}
7.�Զ�����ж�Ӧ�ĺ�����ʼ���������캯����ʼ����
8.���ڴ��ַ����ջ�ڴ���p������
*/


/*ע���������еķ����Լ������Ķ�����ջ�ڴ��С�
          ����ķǾ�̬���Դ����ڶ��ڴ��С�
		  ���ڸ������ʼ���ķ����Լ�����ľ�̬���Դ����ڷ������С�
*/