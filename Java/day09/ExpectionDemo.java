/*
1.�������װΪ��������쳣������
	�쳣�����ǳ���������ʱ���ֲ����������
	�쳣���֣�����Ҳ����ʵ������һ����������Ҳ����ͨ��Java�������ʽ��������������װ�ɶ���
				��ʵ����Java�Բ������������������Ķ������֡�

	���ڶ���Ļ��֣����֣�һ�������ص����⣬һ���Ƿ����ص����⡣

	�������صģ�Javaͨ��Error�����������
	����Error��һ�㲻��д����ԵĴ��룬������д���
	���ڷ����صģ�Javaͨ��Exception�����������
	����Exception����ʹ������ԵĴ���ʽ���д���


	����Error����Exception������һЩ�������ݡ�
	���磺�������������Ϣ������ԭ��ȡ�

Throwable		Throwable��Java�����д�����쳣�ĳ���
	---Error
	---Exception

2.�쳣�Ĵ���

Java�ṩ�����е������д���

try
{
		��Ҫ�����Ĵ��룻
}
catch���쳣�� ������
{
		�����쳣�Ĵ��룻������ʽ��
}
finally
{
		һ����ִ�е���䣻
}

	 
3.�Բ��񵽵��쳣������г�����������
	String getMessage();//��ȡ�쳣��Ϣ
*/
class Demo
{
	int div(int a,int b) //�ڹ�����ͨ��throws�Ĺؼ��������˸ù��ܿ��ܳ�������
	{
		return a/b;
		//������һ�����⣬�������װΪһ������
		//new ArithmaticExpection()
	}
}
class  ExpectionDemo1
{
	public static void main(String[] args) 
	{
		Demo d=new Demo();
		try
		{
			int x=d.div(4,0);//new ArithmaticExpection()
		    System.out.println("x="+x); //Ҫ�Ƿ������������޷����ʵĴ�����Ϊx�Ǿֲ�����
		}
		//���������ִ��catch������ִ��
		catch (Exception e)//Expection e=new ArithmeticExpection();
		{
			System.out.println("������");
			System.out.println(e.getMessage());//�쳣����
			System.out.println(e.toString());//�쳣��Ϣ �쳣����
			e.printStackTrace();//�쳣��Ϣ���쳣�������쳣���ֵ�λ�á�
										//��ʵjvmĬ�ϵ��쳣������ƣ������ڵ���printStackTrace��������ӡ�쳣�Ķ�ջ�ĸ�����Ϣ��
		}
		
		System.out.println("over");
	}	
}
