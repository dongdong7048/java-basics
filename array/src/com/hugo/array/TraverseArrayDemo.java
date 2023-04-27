package com.hugo.array;

import org.junit.Test;

import java.util.Arrays;

public class TraverseArrayDemo {
    /**
     * 在Java中Array的打印有幾種方法：
     * 1. for迴圈
     * 2. 增強for循環
     * 3. Stream Api遍歷
     *
     * 注意事項：
     * 因為Array本身沒有提供toString的複寫，因此若直接打印整個Array物件本身或使用Array物件的toString()方法都只會打印其自身的物件記憶體位址
     * 因此若需要打印整個Array物件，可以使用以上幾個方法，或可以使用Arrays.toString(ArrayObject)來打印
     * 如果Array物件是一個多維度的陣列，可以使用Arrays.toDeepString(ArrayObject)來打印
     * */
    int[] intArray = {1,3,25,56,71,33,12,2,0,34,5,55,99};


    @Test
    public void testTraverseArray_1(){
        // 1. 使用for迴圈
        System.out.println("使用for迴圈打印 ");
        for(int i = 0 ; i<intArray.length ; i++){
            System.out.print(intArray[i]+"\t");
        }

        // 2. 使用增強for循環
        System.out.println("\n使用增強for循環打印 ");
        for(int i:intArray){
            System.out.print(i+"\t");
        }

        // 3. Stream Api打印
        System.out.println("\n使用Stream Api打印 ");
        Arrays.stream(intArray).forEach(num->System.out.print(num+"\t"));

        // 4. 利用Arrays的toString()方法
        System.out.println("\nArrays的toString方法 ");
        System.out.println(Arrays.toString(intArray));

    }
}
