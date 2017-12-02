/*
Object:是所有对象的直接或者间接父类，传说中的上帝
该类中定义的肯定是所有对象都具备的功能...

Object类中已经提供了对对象是否相同的比较方法，没有必要重新定义。
只要沿袭父类中的功能，建立自己特有比较内容即可。这就是覆盖。

*/
class Demo //extends object
{
	private int num;
	Demo(int num)
	{
		this.num=num;
	}
	public boolean equals(Object obj)//Object obj=new Demo();
	{
		Demo d=(Demo)obj;
		return this.num==d.num;
	}
}
class  ObjectDemo
{
	public static void main(String[] args) 
	{
		Demo d1=new Demo(4);
		Demo d2=new Demo(4);
		System.out.println(d1.equals(d2));
	}
}
