/*
Arrays:���ڲ�������Ĺ����࣬���涼�Ǿ�̬������

asList:��������list���ϡ�

��һ������û�й��캯���Ļ���˵������ֱ�Ӵ�����������ķ������Ǿ�̬������
�������ģʽ��֤��һ�����ж����Ψһ�ԡ�
*/
import java.util.*;
class  ArraysDemo
{
	public static void main(String[] args) 
	{
		/*
		int[] arr={2,34,4};
		System.out.println(Arrays.toString(arr));
		*/
		String[] arr={"aaa","bbb","ccc"};
		//��������list������ʲô�ô���
		/*
		����ʹ�ü����е�˼��ͷ��������������е�Ԫ�ء�
		ע�⣺�������ɼ��Σ�������ʹ�ü��ϵ���ɾ������
		��Ϊ����ĳ����ǹ̶��ģ�������UNSupportOperationException��
		*/                                     
		List<String> list=Arrays.asList(arr);
		sop("cointains:"+list.contains("fff"));
		sop(list);
		/*
		��������Ԫ�ض��Ƕ�����ô��ɼ���ʱ�������е�Ԫ�ؾ�ֱ��ת�ɼ����е�Ԫ�ء���
				Integer[] num={1,2,3};
				List<Integer>list=Arrays.asList(num);
		
		��������е�Ԫ�ض��ǻ����������ͣ���ô�Ὣ��������Ϊ�����е�Ԫ�ش��ڡ�
				int[] num={1,2,3};
				List<int[]>list=Arrays.asList(num);
		
		*/
		

 	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
