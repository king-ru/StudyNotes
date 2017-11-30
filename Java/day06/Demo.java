/*
静态的应用：
每一个应用程序中都有共性的功能，可以将这些功能进行抽取，独立封装。以便应用。

接下来将ArrayTool.class文件发送给其他人，其他人只要将改文件设置到classpath路径下，就可以使用工具类。

但是，很遗憾，该类中到底定义了多少个方法，对方不清楚，因为该类并没有使用说明书。

开始制作程序的说明书，Java的说明书通过文档注释来完成。

*/



/**
这是一个可以对数组进行操作的工具类，该类中提供了，获取数值，排序等功能。
@author 陈茹
@version V1.1
*/
class ArrayTool
{
	/**
	获取一个整形数组中的最大值。
	@param arr 接受一个int类型的数组。
	@return 会返回该数组中的一个最大值。
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
	获取一个整形数组中的最小值。
	@param arr 接受一个int类型的数组。
	@return 会返回该数组中的一个最小值。
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
	给int数组进行选择排序。
	@param arr 接受一个int类型的数组。
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
	给int数组进行冒泡排序。
	@param arr 接受一个int类型的数组。
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
	给数组中的元素进行位置的互换。
	@param arr 接受一个int类型的数组。
	@param a 要置换的位置。
	@param b 要置换的位置。

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
