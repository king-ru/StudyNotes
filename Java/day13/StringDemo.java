class  StringDemo
{
	public static void main(String[] args) 
	{
		String s1="abc";//s1��һ�������ͱ�������abc����һ������
								//�ַ��������ص㣺һ������ʼ���Ͳ����Ա��ı䡣��s1��ָ����Է����ı䡣���磺s1=��kkk��������abc���������û�з����ı䡣
		String s2=new String("abc");
		/*
		s1��s2��ʲô����
		s1���ڴ�����һ������
		s2���ڴ�������������
		*/
		System.out.println(s1==s2);//false
		System.out.println(s1.equals(s2));//true
		//String�ิд��Object���е�equals�������÷��������ж��ַ����е������Ƿ���ͬ�������ַ������صıȽϷ�ʽ��
		System.out.println("Hello World!");
	}
}

