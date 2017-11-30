public class Test {
	public static void main(String[] args) {
		String s0 = "Android";
		String s1 = "Android";
		String s2 = "创新实验室";
		String s3 = "Android" + "创新实验室";
		String s4 = s1 + s2;
		String s5 = "Android创新实验室";
		String s6 = new String("Android");
		String s7 = new String("Android创新实验室");
		String s8 = new String("Android创新实验室").intern();
		
		
		System.out.println(s0 == s1); // true（都是字符串常量）
		System.out.println(s1 == s6); // false
		System.out.println(s3 == s4); // false
		//（s3在编译时期会自动去掉加号，生成一个新的字符串常量，s4则为两个对象相加，通过StringBuffer添加，生成一个新对象）
		System.out.println(s3 == s5); // true
		System.out.println(s4 == s5); // false
		System.out.println(s3 == s7); // false
		System.out.println(s3 == s8); // true（intern方法：首先去内存中找有没有该字符串常量，有的话直接返回，不会new 对象，没有的话再new 对象）
		
	}
}
