/*
��������г�����ͬ���ܣ����ǹ������岻ͬ��
���ǿ��Խ������ϳ�ȡ����ʱֻ��ȡ���ܶ��壬������ȡ��������


���󣺿�����

��������ص㣺
1.���󷽷�һ�������ڳ������С�
���󷽷��ͳ����඼���뱻abstrcat�ؼ������Ρ�
3.�����಻������new����������Ϊ���ó��󷽷�û���塣
4.�������еĳ��󷽷�Ҫ��ʹ�ã����������ิд�����еĳ��󷽷��󣬽������������á�
   �������ֻ�����˲��ֳ��󷽷�����ô�����໹��һ�������ࡣ


   �������һ����û��̫��Ĳ�ͬ��
   ������������������������ֻ�������������г�����һЩ�������Ķ�����
   ��Щ��ȷ���Ķ�����Ҳ�Ǹ�����Ĺ��ܣ���Ҫ��ȷ���֣����޷��������塣
   ͨ�����󷽷�����ʾ��

   �������һ������˳����������������ж�����󷽷���
   �����಻����ʵ������


   ���⣺�������п��Բ�������󷽷��������������ǲ��ø��ཨ������
*/
abstract class Student
{
	abstract void study();//abstract ��Ϊ����û��ִ���壻
	//abstract void study1();
	void sleep()
	{
		System.out.println("����");
	}
}
abstract class BaseStudent extends Student
{
	void study()
	{
		System.out.println("study");
	}
	//��studyû�н�����д����Ҳ��������󷽷��̳��˹���������Ҫ�ĳɳ����ࡣ
}
class ChongCiStudent extends Student
{
	void study()
	{
		System.out.println("chongci study");
	}
}
class AdvStudent extends Student
{
	void study()
	{
		System.out.println("adv study");
	}

}

class AbstractDemo 
{
	public static void main(String[] args) 
	{
		new BaseStudent().study();
	}
}
