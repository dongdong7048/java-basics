package com.hugo.array;


import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ArrayDemo {

    /**
     * 陣列（Array）是一種非常常見的資料結構，可以儲存同種型別的多個元素。在 Java 中，宣告一個陣列需要指定陣列元素的型別和元素個數，語法如下：
     * type[] arrayName = new type[length];
     * 其中，type 是陣列元素的型別，arrayName 是陣列的名稱，length 是陣列的元素個數。
     * 例如：
     * int[] nums = new int[5];
     *
     * Java 還提供了一種簡化陣列宣告的語法，如下：
     * type[] arrayName = {value1, value2, ..., valueN};
     * 例如：
     * int[] nums = {1, 2, 3};
     * */
    @Test
    public void testArray(){
        // 1. type[] arrayName = new type[length];
        int[] intArray = new int[10];
        //利用 arrayName[index] = value來對陣列的第幾個位置賦值，index = 0，表示陣列的第一個元素位置
//        intArray[0] = 0;
//        intArray[1] = 1;
//        intArray[2] = 2;
        for(int i = 0 ; i<intArray.length; i++){
            intArray[i] = i;
        }

        System.out.println("intArray: "+Arrays.toString(intArray));

        // 2. type[] arrayName = {value1, value2, ..., valueN};
        double[] doubleArray = {1.0, 2.2, 3.7, 4.4, 5.5, 5.2, 1.8, 9.0, 10.00};
        System.out.println("doubleArray: "+Arrays.toString(doubleArray));
    }
}
