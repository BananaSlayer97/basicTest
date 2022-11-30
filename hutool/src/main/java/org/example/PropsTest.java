package org.example;

import cn.hutool.setting.dialect.Props;

/**
 * @author liu ya
 * @copyright
 * @program basicTest
 * @create 2022 - 11 - 30:15:04
 */
public class PropsTest {

    public static void main(String[] args) {

        Props props = new Props("propsTest.properties");
        String test = props.getStr("propertiesTest");
        System.out.println(test);

    }
}
