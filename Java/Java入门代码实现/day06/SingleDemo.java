/*
设计模式：解决某一类问题最行之有效的方法。
Java中有23种设计模式。
单例设计模式：解决一个类中只存在一个对象。

想要保证对象的唯一性。
1.为了避免其他程序过多建立该类对象。先控制禁止其他程序建立该类对象。
2.还为了让其他程序可以访问到该类对象，只好在本类中，自定义一个对象。
3.为了方便其他程序对自定义对象的访问，可以对外提供一些访问方式。

这三步如何让用代码体现呢?
1.将构造函数私有化。
2.在类中创建一个本类对象。
3.提供一个方法可以获取该对象。


对于事物该怎么描述，还怎么描述。
当需要将该事物的对象保证在内存中唯一时，就将以上的三步加上即可。
*/
class Single//类中的成员一般都要私有化
{
    private int num;
	public void setNum(int num)
	{
		this.num=num;
	}
	public int getNum()
	{
		return num;
	}
	private Single(){}
	private static Single s=new Single();//静态方法只能访问静态成员，故s也要静态化。
	public static Single getInstance()//方法被调用：1.对象调用  2.类名调用。因为没有对象了，只能方法调用，所以要加static。
	{
		return s;//只有一个成员，不需要设置函数了。
	}
}
class SingleDemo
{
	public static void main(String[] args) 
	{
		/*
		Single s1=new Single();//此时Single没有私有化，还可以创建对象，加了private后就不可以new对象了。

		Single s2=new Single();
		s1.setNum(22);
		System.out.println(s2.getNum());//结果是0；没对s2操作，默认初始化为0；
	    */
        Single s1=Single.getInstance();
		Single s2=Single.getInstance();
		s1.setNum(22);
		System.out.println(s2.getNum());

	}
}
/*
三步：
    private Single(){}
	private static Single s=new Single();
	public static Single getInstance()
	{
		return s;
	}
*/
