package stream;

import lambda.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: basicTest
 * @description: Stream流的filter使用
 * @author: 全栈者也
 * @create: 2020 - 10 - 05 15:35
 **/
public class FilterUse {

    /**
     * filter方法用于通过设置的条件过滤出元素。
     * @param args
     */
    public static void main(String[] args) {


        //通过与 findAny 得到 if/else 的值
        List<String> list = Arrays.asList("张三", "李四", "王五", "xuwujing");
        String result3 = list.stream().filter(str -> "李四".equals(str)).findAny().orElse("找不到!");
        String result4 = list.stream().filter(str -> "李二".equals(str)).findAny().orElse("找不到!");

        System.out.println("stream 过滤之后 2:" + result3);
        System.out.println("stream 过滤之后 3:" + result4);


        // 通过与 mapToInt 计算和
        List<User> lists = new ArrayList<User>();
        lists.add(new User(6, "张三"));
        lists.add(new User(2, "李四"));
        lists.add(new User(3, "王五"));
        lists.add(new User(1, "张三"));
        // 计算这个list中出现 "张三" id的值
        int sum = lists.stream().filter(u -> "张三".equals(u.getName())).mapToInt(u -> u.getId()).sum();
        System.out.println(sum);

    }
}
