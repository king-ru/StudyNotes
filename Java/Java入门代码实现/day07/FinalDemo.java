/*
final:���ա���Ϊһ�����η���
1.���������࣬������������
2.��final���ε��಻�ܱ��̳С�Ϊ�˱��ⱻ�̳У������ิд���ܡ�
3.��final���εķ������ܱ���д��
4.��final���εı�����һ������ֻ�ܸ�ֵһ�Σ��ȿ������γ�Ա������Ҳ�������ξֲ�������
   ������������ʱ��һЩ���ݵĳ���ֵ�ǹ̶��ģ���ô��ʱΪ����ǿ�Ķ��ԣ�������Щֵ������֣��������Ķ���
   �����ֵ����Ҫ�ı䣬���Լ���final���Ρ�
   ��Ϊ��������������д�淶��������ĸ����д������ɶ��������ɣ����ʼ�ͨ��__���ӡ�
5.�ڲ��ඨ�������еľֲ�λ����ʱ��ֻ�ܷ��ʸþֲ���final���εľֲ�������


Ŀǰ������η���3�֣�public final Ĭ�ϼ�û�С�
*/
 class Demo
{
	final int x=3;
	public static final double MY_PAI=3.14;
	final void show1()
	{}
    void show2()
	{
		final int y=4;
	}
}
class SubDemo extends Demo
{
	void show2();
}
class FinalDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
