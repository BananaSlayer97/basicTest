package org.example;

import cn.hutool.core.io.FileTypeUtil;
import cn.hutool.core.io.FileUtil;

import java.io.File;

/**
 * @author liu ya
 * @copyright
 * @program basicTest
 * @create 2022 - 11 - 28:17:44
 */
public class FileUtilTest {


    public static void main(String[] args) {

        // 得到子级列表
        File[] ls = FileUtil.ls("/Users/liuya/IdeaProjects");
        for (File file : ls){
            System.out.println(file.getName());
        }

        // 得到文件类型

        String type = FileTypeUtil.getType("/Users/liuya/Documents/1984.xmind");
        System.out.printf(type);
    }

}
