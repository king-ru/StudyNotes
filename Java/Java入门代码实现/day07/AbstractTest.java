/*
���������ڿ���ϵͳʱ��Ҫ��Ա�����н�ģ��Ա������3�����ԣ�
���� ���� ���ʡ�����Ҳ��Ա����������Ա���������⣬���⻹��һ���������ԡ�
���ü̳е�˼����Ƴ�Ա����;����ࡣ��Ҫ�������ṩ��Ҫ�ķ����������Է��ʡ�


Ա���ࣺname ID pay
�����ࣺ�̳���Ա�� �����Լ����еĽ���bonus������



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
	public abstract void work();//����������Ϊ���߶���������������ͬ


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
