class Person//注：在创建对象中不要（）
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
	  public static void showCountry()//静态方法存在于方法区中，不访问堆内存中的数据。通过类名直接在方法区中调用。
	{
		System.out.println("country="+country);
		method();
		//一定要注意，静态里面没有this，因为静态优先于对象存在。通过类名调用。country前面省略的是Person.
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

该句话都做了什么事情？
1.因为new用到了person.class，所以先会找到Person.class文件并加载到内存中。
2.执行该类中的static代码块，如果有的话，给Person.class类进行初始化。
   static//静态代码块给类进行初始化。
	{
		System.out.println("a");
	}
3.在堆内存中开辟空间，分配内存地址。
4.在堆内存中建立对象的特有属性，并进行默认初始化。
5.对属性进行显示初始化。（即在初始类中进行的属性初始化）
6.对对象进行构造代码块初始化。
//构造代码块，给对象进行初始化。
	{
		System.out.println("c");
	}
7.对对象进行对应的函数初始化。（构造函数初始化）
8.将内存地址赋给栈内存中p变量。
*/


/*注：主函数中的方法以及创建的对象在栈内存中。
          对象的非静态属性存在于堆内存中。
		  用于给对象初始化的方法以及对象的静态属性存在于方法区中。
*/