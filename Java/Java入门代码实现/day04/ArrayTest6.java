class ArrayTest6 
{
	public static void main(String[] args) 
	{
				toBin1(6);
				toHex1(60);
	}
	//ʮ����--�������� ȡ�෨
    public static void toBin(int num)
	{
		StringBuffer sb=new StringBuffer();
		while(num>0)
		{
			sb.append(num%2);
			num=num/2;
		}
		System.out.println(sb.reverse());
	}//��StringBuffer��Ŀ����Ϊ���÷�ת���ܡ�
	//ʮ����--��������  ���  
    public static void toBin1(int num)
	{
		char[] arr={'0','1'};
		char[] chs=new char[32];// һλ��һλ
		int pos=0;
		while(num!=0)
		{
			int temp=num & 1;//&�ϵ���Ϊ��λһ�������ʮ������
			chs[pos++]=arr[temp];
			num=num>>>1;
		}
		for(int x=pos-1;x>=0;x--)
			System.out.print(chs[x]+",");
	}
	//ʮ����--��ʮ������  ��λ��һλ
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
	       0  1 2 3 4 5 6 7 8 9   A   B    C    D   E   F-->ʮ�������е�Ԫ��
		   0 1 2 3 4  5 6 7 8 9 10  11  12  13  14 15
		   ����������е�Ԫ����ʱ�洢������������Ӧ��ϵ��
		   ÿһ��&15���ֵ��Ϊ����ȥ�齨���õı��Ϳ����ҵ���Ӧ�е�Ԫ�ء�
		   �������ϸ��㷨�򵥡�

		   ����ͨ���������ʽ��������������
	*/
	public static void toHex1(int num)
	{
		char[] chs={'0','1','2','3',
							'4','5','6','7',
							'8','9','A','B',
							'C','D','E','F'};
		//����һ����ʱ���������������ﵽ�洢��������������
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
	
	 //��ʱ������������ǰ�滹�ǻ���0�������򽫳����һ���Ż�
	   while(num!=0)
	   {
		       int temp=num & 15;
				arr[pos++]=chs[temp];
				num=num>>>4;
	   }
	   for(int x=pos-1;x>=0;x--)
			System.out.print(arr[x]+",");//��ʱҲ�������Ŵ�����Ȼ�����������
    }
}

