/*
���ϱ����飺
Collection�ӿ��е�toArray������
*/
import java.util.*;
class  CollectionToArray
{
	public static void main(String[] args) 
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("aaa");
		al.add("bbb");
		al.add("ccc");
		/*
		1.ָ�����͵�����Ҫ����೤�أ�
		��ָ�����͵����鳤��С���˼��ϵ�size����ô�÷����ڲ��ͻᴴ��һ���µ����飬����Ϊ���ϵ�size��
		��ָ�����͵����鳤�ȴ����˼��ϵ�size����ô���ᴴ���µ����飬�����ô��ݽ��������顣
		���Դ���һ���պõ��������š�

		2.ΪʲôҪ�����ϱ�����飿
		Ϊ���޶���Ԫ�صĲ���������Ҫ������ɾ��
		*/
		String[] arr=al.toArray(new String[al.size()]);
		System.out.println(Arrays.toString(arr));//Ϊʲô���Ǽ��ϵ���ʽ��
	}
}
