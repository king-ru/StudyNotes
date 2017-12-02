import java.util.*;
/*

ClassCastException：类型转换异常。
Set:无序，不可以重复元素。
		|--HashSet：数据结构是哈希表，线程是非同步的。
							保证元素唯一性的原理，判断元素的hashcode值是否相同。
							如果相同，还会继续判断元素的equals方法，是否为true。
		
		|--TreeSet：可以对Set集合中的元素进行排序。
							底层数据结构是二叉树。和哈希值没有关系。
							保证数据唯一性的依据：compareTo方法return 0。返回0就代表不会存进去。
							

							TreeSet排序的第一种方式：让元素自身具备比较性。
							元素需要实现Comparable接口，覆盖CompareTo方法。
							这种方式也成为元素的自然顺序，或者叫做默认顺序。

							TreeSet的第二种排序方式：
							当元素自身不具备比较性时，或者具备的比较性不是所需要的。
							这时需要让集合自身具备比较性。都和集合标准相比。
							在集合一初始化时，就有了比较方式。
			当两种比较方式都存在时，以比较器为主。

			比较器实现原理：
			定义一个类实现comparator接口，覆盖compare方法。


		需求：往TreeSet集合中存储自定义对象学生。
		想按照学生的年龄进行排序。
		

		记住：排序时，当主要条件相同时，一定要判断一下次要条件。
*/
class  TreeSetDemo
{
	public static void main(String[] args) 
	{
		TreeSet ts=new TreeSet();

		ts.add(new Student("lisi02",22));
		ts.add(new Student("lisi007",20));
		ts.add(new Student("lisi09",19));
		ts.add(new Student("lisi088",22));
		//ts.add(new Student("lisi02",22));
		Iterator it=ts.iterator();
		while(it.hasNext())
		{
			Student s=(Student)it.next();//it.next()返回的是object类，要进行强制类型转换，转换成student类型才可以调用其特有的getName和getAge方法。
			System.out.println(s.getName()+"....."+s.getAge());
		}

	}
}
class Student implements Comparable//该接口强制让学生具备比较性。
{
	private String name;
	private int age;
	Student(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	//下面该方法是底层自行调用
	public int compareTo(Object obj)
	{
		if(!(obj instanceof Student))
			throw new RuntimeException("不是学生对象");

		Student s=(Student)obj;//进项强制类型转换，比较年龄，姓名。

		System.out.println(this.name+"...compareto..."+s.name);//通过输出的方式显示出如何进行比较的。
		//**this，指的是此时自行调用该方法的对象，s指的是this调用该方法时传入的另一个比较对象。第一个元素作为参数传入，第二个元素自行调用compare方法。

		if(this.age>s.age)//实现的是按年龄从小到大进行排序的功能。 
			return 1;

		if(this.age==s.age)
			return this.name.compareTo(s.name);//如果相同时，则不会增加进去。
	    return -1;//不用else。
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
}
/*
如何存储的如何取出：将compareTo方法里面的代码换成1；因为排序的时候只和返回的结果有关，取的时候默认从小到大进行取出。
将其换成-1，就会倒序取出。
*/