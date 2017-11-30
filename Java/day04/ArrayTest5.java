class ArrayTest5
{
	public static void main(String[] args) 
	{
				//toBin(6);
				toHex(60);
	}
	//十进制--》二进制
    public static void toBin(int num)
	{
		StringBuffer sb=new StringBuffer();
		while(num>0)
		{
			sb.append(num%2);
			num=num/2;
		}
		System.out.println(sb.reverse());
	}
	十进制--》十六进制
		public static void toHex(int num)
	{
		for(int x=0;x<8;x++)
		{
			int temp=num & 15;
			if(temp>9)
				System.out.print((char)(temp-10+'A'));
			else
				System.out.print(temp);
			num=num>>>4;
		}
	}
}

