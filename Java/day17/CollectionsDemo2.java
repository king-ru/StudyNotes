import java.util.*;
//Ŀ�ģ����������������򣬰��Լ��ķ�ʽ����
class StrComparator implements Comparator<String>
{
	public int compare(String s1,String s2)
	{
		/*
		int num=s1.compareTo(s2);
		if(num>0)
			return -1;
		if(num<0)
			return 1;
		else 
			return num;
		*/
		return s2.compareTo(s1);
	}
}
class CollectionsDemo2
{
	public static void main(String[] args) 
	{
		orderDemo();
	}
	public static void orderDemo()
	{
		//TreeSet<String> ts=new TreeSet<String>(new StrComparator());
		TreeSet<String> ts=new TreeSet<String>(Collections.reverseOrder());
		//Collections.reverseOrder()����ֵΪһ���Ƚ�����ǿ����ת��Comparable�ӿڵĶ���collection����Ȼ˳��
		//TreeSet<String> ts=new TreeSet<String>(new StrLenComparator());���Ӷ̵�����˳������
		//TreeSet<String> ts=new TreeSet<String>(collections.reverseOrder(new StrLenComparator()));���ӳ����̵�˳�����С�
		ts.add("abcde");
		ts.add("bde");
		ts.add("abde");
		ts.add("ad");
		//�������Ľ��������Ȼ����
		Iterator it=ts.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
