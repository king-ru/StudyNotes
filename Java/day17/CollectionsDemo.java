/*
���Ͽ�ܵĹ����࣬collections��
ֱ�ӵ���collection������ķ�����ʵ���ַ���������
����Ϊlist.size();����Ϊarray.length();
*/
import java.util.*;
class  CollectionsDemo
{
	public static void main(String[] args) 
	{
		sortDemo();
	}
	public static void sortDemo()
	{
		List<String> list=new ArrayList<String>();//����һ��String���͵�list���ϡ�

		list.add("abcde");
		list.add("aaa");
		list.add("z");
		list.add("kkkkk");
		list.add("qq");

		sop(list);
		//Collections.sort(list);//���ø÷�������Ĭ�Ϸ����������
		Collections.sort(list,new StrLenComparator());
		sop(list);
		//String max=Collections.max(list);//�÷���ֱ��ʵ�����ֵ

		/*
		����ʵ�ֶ��ֲ���binarySearch();ǰ���Ǹü��ϱ��������޼��ϡ�
		���������룺int index=halfSearch(list,"aaa");
		int index=Collections.binary(list,"aaa");������ǡ�aaaa������index=-2������ֵΪ��������-1�����������ֵΪ�����Ļ���˵�������ڡ�����
		sop(index);
		//���ֲ��ҵ�ʵ�֣�ǰ�᣺Ԫ�ؾ��бȽ��ԣ����Ұ�����Ȼ����
		
		public static int halfSearch(List<String> list,String key)
		{
			int max,min,mid;
			max=list.size()-1;
			min=0;
			while(min<=max)
			{
				mid=(max+min)>>1;   // /2
				String str=list.get(mid);//�����м�Ǳ���Ԫ��
				int num=str.compareTo(key);
				if(num>0)
					max=mid-1;
				else if(num<0)
					min=mid+1;
				else 
					return mid;//�����˷���ֵ��Ͳ�ִ�к���ĳ���
			}
			return -min-1;//(-(min+1))//min����λ�ü�ΪҪ����Ľ�㣬�÷���ֵ���ܱȽ����ơ�
		}

		*/

		/*
		������Ԫ�ز����бȽ��Ի��߰����Լ��ķ�ʽ����������
		(����Ƚ�����ʵ��comparator)
		���������� int index=halfSearch1(list,"aaa",new StrLenComparator());
		public static int halfSearch1(List<String> list,String key,Comparator<String> cmp)
		{
			int max,min,mid;
			max=list.size()-1;
			min=0;
			while(min<=max)
			{
				mid=(max+min)>>1;   // /2
				String str=list.get(mid);//�����м�Ǳ���Ԫ��
				//int num=str.compareTo(key);(���ɵ��ñȽ����ķ���)
				int num=cmp.compare(str,key);
				if(num>0)
					max=mid-1;
				else if(num<0)
					min=mid+1;
				else 
					return mid;//�����˷���ֵ��Ͳ�ִ�к���ĳ���
			}
			return -min-1;//(-(min+1))//min����λ�ü�ΪҪ����Ľ�㣬�÷���ֵ���ܱȽ����ơ�
		}
		*/
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
class StrLenComparator implements Comparator<String>//Ҫ��ʵ�ֱȽϣ���һ��Ҫʵ��comparator��
{
	public int compare(String s1,String s2)
	{
		if(s1.length()>s2.length())
			return 1;
		if(s1.length()<s2.length())
			return -1;
		else 
			return s1.compareTo(s2);//��ʾ�������һ���Ͱ�����ĸ����
	}
}
