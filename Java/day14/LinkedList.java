import java.util.*;
/*

ArrayList��LinkedList��ѡȡ��
1.ArrayList������Ԫ�صĲ�ѯ��LinkedList�����ڽ϶����ݵ���ɾ��
2.һ������£����ݵ���ɾ�õĽ��٣�����ArrayList��Ϊ��õ�������

LinkedList�����з�����

addFirst();//��ͷ��λ����ӡ�
addLast();//��β��λ����ӡ�

getFirst();
getLast();//��ȡԪ�أ�����ɾ��Ԫ�ء�

removeFirst();
removeLast();//��ȡԪ�أ�����Ԫ�ر�ɾ�������������û��Ԫ�أ������NoSuchElementException���Ƴ���Ԫ�أ�����ȡ����Ԫ�أ�

��Jdk1.6�г��������������

offerFirst();//����
offerLast(0;

peekFirst();//��ȡ
peekLast();
��ȡԪ�أ�Ԫ�ز���ɾ�������������û��Ԫ�أ��᷵��null��

poolFirst();//ɾ��
poolLast();
��ȡԪ�أ�����Ԫ�ر�ɾ�������������û��Ԫ�أ��᷵��null��
*/
class  LinkedListDemo
{
	public static void main(String[] args) 
	{
		LinkedList link=new LinkedList();

		link.addFirst("java01");
		link.addFirst("java02");
		link.addFirst("java03");
		link.addFirst("java04");

		sop(link);
		//��ȡ�����е�Ԫ�ء�
		while(!link.isEmpty())
		{
			sop(link.removeFirst());//����ȡ����Last��
		}

	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
	
}
