package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @program: basicTest
 * @description: 流式处理test
 *                  Max
 *                  Min
 *                  distinct
 * @author: 全栈者也
 * @create: 2020 - 10 - 05 15:07
 **/
public class StreamTest {

    public static void main(String[] args) {

        //常用测试
        List<String> list = Arrays.asList("张三", "李四", "王五", "xuwujing");

        List<String> collect = list.stream().filter(name -> !name.equals("李四")).collect(Collectors.toList());
        System.out.println("stream过滤之后:" + collect);


        //得到最大最小值
        List<String> list13 = Arrays.asList("zhangsan","lisi","wangwu","xuwujing");
        int maxLines = list13.stream().mapToInt(String::length).max().getAsInt();
        int minLines = list13.stream().mapToInt(String::length).min().getAsInt();
        System.out.println("最长字符的长度:" + maxLines+",最短字符的长度:"+minLines);

        //得到去重之后的数据
        String lines = "good good study day day up";
        List<String> list14 = new ArrayList<String>();
        list14.add(lines);

        //先把长度大于0的找出来
        // 然后全部换为大写
        // 在进行去重复
        List<String> words = list14.stream().flatMap(line -> Stream.of(line.split(" "))).filter(word -> word.length() > 0)
                .map(String::toLowerCase).distinct().sorted().collect(Collectors.toList());
        System.out.println("去重复之后:" + words);

    }

}
