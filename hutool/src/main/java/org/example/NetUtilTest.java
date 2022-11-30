package org.example;

import cn.hutool.core.net.NetUtil;

/**
 * @author liu ya
 * @copyright
 * @program basicTest
 * @create 2022 - 11 - 29:14:07
 */
public class NetUtilTest {
    public static void main(String[] args) {

        //检测本地端口可用性
        boolean result= NetUtil.isUsableLocalPort(8080);
        System.out.println(result);
    }
}
