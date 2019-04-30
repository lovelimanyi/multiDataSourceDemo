package com.xianjinxia.multiDatasource;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Sort_Test {

    //插入排序测试
    @Test
    public void test46464(){
        int[] arr= {6,9,8,1,2,3,7,4,6};
        int arr2[] = insertSort(arr);
        System.out.println();
    }

    //插入排序
    private static int[] insertSort(int[] arr) {
        System.out.println(JSONObject.toJSONString(arr));
        if (arr == null || arr.length < 2) {
            return arr;
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    //TODO:
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    //接下来是无用功
                    break;
                }
            }
        }
        System.out.println(JSONObject.toJSONString(arr));
        return arr;
    }


    //冒泡排序
    @Test
    public void test() {
        System.out.println("111111");

        int arr[] = {5, 6, 9, 4, 12, 8};
        System.out.println(JSONObject.toJSONString(arr));
        int i, j, temp;
        for (i = 0; i < arr.length - 1; i++) {
            for (j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(JSONObject.toJSONString(arr));
        System.out.println("22222");
    }

    //for(int i = 0;i<3;i++)情况的，只打印0  1  2
    @Test
    public void test33() {

        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }
    }

}
