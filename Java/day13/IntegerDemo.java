/*
基本数据类型对象包装类。

byte			Byte
short		Short
int			 Integer
long			 Long
boolean	 Boolean
float			 Float
double		 Double
char			 Character

基本数据类型对象包装类的最常用作用
就是用于基本数据类型和字符串类型之间做转换

基本数据类型转成字符串
	1.基本数据类型+""

	2.基本数据类型.toString(基本数据类型值);

	如：Integer.toString(34);//将34整数变成字符串“34”

字符串转成基本数据类型（文本框中的数据全部为字符串）
	1. xxx a=Xxx.parseXxx(string);
	    如：int a=Integer.parseInt("122");//通过静态直接调用
	
	double d=Double.parseDouble("12.23");
	
	boolean b=Boolean.parseBoolean("true");
		
		Integer i=new Integer("123");//通过建立对象，再调用。
		int num=i.intValue();

十进制转换为其他进制
	toBinaryString();2
	toHexString();16
	toOctalString();8

其他进制转换为十进制
	parseInt(String);
	parse(String,radix);后面的radix指的是将字符串看作是几进制的数。进而转换为10进制的数。
*/
class  IntegerDemo
{
	public static void main(String[] args) 
	{
		//整数类型的最大值
		//sop("int max:"+Integer.MAX_VALUE);
		//将一个字符串转换成整数
		int num=Integer.parseInt("110",2);
		//int num=Integer.parseInt("a123");发生数字格式异常。必须传入数字格式的字符串。
		sop(num+"");
		//sop("num="+(num+4));
		sop(Integer.toBinaryString(-6));//二进制
		sop(Integer.toHexString(60));//十六进制3c
		
	}
		public static void sop(String str)
	{
		System.out.println(str);
	}
}
