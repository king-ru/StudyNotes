/*
构造函数的特点：
1.函数名与类名相同。
2.不用定义返回值类型。
3.不可以写return语句。
*/

/*
对象一建立就会调用与之对应的构造函数。
构造函数的作用：可以用于给对象进行初始化。只能是初始化。
构造函数的小细时节：当一个类中没有定义构造函数，那么系统会默认给该类加入一个空参数的构造函数。
构造函数和一般函数在写法上不同，在运行上也有不同。
构造函数是在对象一建立就运行，给对象初始化。
而一般方法是对象调用才执行，是给对象添加对象具备的功能。

一个对象建立，构造函数只运行一次。
而一般方法可以被对象调用多次。
..什么时候定义构造函数呢？
当分析事物时，该事物存在具备一些特性或行为，那么将这些内容定义在构造函数中。

*/
class Person//注：在创建对象中不要（）
{
	private String name;
	private int age;
	/*
	构造代码块：
	作用：给对象进行初始化，对象一建立就运行，而且优先于构造函数执行。
	和构造函数的区别：构造代码块是给所有对象进行统一初始化，
	而构造函数是给  对应  的对象初始化。用不同的方式进行初始化。
	构造代码块中定义的是不同对象共性的初始化内容。
	*/
	{
		System.out.println("person code run");
		cry();
	}
	Person(int age)
	{
		this.age=age;
	}
	//可以构造多个构造函数对对象进行不同的初始化。
	Person()
	{
		//Person(){} 
		System.out.println("A:name="+name+"age="+age);
	}
	Person(String name)
	{
		this.name=name;//this关键字：看上去是用与区分局部变量和成员变量的
		/*
		this语句作用一：1.this代表本类中的对象.代表所在函数所属对象的引用，简单说，哪个对象在调用this所在的函数，this就代表哪个对象
		*/
		/*this的应用：当定义类中功能时，该函数内部要用到调用该函数的对象时，这时用this表示这个对象。
								但凡本类功能内部使用了本类对象，都用this. 	表示。。
		*/
		//此时this就代表p1;
		System.out.println("B:name="+name+"\n"+"age="+age);
	}
	Person(String name, int a)
	{
		this.name=name;
		age=a;
		System.out.println("C:name="+name+"age="+age);
	}
	public void cry()//方法函数，执行动作，和构造函数不同
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
	需求：给人定义一个用于比较年龄是否相同的功能。
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
		//Person p1=new Person("chenru");//但凡出现new即创建了一个新的对象
		/*p1.cry();
		p1.cry();
		Person p2=new Person("Lisi");
		Person p3=new Person("Lisi",11);
		p3.setAge(12);*/
	//}
//}
/*
需求：判断是否是同龄人，注：这是一个人的功能，所以传入一个参数即可
*/

class PersonDemo3
{
	public static void main(String args[])
	{
		Person p1=new Person(20);
		Person p2=new Person(25);
		boolean b=p1.compare(p2);//此时p1在调用该函数，p2作为参数传入。
		System.out.println(b);//boolean型需要输出打印的。
	}
}
