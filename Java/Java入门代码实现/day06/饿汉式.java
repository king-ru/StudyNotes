/*
������ȳ�ʼ�����󣬳�Ϊ������ʽ������һ���������
single��һ���ڴ棬���Ѿ��������˶���
CPUÿʱ��ֻ�ܽ���һ�����򣬲����ڽ���������л����л�������ġ�
class Single
{
	private static Single s=new Single();
	private Single(){}
	public static Single getInstance()
	{
		return s;
	} 
}
*/
//�����Ƿ���������ʱ���ų�ʼ����Ҳ�ж������ʱ���ء���Ϊ����ʽ��
//single����ڴ棬����û�д��ڣ�ֻ�е�����getInstance����ʱ���Ž�������
class Single
{
	private static Single s=null;
	private Single(){}
	public static  Single getInstance()//���Լ�synchronized��ͬ�����ģ�����һ������û��ȫ��ȥʱ����һ���������ܵ��øö���
	{
		if(s==null)
        {
			synchronized(Single,class);
			if(s==null)
				s=new Single();
				
        }
		return s;//Ϊʲô��ִ����new Single ����һ������
	}
//��סԭ�򣺶��嵥��������ʹ�ö���ʽ��
}
class  
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
