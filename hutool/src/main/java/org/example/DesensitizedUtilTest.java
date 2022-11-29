package org.example;

import cn.hutool.core.util.DesensitizedUtil;

/**
 * @author liu ya
 * @copyright
 * @program basicTest
 * @create 2022 - 11 - 29:13:06
 */
public class DesensitizedUtilTest {

    public static void main(String[] args) {

        String s = DesensitizedUtil.mobilePhone("17513286893");
        System.out.println(s);

    }
}
