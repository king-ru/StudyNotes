/*
Object:�����ж����ֱ�ӻ��߼�Ӹ��࣬��˵�е��ϵ�
�����ж���Ŀ϶������ж��󶼾߱��Ĺ���...

Object�����Ѿ��ṩ�˶Զ����Ƿ���ͬ�ıȽϷ�����û�б�Ҫ���¶��塣
ֻҪ��Ϯ�����еĹ��ܣ������Լ����бȽ����ݼ��ɡ�����Ǹ��ǡ�

*/
class Demo //extends object
{
	private int num;
	Demo(int num)
	{
		this.num=num;
	}
	public boolean equals(Object obj)//Object obj=new Demo();
	{
		Demo d=(Demo)obj;
		return this.num==d.num;
	}
}
class  ObjectDemo
{
	public static void main(String[] args) 
	{
		Demo d1=new Demo(4);
		Demo d2=new Demo(4);
		System.out.println(d1.equals(d2));
	}
}
