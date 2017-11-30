class  StringDemo
{
	public static void main(String[] args) 
	{
		String s1="abc";//s1是一个类类型变量，“abc”是一个对象。
								//字符串最大的特点：一旦被初始化就不可以被改变。但s1的指向可以发生改变。例如：s1=“kkk”，但“abc”这个对象没有发生改变。
		String s2=new String("abc");
		/*
		s1和s2有什么区别？
		s1在内存中有一个对象。
		s2在内存中有两个对象。
		*/
		System.out.println(s1==s2);//false
		System.out.println(s1.equals(s2));//true
		//String类复写了Object类中的equals方法。该方法用于判断字符串中的内容是否相同。这是字符串独特的比较方式。
		System.out.println("Hello World!");
	}
}

