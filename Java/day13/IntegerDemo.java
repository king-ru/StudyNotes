/*
�����������Ͷ����װ�ࡣ

byte			Byte
short		Short
int			 Integer
long			 Long
boolean	 Boolean
float			 Float
double		 Double
char			 Character

�����������Ͷ����װ����������
�������ڻ����������ͺ��ַ�������֮����ת��

������������ת���ַ���
	1.������������+""

	2.������������.toString(������������ֵ);

	�磺Integer.toString(34);//��34��������ַ�����34��

�ַ���ת�ɻ����������ͣ��ı����е�����ȫ��Ϊ�ַ�����
	1. xxx a=Xxx.parseXxx(string);
	    �磺int a=Integer.parseInt("122");//ͨ����ֱ̬�ӵ���
	
	double d=Double.parseDouble("12.23");
	
	boolean b=Boolean.parseBoolean("true");
		
		Integer i=new Integer("123");//ͨ�����������ٵ��á�
		int num=i.intValue();

ʮ����ת��Ϊ��������
	toBinaryString();2
	toHexString();16
	toOctalString();8

��������ת��Ϊʮ����
	parseInt(String);
	parse(String,radix);�����radixָ���ǽ��ַ��������Ǽ����Ƶ���������ת��Ϊ10���Ƶ�����
*/
class  IntegerDemo
{
	public static void main(String[] args) 
	{
		//�������͵����ֵ
		//sop("int max:"+Integer.MAX_VALUE);
		//��һ���ַ���ת��������
		int num=Integer.parseInt("110",2);
		//int num=Integer.parseInt("a123");�������ָ�ʽ�쳣�����봫�����ָ�ʽ���ַ�����
		sop(num+"");
		//sop("num="+(num+4));
		sop(Integer.toBinaryString(-6));//������
		sop(Integer.toHexString(60));//ʮ������3c
		
	}
		public static void sop(String str)
	{
		System.out.println(str);
	}
}
