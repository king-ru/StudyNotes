import java.util.*;

class BaseSort {
    public int i, j, temp;

    public void sort(int[] a) {
        System.out.println("排序算法");
    }

    public void print(int[] a) {
        System.out.println(Arrays.toString(a));
    }
}

//选择排序
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

//插入排序
class InsertSort extends BaseSort {
    void sort(int[] array, int first, int last) {
        for (i = first + 1; i <= last; i++)            //依次插入从第2个开始的所有元素开始进行插入
        {
            temp = array[i];        //将要插入的值存储起来
            j = i - 1;                    //将该值和前面的值作比较
            while ((j >= first) && (array[j] > temp))
            //将要插入的数和前面的数逐一比较，大于temp时，该数后移，将temp覆盖。
            //当first=0，j循环到-1时，说明temp前面的元素都比temp大。
            {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;            //被排序数放到正确的位置

        }
    }
}

//快速排序
class QuickSort extends BaseSort {
    void sort(int[] arr, int left, int right) {
        if (left < right) {
            i = left;
            j = right;
            temp = arr[i];		//以最左边的值为基准进行快排，小于该值的放左边，大于该值的放右边
            do {
                while (arr[j] > temp && i < j)		//从右向左找第一个小于标准值的位置j
                    j--;
                if (i < j) {										//将第j个元素置于左端并重置i
                    arr[i] = arr[j];
                    i++;
                }
                while (arr[i] < temp && i < j)		//从左向右找第一个大于标准值的位置i
                    i++;
                if (i < j) {										//将第i个元素置于右端并重置j
                    arr[j] = arr[i];
                    j--;
                }
            } while (i != j);
            arr[i] = temp;								//将标准值放到它的最终位置，本次循环结束
            sort(arr, left, i - 1);						//对标准值左半部递归
            sort(arr, i + 1, right);					//对标准值右半部递归
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
	//使用共同方法print,判断类别调用不同的sort方法
    public static void function(BaseSort b) {		//BaseSort b=new SelectSort();父类引用指向子类对象
        if (b instanceof SelectSort) {
            SelectSort s = (SelectSort) b;				//向下转型，调用自己的方法
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
