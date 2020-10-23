package thread.method;

/**
 * @program: basicTest
 * @description: 守护线程 使用测试
 * @author: 全栈者也
 * @create: 2020 - 10 - 21 16:07
 **/
public class DaemonUse {

    /**
     * 线程分为用户线程和守护线程
     * 虚拟机必须确保用户线程执行完毕
     * 虚拟机不必等待守护线程执行完毕
     *
     */
    public static void main(String[] args) {
            Dog dog = new Dog();
            Man man = new Man();

        Thread threadDog = new Thread(dog);
        threadDog.setDaemon(true);
        threadDog.start();

        //启动 一年倒计时
        new Thread(man).start();

    }
}

class Dog implements Runnable{
    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("汪");
        }
    }
}

class Man implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 365; i++) {
            System.out.println("hehe==="+i);
        }
        System.out.println(" later is gone!");
    }
}
