/*
package pack;(定义包名时，所有字母小写)
类名前面有了public修饰后，Java文件名必须和类名一致。
包要进行逐级存放，对类要进行分层管理。

总结：
		包与包之间进行访问，被访问的包中的类以及类中的成员，需要public修饰。
		不同包中的子类还可以直接访问父类中被protected（保护）权限修饰的成员。
包与包之间可以使用的权限只有两种：public protected


							
						public			protected			default（默认）		private(只在本类中有效)

同一个类中			ok					ok					ok						ok
同一个包中			ok					ok					ok
子类						ok					ok
不同包中				ok
*/
/*
为了简化类名的书写，使用一个关键字import（导入）
import packb.haha.heihei.hehe.*;(*代表包中的所有类)
建议不要写通配符*，需要用到包中的哪个类，就导入哪个类。
编译器中按快捷键自动生成。


建议定义包名时不要重复，可以使用url来完成定义，url（网站地址）是唯一的。

*/
package pack;
public class DemoA
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
