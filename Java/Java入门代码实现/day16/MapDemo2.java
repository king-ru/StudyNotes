/*
map���ϵ�����ȡ��(ֵ)�ķ�ʽ��
1.keySet����map�����еļ����뵽Set���ϣ���ΪSet���Ͼ߱���������
				���Կ��Ե�����ʽȡ�����еļ����ٸ���get��������ȡÿһ������Ӧ��ֵ��
				

				Map���ϵ�ȡ��ԭ����map����ת��Set���ϣ���ͨ��������ȡ����

2.Set<Map.Entry<k,v>>entrySet:��map�����е�ӳ���ϵ���뵽��set�����У��������ϵ���������;��ǣ�Map.Entry��
*/
import java.util.*;
class  MapDemo2
{
	public static void main(String[] args) 
	{
		Map<String,String> map=new HashMap<String,String>();
		map.put("01","zhangsan1");
		map.put("02","zhangsan2");
		map.put("03","zhangsan3");
		map.put("04","zhangsan4");

		//��Map�����е�ӳ���ϵȡ�������뵽Set�����С�

		Set<Map.Entry<String,String>> entrySet=map.entrySet();//���͵�Ƕ��ʹ�á�

		Iterator<Map.Entry<String,String>> it=entrySet.iterator();

		while(it.hasNext())
		{
			Map.Entry<String,String> me=it.next();
			String key=me.getKey();
			String value=me.getValue();
			System.out.println(key+"....."+value);
		}
		System.out.println(entrySet);
		/*

		//�Ȼ�ȡmap���������м���Set���ϣ�keySet();
		Set<String> keySet=map.keySet();

		//����set���ϣ��Ϳ��Ի�ȡ���������
		Iterator<String> it=keySet.iterator();
		while(it.hasNext())
		{
			String key=it.next();
			//���˼��Ϳ���ͨ��map���ϵ� map������ȡ���Ӧ��ֵ��
			String value=map.get(key);
			System.out.println("key:"+key+",value:"+value);
		}
		System.out.println(map);

		*/
	}
}

/*
Map.Entry ��ʵEntryҲ��һ���ӿڣ�����Map�ӿ��е�һ���ڲ��ӿڡ�

*/

//���Ǽ�static���εĽӿ�һ����һ���ڲ��ӿڣ���Ϊֻ�нӿ�λ�ڳ�Աλ���ϲ��ܱ�static���Ρ�
/*
interface Map
{
	public static interface Entry
	{
		public abstract Object getKey();
		public abstract Object getValue();
	}
}
*/