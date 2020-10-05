package lambda;

/**
 * @program: basicTest
 * @description: 测试
 * @author: 全栈者也
 * @create: 2020 - 10 - 05 13:10
 **/
public class LambdaTest {


    public static void main(String[] args) {

        UserInterfaceByZero userInterfaceByZero = User::new;
        System.out.println(userInterfaceByZero.get());

        UserInterfaceByOne userInterfaceByOne = User::new;
        System.out.println(userInterfaceByOne.get("hehe").getName());


    }

}
