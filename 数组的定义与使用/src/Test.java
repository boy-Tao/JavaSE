import java.sql.Array;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
/*
         //数组的基本用法
        int[] arr = new int[3];
        int[] arr1 = {1,2,3};

        System.out.println(arr1.length);
        System.out.println(arr1[2]);

        //遍历数组
        for (int x:arr1) {
            System.out.print(x);
        }
        System.out.println();

        //打印数组
        printArray(arr1);

        //理解引用类型
        func(arr1);
        System.out.println(arr1[1]);

        //数组作为方法的返回值
        //代码示例: 写一个方法, 将数组中的每个元素都 * 2

        int[] a = transform(array);
        printArray(a);

        //数组转字符串
        int[] array = {9,7,8,5,6};
        String newArr = Arrays.toString(array);
        System.out.println(newArr);

        //自己实现数组转字符串
        System.out.println(toString(array));

        //数组的拷贝
        int[] arr = {1, 2, 3, 8, 9};
        int[] newArr = Arrays.copyOf(arr,arr.length);
        System.out.println(Arrays.toString(newArr));

        //自己实现数组的拷贝
        System.out.println(Arrays.toString(copyOf(arr)));

        //找数组中的最大元素
        int[] arr = {8, 7, 6, 9, 2};
        System.out.println(max(arr));

        //求数组中元素的平均值
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(avg(arr));

        //查找数组中指定元素(顺序查找)
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(find(arr,6));

        //查找数组中指定元素(二分查找) 针对有序数组
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(binarySearch(arr, 6));

        //检查数组的有序性(升序）
        int[] arr = {1, 3, 6, 8, 2, 9};
        System.out.println(isSorted(arr));

        //数组排序(冒泡排序)
        int[] arr = {5, 3, 6, 8, 2, 7};
        System.out.println(Arrays.toString(bubbleSort(arr)));

        //数组逆序
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(reverse(arr)));

        //数组数字排列
        //给定一个整型数组, 将所有的偶数放在前半部分, 将所有的奇数放在数组后半部分
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(rank(arr)));
*/
        //二维数组
        int[][] array = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%d\t",array[i][j]);
            }
            System.out.println();
        }
    }

    public static int[] rank(int[] arr) {
        int left = 0;
        int right = arr.length-1;
        while (left < right){
            while (left < right && arr[left] % 2 == 0){
                left++;
            }
            while (left < right && arr[right] % 2 == 1){
                right--;
            }
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
            left++;
            right--;
        }
        return arr;
    }

    public static int[] reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right){
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
            left++;
            right--;
        }
        return arr;
    }

    public static int[] bubbleSort(int[] arr) {
        boolean flg = false;
        for (int i = 0; i < arr.length; i++) {
            flg = false;
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    flg = true;
                }
            }
            if (!flg){
                return arr;
            }
        }
        return arr;
    }

    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }

    public static int binarySearch(int[] arr, int toFind) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right){
            int mid = (left + right) / 2;
            if (arr[mid] > toFind) {
                right = mid - 1;
            }else if(arr[mid] < toFind) {
                left = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    public static int find(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num){
                return i;
            }
        }
        return -1;
    }

    public static double avg(int[] arr) {
        int sum = 0;
        for (int x:arr) {
            sum += x;
        }
        return (double)sum/(double)arr.length;
    }

    public static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static int[] copyOf(int[] arr) {
        int[] ret = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ret[i] = arr[i];
        }
        return ret;
    }

    public static String toString(int[] array) {
        String str = "[";
        for (int i = 0; i < array.length; i++) {
            str += array[i];
            if (i < array.length - 1){
                str += "，";
            }
        }
        str += "]";
        return str;
    }

    public static int[] transform(int[] array) {
        int[] ret = new int[array.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = array[i] * 2;
        }
        return ret;
    }

    public static void func(int[] a) {
        a[1] = 5;
        System.out.println(a[1]);
    }

    public static void printArray(int[] arr1) {
        for (int x:arr1) {
            System.out.print(x + " ");
        }
        System.out.println();
    }


}
