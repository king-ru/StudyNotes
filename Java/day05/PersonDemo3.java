/*
���캯�����ص㣺
1.��������������ͬ��
2.���ö��巵��ֵ���͡�
3.������дreturn��䡣
*/

/*
����һ�����ͻ������֮��Ӧ�Ĺ��캯����
���캯�������ã��������ڸ�������г�ʼ����ֻ���ǳ�ʼ����
���캯����Сϸʱ�ڣ���һ������û�ж��幹�캯������ôϵͳ��Ĭ�ϸ��������һ���ղ����Ĺ��캯����
���캯����һ�㺯����д���ϲ�ͬ����������Ҳ�в�ͬ��
���캯�����ڶ���һ���������У��������ʼ����
��һ�㷽���Ƕ�����ò�ִ�У��Ǹ�������Ӷ���߱��Ĺ��ܡ�

һ�������������캯��ֻ����һ�Ρ�
��һ�㷽�����Ա�������ö�Ρ�
..ʲôʱ���幹�캯���أ�
����������ʱ����������ھ߱�һЩ���Ի���Ϊ����ô����Щ���ݶ����ڹ��캯���С�

*/
class Person//ע���ڴ��������в�Ҫ����
{
	private String name;
	private int age;
	/*
	�������飺
	���ã���������г�ʼ��������һ���������У����������ڹ��캯��ִ�С�
	�͹��캯�������𣺹��������Ǹ����ж������ͳһ��ʼ����
	�����캯���Ǹ�  ��Ӧ  �Ķ����ʼ�����ò�ͬ�ķ�ʽ���г�ʼ����
	���������ж�����ǲ�ͬ�����Եĳ�ʼ�����ݡ�
	*/
	{
		System.out.println("person code run");
		cry();
	}
	Person(int age)
	{
		this.age=age;
	}
	//���Թ��������캯���Զ�����в�ͬ�ĳ�ʼ����
	Person()
	{
		//Person(){} 
		System.out.println("A:name="+name+"age="+age);
	}
	Person(String name)
	{
		this.name=name;//this�ؼ��֣�����ȥ���������־ֲ������ͳ�Ա������
		/*
		this�������һ��1.this�������еĶ���.�������ں���������������ã���˵���ĸ������ڵ���this���ڵĺ�����this�ʹ����ĸ�����
		*/
		/*this��Ӧ�ã����������й���ʱ���ú����ڲ�Ҫ�õ����øú����Ķ���ʱ����ʱ��this��ʾ�������
								�������๦���ڲ�ʹ���˱�����󣬶���this. 	��ʾ����
		*/
		//��ʱthis�ʹ���p1;
		System.out.println("B:name="+name+"\n"+"age="+age);
	}
	Person(String name, int a)
	{
		this.name=name;
		age=a;
		System.out.println("C:name="+name+"age="+age);
	}
	public void cry()//����������ִ�ж������͹��캯����ͬ
	{
		System.out.println("cry");
	}
	public void setAge(int a)
	{
			age=a;
			System.out.println("age="+age);
	}
	public int getAge()
	{
		return age;
	}
	public void speak()
	{
		System.out.println("name="+this.name+"age="+this.age);
	}
	/*
	���󣺸��˶���һ�����ڱȽ������Ƿ���ͬ�Ĺ��ܡ�
	*/
	public boolean compare(Person p)
    {
	return(this.age==p.age); 
    }
	
}
//class  PersonDemo2
//{
	//public static void main(String[] args) 
	//{
		//Person p1=new Person("chenru");//��������new��������һ���µĶ���
		/*p1.cry();
		p1.cry();
		Person p2=new Person("Lisi");
		Person p3=new Person("Lisi",11);
		p3.setAge(12);*/
	//}
//}
/*
�����ж��Ƿ���ͬ���ˣ�ע������һ���˵Ĺ��ܣ����Դ���һ����������
*/

class PersonDemo3
{
	public static void main(String args[])
	{
		Person p1=new Person(20);
		Person p2=new Person(25);
		boolean b=p1.compare(p2);//��ʱp1�ڵ��øú�����p2��Ϊ�������롣
		System.out.println(b);//boolean����Ҫ�����ӡ�ġ�
	}
}
