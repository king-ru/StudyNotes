import java.util.*;
/*
����λ�ã��෺�ͣ������ĺ��档
				�������ͣ�public���档

Ϊ���ò�ͬ�������Բ�����ͬ���ͣ��������ͻ���ȷ����
��ô���Խ����Ͷ����ڷ����ϡ����෺�͸��������㡣

����֮����
��̬���������Է������϶���ķ��͡�
�����̬����������Ӧ���������Ͳ�ȷ�������Խ����Ͷ����ڷ����ϡ�
*/
class Demo <T>//�ڽ�����������ȷ
{
	public void show(T t)//�෺��
	{
		System.out.println("show..."+t);
	}
	public <Q> void print(Q q)//��������
	{
		System.out.println("print..."+q);
	}
	
	public static <W> void method(W t)
	{
		System.out.println("method..."+t);
	}
	
}
class  GenericDemo4
{
	public static void main(String[] args) 
	{
		Demo <String>d=new Demo<String>();
		d.show("hahha");
		//d.show(new Integer(4));
		d.print("dashdiu");
		d.print(new Integer(4));
		d.method("123");
	}
}
