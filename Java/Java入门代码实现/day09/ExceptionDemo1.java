/*
�ں����������쳣��
������߰�ȫ�ԣ��õ��ú������д������������ʧ��
	//�����ַ�ʽ��throws Exception��������������Լ�Ĭ�ϵķ�ʽȥ�����
	//�����Լ��Ĵ���ʽ


�Զ��쳣�Ĵ���
���ŷ�����������������catch�飬����Էֱ�������
1.�����쳣ʱ������������Ϊ������쳣����������Ŀ��Ը����塣

2.�Է����������쳣���Ͷ�Ӧ����catch�飬��Ҫ��������catch�顣
	������catch�е��쳣���ּ̳й�ϵ�������쳣catch����������档

3.�����ڽ���catch����ʱ��catch��һ��Ҫ������崦��ʽ��
	��Ҫ�򵥵ö���һ�䣺e.printStackTrace();
	Ҳ��Ҫ�򵥵ľ���дһ�������䡣������ֻ�Ƿ�����ʾ��

	//stack��ջ  trace ׷�٣��ټ�

*/
class Demo
{
	int div(int a,int b) throws ArithmeticException,ArrayIndexOutOfBoundsException//�ڹ�����ͨ��throws�Ĺؼ��������˸ù��ܿ��ܳ�������
	{
		//index  �Ǳ꣬������ָ��	
		//bound ���ƣ���Χ����Լ����
		int[] arr=new int[a];
		System.out.println(arr[4]);
		//�׸�ִ���ߣ��������ߣ���������Ϊ������
		return a/b;
		//������һ�����⣬�������װΪһ������
		//new AritchmaticExpection()
	}
}
class  ExceptionDemo1 
{
	public static void main(String[] args) 
	//�����ַ�ʽ��throws Exception��������������Լ�Ĭ�ϵķ�ʽȥ�����
	//�����Լ��Ĵ���ʽ

	{
		Demo d=new Demo();
		try
		{
			int x=d.div(4,0);
			System.out.println("x="+x);
		}
		catch (Exception e)
		{
			System.out.println(e.toString());
		}
		//��⵽һ������ͻ�ֹͣ����ʵ�Ƕ�̬������
		/*
		catch (ArithmeticException e)
		{
			System.out.println(e.toString());
			System.out.println("��0����");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.toString());
			System.out.println("�Ǳ�Խ����");
		}
		*/
		//һ��������ֺ����ͻ�ֹͣ��������Խ��arr[4]�����ֹͣ��a/b�Ͳ������С�
		//������ͬʱ��⵽
		System.out.println("over");
	}	
}
