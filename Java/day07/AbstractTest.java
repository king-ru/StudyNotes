/*
假如我们在开发系统时需要对员工进行建模，员工包含3个属性；
姓名 工号 工资。经理也是员工，除了有员工的属性外，另外还有一个奖金属性。
请用继承的思想设计出员工类和经理类。。要求类中提供必要的方法进行属性访问。


员工类：name ID pay
经理类：继承了员工 并有自己特有的奖金（bonus）属性



*/
class Employee
{
	private String name;
	private String id;
	private double pay;

	Employee(String name,String id,double pay)
	{
		this.name=name;
		this.id=id;
		this.pay=pay;
	}
	public abstract void work();//抽象函数。因为两者都工作，但工作不同


}
class Manager extends Employee
{
	private int bonus;
	Manager(String name,String id,double pay,int bonus)
    {
		super(name,id,pay);
		this.bonus=bonus;
	}
	public void work()
	{
		System.out.println("Manager work");
	}
}
class Pro extends Employee
{
	Pro(String name,String id,double pay)
    {
		super(name,id,pay);
		
	}
	public void work()
	{
			System.out.println("Pro work");
	}
}
class AbstractTest 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}

}
