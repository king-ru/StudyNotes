/*
�ӿڣ�������⣬������Ϊ��һ������ĳ����࣬
			���������еķ������ǳ���ģ���ô�������ͨ���ӿڵ���ʽ����ʾ��
class���ڶ����ࡣ
interface���ڶ���ӿڡ�


�ӿڶ���ʱ����ʽ�ص㣺
1.�ӿ��г������壺���������󷽷���
2.�ӿ��еĳ�Ա���й̶����η���
	������public static final(ȫ�ֳ���)
	������public abstract

��ס���ӿ��еĳ�Ա����public�ġ�

��̳��ࣺ��������һЩ�ǳ���ĺ�������ֱ�������á�
��ʵ�֣�implements���ӿڣ��ӿ��ж��ǳ���ķ���������븴д���ܲ��ܽ���ʵ������ʵ�ֹ��ܡ�

�ӿ��ǲ����Դ�������ģ���Ϊ�г��󷽷���
��Ҫ������ʵ�֣�����Խӿ��еĳ��󷽷�ȫ�����Ǻ�����ſ���ʵ������
����������һ�������ࡣ

�ӿڿ��Ա����ʵ�֣���һ������Ե��ö���ӿڣ���Ҳ�ǶԶ�̳в�֧�ֵ�ת����ʽ��Java֧�ֶ�ʵ�֡�

�ӿںͽӿ�֮��֧�ֶ�̳У���ͬ�������ķ���ֵ������ͬ��

�����֮�䲻֧�ֶ�̳е�ԭ��
1.������̳еĸ�����ӵ����ͬ�ĳ�Ա���������������øñ���ʱ���޷��б�ʹ���ĸ�����ĳ�Ա������
2.������̳еĸ�����ӵ����ͬ�ĳ�Ա���������������øñ���ʱ���޷��б�ʹ���ĸ�����ĳ�Ա������

�ӿںͽӿ�֮��֧�ֶ�̳е�ԭ��
1.���þ�̬������������һ��ֱ��ʹ��������ӿ������Ӷ�����������壬���Ҳ�����ڶ�̳еĵ�һ��ȱ��.
2.�ӿ���һ������ĳ����࣬�ӿ��г�Ա������Ĭ��Ϊ static final ���ͣ����������ҽӿ��еķ�����Ϊ����ģ���û�з����塣 ���巽��ֻ����ʵ�ֽӿڵ���ʵ�֣��ڵ��õ�ʱ��ʼ��ֻ�����ʵ����ķ��������������壩����˲����ڶ�̳еĵڶ���ȱ�㣻
*/
interface Inter
{
	public static final int NUM=3;
	public abstract void show();
		//�����д�ˣ�ϵͳ���Զ����ϡ���
}
interface Inter1
{
	public static final int NUM=52;
	public abstract void show();
}
class Demo
{
	public void function(){}
}
class Test extends Demo implements Inter,Inter1
{
	 public void show(){}
	//public abstract void method(){}
} 

interface A
{
	public abstract void methodA();
}
interface B //extends A
{
	public abstract void methodB();
}
interface C  extends B,A
{
	public abstract void methodC();
}
class D implements C
{
	//Ҫ����3������
	public void methodA(){}
	public void methodB(){}
	public void methodC(){}

}

class  InterfaceDemo
{
	public static void main(String[] args) 
	{
		//Test t=new Test();
		//System.out.println(t.NUM);//������ó�Ա
		//System.out.println(Test.NUM);//����ó�Ա
		System.out.println(Inter.NUM);
		System.out.println(Inter1.NUM);
		//System.out.println("123");
	}
}

