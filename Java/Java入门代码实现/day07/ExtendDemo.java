/*
将学生和工人的共性提取出来，单独进行描述.
只要让学生和工人与单独描述的这个类有关系，就可以了。

继承:
1.提高了代码的复用性；
2.让类于类之间产生了关系。有了这个关系，才有了多态的特性。

注意：千万不要为了获取其他类的功能，简化代码而继承。
必须是类与类之间有所属关系才可以继承，所属关系 。即子类必须具备父类的全部内容。


Java语言中：Java只支持单继承，不支持多继承。（即一个类只能继承一个类）
因为多继承容易带来安全隐患。.当多个父类中定义了相同功能，当功能内容不同时，不确定要运行哪一个。
但是Java保留了这种机制，并用另一种体现形式来完成表示，多实现。

Java支持多层继承（C继承B B继承A）也就是一个继承体系。

如何使用一个继承体系中的功能？

想要使用体系，先查阅体系父类的描述，因为父类中定义的是该体系中的共性功能。
通过了解共性功能，就可以知道该体系的基本功能。
那么，这个体系功能就可以基本使用了。
那么在具体调用时，要创建最子类的对象。
原因：1.有可能是父类不能创建对象。
2.创建子类对象可以使用更多的功能。

简单一句话：查阅父类功能，创建子类对象使用功能。

class A
{
	void show()
	{
		System.out.println("a");
	}
}
class B
{
	void show()
	{
		System.out.println("b");
	}
}
class C extends A,B
{
	
}
C c=new C();
c.show();


聚集关系：has（其中一员） 分为2种

聚合：紧密程度小

组合：紧密程度较大

*/

class Person
{
   String name;
	int age;
}

class Student extends Person
{
	//String name;
	//int age;
	void study()
	{
		System.out.println("good study");
	}
}
class Worker extend Person
{
	//String name;
	//int age;
	void work()
	{
		System.out.println("good work");
	}
}
class ExtendDemo 
{
	public static void main(String[] args) 
	{
		Student s=new Student();

	}
}
