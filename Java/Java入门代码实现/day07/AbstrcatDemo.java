/*
当多个类中出现相同功能，但是功能主体不同。
这是可以进行向上抽取。这时只抽取功能定义，而不抽取功能主体


抽象：看不懂

抽象类的特点：
1.抽象方法一定定义在抽象类中。
抽象方法和抽象类都必须被abstrcat关键字修饰。
3.抽象类不可以用new创建对象，因为调用抽象方法没意义。
4.抽象类中的抽象方法要被使用，必须由子类复写起所有的抽象方法后，建立子类对象调用。
   如果子类只覆盖了部分抽象方法，那么该子类还是一个抽象类。
*/
abstract class Student
{
	abstract void study();//abstract 意为抽象，没有执行体；
}
class BaseStudent extends Student
{
	void study()
	{
		System.out.println("study");
	}
}
class AdvStudent extends Student
{
	void study()
	{
		System.out.println("adv study");
	}

}

class AbstractDemo 
{
	public static void main(String[] args) 
	{
		new BaseStudent().study();
	}
}
