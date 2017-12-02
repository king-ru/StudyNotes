import java.util.*;
/*
什么时候定义泛型类？
当类中要操作的数据类型不确定的时候，
早期定义Object来完成扩展，但必须要进行强制类型转换，有很大的安全隐患（编译通过，但却无法运行）
现在定义泛型类来完成扩展。(好处：避免了强转，将错误转移到了编译时期)


局限性：在声明数据类型后，在整个类中有效。则对象只能操作该数据类型，其他的不能操作。
			引进泛型方法。
*/
class Worker
{
}
class Student
{
}
class Utils <QQ>
{
	private QQ qq;
	public void setObject(QQ qq)
	{
		this.qq=qq;
	}
	public QQ getObject()
	{
		return qq;
	}
}
class  GenericDemo3
{
	public static void main(String[] args) 
	{
		Utils<Worker> u=new Utils<Worker>();
		u.setObject(new Worker());
		Worker w=u.getObject();
	}
}
