package com.hugo.string;


import org.junit.Test;
import org.junit.platform.commons.util.StringUtils;

import java.util.Arrays;

public class StringDemo {

    /**
     * Java中的String類是用來處理字串的類別，可以用以下方式建立字串
     * 1. String s = "hello"
     * 2. String s = new String("hello")
     *
     * 兩種都是創建字串的方式，不過建議使用第1種來建立即可
     *
     * 關於String類中的一些操作與Api功能
     * 1. 字串連接，兩個字串變量以'+'號來串接
     * 2. 獲取字串長度：str.legnth()
     * 3. 取得字串中的子字串：str.subString()
     * 4. 取得字串中的子字串(提供開始到結束的index)：subString(int Start,int end)
     * 5. 字串是否相等：str.equals(str2)
     * 6. 忽略大小進行比較：str1.equalsIgnoreCase(str2)
     * 7. 字串分割：str.split(notNullString)
     * 8. 字串替換：str.replace()
     * 9. 字串轉換:str.valueOf(otherDatatypeValue)
     * 10. 字串轉int：Integer.parseInt(str)
     * 11. 是否為空字串：str.isEmpty()
     * 12. 是否為空白字串(空字串、tab、換行符):str.isBlank()
     *
     * */

    @Test
    public void testString(){

        String s1 = "Hello"; //創建Hello字串
        String s2 = "World";

        // 1. 字串串接
        String s3 = s1 + " " + s2;
        System.out.println(s3); //Hello World

        // 2. 獲取字串長度
        System.out.println( s3.length() ); // 11(包含空格)

        // 3. 獲得字串中的子字串
        String s4 = s3.substring(6); //獲取從index為6至字串尾的字串
        System.out.println(s4);  // World

        // 4. 獲取字串中的子字串，有開始至結束的index參數
        String s5 = s3.substring(0, 6);  //獲取從index 0 至 5的字串
        System.out.println(s5); // Hello

        // 5. 字串是否相等
        String s6 = "Hello World";
        System.out.println(s6.equals(s3)); //true
        System.out.println(s6.equals(s5)); //false

        // 6. 忽略大小進行比較
        String s7 = "hello world";
        System.out.println(s7.equalsIgnoreCase(s3)); //true

        // 7. 字串分割
        String[] sArr = s7.split("");
        System.out.println(Arrays.toString(sArr)); // [h, e, l, l, o,  , w, o, r, l, d]

        // 8. 字串替換
        String s8 = s3.replace("Hello", "Beautiful");
        System.out.println(s8); //Beautiful World

        // 9.字串轉換
        double d = 20.002;
        String s9 = String.valueOf(d);
        System.out.println(s9); //"20.002"

        // 10.字串轉成整數
        String s10 = "136";
        int num = Integer.parseInt(s10);
        System.out.println(num); //136

        // 11. 是否為空字串
        String s11 = "";
        String s12 = "  ";
        String s13 = "\n";
        String s14 = null;
        System.out.println(s11.isEmpty()); //true
        System.out.println(s12.isEmpty()); //false
        System.out.println(s13.isEmpty()); //false
//        System.out.println(s14.isEmpty()); //會報NullPointerException的異常


        // 12. 是否為空白字串(空字串、tab、換行符)
        System.out.println(s11.isBlank()); //true
        System.out.println(s12.isBlank()); //true
        System.out.println(s13.isBlank()); //true
//        System.out.println(s14.isBlank()); //會報NullPointerException的異常

        // 關於字串是否為空白字串或null可以使用StringUtils的isBlank()來判別
        System.out.println(StringUtils.isBlank(s11)); // true
        System.out.println(StringUtils.isBlank(s12)); // true
        System.out.println(StringUtils.isBlank(s13)); // true
        System.out.println(StringUtils.isBlank(s14)); // true






    }
}
