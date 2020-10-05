package stream;

import lambda.User;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @program: basicTest
 * @description: 分区排序
 * @author: 全栈者也
 * @create: 2020 - 10 - 05 17:27
 **/
public class PartitioningByUse {

    public static void main(String[] args) {

        System.out.println("通过年龄进行分区排序:");
        Map<Boolean, List<User>> children = Stream.generate(new UserSupplier3()).limit(5).collect(Collectors.partitioningBy(p -> p.getId() < 18));

        System.out.println("小孩: " + children.get(true));
        System.out.println("成年人: " + children.get(false));

    }

}

class UserSupplier3 implements Supplier<User> {
    private int index = 16;
    private Random random = new Random();

    @Override
    public User get() {
        return new User(index++, "pancm" + random.nextInt(10));
    }
}