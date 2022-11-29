package org.example;

import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.ObjectUtil;

import java.time.Instant;

/**
 * @author liu ya
 * @copyright
 * @program basicTest
 * @create 2022 - 11 - 29:09:28
 */
public class ObjectUtilTest {


    public static void main(String[] args) {

        String ifNull = null;

        //
        String def = ObjectUtil.defaultIfNull(ifNull, "def");
        System.out.println(def);

        //
        Instant result1 = ObjectUtil.defaultIfNull(ifNull,
                () -> DateUtil.parse(ifNull, DatePattern.NORM_DATETIME_PATTERN).toInstant(),
                Instant.now());
        System.out.println(result1);

        //
        String a = "d";
        String b = "b";
        boolean equal = ObjectUtil.equal(a, b);
        System.out.println(equal);


        int[] array = new int[]{1,2,3,4,5};
        int length = ObjectUtil.length(array);
        System.out.println(length);


    }
}
