/*
需求：对于数据库的操作：
数据是：用户信息
1.连接数据库 JDBC
2.操作数据库
	c creat r read u update d delete
3.关闭数据库连接
*/
class UserInfoByJDBC implements UserInfoDao
{
	pubic void add(User user)
	{
		1.JDBC连接数据库；
		2.使用sql添加语句添加数据；
		3.关闭连接；
	}
	public void delete(User user)
	{
		1.JDBC连接数据库；
		2.使用sql添加语句删除数据；
		3.关闭连接；
	}

}
interface UserInfoDao
{
		void add(User user);
		void delete(User user);
}
class DBOperate
 {
	public static void main(String[] args) 
	{
		//UserInfoByJDBC ui=new UserInfoByJDBC();
		UserInfoDao ui=new UserInfoByJDBC() ;
		ui.add(user);//user哪儿来的
		ui.delete(user);
	}
}
