package org.example;

import cn.hutool.core.util.HexUtil;
import cn.hutool.core.util.StrUtil;

/**
 * @author liu ya
 * @copyright
 * @program basicTest
 * @create 2022 - 11 - 29:09:02
 */
public class StrUtilTest {

    public static void main(String[] args) {

        // strUtil
        boolean b = StrUtil.hasBlank("");
        boolean b1 = StrUtil.hasBlank(" ");
        boolean b2 = StrUtil.hasBlank(null);
        System.out.println(b);
        System.out.println(b1);
        System.out.println(b2);


        String template = "{}爱{}，就像老鼠爱大米";
        String str = StrUtil.format(template, "我", "你"); //str -> 我爱你，就像老鼠爱大米
        System.out.println(str);

        System.out.println(StrUtil.HTML_APOS);



    }

}
