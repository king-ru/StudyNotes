/*
��̬��Ӧ�ã�
ÿһ��Ӧ�ó����ж��й��ԵĹ��ܣ����Խ���Щ���ܽ��г�ȡ��������װ���Ա�Ӧ�á�

��������ArrayTool.class�ļ����͸������ˣ�������ֻҪ�����ļ����õ�classpath·���£��Ϳ���ʹ�ù����ࡣ

���ǣ����ź��������е��׶����˶��ٸ��������Է����������Ϊ���ಢû��ʹ��˵���顣

��ʼ���������˵���飬Java��˵����ͨ���ĵ�ע������ɡ�

*/



/**
����һ�����Զ�������в����Ĺ����࣬�������ṩ�ˣ���ȡ��ֵ������ȹ��ܡ�
@author ����
@version V1.1
*/
class ArrayTool
{
	/**
	��ȡһ�����������е����ֵ��
	@param arr ����һ��int���͵����顣
	@return �᷵�ظ������е�һ�����ֵ��
	*/
	public static int getMax(int[] arr)
	{
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
				max=arr[i];
		}
		return(max);
	}
	/**
	��ȡһ�����������е���Сֵ��
	@param arr ����һ��int���͵����顣
	@return �᷵�ظ������е�һ����Сֵ��
	*/
		public static int getMin(int[] arr)
	{
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
				min=arr[i];
		}
		return(min);
	}
    /**
	��int�������ѡ������
	@param arr ����һ��int���͵����顣
	*/
	public void selectSort(int[] arr)//????
	{
		for(int x=0;x<arr.length-1;x++)
		{
			for(int y=x+1;y<arr.length;y++)
			{
				if(arr[x]>arr[y])
				{
					swap(arr,x,y);
				}
			}
		}
	}
	/**
	��int�������ð������
	@param arr ����һ��int���͵����顣
	*/
	public void bubbleSort(int[] arr)
	{
		for(int x=0;x<arr.length-1;x++)
		{
			for(int y=0;y<arr.length-1-x;y++)
			{
				if(arr[y]>arr[y+1])
				{
					swap(arr,y,y+1);
				}
			}
		}
	}
	/**
	�������е�Ԫ�ؽ���λ�õĻ�����
	@param arr ����һ��int���͵����顣
	@param a Ҫ�û���λ�á�
	@param b Ҫ�û���λ�á�

	*/
	public void swap(int[] arr,int a,int b)
	{
		int temp;
		temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
}

class ArrayToolDemo
{
	public static void main(String[] args)
	{
		int[] arr={5,6,9,1,2,20};
		ArrayTool tool=new ArrayTool();
		int max=tool.getMax(arr);
		System.out.println("max="+max);
	}
}
