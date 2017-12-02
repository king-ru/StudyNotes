import java.util.*;

/*
去除ArrayList集合中的重复元素。定义一个临时容器，运用迭代器遍历进行判断。
equals方法比较的是对象的地址。

*/
class  ArrayListTest
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
	public static void main(String[] args) 
	{
		ArrayList Al=new ArrayList();
		Al.add("java001");
		Al.add("java002");
		Al.add("java001");
		Al.add("java002");
		Al.add("java001");
		Al.add("java003");
		
		sop(Al);

		Al=singleElements(Al);
		sop(Al);
	}

	public static ArrayList singleElements(ArrayList al)
	{
		//定义一个临时容器。
		ArrayList newAl=new ArrayList();
		Iterator it=al.iterator();

		while(it.hasNext())//特有的迭代器遍历。
		//在迭代时循环中next调用一次，就要hasNext判断一次。如果是sop(it.next()+"...."+it.next())则一次取出2个元素，很容易出现noSuchElementException。。
		{
				Object obj=it.next();

				if(!newAl.contains(obj))
					newAl.add(obj);
		}

		return newAl;
	}
}