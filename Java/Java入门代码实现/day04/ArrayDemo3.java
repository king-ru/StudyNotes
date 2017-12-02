class  ArrayDemo3
{
	public static void main(String[] args) 
	{
		int[] arr={1,2,3,4,5,6,7};
		//数组的操作；
		//获取数组中的元素,通常会用到遍历；要用for循环
		//int[] arr=new int[3];
		//数组中有一个属性可以直接获取到数组元素的个数.length.
		//使用方式：数组名称.length

		/*int[] arr={1,2,3,4,5,6};
		System.out.println("length:"+arr.length);
		//int sum=0;
		for(int x=0;x<arr.length;x++)
		{
			//sum+=arr[x];
			System.out.println("arr["+x+"]="+arr[x]+";");//("arr[0]="+arr[0]);
		} */
	   // printArray(arr);
	   System.out.print(arr);//打印的是数组的hash地址
	}
//}
//定义功能，用于打印数组中的元素，元素间用逗号隔开。
	public static void printArray(int[] arr)
  {
	for(int x=0;x<arr.length;x++)
	{
		if(x==arr.length-1)
				System.out.println(arr[x]);
		else
			   System.out.print(arr[x]+",");//一个字符也要用双引号
	}
  }
}

