import java.util.*;

/*
|--Set:Ԫ��������ģ������ȡ����˳��һ��һ�£���Ԫ�ز������ظ���
	���������ࣺHashSet���ײ����ݽṹ�ǹ�ϣ������ϣ���ǰ���ϣֵ�Ĵ�С��������ġ���
						HashSet����α�֤Ԫ��Ψһ�Ե��أ�
						��ͨ��Ԫ�ص�����������hashcode��equals����ɡ�
						���Ԫ�ص�hashcodeֵ��ͬ���Ż��ж�equals�Ƿ�Ϊtrue��
						���Ԫ�ص�hashcodeֵ��ͬ���Ż����equals��


java������ֵ��ͬ�Ļ���hashCode��һ����ͬ�ģ�����Ҳ����ͬ�ġ�����String���hashCode�������String����ֵһ����
								   ��ôhashCodeһ������ͬ�ģ���ΪString����д��hashCode()���� ��

								   hashcode�͵�ַ����ϵ���ǵ�ַ��һ��ӳ�䡣hashcode��ͬ����ַ��һ����ͬ�����ַ���������ַ����ͬ��hashcodeһ������ͬ��
						TreeSet��
Set���ϵĹ��ܺ�Collection��һ�µġ�

*/
class Person
{
	private String name;
	private int age;
	Person()
	{
		this.name=name;
		this.age=age;
	}
	//�����Լ���hashcode����
	public int hashCode()
	{
		System.out.println(this.name+"...hashcode");
		return name.hashCode+age;
	}

	public boolean equals(Object obj)
	{
		if(!obj instanceof Person)
			return false;
		Person p=(Person)obj;
		System.out.println(this.name+"...equals..."p.name);

		return this.name.equals(p.name) && this.age==p.age;
	}
}
 
class  HashSetDemo
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
	public static void main(String[] args) 
	{
		HashSet hs=new HashSet();
		sop(hs.add("java01"));//����ֵΪ�����ͣ����ӽ�ȥ��Ϊtrue�������Ϊfalse��
		sop(hs.add("java01"));
		hs.add("java01");
		hs.add("java02");
		hs.add("java02");
		hs.add("java03");
		hs.add("java04");

		Iterator it=hs.iterator();//ֻ���õ�����ȡ��Ԫ�ء�
		while(it.hasNext())
		{
			sop(it.next());
		}

	}
}
