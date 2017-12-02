/*
StringBuffer���ַ�����������

��һ��������
�ص㣺�������ݳ����Լ������ǲ�ȷ��������£�������������Ҫ���㡣��
1.���ҳ����ǿɱ仯�ġ�
2.����һ�β�������������͡�
3.���ջ�ͨ��toString������������ַ�����
C create U update R read D delete
//��ɾ�Ĳ�

1.�洢��
	StringBuffer append();��ָ��������Ϊ������ӵ��������ݽ�β����
	StringBuffer insert(index,����);���Խ����ݲ��뵽ָ��indexλ�á�

2.ɾ����
	StringBuffer delete(start,end);ɾ���������е����ݣ�����start��������end��
	StringBuffer deleteCharAt��index����ɾ��ָ��λ�õ��ַ���

3.��ȡ��
	char charAt(int index);
	int indexOf(String str);
	int lastIndexOf(String str);
	int length();
	String substring(int start ,int end);

4.�޸ġ�
	StringBuffer replace(start,end,string);
	void setCharAt(int index,char ch);//ֱ���滻���������κ�ֵ��

5.��ת
	StringBuffer reverse();

6.����������ָ�����ݴ洢��ָ���������ַ����飩�С�
	void getChars(int srcBegin(�ַ�����ʼ���ַ��Ǳ�),int srcEnd���ַ����������ַ��Ǳ꣩,char[] dst��Ŀ�ĵ����飩,int dstBegin��Ŀ�ĵ����鿪ʼ�洢�ĽǱ꣩) ��

jdk1.5�汾֮�������StringBuilder��

StringBuffer���߳�ͬ���ġ�
StringBuilder���̲߳�ͬ���ġ�������ʹ�ã������ж���������ȫ��

�������������أ�
���Ч�ʡ�
����д��
��߰�ȫ�ԡ�
*/
class  StringBufferDemo
{
	public static void method_update()
	{
		StringBuffer sb=new StringBuffer("abcde");
		sb.replace(1,4,"java");
		sop(sb.toString());
	} 
	public static void method_add()
	{
		StringBuffer sb=new StringBuffer();
		sb.append(34).append(true).append("abc");//�������������������ر�����󣬼������ñ��෽����
		//StringBuffer sb1=sb.append(34);
		//sop("sb==sb1"+(sb==sb1));
		sb.insert(1,"qq");
		sop(sb.toString());
		//sop(sb1.toString());
	}
	public static void method_del()
	{
		StringBuffer sb=new StringBuffer("abcder");
		//sb.delete(1,3);
		//��ջ�������
		//sb.delete(0,sb.length());
		sop(sb.toString());
	}
	public static void method_6()
	{
		StringBuffer sb=new StringBuffer("abcde");
		char[] chs=new char[6];
		sb.getChars(1,4,chs,1);
		for(int x=0;x<chs.length;x++)
		{
			sop("chs["+x+"]="+chs[x]);
		}
	}
	public static void main(String[] args) 
	{
		method_add();
		method_del();
		method_update();
		method_6();
	}
	
	public static void sop(String str)
	{
		System.out.println(str);
	}
}
