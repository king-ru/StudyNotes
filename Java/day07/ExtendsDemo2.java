/*
�Ӹ�����ֺ����Ա���ص㣺

���г�Ա�� 
1.������
2.������
3.���캯��

1.����
��������г��ַ�˽�е�ͬ����Ա��������this
����Ҫ���ʸ����з�˽�е�ͬ����Ա��������super

super���÷���this��ʹ�ü���һ�¡�
this������Ǳ����������á�
super������Ǹ����������á�
*/
class Fu
{
  private int num=4;
 
}
class Zi extends Fu
{
	//int num=5;
	void show()
	{
		System.out.println(super.num);
	}
}
class ExtendsDemo2 
 {
	public static void main(String[] args) 
	{
		Zi z=new Zi();
		System.out.println(z.num+"..."+z.num);
	}
}
