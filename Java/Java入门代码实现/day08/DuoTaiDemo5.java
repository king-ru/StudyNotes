/*
需求：
电脑运行实例：
电脑运行基于主板(定义一个准则)
*/
interface PCI//提高功能扩展性
{
	public void open();
	public void close();
}
class MainBoard
{
	public void run()
	{
		System.out.println("mainboard run");
	}
   public void usePCI(PCI p)//PCI p=new NetCard();//接口型引用指向自己的子类对象。
   {
	   if(p!=null)
	  {
		p.open();
		p.close();
	  }
   }
}
   class NetCard implements PCI
{
	public void open()
	{
		System.out.println("net open");
	}
	public void close()
	{
		System.out.println("net close");
	}
}
 class SoundCard implements PCI
{
	public void open()
	{
		System.out.println("sound open");
	}
	public void close()
	{
		System.out.println("sound close");
	}
}
/*
class MainBoard
{
	public void run()
	{
		System.out.println("mainboard run");
	}
	public void useNetCard(NetCard c)
	{
		c.open();
		c.close();
	}
}
class NetCard
{
	public void open()
	{
		System.out.println("net open");
	}
	public void close()
	{
		System.out.println("net close");
	}
}
*/
class  DuoTaiDemo5
{
	public static void main(String[] args) 
	{
		MainBoard mb=new MainBoard();
		mb.run();
		//PCI p=new NetCard();  接口是不能创建对象的，因为有抽象类，建立对象无意义。

		mb.usePCI(new NetCard());
		mb.usePCI(new SoundCard());
	}
}
