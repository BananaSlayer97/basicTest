package stream;

import lambda.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * @program: basicTest
 * @description: Stream流的sort使用
 * @author: 全栈者也
 * @create: 2020 - 10 - 05 16:30
 **/
public class SortUse {

    /**
     * sorted方法用于对流进行升序排序。
     * @param args
     */
    public static void main(String[] args) {

        //随机取值排序
        Random rd2 = new Random();
        System.out.println("取到的前三条数据然后进行排序:");
        rd2.ints().limit(3).sorted().forEach(System.out::println);


        List<User> list9 = new ArrayList<User>();
        for (int i = 1; i < 4; i++) {
            User user = new User(i, "pancm" + i);
            list9.add(user);
        }


        //先获取在排序效率会更高!
        //普通的排序取值
        List<User> list11 = list9.stream().sorted((u1, u2) -> u1.getName().compareTo(u2.getName())).limit(3).collect(Collectors.toList());
        System.out.println("排序之后的数据:" + list11);

        //优化排序取值
        List<User> list12 = list9.stream().limit(3).sorted((u1, u2) -> u1.getName().compareTo(u2.getName())).collect(Collectors.toList());
        System.out.println("优化排序之后的数据:" + list12);

    }

}
