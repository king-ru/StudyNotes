/*
���󣺶������ݿ�Ĳ�����
�����ǣ��û���Ϣ
1.�������ݿ� JDBC
2.�������ݿ�
	c creat r read u update d delete
3.�ر����ݿ�����
*/
class UserInfoByJDBC implements UserInfoDao
{
	pubic void add(User user)
	{
		1.JDBC�������ݿ⣻
		2.ʹ��sql������������ݣ�
		3.�ر����ӣ�
	}
	public void delete(User user)
	{
		1.JDBC�������ݿ⣻
		2.ʹ��sql������ɾ�����ݣ�
		3.�ر����ӣ�
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
		ui.add(user);//user�Ķ�����
		ui.delete(user);
	}
}
