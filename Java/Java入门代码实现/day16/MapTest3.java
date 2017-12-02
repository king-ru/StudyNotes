/*
练习：
“dsjfpwoerpiacvbm”获取该字符串中各字母出现的次数。

希望打印结果：a() d().....

通过结果发现，每一个字母都有对应的次数。说明字母和次数之间有对应关系。
						建立映射关系Map集合。

思路：
1.将字符串换算成字符数组。因为要对每一个字母进行操作。

2.定义一个Map集合，因为打印结果的字母有顺序，所以使用TreeMap集合。

3.遍历字符数组
	将每一个字母作为键去查Map集合。
	如果返回为null，将字母和1存入Map集合。
	如果返回不是null，说明该字母在Map集合中已经存在并有相对应的次数。
	那么就获取该次数并进行自增；然后将该字母和自增后的次数存入到Map集合中，覆盖原来键所对应的值。

4.将Map集合中的数据变成指定的字符串形式返回。


注意：泛型里面运用的是基本数据类型的引用。
		要找到接收数据的类型包装类。
		char——character
		int----integer
*/
import java.util.*;
class  MapTest3
{
	public static void main(String[] args) 
	{
		String s=charCount("faigaihoxcjpawjdasf");
		System.out.println(s);
	}
	public static String charCount(String str)
	{
		char[] chs=str.toCharArray();
		TreeMap<Character,Integer> tm=new TreeMap<Character,Integer>();
		for(int x=0;x<chs.length;x++)
		{
			Integer value=tm.get(chs[x]);
			if(value==null)
			{
				tm.put(chs[x],1);
			}
			else
			{
				value=value+1;
				tm.put(chs[x],value);

			}
		}
		System.out.println(tm);
		//用缓冲区存储，最终转换为字符串。
		StringBuilder sb=new StringBuilder();

		Set<Map.Entry<Character,Integer>> entrySet=tm.entrySet();//泛型的嵌套使用。

		Iterator<Map.Entry<Character,Integer>> it=entrySet.iterator();

		while(it.hasNext())
		{
			Map.Entry<Character,Integer> me=it.next();
			Character key=me.getKey();
			Integer value=me.getValue();
			sb.append(key+"("+value+")");
		}
		return sb.toString();
	} 
}
/*
  对于三者使用的总结：	(String StringBuilder StringBuffer)		   
								
								1.如果要操作少量的数据用 = String

　　　　　　　			2.单线程操作字符串缓冲区 下操作大量数据 = StringBuilder（较为常用）

　　　　　　　　　	3.多线程操作字符串缓冲区 下操作大量数据 = StringBuffer

 
*/