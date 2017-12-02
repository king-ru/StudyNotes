/*
这个是先初始化对象，称为：饿汉式；开发一般用这个。
single类一进内存，就已经创建好了对象。
CPU每时刻只能进行一个程序，不断在进行任务的切换。切换是随机的。
class Single
{
	private static Single s=new Single();
	private Single(){}
	public static Single getInstance()
	{
		return s;
	} 
}
*/
//对象是方法被调用时，才初始化，也叫对象的延时加载。称为懒汉式；
//single类进内存，对象还没有存在，只有调用了getInstance方法时，才建立对象。
class Single
{
	private static Single s=null;
	private Single(){}
	public static  Single getInstance()//可以加synchronized（同步化的），在一个方法没完全出去时，另一个方法不能调用该对象。
	{
		if(s==null)
        {
			synchronized(Single,class);
			if(s==null)
				s=new Single();
				
        }
		return s;//为什么都执行了new Single 还是一个对象？
	}
//记住原则：定义单例，建议使用饿汉式。
}
class  
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
