/*
Collection 
		|--List��Ԫ��������ģ�Ԫ�ؿ����ظ�����Ϊ�ü�����ϵ��������
				|--ArrayList���ײ����ݽṹʹ�õ�������ṹ��  �ص㣺��ѯ���ݽϿ죬����ɾԪ�ؽ�����Ԫ��Խ��Խ���ԡ��̲߳�ͬ����
				|--LinkedList���ײ�ʹ�õ����������ݽṹ��		 �ص㣺��ѯ���ݽ���������ɾԪ�ؽϿ졣
				|--Vector���ײ����ݽṹʹ�õ�������ṹ��		 �ص㣺�߳�ͬ������ArrayList�������ѯ�Լ���ɾ�ٶȶ�������


		
		|--Set��Ԫ������Ԫ�ز����ظ���

List��
	���з��������ǿ��Բ����Ǳ�ķ������Ǹ���ϵ���еķ�����

����
	add(index,element)
	addAll(index,Collection)

ɾ��
	remove(index,element)
�ģ�
	set(index,element)
�飺
	get(index)
	subList(from,to)
	ListIterator();


����Ԫ�صķ�ʽ�����֣�1.����  2.������

List�������еĵ�������ListIterator��Iterator���ӽӿڡ�

�ڵ���ʱ��������ͨ�����϶���ķ������������е�Ԫ�ء�
��Ϊ�ᷢ��ConcurrentModificationException�쳣��modification���޸ġ��������޸��쳣��
ֻ���õ������ķ�������Ԫ�ء�

���ԣ���ʹ�õ�����ʱ��ֻ���õ������ķ�������Ԫ�أ�����Iterator����ʱ���޵ġ�
ֻ�ܶ�Ԫ�ؽ����жϣ�ȡ����ɾ���Ĳ�����
�����Ҫʵ�������Ĳ����磺��ӣ��޸ĵȣ�����Ҫʹ�����ӽӿڣ�ListIterator���������������跽����

�ýӿ�ֻ��ͨ��List���ϵ�ListIterator������ȡ��


*/
import java.util.*;
class  ListDemo
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
	
	public static void method()
	{
		ArrayList al=new ArrayList();
		//���Ԫ��
		al.add("java 01");
		al.add("java 02");
		al.add("java 03");
		//��ָ��λ�����Ԫ��
		al.add(1,"java 09");
		//ɾ��ָ��λ��Ԫ��
		al.remove(2);
		//�޸�Ԫ��
		al.set(2,"java 007");
		//ͨ���Ǳ��ȡԪ�ء�
		al.get(1);
		sop(al);
		//��ȡ����Ԫ��
		for(int x=0;x<al.size();x++)
		{
			System.out.println("al("+x+")="+al.get(x));
		}
		
		Iterator it=al.iterator();
		while(it.hasNext())
		{
			sop("next:"+it.next());
		}
		//ͨ��indexOf��ȡ�����λ�á�
		sop("index="+al.indexOf("java 02"));

		List sub=al.subList(1,3);//���ײ���β,����Ҫͨ��ѭ����ֱ�ӾͿ��Դ�ӡ������

		sop("sub="+sub);
	}
	
	public static void main(String[] args) 
	{
		//��ʾ�б��������
		ArrayList al=new ArrayList();
		//���Ԫ��
		al.add("java 01");
		al.add("java 02");
		al.add("java 03");
		sop(al);
		ListIterator li=al.ListIterator();
		while(li.hasNext())
		{
			Object obj=li.next();
			if(obj.equals("java 02"))
				li.add("java 09");
		}
		sop(al);
		/*
		//�ڵ��������У�׼����ӻ���ɾ��Ԫ��
		Iterator it=al.iterator();
		while(it.hasNext())
		{
			Object obj=it.next();
			if(obj.equals("java 02"))
				//al.add("java 08");�����ͻᷢ���쳣�������������ͼ��Ϸ�������ͬʱʹ�á�ֻ����һ�֡�
				it.remove();
			sop(obj);//����Ԫ�صķ�ʽ�����֣�1.����  2.������
			//��ʱ������֡�Java 02������Ȼ�Ѿ������Ӽ�����ɾ���������ڴ�����Ȼ���ڣ���������object��Ȼ�����õ�����
		}
		sop(al);
		*/
	}
}
