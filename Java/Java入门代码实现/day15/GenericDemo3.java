import java.util.*;
/*
ʲôʱ���巺���ࣿ
������Ҫ�������������Ͳ�ȷ����ʱ��
���ڶ���Object�������չ��������Ҫ����ǿ������ת�����кܴ�İ�ȫ����������ͨ������ȴ�޷����У�
���ڶ��巺�����������չ��(�ô���������ǿת��������ת�Ƶ��˱���ʱ��)


�����ԣ��������������ͺ�������������Ч�������ֻ�ܲ������������ͣ������Ĳ��ܲ�����
			�������ͷ�����
*/
class Worker
{
}
class Student
{
}
class Utils <QQ>
{
	private QQ qq;
	public void setObject(QQ qq)
	{
		this.qq=qq;
	}
	public QQ getObject()
	{
		return qq;
	}
}
class  GenericDemo3
{
	public static void main(String[] args) 
	{
		Utils<Worker> u=new Utils<Worker>();
		u.setObject(new Worker());
		Worker w=u.getObject();
	}
}
