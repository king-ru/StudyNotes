/*
argument��Ϊ����

Exception����һ������������쳣RuntimeException����ʱ�쳣��

����ں����ڲ��׳����쳣�������Ͽ��Բ�������������һ����ͨ����

����ں����������˸��쳣�������߿��Բ��ý��д�������һ��ͨ����

֮���Բ����ں���������������Ϊ����Ҫ�õ����ߴ���
�����쳣������ϣ������ֹͣ����Ϊ������ʱ���������޷��������������ϣ��ֹͣ�����
�Դ�������޸ġ�


//runtime�ĳ��ֻ����������ֹͣ�������쳣���ҽ���������


�����쳣��Ϊ���֣�
1.����ʱ�������쳣��

�ں����׳�ʱ������û�б�ʶ���ͱ���Ϊ�а�ȫ�����ģ����벻��ͨ�����õ����ߴ�����쳣�������߱����������ʽ��Ҫô�ף�Ҫô���Լ��ķ�ʽ���д���

2.����ʱ���������쳣������ʱ�쳣������Runtime�Լ����࣬������ʱ�����쳣ֹͣ����


���ԣ������쳣ʱ���жϸ��쳣�ܲ��ܱ�����������ԣ�������������������У���Runtime�Լ�����ʹ�䷢�����⣬ֹͣ����

�Զ����쳣ʱ��������쳣�ķ������޷��ټ����������㡣
�����Զ����쳣�̳�RuntimeException��
*/
class FuShuException extends RuntimeException
{
	FuShuException(String msg)
		{
			super(msg);
		}
}
class Demo
{
	int div(int a,int b)//throws ArithmeticException
	{
		if (b<0)
				throw new FuShuException("���ָ���");
		if (b==0)
				throw new ArithmeticException("��0����");
		return a/b;
	}
}
class  ExceptionDemo4
{
	public static void main(String[] args) 
	{
		Demo d=new Demo();
		int x=d.div(4,-1);
		System.out.println("x="+x);
		System.out.println("over");
	}
}