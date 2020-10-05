package singleton;

/**
 * @program: basicTest
 * @description:
 * @author: 全栈者也
 * @create: 2020 - 10 - 03 09:12
 **/
public class Test {

    public static void main(String[] args) {
        System.out.println(SingletonByHunger.getSingletonByHunger());

        System.out.println( SingletonByLaze.getSingletonByLaze());

        System.out.println(SingleByInnerClass.getInstance());


    }

}
