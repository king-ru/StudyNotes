class ArrayTest6 
{
	public static void main(String[] args) 
	{
				toBin1(6);
				toHex1(60);
	}
	//十进制--》二进制 取余法
    public static void toBin(int num)
	{
		StringBuffer sb=new StringBuffer();
		while(num>0)
		{
			sb.append(num%2);
			num=num/2;
		}
		System.out.println(sb.reverse());
	}//用StringBuffer的目的是为了用反转功能。
	//十进制--》二进制  查表法  
    public static void toBin1(int num)
	{
		char[] arr={'0','1'};
		char[] chs=new char[32];// 一位抵一位
		int pos=0;
		while(num!=0)
		{
			int temp=num & 1;//&上的数为几位一所代表的十进制数
			chs[pos++]=arr[temp];
			num=num>>>1;
		}
		for(int x=pos-1;x>=0;x--)
			System.out.print(chs[x]+",");
	}
	//十进制--》十六进制  四位抵一位
		public static void toHex(int num)
	{
		StringBuffer sb=new StringBuffer();
		for(int x=0;x<8;x++)
		{
			int temp=num&15;
			if(temp>9)
				//System.out.print((char)(temp-10+'A'));
				sb.append	((char)(temp-10+'A'));		
			else
				//System.out.print(temp);
				sb.append(temp);
			num=num>>>4;
		}
		System.out.println(sb.reverse());
	}
	/*
	       0  1 2 3 4 5 6 7 8 9   A   B    C    D   E   F-->十六进制中的元素
		   0 1 2 3 4  5 6 7 8 9 10  11  12  13  14 15
		   查表法。将所有的元素临时存储起来，建立对应关系。
		   每一次&15后的值作为索引去查建立好的表，就可以找到对应中的元素。
		   这样比上个算法简单。

		   可以通过数组的形式来建立。。。。
	*/
	public static void toHex1(int num)
	{
		char[] chs={'0','1','2','3',
							'4','5','6','7',
							'8','9','A','B',
							'C','D','E','F'};
		//定义一个临时容器，即数组来达到存储结果，再逆序输出
		char[] arr=new char[8];
		int pos=0;
		/*for(int x=0;x<8;x++)
		{
			int temp=num & 15;
			System.out.print(chs[temp]);
			num=num>>>4;
		}*/  
			/*for(int x=0;x<8;x++)
		{
				int temp=num &15;
				arr[x]=chs[temp];
				num=num>>>4;
		}
		for(int x=arr.length-1;x>=0;x--)
			System.out.print(arr[x]+",");*/
	
	 //此时如果逆序输出，前面还是会有0。将程序将程序进一步优化
	   while(num!=0)
	   {
		       int temp=num & 15;
				arr[pos++]=chs[temp];
				num=num>>>4;
	   }
	   for(int x=pos-1;x>=0;x--)
			System.out.print(arr[x]+",");//此时也可以逆着存数，然后正序输出。
    }
}

