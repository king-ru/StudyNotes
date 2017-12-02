/*
多态的好处：方便同时调用多个对象，以前是分别调用对象做事情，现在可以调用一批对象做事情。

基础班学生：
	学习，睡觉
高级班
	学习，睡觉

可以对这两类事物进行抽取。
*/
abstract class Student
{
	public abstract void study();
	public void sleep()
	{
		System.out.println("躺着睡");
	}
}
class BaseStudent extends Student
{
	public void study()
	{
		System.out.println("basestudy");
	}
	public void sleep()
	{
		System.out.println("坐着睡");
	}
}
class AdvStudent extends Student
{
	public void study()
	{
		System.out.println("advstudy");
	}
}
class DoStudent
{
   public void doSome(Student stu)
	{
		stu.study();
		stu.sleep();

	}
}
class  DuoTaiDemo3
{
	public static void main(String[] args) 
	{
		DoStudent bs=new DoStudent();
		DoStudent as=new DoStudent();

		bs.doSome(new BaseStudent() );
		as.doSome(new AdvStudent() );
		
	}
	
}
