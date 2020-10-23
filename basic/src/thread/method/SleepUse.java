package thread.method;

/**
 * @program: basicTest
 * @description: 模拟延时
 * @author: 全栈者也
 * @create: 2020 - 10 - 21 14:20
 **/
public class SleepUse {

    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 10; i++) {

            Thread.sleep(1000);
            System.out.println(i);
        }

    }

}
