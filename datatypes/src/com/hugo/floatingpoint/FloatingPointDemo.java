package com.hugo.floatingpoint;

import org.junit.Test;

public class FloatingPointDemo {

    /**
     * Java中的浮點數類型是指可以表示小數的數據類型。Java提供了兩種浮點數類型：float和double。
     * 1. float類型：
     *      float類型是Java中較短的浮點數類型，佔用4個字節，可表示的範圍為-3.40282347E+38到3.40282347E+38之間的數字，並且精度為約6-7位小數。
     *      注意事項：必須在數字後面加上"f"或"F"，否則Java將認為這是一個double類型。
     *
     * 2. double類型
     *      double類型是Java中較長的浮點數類型，佔用8個字節，可表示的範圍為-1.79769313486231570E+308到1.79769313486231570E+308之間的數字，並且精度為約15-16位小數。
     *      不需要在數字後面加上任何字符，Java將自動認為這是一個double類型。
     *
     * 結論：
     * 在使用浮點數類型時，需要注意以下幾點：
     *
     * 1. 浮點數運算可能會存在精度丟失的問題，因為在計算機中，浮點數並不能精確地表示所有的小數。因此，在比較兩個浮點數是否相等時，不應該直接使用"=="運算符，而應該使用差值的絕對值是否小於某個極小值的方式進行判斷。
     * 2. 浮點數類型的初始值為0.0，而不是null。
     * 3. float類型需要在數字後面加上"f"或"F"，否則Java將認為這是一個double類型。
     * 4. 在需要精確計算的場合，應該使用BigDecimal類型進行計算，而不是使用浮點數類型。
     *
     * */
    @Test
    public void testFloat(){
//        float floatValue = 1.234567;  //數字尾要加上f或F，否則編譯時會視為double類型而編譯不過
        float floatValue = 1.234567F;

        double doubleValue = 1.234567;
        double d1=100; //設定d1值為整數N，打印出來時的值會是N.0，java會自動地將其表示成浮點數的形式
        System.out.println("double初始值: "+d1);

        floatValue = 0F; //同樣如上方d1的狀態相同，打印時會是0.0
        System.out.println("floatValue的值: "+floatValue);


    }
}
