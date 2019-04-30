package com.xianjinxia.multiDatasource.srotMethod;

public class SortMethod {
    public static void main(String[] args) {
        int temp[]={3,5,6,2,8,9,4};
//        int[] arr = bubbleSort(temp);

        int[] arr2 = insertSort(temp);

        System.out.println("");

    }

    public static int[] bubbleSort(int[] arr){
        int temp;
        for (int i = 0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }

    //直接插入排序
    //https://baike.baidu.com/item/%E7%9B%B4%E6%8E%A5%E6%8F%92%E5%85%A5%E6%8E%92%E5%BA%8F/8255911
    public static int[] insertSort(int[] array){
        for(int i=1;i<array.length;i++)//第0位独自作为有序数列，从第1位开始向后遍历
        {
            if(array[i]<array[i-1])//0~i-1位为有序，若第i位小于i-1位，继续寻位并插入，否则认为0~i位也是有序的，忽略此次循环，相当于continue
            {
                int temp=array[i];//保存第i位的值
                int k = i - 1;
                for(int j=k;j>=0 && temp<array[j];j--)//从第i-1位向前遍历并移位，直至找到小于第i位值停止
                {
                    array[j+1]=array[j];
                    k--;
                }
                array[k+1]=temp;//插入第i位的值
            }
        }
        return array;
    }
}
