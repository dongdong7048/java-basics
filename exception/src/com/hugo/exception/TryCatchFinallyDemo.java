package com.hugo.exception;

import org.junit.Test;

import java.io.*;
import java.util.Scanner;

public class TryCatchFinallyDemo {
    /**
     * Java 中異常處理是一個重要的主題，因為它可以幫助程式開發者在程序執行時發生問題時更有效地處理錯誤，
     * 避免程式崩潰，提高程式的穩定性。Java 中的異常分為檢查異常和非檢查異常，其中非檢查異常又稱為運行時異常。
     *
     * 1. 檢查異常
     * 檢查異常是指編譯器會強制要求開發者處理的異常，開發者必須在程式中使用 try-catch 塊來處理它們，否則編譯器會報錯。
     * 檢查異常通常是因為外部條件導致的，例如：IO 操作中文件不存在、數組下標越界等。
     *
     * 2. 非檢查異常
     * 非檢查異常是指編譯器不會強制要求開發者處理的異常，開發者可以選擇是否處理它們。
     * 通常這些異常是因為程式內部錯誤導致的，例如：數據類型轉換失敗、空指針引用等。
     *
     * 3. finally 塊
     * finally 塊是一個可選的代碼塊，用於定義一些需要在 try-catch 語句執行完畢後必須執行的代碼，
     * 例如：釋放資源、關閉文件等。無論 try 語句是否產生異常，finally 塊都會被執行。
     *
     * 4. throws 關鍵字
     * throws 關鍵字用於聲明方法可能產生的異常類型，當一個方法可能會產生檢查異常時，開發者必須聲明這些異常類型。
     * 如果方法可能會產生非檢查異常，則不需要聲明。
     * */

    @Test
    public void testExceptionHandling() throws FileNotFoundException {
        // 1. 檢查異常：IO操作 文件不存在
        String fileName = "test.txt";
        File file = new File(fileName);
        try {
            Scanner sc = new Scanner(file); //編譯時會要求需進行異常處理
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println(fileName+"=>文件不存在");
        }

        System.out.println("============================");

        // 1. 檢查異常：數組下標越界
        //情境：購物車中有數個訂單，每十個進行一次性的總額計算，取得第一組訂單總額
        int[] orderCostArr = {120,130,250,330,120,70,70,100,120};
        int onceTime = 10;
        int sum = 0 ;
        for(int i = 0 ; i<onceTime ; i++){
            try{
                sum+=orderCostArr[i];
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("獲取訂單陣列元素異常: "+e.getMessage());
            }
        }

        System.out.println("============================");

        // 2. 非檢查異常：除法分母為0
        //情境：購物車中有數個訂單，每十個進行一次性的總額計算，取得第一組訂單總額
        double d = 100/0;
        System.out.println(d); //會出現 java.lang.ArithmeticException: / by zero 的異常

        System.out.println("============================");

        // 3. finally 塊
        FileWriter fw = null;
        try {
            fw = new FileWriter("aa.txt");
            String content = "Hello World";
            fw.write(content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                fw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("============================");

        // throws拋出異常
        File f3 = new File("myFamily.txt");
        FileInputStream fis  = new FileInputStream(f3); //檢查異常類型，需用try-catch進行異常處理或用throws拋出異常



    }
}
