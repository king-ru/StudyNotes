/*
��ϰ��
��dsjfpwoerpiacvbm����ȡ���ַ����и���ĸ���ֵĴ�����

ϣ����ӡ�����a() d().....

ͨ��������֣�ÿһ����ĸ���ж�Ӧ�Ĵ�����˵����ĸ�ʹ���֮���ж�Ӧ��ϵ��
						����ӳ���ϵMap���ϡ�

˼·��
1.���ַ���������ַ����顣��ΪҪ��ÿһ����ĸ���в�����

2.����һ��Map���ϣ���Ϊ��ӡ�������ĸ��˳������ʹ��TreeMap���ϡ�

3.�����ַ�����
	��ÿһ����ĸ��Ϊ��ȥ��Map���ϡ�
	�������Ϊnull������ĸ��1����Map���ϡ�
	������ز���null��˵������ĸ��Map�������Ѿ����ڲ������Ӧ�Ĵ�����
	��ô�ͻ�ȡ�ô���������������Ȼ�󽫸���ĸ��������Ĵ������뵽Map�����У�����ԭ��������Ӧ��ֵ��

4.��Map�����е����ݱ��ָ�����ַ�����ʽ���ء�


ע�⣺�����������õ��ǻ����������͵����á�
		Ҫ�ҵ��������ݵ����Ͱ�װ�ࡣ
		char����character
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
		//�û������洢������ת��Ϊ�ַ�����
		StringBuilder sb=new StringBuilder();

		Set<Map.Entry<Character,Integer>> entrySet=tm.entrySet();//���͵�Ƕ��ʹ�á�

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
  ��������ʹ�õ��ܽ᣺	(String StringBuilder StringBuffer)		   
								
								1.���Ҫ���������������� = String

��������������			2.���̲߳����ַ��������� �²����������� = StringBuilder����Ϊ���ã�

������������������	3.���̲߳����ַ��������� �²����������� = StringBuffer

 
*/