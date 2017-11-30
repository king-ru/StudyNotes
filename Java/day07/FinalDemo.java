/*
final:最终。最为一个修饰符。
1.可以修饰类，函数，变量。
2.被final修饰的类不能被继承。为了避免被继承，被子类复写功能。
3.被final修饰的方法不能被复写。
4.被final修饰的变量是一个常量只能赋值一次，既可以修饰成员变量，也可以修饰局部变量。
   当在描述事物时，一些数据的出现值是固定的，那么这时为了增强阅读性，都给这些值起个名字，方便于阅读。
   而这个值不需要改变，所以加上final修饰。
   作为常量，常量的书写规范：所有字母都大写，如果由多个单词组成，单词间通过__连接。
5.内部类定义在类中的局部位置上时，只能访问该局部被final修饰的局部变量。


目前类的修饰符有3种：public final 默认即没有。
*/
 class Demo
{
	final int x=3;
	public static final double MY_PAI=3.14;
	final void show1()
	{}
    void show2()
	{
		final int y=4;
	}
}
class SubDemo extends Demo
{
	void show2();
}
class FinalDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
