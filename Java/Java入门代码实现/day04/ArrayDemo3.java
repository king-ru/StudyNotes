class  ArrayDemo3
{
	public static void main(String[] args) 
	{
		int[] arr={1,2,3,4,5,6,7};
		//����Ĳ�����
		//��ȡ�����е�Ԫ��,ͨ�����õ�������Ҫ��forѭ��
		//int[] arr=new int[3];
		//��������һ�����Կ���ֱ�ӻ�ȡ������Ԫ�صĸ���.length.
		//ʹ�÷�ʽ����������.length

		/*int[] arr={1,2,3,4,5,6};
		System.out.println("length:"+arr.length);
		//int sum=0;
		for(int x=0;x<arr.length;x++)
		{
			//sum+=arr[x];
			System.out.println("arr["+x+"]="+arr[x]+";");//("arr[0]="+arr[0]);
		} */
	   // printArray(arr);
	   System.out.print(arr);//��ӡ���������hash��ַ
	}
//}
//���幦�ܣ����ڴ�ӡ�����е�Ԫ�أ�Ԫ�ؼ��ö��Ÿ�����
	public static void printArray(int[] arr)
  {
	for(int x=0;x<arr.length;x++)
	{
		if(x==arr.length-1)
				System.out.println(arr[x]);
		else
			   System.out.print(arr[x]+",");//һ���ַ�ҲҪ��˫����
	}
  }
}

