public class Test {
	public static void main(String[] args) {
		String s0 = "Android";
		String s1 = "Android";
		String s2 = "����ʵ����";
		String s3 = "Android" + "����ʵ����";
		String s4 = s1 + s2;
		String s5 = "Android����ʵ����";
		String s6 = new String("Android");
		String s7 = new String("Android����ʵ����");
		String s8 = new String("Android����ʵ����").intern();
		
		
		System.out.println(s0 == s1); // true�������ַ���������
		System.out.println(s1 == s6); // false
		System.out.println(s3 == s4); // false
		//��s3�ڱ���ʱ�ڻ��Զ�ȥ���Ӻţ�����һ���µ��ַ���������s4��Ϊ����������ӣ�ͨ��StringBuffer��ӣ�����һ���¶���
		System.out.println(s3 == s5); // true
		System.out.println(s4 == s5); // false
		System.out.println(s3 == s7); // false
		System.out.println(s3 == s8); // true��intern����������ȥ�ڴ�������û�и��ַ����������еĻ�ֱ�ӷ��أ�����new ����û�еĻ���new ����
		
	}
}
