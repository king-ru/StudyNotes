/*
�������ģʽ��
*/
/*
����ʽ��
class Single
{
	private static Single s=new Single();
	private Single(){}
	public static Single getInstance()
	{
		return s;
	} 
}


����ʽ����������Ҫ�㣩���ӳټ��صĵ������ģʽ��
class Single
{
	private static Single s=null;
	private Single(){}
	public static  Single getInstance()
	{
		if(s==null)//������ͨ����˫���ж������Լ����ж����Ĵ�����������������ʡ�
        {
			synchronized(Single.class);
			if(s==null)
				s=new Single();
				
        }
		return s;
	}
}

����ʽ���⣺���̷߳���ʱ����ְ�ȫ���⡣
�����������ͬ����
1.ͬ��������ͬ������鶼���ԣ�������Ч�ʽϵ͡�
2.ͨ����˫���ж������Լ����ж����Ĵ�����������������ʡ�
3.�ӵ����������������ֽ�����󡣼�����.class��
*/

class  
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
