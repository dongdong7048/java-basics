package com.hugo.datatype.typecasting;

import org.junit.Test;

public class TypeCastingDemo {
    /**
     * java類型轉換(Type Casting)是指將一種原始數據類型的值分配給另一種類型。
     *
     * 在 Java 中，有兩種類型的轉換：
     *
     * Widening Casting - 將較小的類型轉換為較大的類型，java會自動地進行轉型
     * byte-> short-> char-> int-> long-> float->double
     *
     * Narrowing Casting - 將較大的類型轉換為較小的類型，需要開發者手動強制轉型
     * double-> float-> long- int> char-> short->byte
     *
     * 八個基本數據類型中，類型轉換唯一不包含 boolean
     * */
    @Test
    public void typeCasting(){
        //較小類型轉換成較大類型，會自動轉型
        double d = 2023;
        int i = 72;
        d = i;
        System.out.println("double d: "+d); //72.0

        //較大類型轉換成較小類型，需手動強制轉型
        double d2 = 2023;
        int i2 =72;
        i2 = (int)d2;
        System.out.println("int i2: "+i2); //2023



    }
}
