/*
��̬�ĺô�������ͬʱ���ö��������ǰ�Ƿֱ���ö��������飬���ڿ��Ե���һ�����������顣

������ѧ����
	ѧϰ��˯��
�߼���
	ѧϰ��˯��

���Զ�������������г�ȡ��
*/
abstract class Student
{
	public abstract void study();
	public void sleep()
	{
		System.out.println("����˯");
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
		System.out.println("����˯");
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
