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
	//ʮ����-->������
	public static void toBin(int num)
	{
		trans(num,1,1);
	}
	//ʮ����-->�˽���
	public static void toBa(int num)
	{
		trans(num,7,3);
	}
	//ʮ����-->ʮ������
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
			System.out.print(arr[x]+",");//��ʱҲ�������Ŵ�����Ȼ�����������
    }
	//��ά����Ķ��巽ʽ�� int[] [] y;  int[] y[]; int y[][];
	//һά����Ķ��巽ʽ��int[] x; int x[];

}
