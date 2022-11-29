package org.example;

import cn.hutool.core.util.HexUtil;

/**
 * @author liu ya
 * @copyright
 * @program basicTest
 * @create 2022 - 11 - 29:09:22
 */
public class HexUtilTest {
    public static void main(String[] args) {

        // HexUtil 16 进制转换
        String s = HexUtil.decodeHexStr("81");
        System.out.println(s);

    }
}
