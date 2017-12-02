/*
泛型（Generic）：JDK1.5版本以后出现新特性。用于解决安全问题，是一个安全机制。

	好处：
			1.将运行时期出现问题ClassCastException转移到了编译时期。
			方便程序员解决问题，让运行事情问题减少。
			

			2.避免了强制转换麻烦。
			ArrayList<String>al=new ArrayList<String>();//制定这是一个装String类型数据的容器。
			Iterator <String>it=al.iterator();//将迭代器也设为String类型。

*/
class  GenericDemo
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
