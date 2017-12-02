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




2.判断
*/

class StringMethodDemo 
{
	public static void method_get()
	{
		String str="abcdefg";
		
		//长度
		sop(str.length());
		
		//根据索引获取字符
		sop(str.charAt(4));//当访问到字符串中不存在的角标时会发生StringIndexOutBoundsException

		//根据字符获取索引
		sop(str.indexOf('b',3));
	}
	public static void main(String[] args) 
	{
		method.get();
	}
	public void sop(Object obj)
	{
		System.out.println(obj);
	}
}
