package org.example;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.lang.Dict;

/**
 * @author liu ya
 * @copyright
 * @program basicTest
 * @create 2022 - 11 - 29:13:12
 */
public class DictTest {

    public static void main(String[] args) {
        Dict dict = Dict.create()
                .set("key1", 1)//int
                .set("key2", 1000L)//long
                .set("key3", DateTime.now());//Date

        Long key21 = dict.getLong("key2");
        System.out.println(key21);
    }
}
