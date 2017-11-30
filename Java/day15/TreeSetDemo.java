import java.util.*;
/*

ClassCastException������ת���쳣��
Set:���򣬲������ظ�Ԫ�ء�
		|--HashSet�����ݽṹ�ǹ�ϣ���߳��Ƿ�ͬ���ġ�
							��֤Ԫ��Ψһ�Ե�ԭ���ж�Ԫ�ص�hashcodeֵ�Ƿ���ͬ��
							�����ͬ����������ж�Ԫ�ص�equals�������Ƿ�Ϊtrue��
		
		|--TreeSet�����Զ�Set�����е�Ԫ�ؽ�������
							�ײ����ݽṹ�Ƕ��������͹�ϣֵû�й�ϵ��
							��֤����Ψһ�Ե����ݣ�compareTo����return 0������0�ʹ�������ȥ��
							

							TreeSet����ĵ�һ�ַ�ʽ����Ԫ������߱��Ƚ��ԡ�
							Ԫ����Ҫʵ��Comparable�ӿڣ�����CompareTo������
							���ַ�ʽҲ��ΪԪ�ص���Ȼ˳�򣬻��߽���Ĭ��˳��

							TreeSet�ĵڶ�������ʽ��
							��Ԫ�������߱��Ƚ���ʱ�����߾߱��ıȽ��Բ�������Ҫ�ġ�
							��ʱ��Ҫ�ü�������߱��Ƚ��ԡ����ͼ��ϱ�׼��ȡ�
							�ڼ���һ��ʼ��ʱ�������˱ȽϷ�ʽ��
			�����ֱȽϷ�ʽ������ʱ���ԱȽ���Ϊ����

			�Ƚ���ʵ��ԭ��
			����һ����ʵ��comparator�ӿڣ�����compare������


		������TreeSet�����д洢�Զ������ѧ����
		�밴��ѧ���������������
		

		��ס������ʱ������Ҫ������ͬʱ��һ��Ҫ�ж�һ�´�Ҫ������
*/
class  TreeSetDemo
{
	public static void main(String[] args) 
	{
		TreeSet ts=new TreeSet();

		ts.add(new Student("lisi02",22));
		ts.add(new Student("lisi007",20));
		ts.add(new Student("lisi09",19));
		ts.add(new Student("lisi088",22));
		//ts.add(new Student("lisi02",22));
		Iterator it=ts.iterator();
		while(it.hasNext())
		{
			Student s=(Student)it.next();//it.next()���ص���object�࣬Ҫ����ǿ������ת����ת����student���Ͳſ��Ե��������е�getName��getAge������
			System.out.println(s.getName()+"....."+s.getAge());
		}

	}
}
class Student implements Comparable//�ýӿ�ǿ����ѧ���߱��Ƚ��ԡ�
{
	private String name;
	private int age;
	Student(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	//����÷����ǵײ����е���
	public int compareTo(Object obj)
	{
		if(!(obj instanceof Student))
			throw new RuntimeException("����ѧ������");

		Student s=(Student)obj;//����ǿ������ת�����Ƚ����䣬������

		System.out.println(this.name+"...compareto..."+s.name);//ͨ������ķ�ʽ��ʾ����ν��бȽϵġ�
		//**this��ָ���Ǵ�ʱ���е��ø÷����Ķ���sָ����this���ø÷���ʱ�������һ���Ƚ϶��󡣵�һ��Ԫ����Ϊ�������룬�ڶ���Ԫ�����е���compare������

		if(this.age>s.age)//ʵ�ֵ��ǰ������С�����������Ĺ��ܡ� 
			return 1;

		if(this.age==s.age)
			return this.name.compareTo(s.name);//�����ͬʱ���򲻻����ӽ�ȥ��
	    return -1;//����else��
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
}
/*
��δ洢�����ȡ������compareTo��������Ĵ��뻻��1����Ϊ�����ʱ��ֻ�ͷ��صĽ���йأ�ȡ��ʱ��Ĭ�ϴ�С�������ȡ����
���任��-1���ͻᵹ��ȡ����
*/