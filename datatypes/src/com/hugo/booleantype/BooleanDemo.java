package com.hugo.booleantype;

import org.junit.Test;

public class BooleanDemo {

    /**
     * boolean 是 Java 中最基本的數據類型之一，用於表示真假值。Java 中的boolean值只有兩個：true 和 false，它們分別代表真和假。
     *
     * boolean類型在 Java 中是一個原始類型，因此它不是一個對象，而是一個直接存儲數據值的內存位置。boolean類型的取值範圍只有 true 和 false 兩個值。
     *
     * 開發注意事項：
     * 1. 在 Java 中，boolean類型的默認值是 false。也就是說，如果你聲明了一個boolean變量，但沒有給它賦值，那麼它的值就是 false。
     * 2. boolean類型常用於控制流程中，如 if、while、for 等條件判斷語句。當表達式的值為 true 時，控制流程才會執行相應的代碼塊。
     * */
    @Test
    public void testBoolean(){
        boolean isTruth = false;

        if(isTruth)
            System.out.println("isTruth is ture");
        else
            System.out.println("isTruth is false");

    }
}
