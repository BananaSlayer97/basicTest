package org.example;

import cn.hutool.core.lang.Console;

/**
 * @author liu ya
 * @copyright
 * @program basicTest
 * @create 2022 - 11 - 30:16:15
 */
public class Cat implements Animal{

    @Override
    public String eat() {
        String str = "cat eat fish";
        Console.log(str);
        return str;
    }
}
