/*
�ڲ���ķ��ʹ���
1.�ڲ������ֱ�ӷ����ⲿ���еĳ�Ա������˽�У���Ϊ˽���ڱ�������Ч��
   ֮���Կ���ֱ�ӷ����ⲿ���еĳ�Ա������Ϊ�ڲ����г�����һ���ⲿ���е����ã���ʽ���ⲿ����.this
2.�ⲿ��Ҫ�����ڲ��࣬����Ҫ�����ڲ������


���ʸ�ʽ��
1.���ڲ��ඨ�����ⲿ��ĳ�Աλ���ϣ����ҷ�˽�У��������ⲿ��������ֱ�ӽ����ڲ������
��ʽ��
		�ⲿ����.�ڲ����� ������=�ⲿ�����new Outer()��.�ڲ������
		Outer.Inner in=new Outer().new Inner();
2.���ڲ����ڳ�Աλ���ϣ��Ϳ��Ա���Ա���η������Ρ�
	���磬private�����ڲ������ⲿ���н��з�װ��
			  static���ڲ���;߱���static�����ԡ�
			  ���ڲ��౻static���κ�ֻ��ֱ�ӷ����ⲿ���е�static��Ա�������˷���Ȩ�ޡ�
			  

			  ���ⲿ�������У����ֱ�ӷ��ʾ�̬�ڲ����еķǾ�̬��Ա�أ�
			  new Outer.Inner().function();
			  ���ⲿ�������У����ֱ�ӷ��ʾ�̬�ڲ����еľ�̬��Ա�أ�
			  Outer.Inner.function();


	ע�⣺���ڲ����ж����˾�̬��Ա�����ڲ����б����Ǿ�̬�ġ�
			  ���ⲿ���еľ�̬���������ڲ���ʱ���ڲ���Ҳ������static�ġ��������ԭ��


����������ʱ��������ڲ�����������������ڲ�����������
��Ϊ�ڲ�������ʹ���ⲿ��������ݡ�

������������

class Body
{
	private class XinZang//ֱ�ӷ����ⲿ�������
	{
	}
	public void show()
	{
		new XinZang();//˽������ζ����ṩ���ʵķ���
	}
}


�ص㣺��һ�������ж������ڲ���󣬾�Ҫ���ڲ����װ˽�У�ʹ�䲻�ܱ��ⲿ���ʣ����������ṩ���ʵķ�����
*/
class Outer 
{
	private static int x=3;
    static class Inner//���ڲ������ⲿ��䵱��Աʱ������private���Σ����������class������private���Ρ�
	{
		int x=4;
		void function()
		{
			int x=6;
			System.out.println(this.x);//�ⲿ���е�x
		}
		
	}
	void method()
	{
		Inner in=new Inner();
		in.function();
	}
	class Inner2
	{
		void show()
		{
			System.out.println("inner2 show");
		}
	}
	public static void method1()
    {
		new Inner2().show();//�����޷��Ӿ�̬�����������÷Ǿ�̬������
	}
}
class InnerClassDemo//�ⲿ������
{
	public static void main(String[] args) 
	{
		Outer.method();
		//Outer.Inner.function();
		//new Outer.Inner().function();
		//Outer out=new Outer();
		//out.method();

		//ֱ�ӷ����ڲ����еĳ�Ա
		//Outer.Inner in=new Outer().new Inner();//�ⲿ����.�ڲ�����
		//in.function();
	}
}

	