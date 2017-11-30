/*
String�������������ַ������
��ô�����ṩ�˶���������ַ������в�����

�����Ĳ�������Щ��
"abcd"

1.��ȡ
	1.1�ַ����а������ַ�����Ҳ�����ַ����ĳ��ȡ�
		int length��������ȡ���ȡ�
	1.2����λ�û�ȡλ���ϵ�ĳ���ַ���
		char charAt��int index����
	1.3�����ַ���ȡ���ַ����ַ����е�λ�á�
		int indexOf��int ch //�ַ���AsIC��ֵ�������ص���ch���ַ����е�һ�γ��ֵ�λ�á�
        int indexOf��int ch��int fromIndex������fromIndexָ��λ�ÿ�ʼ����ȡch���ַ����г��ֵ�λ�á�ע���ʱ�Ǳ�ֵ�������ı䣬ֻ�ǵ�һ�η�����λ�÷����˸ı䡣
		
		int indexOf��String str //�硰abcd���еġ�ab���������ص���str���ַ����е�һ�γ��ֵ�λ�á�
        int indexOf��String str��int fromIndex������fromIndexָ��λ�ÿ�ʼ����ȡstr���ַ����г��ֵ�λ�á�

		int indexOf��int ch)


2.�ж�
	2.1 �ַ������Ƿ����ĳһ���Ӵ���
		boolean contains(str);
		����֮����indexOf(str);��������str��һ�γ��ֵ�λ�ã��������-1����ʾ��str�������ڸ��ַ����С�
						���ԣ�Ҳ�����ڶ�ָ���ж��Ƿ������
						if(str.indexOf("aa")!--1)

						���Ҹ÷����������жϣ��ֿ��Ի�ȡ���ֵ�λ�á�
	2.2 �ַ������Ƿ������ݡ�
		boolean isEmpty();ԭ���жϳ����Ƿ�Ϊ0��
	2.3�ַ������Ƿ�����ָ�����ݿ�ͷ��
		boolean startsWith();
	2.4�ַ������Ƿ�����ָ�����ݽ�β��
		boolean endsWith();
	2.5 �ж��ַ����������Ƿ���ͬ����д��Object���е�equals������
		boolean equals(str);
	2.6 �ж������Ƿ���ͬ�������Դ�Сд��
		boolean equalsIgnoreCase();
3.ת��
	3.1���ַ�����ת��Ϊ�ַ���
		���캯����String(char[])
						String(char[],offset,count):���ַ������е�һ����ת���ַ�����offset,��ʼλ��count��������
		��̬������
					static String copyValueOf(char[] data,int offset,int count)
					static String valueOf(char[] data)
	3.2���ַ���ת��Ϊ�ַ�����
		char[] toCharArray()
	3.3���ֽ�����ת��Ϊ�ַ���
		String(byte[])
		String(byte[],offset,count):
	3.4���ַ���ת��Ϊ�ֽ�����
		���⣺�ַ������ֽ�������ת�������У��ǿ���ָ�������ġ�
	3.5��������������ת���ַ���
		static String valueOf��int��
		static String valueOf��double��
4.�滻
	String replace(oldchar,newchar);
	�����滻�ַ������ַ�����
5.�и�
	String[] split(reget);//reget��ʶ���и�
6.�Ӵ�����ȡ�ַ����е�һ���֡�
	String substring(begin);
	String substring(begin,end);
	
7.ת����ȥ���ո񣬱Ƚϡ�

	7.1���ַ���ת���ɴ�д����Сд��
		String toUpperCase();
		String toLowerCase();

	7.2���ַ������˵Ķ���ո�ȥ����
		String trim();

	7.3�������ַ���������Ȼ˳��ıȽϡ�
		int compareTo(String);
*/

class StringMethodDemo 
{
	public static void method_trans()
	{
		char[] arr={'a','b','c','d','e'};
		String s=new String(arr,1,3);
		sop("s="+s);

		String s1="asdqiuh";
		char[] chs=s1.toCharArray();
		for(int x=0;x<chs.length;x++)//�����������Ҫ��ѭ����
		{
			sop("ch="+chs[x]);
		}
	}
	public static void method_is()
	{
		String str="ArrayDemo.java";
		sop(str.startsWith("Array"));
		sop(str.endsWith(".java"));
		sop(str.contains("Demo"));
	}
	public static void method_get()
	{
		String str="abcdefg";
		
		//����
		sop(str.length());
		
		//����������ȡ�ַ�
		sop(str.charAt(4));//�����ʵ��ַ����в����ڵĽǱ�ʱ�ᷢ��StringIndexOutBoundsException

		//�����ַ���ȡ����
		sop(str.indexOf('b',3));//���û���ҵ�������-1.

		//��������һ���ַ����ֵ�λ�á�
		sop(str.lastIndexOf('a'));

	}
	public static void method_replace()
	{
		String s="hello java";
		//String s1=s.replace('a','n');//���Ҫ���滻���ַ������ڣ����صĻ���ԭ����
		String s1=s.replace("java","world");
		sop("s="+s);
		sop("s1="+s1);
		}
	public static void method_split()
	{
		String s="zhangsan,lisi,wangwu";
		String[] arr=s.split(",");//�ַ������顣ע����ʱ������Ϊ�ַ������������ַ���
		for(int x=0;x<arr.length;x++)//�����������Ҫ��ѭ����
		{
			sop("ar="+arr[x]);
		}

	}
	public static void method_sub()
	{
		String s="asdardq";
		sop(s.substring(2));//��ָ��λ�ÿ�ʼ����β.����Ǳ겻���ڣ�������ַ����Ǳ�Խ���쳣��
		sop(s.substring(2,4));//����ͷ������β��s.substring(0,s.length());
	}
	public static void method_7()
	{
		String s="   Hello Java   ";
	    sop(s.toLowerCase());
	    sop(s.toUpperCase());
		sop(s.trim());

		String s1="a1c";
		String s2="aaa";
		sop(s1.compareTo(s2));
		//���ڷ���>0����,С�ڷ���<0��������Ⱦ�Ϊ0.�����ҷ��ص���Ϊ��һ������ͬ�ַ��Ĳ�ֵ��
	}
	public static void main(String[] args) 
	{
		method_get();
		method_is();
		method_trans();
		method_replace();
		method_split();
		method_sub();
		method_7();
	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
 