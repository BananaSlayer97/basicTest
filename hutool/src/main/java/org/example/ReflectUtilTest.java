package org.example;

import cn.hutool.core.util.ReflectUtil;

import java.lang.reflect.Method;

/**
 * @author liu ya
 * @copyright
 * @program basicTest
 * @create 2022 - 11 - 29:11:26
 */
public class ReflectUtilTest {

    public static void main(String[] args) {

        Method[] methods = ReflectUtil.getMethods(ReflectUtilTest1.class);
        System.out.println(methods);

        Method printStr = ReflectUtil.getMethod(ReflectUtilTest1.class, "printStr");
        System.out.println(printStr);

        ReflectUtilTest1 test1 = new ReflectUtilTest1();
        ReflectUtil.invoke(test1,"printStr","test");

    }
}
