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
*/
abstract class Student
{
	abstract void study();//abstract ��Ϊ����û��ִ���壻
}
class BaseStudent extends Student
{
	void study()
	{
		System.out.println("study");
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
