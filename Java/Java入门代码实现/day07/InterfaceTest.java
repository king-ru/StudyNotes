/*
接口的特点：
1.接口是对外暴露的规则。
2.接口是程序的功能拓展。
3.接口减低了内部关系的耦合性。
4.一个类可以实现多个接口。
5.类与接口之间是实现关系，而且类可以继承一个类的同时实现多个接口。
6.接口与接口之间可以有继承关系。

接口和继承的区别：
共性功能在类中，用于继承;
不共性功能在接口中，用于对象功能的拓展。
*/



abstract class Student
{
	abstract void study();
	void sleep()
	{
		System.out.println("sleep");
	}

}
interface Smoking
{
	void smoke();
}
class ZhangSan extends Student implements Smoking//方便举例，实际不会讲zhangsan定义成一个类
{
	void study(){}
	public void smoke(){}
}
class  LiSi extends Student
{
		void study(){}
}

class InterfaceTest
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
