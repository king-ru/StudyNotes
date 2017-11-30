/*
单例设计模式：
*/
/*
饿汉式：
class Single
{
	private static Single s=new Single();
	private Single(){}
	public static Single getInstance()
	{
		return s;
	} 
}


饿汉式：（面试主要点）（延迟加载的单例设计模式）
class Single
{
	private static Single s=null;
	private Single(){}
	public static  Single getInstance()
	{
		if(s==null)//在这里通过加双重判断语句可以减少判断锁的次数，提高了运行速率。
        {
			synchronized(Single.class);
			if(s==null)
				s=new Single();
				
        }
		return s;
	}
}

懒汉式问题：多线程访问时会出现安全问题。
解决方法：加同步：
1.同步函数和同步代码块都可以，但运行效率较低。
2.通过加双重判断语句可以减少判断锁的次数，提高了运行速率。
3.加的锁：该类所属的字节码对象。即类名.class。
*/

class  
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
