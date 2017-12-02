import java.util.*;
/*
泛型位置：类泛型：类名的后面。
				方法泛型：public后面。

为了让不同方法可以操作不同类型，而且类型还不确定。
那么可以将泛型定义在方法上。比类泛型更加灵活，方便。

特殊之处：
静态方法不可以访问类上定义的泛型。
如果静态方法操作的应用数据类型不确定，可以将泛型定义在方法上。
*/
class Demo <T>//在建立对象后才明确
{
	public void show(T t)//类泛型
	{
		System.out.println("show..."+t);
	}
	public <Q> void print(Q q)//方法泛型
	{
		System.out.println("print..."+q);
	}
	
	public static <W> void method(W t)
	{
		System.out.println("method..."+t);
	}
	
}
class  GenericDemo4
{
	public static void main(String[] args) 
	{
		Demo <String>d=new Demo<String>();
		d.show("hahha");
		//d.show(new Integer(4));
		d.print("dashdiu");
		d.print(new Integer(4));
		d.method("123");
	}
}
