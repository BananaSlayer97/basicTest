package thread;

/**
 * @program: basicTest
 * @description:
 * @author: 全栈者也
 * @create: 2020 - 10 - 15 19:34
 **/
public class MyMain {

    public static void main(String[] args) {
        new MyThread("线程 A").start();
        new MyThread("线程 B").start();
    }

}
