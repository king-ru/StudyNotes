/*
�ӿڵ��ص㣺
1.�ӿ��Ƕ��Ⱪ¶�Ĺ���
2.�ӿ��ǳ���Ĺ�����չ��
3.�ӿڼ������ڲ���ϵ������ԡ�
4.һ�������ʵ�ֶ���ӿڡ�
5.����ӿ�֮����ʵ�ֹ�ϵ����������Լ̳�һ�����ͬʱʵ�ֶ���ӿڡ�
6.�ӿ���ӿ�֮������м̳й�ϵ��

�ӿںͼ̳е�����
���Թ��������У����ڼ̳�;
�����Թ����ڽӿ��У����ڶ����ܵ���չ��
*/



abstract class Student
{
	abstract void study();
	void sleep()
	{
		System.out.println("sleep");
	}

}
interface Smoking
{
	void smoke();
}
class ZhangSan extends Student implements Smoking//���������ʵ�ʲ��ὲzhangsan�����һ����
{
	void study(){}
	public void smoke(){}
}
class  LiSi extends Student
{
		void study(){}
}

class InterfaceTest
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
