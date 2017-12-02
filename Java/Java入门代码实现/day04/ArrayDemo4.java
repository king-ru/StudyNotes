/*对一个数组按照从小到大的顺序进行排序。
内循环结束一次，最小值出现在头角标位置上。
选择排序法
*/
class  ArrayDemo4
{
	public static void main(String[] args) 
	{
		int[] arr={5,4,8,1,2,6,9,3,7,10};
		
		    selectSort(arr);
		 for(int x=0;x<arr.length;x++)
         {
			if(x==arr.length-1)
			      System.out.println(arr[x]);
			else
				System.out.print(arr[x]+",");
		  }
		  
	}
	public static void selectSort(int[] arr)
	{
		for(int x=0;x<arr.length-1;x++)
		{
			for(int y=x+1;y<arr.length;y++)
			{
				if(arr[x]>arr[y])
				{
					int temp=arr[x];
					arr[x]=arr[y];
					arr[y]=temp;
				}
			}
		}
	}
}
