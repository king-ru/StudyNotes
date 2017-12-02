/*
StringBuffer是字符串缓冲区。

是一个容器。
特点：（当数据长度以及类型是不确定的情况下，缓冲器比数组要方便。）
1.而且长度是可变化的。
2.可以一次操作多个数据类型。
3.最终会通过toString（）方法变成字符串。
C create U update R read D delete
//增删改查

1.存储。
	StringBuffer append();将指定数据作为参数添加到已有数据结尾处。
	StringBuffer insert(index,数据);可以将数据插入到指定index位置。

2.删除。
	StringBuffer delete(start,end);删除缓冲区中的数据，包含start，不包含end。
	StringBuffer deleteCharAt（index）；删除指定位置的字符。

3.获取。
	char charAt(int index);
	int indexOf(String str);
	int lastIndexOf(String str);
	int length();
	String substring(int start ,int end);

4.修改。
	StringBuffer replace(start,end,string);
	void setCharAt(int index,char ch);//直接替换，不返回任何值。

5.反转
	StringBuffer reverse();

6.将缓冲区中指定数据存储到指定容器（字符数组）中。
	void getChars(int srcBegin(字符串开始的字符角标),int srcEnd（字符串结束的字符角标）,char[] dst（目的地数组）,int dstBegin（目的地数组开始存储的角标）) 。

jdk1.5版本之后出现了StringBuilder。

StringBuffer是线程同步的。
StringBuilder是线程不同步的。（建议使用，不用判断锁，不安全）

升级三方面因素：
提高效率。
简化书写。
提高安全性。
*/
class  StringBufferDemo
{
	public static void method_update()
	{
		StringBuffer sb=new StringBuffer("abcde");
		sb.replace(1,4,"java");
		sop(sb.toString());
	} 
	public static void method_add()
	{
		StringBuffer sb=new StringBuffer();
		sb.append(34).append(true).append("abc");//方法调用链，方法返回本类对象，继续调用本类方法。
		//StringBuffer sb1=sb.append(34);
		//sop("sb==sb1"+(sb==sb1));
		sb.insert(1,"qq");
		sop(sb.toString());
		//sop(sb1.toString());
	}
	public static void method_del()
	{
		StringBuffer sb=new StringBuffer("abcder");
		//sb.delete(1,3);
		//清空缓冲区。
		//sb.delete(0,sb.length());
		sop(sb.toString());
	}
	public static void method_6()
	{
		StringBuffer sb=new StringBuffer("abcde");
		char[] chs=new char[6];
		sb.getChars(1,4,chs,1);
		for(int x=0;x<chs.length;x++)
		{
			sop("chs["+x+"]="+chs[x]);
		}
	}
	public static void main(String[] args) 
	{
		method_add();
		method_del();
		method_update();
		method_6();
	}
	
	public static void sop(String str)
	{
		System.out.println(str);
	}
}
