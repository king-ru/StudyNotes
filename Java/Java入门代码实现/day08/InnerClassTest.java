/*
Java����staticһ���������γ�Ա����������
����һ�������÷�����static�����ڲ��࣬��ͨ���ǲ���������Ϊ��̬�ģ�ֻ���ڲ���ſ��ԡ�
*/
interface Inter
{
	void method();
}
class Test
{
	//������룬ͨ�������ڲ���
	/*
	static class Inner implements Inter//ΪʲôҪ��static����
	{
		public void method()
		{
			System.out.println("method run");
		}
	}
	
	static Inner function()//����ֵΪinter����inner����,��Ϊֻ�ж�����ܵ���method������
	{
		return new Inner();//inner��inter������
	}

	*/
	//�򵥱����ʽ
	
	static Inter function()
	{
		return new Inter()
		{
				public void method()
			{
				System.out.println("method run");
			}
		}; 
	}
	
}

class InnerClassTest 
{
	public static void main(String[] args) 
	{
		//Test.function():Test������һ����̬�ķ���function
		//.method��function������������Ľ����һ��inter���͵Ķ���
		//��Ϊֻ����Inter���͵Ķ��󣬲ſ��Ե���method����
		Test.function().method();
		//����ֱ�ӵ��÷����ж�Ϊ��̬���������ŵ���method�ж�Ϊinner����
		


	//�ȼ�Ϊ  Inter in=Test.function();
	//in.method();
	
	show(new Inter()
	{
		public void method()
		{
			System.out.println("haha");
		}
	});
	
  
  }
	/*
	�ص㣺ʲô�����ʹ���ڲ��ࣿ
	��һ����������Ĳ��������ǽӿ�����ʱ�����ýӿڵĳ��󷽷�������3��ʱ��
	����һ�������ڲ��࣬���������ڲ�����Ϊ�������롣
	*/
	public static void show(Inter in)//ΪʲôҪ����д������д������������
	{
		in.method();
	}
}
//û�нӿڣ�û�и��࣬���Դ����ڲ����𣿣�������
class InnerTest
{
	public static void main(String[] args) 
	{
		new Object()//�������
		{
			public void function()
			{

			}
		}.function();//ֱ�����������Ե��ã����ܴ���������Ϊ���������в�����function����
	}
}