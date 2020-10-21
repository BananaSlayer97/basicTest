package lambda;

/**
 * @program: basicTest
 * @description: 接口
 * @author: 全栈者也
 * @create: 2020 - 10 - 05 13:09
 **/
@FunctionalInterface
interface UserInterfaceByZero {
    User get();
}

class  UserInterfaceByZeroChild implements  UserInterfaceByZero{
    @Override
    public User get() {
        return new User("li san");
    }
}

@FunctionalInterface
interface UserInterfaceByOne {
    User get(String name);
}