//封装（Ecapsulation）：是对隐藏对象的属性和实现细节，仅对外提供公共访问方式。
/*
private（隐藏的最小权限）:私有，权限修饰符，用于修饰类中的成员（成员变量和成员函数）；
私有只在本类中有用。。
这样age私有化之后，类之外即使建立了对象，也不能访问，需要在person类中提供对应访问age的方法。
//注意：私有仅仅是封装的一种表现形式。


//之所以对外提供访问方式，是因为可以在访问方式中加入逻辑判断语句，
   对访问的数据进行操作，提高代码健壮性。
*/
//成员变量存储在堆内存中，不初始化时都是有默认初值的，可以直接进行运算。
//局部变量存储在栈内存中，必须初始化，不能直接参与运算。栈中还包含了函数。
class person//一般对属性都要进行隐藏
{
	private int age;//在定义成员类中，是不允许直接对对象进行判断的，除非有函数
	public void setAge(int a)//方法名由多个单词组成时，第一个单词首字母小写，以后的每个单词首字母都大写。
	{
		
		if(a>0&&a<130)//一个属性一般对应两种方法:重置和获取（ setAge  getAge ）；
		{
			age=a;//这里的age不是私有的age,而是传入对象即p的age.
			speak();
		}
		else
			System.out.println("no");
	}
	public int getAge()
	{
		return age;
	}
	void speak()
	{
		System.out.println("age="+age);//初始化为0
	}
}
class personDemo
{
	public static void main(String args[])
    {
		person p=new person();
		//p.age=20;
		//p.speak();
		//将age私有化之后，p.age就是错的，不能直接进行访问。
		p.setAge(20);
		/*int age = p.getAge();
		System.out.println(age);*/
		
		

	
	}
}
