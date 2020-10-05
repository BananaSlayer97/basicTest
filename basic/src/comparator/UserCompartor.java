package comparator;

import java.util.Comparator;

/**
 * @program: basicTest
 * @description:  自定义比较器
 * @author: 全栈者也
 * @create: 2020 - 10 - 03 10:21
 **/
public class UserCompartor implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {

        //若为正数  表示o1大于o2
        return o1.getAge() - o2.getAge();
    }
}
