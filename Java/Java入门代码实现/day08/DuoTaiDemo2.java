/*
��̬���������Ϊ������ڵĶ���������̬��

�ˣ����ˣ�Ů��
���è ����

è x=new è();
���� x=new è();
 
Χ������4����ѧϰ��
1.��̬������
  ���������ָ�����Լ����������
  ���������Ҳ���Խ����Լ����������

2.��̬��ǰ�� 
  ������������֮�� �й�ϵ��Ҫô�̳У�Ҫôʵ�֡�
  ͨ������һ��ǰ�᣺���ڸ��ǣ�

3.��̬�ĺô�
 ��̬�Ĵ�������˳������չ�ԡ�

4.��̬�ı׶�
�������չ�ԣ�����ֻ��ʹ�ø�������÷��ʸ����еĳ�Ա��
5.��̬��Ӧ��

6.��̬�ĳ��ִ����е��ص㣨��̬ʹ�õ�ע�����

�ڶ������⣺���ʹ���������з���
*/

/*
���
è����2
*/
abstract class Animal
{
	abstract void eat();
}
class Cat extends Animal
{
	public void eat()
	{
		System.out.println("����");
	}
	public void catchMouse()
	{
		System.out.println("ץ����");
	}
}
class Dog extends Animal
{
	public void eat()
	{
		System.out.println("�Թ�ͷ");
	}
	public void kanJia()
	{
		System.out.println("����");
	}
}
class Pig extends Animal
{
	public void eat()
	{
		System.out.println("����");
	}
	public void gongDi()
	{
		System.out.println("����");
	}
}
class  DuoTaiDemo2
{
	public static void main(String[] args) 
	{
		//Animal a=new Cat();//��������������ת��
		//a.eat();
		//�����Ҫ����è�����з���ʱ����β�����
		//ǿ�ƽ����������ת���������͡�����ת�͡�
		//Cat c=(Cat)a;
		//c.catchMouse();
		//ǧ��Ҫ���������Ĳ��������ǽ��������ת����������
		//������ת�����Ǹ�������ָ�����Լ����������ʱ����Ӧ�ÿ��Ա�������Ҳ���Ա�ת����
		//���ɣ���������̬��ʼ���ն�����������ڱ仯��
		//Animal a=new Animal();
		//Cat c=(Cat)a;
			
		function(new Cat());
		function(new Dog());
		//С��Χ���ݣ���Χ���Խ��ոò���������
	}
	public static void function(Animal a)//Animal a=new Cat();
	{
		a.eat();
		if(a instanceof Cat)//�����������ͣ��ж϶����Ƿ�����ĳ�����͵ķ���
		{
			Cat c=(Cat)a;
		   c.catchMouse();
		}
		else if(a instanceof Dog)
		{
			Dog d=(Dog)a;
			d.kanJia();
		}
	}
	
}
