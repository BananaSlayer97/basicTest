package org.example;

import cn.hutool.aop.ProxyUtil;
import cn.hutool.aop.aspects.TimeIntervalAspect;

/**
 * @author liu ya
 * @copyright
 * @program basicTest
 * @create 2022 - 11 - 30:16:11
 */
public class ProxyUtilTest {

    public static void main(String[] args) {

        Animal cat = ProxyUtil.proxy(new Cat(), TimeIntervalAspect.class);
        cat.eat();

    }
}
