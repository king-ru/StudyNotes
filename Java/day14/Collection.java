import java.util.*;

/*
1. add�����Ĳ���������Object���Ա��ڽ����������Ͷ���

2.�����д洢�Ķ��Ƕ�������ã���ַ��

ʲô�ǵ������أ�
��ʵ���Ǽ��ϵ�ȡ��Ԫ�صķ�ʽ������������
���ӣ����޻������Ӿ��ǵ���������Ȼ�в�ͬ�ļ��ӣ����й������ݣ���ȡ���Ĺ��ܣ����ݸ˲��ݣ����ݸ�Ϊ�ӿڣ����޵�����ΪԪ�ء�


*/
class  Collection
{
	public static void main(String[] args) 
	{
		//method_2();
		method_get();
	}
	public static void method_2()
	{
		ArrayList al1=new ArrayList();
		al1.add("java 01");
		al1.add("java 02");
		al1.add("java 03");
		al1.add("java 04");

		ArrayList al2=new ArrayList();
		al2.add("java 01");
		al2.add("java 02");
		al2.add("java 05");
		al2.add("java 06");

		//al1.retainAll(al2);//ȡ������al1��ֻ�ᱣ�����ߵĽ�����
		al1.removeAll(al2);//ȥ������
		sop(al1);
		sop(al2);//al2��Ϊԭ���ġ�
	}
	public static void method_1()
	{
		//����һ������������ʹ��Collection�ӿڵ����࣬ArrayList��
		ArrayList al=new ArrayList();
		//1.���Ԫ��
		al.add("java 01");//add(Object obj);
		al.add("java 02");
		al.add("java 03");
		al.add("java 04");
		
		//��ӡԭ����
		sop(al);

		//2.��ȡ���������ϳ���
		//sop("size="+al.size());

		//3.ɾ��Ԫ��
		//al.remove("java 02");
		//al.clear()����ռ���
		//��ӡ�ı��ļ���
		sop(al);

		//4.�ж�Ԫ��
		sop("java 03�Ƿ����"+al.contains("java 03"));
		sop("�����Ƿ�Ϊ��"+al.isEmpty());
	}
	public static void method_get()
	{
		ArrayList al=new ArrayList();
		al.add("java 01");
		al.add("java 02");
		al.add("java 03");
		al.add("java 04");

		Iterator it=al.iterator();//��ȡ����������ȡ�������е�Ԫ�ء�
		while(it.hasNext())
		{
			sop(it.next());
		}
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
