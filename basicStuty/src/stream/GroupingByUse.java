package stream;

import lambda.User;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @program: basicTest
 * @description: groupingBy：分组排序
 * @author: 全栈者也
 * @create: 2020 - 10 - 05 17:20
 **/
public class GroupingByUse {

    public static void main(String[] args) {

        System.out.println("通过id进行分组排序:");

        Map<Integer, List<User>> personGroups = Stream.generate(new UserSupplier2()).limit(5).collect(Collectors.groupingBy(User::getId));

        Iterator it = personGroups.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, List<User>> persons = (Map.Entry) it.next();
            System.out.print("id " + persons.getKey() + " = ");
            System.out.println(persons.getValue());
        }
    }
}

class UserSupplier2 implements Supplier<User> {
    private int index = 10;
    private Random random = new Random();

    @Override
    public User get() {
        return new User(index % 2 == 0 ? index++ : index, "pancm" + random.nextInt(10));
    }
}