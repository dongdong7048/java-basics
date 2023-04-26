package com.hugo.datatype.character;

import org.junit.Test;

public class CharDemo {

    /**
     * 在Java中，char是一種用於表示單個字符的原始數據類型，它佔用16位（即2個字節）的存儲空間。char類型可以用單引號括起來的單個字符表示，例如：'a'、'b'、'c'等。
     *
     * char類型的特點：
     * 1. char類型的取值範圍是0到65535。這個範圍包含了所有Unicode字符的編碼值。
     * 2. 可以使用Unicode編碼表示特殊字符，例如：'\u0020'表示空格
     * 3. char類型可以進行算術運算，因為它的編碼值可以被視為一個整數。
     * 4.char類型與String類型之間可以進行互相轉換，例如：使用String類的valueOf方法可以將char類型轉換為對應的字符串。
     * */
    @Test
    public void testChar(){
        char c1 = 'a';
        System.out.println(c1);

        char c2 = '\u0020'; //表示空格
        System.out.println("He"+c2+"llo");

        char c3 = 'b';

        int result = c1+c3; //char類型相加，java會先將其提升為int型後再進行相加
        System.out.println("(int)c1: "+(int)c1);
        System.out.println("(int)c3: "+(int)c3);
        System.out.println("c1+c3: "+result);

        char c4 = '中';
        String s = String.valueOf(c4); //將char類型傳換成String字符串
        System.out.println("c4 : "+c4);
        System.out.println("String.valueOf(c4): "+s);

        char c5 = s.charAt(0); //將字符串轉換成char類型
        System.out.println("s.charAt(0): "+c5);

    }
}
