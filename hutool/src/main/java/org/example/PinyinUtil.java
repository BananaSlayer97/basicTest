package org.example;

/**
 * @author liu ya
 * @copyright
 * @program basicTest
 * @create 2022 - 11 - 30:16:03
 */
public class PinyinUtil {
    public static void main(String[] args) {


        // "ni hao"
        String pinyin = cn.hutool.extra.pinyin.PinyinUtil.getPinyin("你好");

        System.out.println(pinyin);
    }
}
