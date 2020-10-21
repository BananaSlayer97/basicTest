package thread;

/**
 * @program: basicTest
 * @description: 礼让线程  ， 礼让 不一定肯定成功，看cup
 * @author: 全栈者也
 * @create: 2020 - 10 - 21 14:22
 **/
public class YieldUse {

    public static void main(String[] args) {

        MyYield myYield = new MyYield();
        new Thread(myYield,"1").start();
        new Thread(myYield,"2").start();
    }
}

class  MyYield implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"线程开始执行");
        Thread.yield();
        System.out.println(Thread.currentThread().getName()+"线程结束");
    }
}
