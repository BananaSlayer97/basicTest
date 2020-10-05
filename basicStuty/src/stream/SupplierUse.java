package stream;

import lambda.User;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * @program: basicTest
 * @description: 通过实现Supplier类的方法可以自定义流计算规则。
 * @author: 全栈者也
 * @create: 2020 - 10 - 05 17:09
 **/
public class SupplierUse {


    public static void main(String[] args) {
        System.out.println("自定义一个流进行计算输出:");
        Stream.generate(new UserSupplier()).limit(2).forEach(u -> System.out.println(u.getId() + ", " + u.getName()));

    }


}
class UserSupplier implements Supplier<User> {
    private int index = 10;
    private Random random = new Random();

    @Override
    public User get() {
        return new User(index++, "pancm" + random.nextInt(10));
    }
}