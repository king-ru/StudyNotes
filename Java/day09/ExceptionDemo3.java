/*
��Ϊ��Ŀ�л�������е����⡣
����Щ���Ⲣ����Java����������װ����
���Զ�����Щ���е�������԰���Java�������װ��˼�룬
�����е����⣬�����Զ�����쳣��װ��


�Զ����쳣��
�����ڱ������У����ڳ���Ϊ������Ҳ��Ϊ�Ǵ���ģ����޷���������ġ�
		  ��ô����Ҫ�������������Զ����������

���ں����ڲ�������throw�׳��쳣������ô����Ҫ������Ӧ�Ĵ�������
Ҫô���ڲ�try catch����
Ҫô�ں����������õ����ߴ���


һ������£������ڳ����쳣����������Ҫ��throws������


���ִ�ӡ�Ľ����ֻ���쳣�����ƣ�û���쳣����Ϣ��
��Ϊ�Զ�����쳣��δ������Ϣ��

��ζ����쳣��Ϣ�أ�
��Ϊ�������Ѿ����쳣��Ϣ�Ĳ���������ˡ�
��������ֻҪ�ڹ���ʱ�����쳣��Ϣ���ݸ�����ͨ��super��䡣
��ô�Ϳ���ֱ��ͨ��getMessage�ķ�����ȡ�Զ�����쳣��Ϣ��


�Զ����쳣��
�������Զ�����̳�Exception��


�̳�Exceptionԭ��
�쳣��ϵ��һ���ص㣺��Ϊ�쳣����쳣���󶼱��׳���
���Ƕ��߱������У������������Throwable�����ϵ�еĶ����ص㡣


ֻ�������ϵ���еĶ���ſ��Ա�throw��throws������
Throwable��ϵ�а����ĳ�Ա  Exception ��Error��ֻ��Throwable��ϵ�еĳ�Ա�ſ��Ա��׳�ȥ��



throws��throw������
1.λ�ã�throwsʹ���ں����ϡ������ں������ƺ��棬��С�����������֮�䣩
			throwʹ���ں����ڲ���
2. �������ݣ�throws������쳣�࣬���Ը��ܶ�����ö��Ÿ�����
					throw����������쳣����


throw����ʱ�����治Ҫ�ټӺ���ִ����䣬��Ϊһ�����ף��ô�����ֹͣ�����ˡ�
���Կ��ǽ���һ����������ǰ�档
*/

//�Զ����쳣�����Լ����صķ�����Ҳ�жԸ���ĸ�д��
class FuShuException extends Exception//getMessage();
{
	private int vaule;
	private String msg;
	
	FuShuException(String msg,int vaule)//��getMessage������д
	{
		super(msg);
		this.vaule=vaule;
	}
	public int getVaule()
	{
		return vaule;
	}
	

}
class Demo
{
	int div(int a,int b)throws FuShuException
	{
		if(b<0)
			throw new FuShuException("�������ָ���",b);//�ֶ�ͨ��throw�ؼ����׳�һ���Զ����쳣����
		return a/b;
	}
}
class  ExceptionDemo3
{
	public static void main(String[] args) 
	{
		Demo d=new Demo();
		try
		{
			int x=d.div(4,-1);
			System.out.println("x="+x);
		}
		catch (FuShuException e)
		{
			System.out.println(e.toString());
			System.out.println("���ִ�������ǣ�"+e.getVaule()); 
		}
	
	}
}