import java.util.*;

/*
ȥ��ArrayList�����е��ظ�Ԫ�ء�����һ����ʱ���������õ��������������жϡ�
equals�����Ƚϵ��Ƕ���ĵ�ַ��

*/
class  ArrayListTest
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
	public static void main(String[] args) 
	{
		ArrayList Al=new ArrayList();
		Al.add("java001");
		Al.add("java002");
		Al.add("java001");
		Al.add("java002");
		Al.add("java001");
		Al.add("java003");
		
		sop(Al);

		Al=singleElements(Al);
		sop(Al);
	}

	public static ArrayList singleElements(ArrayList al)
	{
		//����һ����ʱ������
		ArrayList newAl=new ArrayList();
		Iterator it=al.iterator();

		while(it.hasNext())//���еĵ�����������
		//�ڵ���ʱѭ����next����һ�Σ���ҪhasNext�ж�һ�Ρ������sop(it.next()+"...."+it.next())��һ��ȡ��2��Ԫ�أ������׳���noSuchElementException����
		{
				Object obj=it.next();

				if(!newAl.contains(obj))
					newAl.add(obj);
		}

		return newAl;
	}
}