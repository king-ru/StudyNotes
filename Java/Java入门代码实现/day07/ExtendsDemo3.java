/*
2,�Ӹ����еĺ���

������͸������һ���ĺ���ʱ��������������ͬ��
�����������øú��������������ຯ�������ݡ�
��ͬ���ຯ��������һ����

��������Ǻ�������һ�����ԣ���д��Ҳ��Ϊ���ǣ���

������̳��˸��࣬��Ϯ�˸���Ĺ��ܵ������У�
��Ȼ������иù��ܣ����ǹ��ܵ����ݺ͸��಻һ�£�
��ʱ��û�б�Ҫ�����¹��ܣ�����ʹ�ø������⣬��������Ĺ��ܶ��壬����д�������ݡ�

����ע������:
1.���า�Ǹ��࣬���뱣֤����Ȩ�޴��ڵ��ڸ���Ȩ�ޣ��ſ��Ը��ǣ��������ʧ�ܡ�

2.��ֻ̬�ܸ��Ǿ�̬��


ע�⣺���أ�ֻ��ͬ�������Ĳ����б�
		 ��д���ָ��෽��Ҫһģһ����
*/
class Fu
{
   void show()//����Ĭ��Ȩ�ޣ�����public��private֮��
	{
		System.out.println("Fu show");
		
	}
	void speak()
	{
		System.out.println("vb");
	}
}
class Zi extends Fu
{
	public void show()
	{
		System.out.println("Zi show");
	}
	void speak()
	{
		System.out.println("java");
	}
}
class ExtendsDemo3
{
	public static void main(String[] args)
	{
		Zi zi=new Zi();
		zi.show();
		zi.show();
		zi.speak();
	}
}
class Tel
{
	void show()
	{
		System.out.println("number"); 

	}
}
class NewTel extends Tel
{
    void show()
	{
		 //System.out.println("number");
        super.show();//���ǵ��ø���ĺ�����
		//�������super�Ļ���Ĭ�ϵ���this�����Լ������Լ���û�������ĵ�������ѭ����������ڴ������
		 System.out.println("name");
		 System.out.println("pic");
	}
}
	 