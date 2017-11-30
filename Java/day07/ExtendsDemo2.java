/*
子父类出现后，类成员的特点：

类中成员： 
1.变量。
2.函数。
3.构造函数

1.变量
如果子类中出现非私有的同名成员变量，用this
子类要访问父类中非私有的同名成员变量，用super

super的用法和this的使用几乎一致。
this代表的是本类对象的引用。
super代表的是父类对象的引用。
*/
class Fu
{
  private int num=4;
 
}
class Zi extends Fu
{
	//int num=5;
	void show()
	{
		System.out.println(super.num);
	}
}
class ExtendsDemo2 
 {
	public static void main(String[] args) 
	{
		Zi z=new Zi();
		System.out.println(z.num+"..."+z.num);
	}
}
