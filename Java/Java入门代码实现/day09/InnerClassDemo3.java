/*
�ڲ��ඨ���ھֲ�ʱ��
1.�����Ա���Ա���η���static��
2.����ֱ�ӷ����ⲿ���еĳ�Ա����Ϊ�������ⲿ���е�����
   ���ǲ����Է��������ڵľֲ��еı�����ֻ�ܷ��ʱ�final���εľֲ�����
*/
class Outer
{
	int x=3;
	void method(final int a)//����ͨ���������
	{
		final int y=4;///�ܽ᣺finalʹa�������ڸ÷����в��ܱ�����
		//�ڸ÷�����a�����ٱ���ֵ����Ϊ��final���Σ�

		//�ڴ�������ʱ������ͨ��������ͬ���������������Ĳ�ͬ
		//Ҳ����ͨ��һ�������ε���method����ʱ����Ĳ�����ͬ
		class Inner//��ֻ̬�����γ�Ա�����������࣬����private�Ϳ���������
		{
			void function()//���ܱ�static���Σ���Ϊ�ڲ��಻�ܱ�static����
			{
				System.out.println(Outer.this.x);//Ϊʲô�䲻�������
				System.out.println(y);
				System.out.println(a);

			}
		}
		new Inner().function();//��������Inner��ǰ�洴��������Ϊ��ʱ��δ�����ࣺ����function����ͨ������Inner�������
	}
}
class InnerClassDemo3 
{
	public static void main(String[] args) 
	{
		new Outer().method(7);
		new Outer().method(8);
		Outer outer=new Outer();
		outer.method(7);
		outer.method(8);
	}
}
