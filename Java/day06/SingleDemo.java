/*
���ģʽ�����ĳһ����������֮��Ч�ķ�����
Java����23�����ģʽ��
�������ģʽ�����һ������ֻ����һ������

��Ҫ��֤�����Ψһ�ԡ�
1.Ϊ�˱�������������ཨ����������ȿ��ƽ�ֹ�����������������
2.��Ϊ��������������Է��ʵ��������ֻ���ڱ����У��Զ���һ������
3.Ϊ�˷�������������Զ������ķ��ʣ����Զ����ṩһЩ���ʷ�ʽ��

������������ô���������?
1.�����캯��˽�л���
2.�����д���һ���������
3.�ṩһ���������Ի�ȡ�ö���


�����������ô����������ô������
����Ҫ��������Ķ���֤���ڴ���Ψһʱ���ͽ����ϵ��������ϼ��ɡ�
*/
class Single//���еĳ�Աһ�㶼Ҫ˽�л�
{
    private int num;
	public void setNum(int num)
	{
		this.num=num;
	}
	public int getNum()
	{
		return num;
	}
	private Single(){}
	private static Single s=new Single();//��̬����ֻ�ܷ��ʾ�̬��Ա����sҲҪ��̬����
	public static Single getInstance()//���������ã�1.�������  2.�������á���Ϊû�ж����ˣ�ֻ�ܷ������ã�����Ҫ��static��
	{
		return s;//ֻ��һ����Ա������Ҫ���ú����ˡ�
	}
}
class SingleDemo
{
	public static void main(String[] args) 
	{
		/*
		Single s1=new Single();//��ʱSingleû��˽�л��������Դ������󣬼���private��Ͳ�����new�����ˡ�

		Single s2=new Single();
		s1.setNum(22);
		System.out.println(s2.getNum());//�����0��û��s2������Ĭ�ϳ�ʼ��Ϊ0��
	    */
        Single s1=Single.getInstance();
		Single s2=Single.getInstance();
		s1.setNum(22);
		System.out.println(s2.getNum());

	}
}
/*
������
    private Single(){}
	private static Single s=new Single();
	public static Single getInstance()
	{
		return s;
	}
*/
