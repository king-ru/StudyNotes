
/*
�� ͨ�����Ҳ�������Ϊռλ�����Ͷ����ڷ����ϵķ���Ч����һ���ġ�ֻ��������д�����ӳ�����
���͵��޶���
�� extends E�����Խ���E���ͻ���E���͵������͡����ޡ�
�� super E�����Խ���E���ͻ���E���͵ĸ����͡����ޡ�

�Ƚ���Ҳ�����ڷ��͡�

class Comp implements Comparator<Person>(person��Ƚ���)(������worker�Լ�Person������)
{
	public int compare(Person p1,Person p2)
	{
		return s1.getName.compareTo(s2.getName);
	}
}



comparable---compareTo
comparator----compare

���ߵ�����
 Comparable & Comparator ��������ʵ�ּ�����Ԫ�صıȽϡ�����ģ�ֻ�� Comparable ���ڼ����ڲ�����ķ���ʵ�ֵ�����
 Comparator ���ڼ����ⲿʵ�ֵ�����
 ���ԣ�����ʵ������
 ����Ҫ�ڼ����ⶨ�� Comparator �ӿڵķ������ڼ�����ʵ�� Comparable �ӿڵķ�����

 Comparable ��һ����������Ѿ�֧���ԱȽ�����Ҫʵ�ֵĽӿڣ�
 ���� String��Integer �Լ��Ϳ�����ɱȽϴ�С�������Ѿ�ʵ����Comparable�ӿڣ�   

 �� Comparator ��һ��ר�õıȽ��������������֧���ԱȽϻ����ԱȽϺ��������������Ҫ��ʱ��
 �����дһ���Ƚ����������������֮���С�ıȽϡ�
*/

class  GenericDemo5
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
