package stream;

import lambda.User;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: basicTest
 * @description: allMatch：Stream 中全部元素符合则返回 true ;
 *               anyMatch：Stream 中只要有一个元素符合则返回 true;
 *              noneMatch：Stream 中没有一个元素符合则返回 true。
 * @author: 全栈者也
 * @create: 2020 - 10 - 05 16:52
 **/
public class MatchUse {

    public static void main(String[] args) {

        List<User> lists = new ArrayList<>();
        lists.add(new User(6, "张三"));
        lists.add(new User(2, "李四"));
        lists.add(new User(3, "王五"));
        lists.add(new User(1, "张三"));

        boolean all = lists.stream().allMatch(u -> u.getId() > 3);
        System.out.println("是否都大于3:" + all);
        boolean any = lists.stream().anyMatch(u -> u.getId() > 3);
        System.out.println("是否有一个大于3:" + any);
        boolean none = lists.stream().noneMatch(u -> u.getId() > 3);
        System.out.println("是否没有一个大于3的:" + none);
    }


}
