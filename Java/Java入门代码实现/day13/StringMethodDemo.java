/*
String类适用于描述字符串事物。
那么它就提供了多个方法对字符串进行操作。

常见的操作有哪些？
"abcd"

1.获取
	1.1字符串中包含的字符数，也就是字符串的长度。
		int length（）：获取长度。
	1.2根据位置获取位置上的某个字符。
		char charAt（int index）：
	1.3根据字符获取该字符在字符串中的位置。
		int indexOf（int ch //字符的AsIC码值）：返回的是ch在字符串中第一次出现的位置。
        int indexOf（int ch，int fromIndex）：从fromIndex指定位置开始，获取ch在字符串中出现的位置。注意此时角标值不发生改变，只是第一次发生的位置发生了改变。
		
		int indexOf（String str //如“abcd”中的“ab”）：返回的是str在字符串中第一次出现的位置。
        int indexOf（String str，int fromIndex）：从fromIndex指定位置开始，获取str在字符串中出现的位置。

		int indexOf（int ch)


2.判断
	2.1 字符串中是否包含某一个子串。
		boolean contains(str);
		特殊之处：indexOf(str);可以索引str第一次出现的位置；如果返回-1，表示该str不存在于该字符串中。
						所以，也可用于对指定判断是否包含。
						if(str.indexOf("aa")!--1)

						而且该方法即可以判断，又可以获取出现的位置。
	2.2 字符串中是否有内容。
		boolean isEmpty();原理判断长度是否为0；
	2.3字符串中是否是以指定内容开头。
		boolean startsWith();
	2.4字符串中是否是以指定内容结尾。
		boolean endsWith();
	2.5 判断字符串的内容是否相同，复写了Object类中的equals方法。
		boolean equals(str);
	2.6 判断内容是否相同，并忽略大小写。
		boolean equalsIgnoreCase();
3.转换
	3.1将字符数组转换为字符串
		构造函数：String(char[])
						String(char[],offset,count):将字符数组中的一部分转成字符串。offset,起始位；count，个数。
		静态方法：
					static String copyValueOf(char[] data,int offset,int count)
					static String valueOf(char[] data)
	3.2将字符串转换为字符数组
		char[] toCharArray()
	3.3将字节数组转换为字符串
		String(byte[])
		String(byte[],offset,count):
	3.4将字符串转换为字节数组
		特殊：字符串和字节数组在转换过程中，是可以指定编码表的。
	3.5将基本数据类型转成字符串
		static String valueOf（int）
		static String valueOf（double）
4.替换
	String replace(oldchar,newchar);
	可以替换字符或者字符串。
5.切割
	String[] split(reget);//reget标识符切割
6.子串。获取字符串中的一部分。
	String substring(begin);
	String substring(begin,end);
	
7.转换，去除空格，比较。

	7.1将字符串转换成大写或者小写。
		String toUpperCase();
		String toLowerCase();

	7.2将字符串两端的多个空格去除。
		String trim();

	7.3对两个字符串进行自然顺序的比较。
		int compareTo(String);
*/

class StringMethodDemo 
{
	public static void method_trans()
	{
		char[] arr={'a','b','c','d','e'};
		String s=new String(arr,1,3);
		sop("s="+s);

		String s1="asdqiuh";
		char[] chs=s1.toCharArray();
		for(int x=0;x<chs.length;x++)//数组输出还是要用循环。
		{
			sop("ch="+chs[x]);
		}
	}
	public static void method_is()
	{
		String str="ArrayDemo.java";
		sop(str.startsWith("Array"));
		sop(str.endsWith(".java"));
		sop(str.contains("Demo"));
	}
	public static void method_get()
	{
		String str="abcdefg";
		
		//长度
		sop(str.length());
		
		//根据索引获取字符
		sop(str.charAt(4));//当访问到字符串中不存在的角标时会发生StringIndexOutBoundsException

		//根据字符获取索引
		sop(str.indexOf('b',3));//如果没有找到，返回-1.

		//反向索引一个字符出现的位置。
		sop(str.lastIndexOf('a'));

	}
	public static void method_replace()
	{
		String s="hello java";
		//String s1=s.replace('a','n');//如果要被替换的字符不存在，返回的还是原串。
		String s1=s.replace("java","world");
		sop("s="+s);
		sop("s1="+s1);
		}
	public static void method_split()
	{
		String s="zhangsan,lisi,wangwu";
		String[] arr=s.split(",");//字符串数组。注：此时，将作为字符串，而不是字符。
		for(int x=0;x<arr.length;x++)//数组输出还是要用循环。
		{
			sop("ar="+arr[x]);
		}

	}
	public static void method_sub()
	{
		String s="asdardq";
		sop(s.substring(2));//从指定位置开始到结尾.如果角标不存在，会出现字符串角标越界异常。
		sop(s.substring(2,4));//包含头不包含尾。s.substring(0,s.length());
	}
	public static void method_7()
	{
		String s="   Hello Java   ";
	    sop(s.toLowerCase());
	    sop(s.toUpperCase());
		sop(s.trim());

		String s1="a1c";
		String s2="aaa";
		sop(s1.compareTo(s2));
		//大于返回>0的数,小于返回<0的数。相等就为0.（并且返回的数为第一个不相同字符的差值）
	}
	public static void main(String[] args) 
	{
		method_get();
		method_is();
		method_trans();
		method_replace();
		method_split();
		method_sub();
		method_7();
	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
 