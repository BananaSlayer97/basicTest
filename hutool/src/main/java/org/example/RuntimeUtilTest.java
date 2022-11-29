package org.example;

import cn.hutool.core.util.RuntimeUtil;

/**
 * @author liu ya
 * @copyright
 * @program basicTest
 * @create 2022 - 11 - 29:12:52
 */
public class RuntimeUtilTest {

    public static void main(String[] args) {
        String str = RuntimeUtil.execForStr("ls");
        System.out.println(str);

    }

}
