import java.util.*;

class BaseSort {
    public int i, j, temp;

    public void sort(int[] a) {
        System.out.println("�����㷨");
    }

    public void print(int[] a) {
        System.out.println(Arrays.toString(a));
    }
}

//ѡ������
 class SelectSort extends BaseSort {
    public void sort(int[] arr) {
        for (i = 0; i < arr.length - 1; i++) {
            for (j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }
}

//��������
class InsertSort extends BaseSort {
    void sort(int[] array, int first, int last) {
        for (i = first + 1; i <= last; i++)            //���β���ӵ�2����ʼ������Ԫ�ؿ�ʼ���в���
        {
            temp = array[i];        //��Ҫ�����ֵ�洢����
            j = i - 1;                    //����ֵ��ǰ���ֵ���Ƚ�
            while ((j >= first) && (array[j] > temp))
            //��Ҫ���������ǰ�������һ�Ƚϣ�����tempʱ���������ƣ���temp���ǡ�
            //��first=0��jѭ����-1ʱ��˵��tempǰ���Ԫ�ض���temp��
            {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;            //���������ŵ���ȷ��λ��

        }
    }
}

//��������
class QuickSort extends BaseSort {
    void sort(int[] arr, int left, int right) {
        if (left < right) {
            i = left;
            j = right;
            temp = arr[i];		//������ߵ�ֵΪ��׼���п��ţ�С�ڸ�ֵ�ķ���ߣ����ڸ�ֵ�ķ��ұ�
            do {
                while (arr[j] > temp && i < j)		//���������ҵ�һ��С�ڱ�׼ֵ��λ��j
                    j--;
                if (i < j) {										//����j��Ԫ��������˲�����i
                    arr[i] = arr[j];
                    i++;
                }
                while (arr[i] < temp && i < j)		//���������ҵ�һ�����ڱ�׼ֵ��λ��i
                    i++;
                if (i < j) {										//����i��Ԫ�������Ҷ˲�����j
                    arr[j] = arr[i];
                    j--;
                }
            } while (i != j);
            arr[i] = temp;								//����׼ֵ�ŵ���������λ�ã�����ѭ������
            sort(arr, left, i - 1);						//�Ա�׼ֵ��벿�ݹ�
            sort(arr, i + 1, right);					//�Ա�׼ֵ�Ұ벿�ݹ�
        }
    }
}

public class Sort {

    static int[] arr = {3, 4, 8, 9, 5, 6, 1, 8, 2, 7, 10};

    public static void main(String[] args) {
        function(new SelectSort());
		function(new InsertSort());
		function(new QuickSort());
    }
	//ʹ�ù�ͬ����print,�ж������ò�ͬ��sort����
    public static void function(BaseSort b) {		//BaseSort b=new SelectSort();��������ָ���������
        if (b instanceof SelectSort) {
            SelectSort s = (SelectSort) b;				//����ת�ͣ������Լ��ķ���
            s.sort(arr);
        }
        if (b instanceof InsertSort) {
            InsertSort i = (InsertSort) b;
            i.sort(arr, 0, arr.length - 1);
        }
        if (b instanceof QuickSort) {
            QuickSort q = (QuickSort) b;
            q.sort(arr, 0, arr.length - 1);
        }
        b.print(arr);
    }
}
