/*
接口：初期理解，可以认为是一个特殊的抽象类，
			当抽象类中的方法都是抽象的，那么该类可以通过接口的形式来表示。
class用于定义类。
interface用于定义接口。


接口定义时，格式特点：
1.接口中常见定义：常量，抽象方法。
2.接口中的成员都有固定修饰符。
	常量：public static final(全局常量)
	方法：public abstract

记住：接口中的成员都是public的。

类继承类：父类中有一些非抽象的函数可以直接拿来用。
类实现（implements）接口：接口中都是抽象的方法，类必须复写功能才能将其实例化，实现功能。

接口是不可以创建对象的，因为有抽象方法。
需要被子类实现，子类对接口中的抽象方法全都覆盖后，子类才可以实例化。
否则子类是一个抽象类。

接口可以被类多实现（即一个类可以调用多个接口），也是对多继承不支持的转换形式。Java支持多实现。

接口和接口之间支持多继承，但同名方法的返回值必须相同。

类和类之间不支持多继承的原因：
1.若子类继承的父类中拥有相同的成员变量，子类在引用该变量时将无法判别使用哪个父类的成员变量。
2.若子类继承的父类中拥有相同的成员变量，子类在引用该变量时将无法判别使用哪个父类的成员变量。

接口和接口之间支持多继承的原因：
1.引用静态变量，常量，一般直接使用类名或接口名，从而避免产生歧义，因此也不存在多继承的第一个缺点.
2.接口是一个特殊的抽象类，接口中成员变量均默认为 static final 类型，即常量，且接口中的方法都为抽象的，都没有方法体。 具体方法只能由实现接口的类实现，在调用的时候始终只会调用实现类的方法（不存在歧义），因此不存在多继承的第二个缺点；
*/
interface Inter
{
	public static final int NUM=3;
	public abstract void show();
		//如果少写了，系统会自动补上。。
}
interface Inter1
{
	public static final int NUM=52;
	public abstract void show();
}
class Demo
{
	public void function(){}
}
class Test extends Demo implements Inter,Inter1
{
	 public void show(){}
	//public abstract void method(){}
} 

interface A
{
	public abstract void methodA();
}
interface B //extends A
{
	public abstract void methodB();
}
interface C  extends B,A
{
	public abstract void methodC();
}
class D implements C
{
	//要覆盖3个方法
	public void methodA(){}
	public void methodB(){}
	public void methodC(){}

}

class  InterfaceDemo
{
	public static void main(String[] args) 
	{
		//Test t=new Test();
		//System.out.println(t.NUM);//对象调用成员
		//System.out.println(Test.NUM);//类调用成员
		System.out.println(Inter.NUM);
		System.out.println(Inter1.NUM);
		//System.out.println("123");
	}
}

