package org.example;

import cn.hutool.core.codec.BCD;
import cn.hutool.core.lang.Assert;

/**
 * @author liu ya
 * @copyright
 * @program basicTest
 * @create 2022 - 11 - 29:13:17
 */
public class BCDTest {
    public static void main(String[] args) {

        String strForTest = "59";

        //转BCD
        byte[] bcd = BCD.strToBcd(strForTest);
        System.out.println(bcd);
        //解码BCD
        String str = BCD.bcdToStr(bcd);
        System.out.println(str);
    }
}
