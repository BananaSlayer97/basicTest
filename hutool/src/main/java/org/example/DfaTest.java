package org.example;

import cn.hutool.core.lang.Assert;
import cn.hutool.dfa.WordTree;

import java.util.List;

/**
 * @author liu ya
 * @copyright
 * @program basicTest
 * @create 2022 - 11 - 30:15:40
 */
public class DfaTest {

    public static void main(String[] args) {

        WordTree tree = new WordTree();
        tree.addWord("大");
        tree.addWord("大土豆");
        tree.addWord("土豆");
        tree.addWord("刚出锅");
        tree.addWord("出锅");


        //正文
        String text = "我有一颗大土豆，刚出锅的";

        // 匹配到【大】，就不再继续匹配了，因此【大土豆】不匹配
        // 匹配到【刚出锅】，就跳过这三个字了，因此【出锅】不匹配（由于刚首先被匹配，因此长的被匹配，最短匹配只针对第一个字相同选最短）
        List<String> matchAll = tree.matchAll(text, -1, false, false);
        //Assert.assertEquals(matchAll.toString(), "[大, 土豆, 刚出锅]");
        System.out.println(matchAll.toString());
    }
}
