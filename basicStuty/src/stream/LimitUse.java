package stream;

import lambda.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @program: basicTest
 * @description: Stream流的limit使用
 * @author: 全栈者也
 * @create: 2020 - 10 - 05 16:24
 **/
public class LimitUse {

    /**
     * limit 方法用于获取指定数量的流。
     * @param args
     */
    public static void main(String[] args) {

        //获取前n条数的数据
        Random rd = new Random();
        System.out.println("取到的前三条数据:");
        IntStream ints = rd.ints();
        ints.limit(5).forEach(System.out::println);

        //结合skip使用得到需要的数据
        //skip表示的是扔掉前n个元素。
        List<User> list9 = new ArrayList<User>();
        for (int i = 1; i < 4; i++) {
            User user = new User(i, "pancm" + i);
            list9.add(user);
        }

        // 取前3条数据，但是扔掉了前面的2条，可以理解为拿到的数据为 2<=i<3 (i 是数值下标)
        List<String> list10 = list9.stream().map(User::getName).limit(3).skip(2).collect(Collectors.toList());
        System.out.println("截取之后的数据:" + list10);
    }

}
