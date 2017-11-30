class ArrayTest7 
{
	public static void main(String[] args) 
	{
		toBin(6);
		System.out.println();
		toBa(60);
		System.out.println();
		toHex(60);
	}
	//十进制-->二进制
	public static void toBin(int num)
	{
		trans(num,1,1);
	}
	//十进制-->八进制
	public static void toBa(int num)
	{
		trans(num,7,3);
	}
	//十进制-->十六进制
    public static void toHex(int num)
	{
		trans(num,15,4);
	}
	public static void trans(int num,int base,int offset)
	{
		char[] chs={'0','1','2','3',
							'4','5','6','7',
							'8','9','A','B',
							'C','D','E','F'};
		char[] arr=new char[32];
		int pos=0;
		while(num!=0)
	   {
		       int temp=num & base;
				arr[pos++]=chs[temp];
				num=num>>>offset;
	   }
	   for(int x=pos-1;x>=0;x--)
			System.out.print(arr[x]+",");//此时也可以逆着存数，然后正序输出。
    }
	//二维数组的定义方式： int[] [] y;  int[] y[]; int y[][];
	//一维数组的定义方式：int[] x; int x[];

}
