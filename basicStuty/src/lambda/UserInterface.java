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

@FunctionalInterface
interface UserInterfaceByOne {
    User get(String name);
}