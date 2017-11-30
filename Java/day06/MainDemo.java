/*
public static void main(String[] args) 
主函数：是一个特殊的函数。作为程序的入口，可以被jvm（虚拟机）调用。
主函数的定义：
public：代表着该函数的访问权限是最大的。
static：代表着主函数随着类的加载就已经存在了。
void：主函数没有具体的返回值。
main：不是关键字，是一个特殊的单词，可以被jvm识别。
（String[] args）:函数的参数，参数的类型是一个数组，该数组中的元素是字符串，字符串类型的数组。
主函数是固定格式的：jvm识别。
jvm在调用主函数时传入的参数为new String[]
*/
class MainDemo
{
	public static void main(String[] args) //传入的参数为：new String[]
		//这里的args可以改成x的，变量名可更改，全称为arguements（参数）
	{
		System.out.println(args);
	}
	//int[] arr=new int[5];  || null ;
}
