/*
 Map���ϣ��ü��ϴ洢��ֵ�ԣ�һ��һ������棬����Ҫ��֤����Ψһ�ԡ�
 ������ӳ���ϵʱ�����Կ�����Map���ϡ�
					1.���
					put(K key,V value)
					putAll(Map<? extends K? extends V> m)

					2.ɾ��
					clear()
					remove(Object key)
					
					3.�ж�
					containsValue(Object value)
					containsKey(Object key)
					isEmpty()

					4.��ȡ
					get(Object key)
					size()
					values()

Map
		|--Hashtable:�ײ��ǹ�ϣ�����ݽṹ�������Դ���null��nullֵ���ü������߳�ͬ���ġ�Ч�ʵ͡�
		|--HashMap���ײ��ǹ�ϣ�����ݽṹ�����Դ���null��nullֵ���ü������̲߳�ͬ���ġ�Ч�ʸߡ�
		|--TreeMap���ײ��Ƕ������ṹ���ݣ��̲߳�ͬ�����������ڸ�Map�����еļ���������


��Set����
��ʵ��Set�ײ����ʹ����Map���ϡ�
*/
import java.util.*;
class  MapDemo
{
	public static void main(String[] args) 
	{
		Map<String,String>map=new HashMap<String,String>();

		//���Ԫ�ء�����������ʱ����ͬ�ļ�����ô����ӵ�ֵ�Ḳ��ԭ�м��Ķ�Ӧֵ����put�����᷵�ر����ǵ�ֵ��
		map.put("01","zhangsan1");
		map.put("02","zhangsan2");
		map.put("03","zhangsan3");

		map.put("04",null);
		map.put("01","chenru");
		System.out.println("get:"+map.get("04"));
		//����ͨ��get�������ж�һ�����Ƿ���ڡ�ͨ������null���жϡ�
		

		
		Collection<String>coll=map.values();

		System.out.println(coll);//��ȡmap�����е����е�ֵ��
		System.out.println(map);//��ȡ�ü��ϵ�ӳ���ϵ��
	}
}
