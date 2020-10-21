package thread;

/**
 * @program: basicTest
 * @description: 线程优先级测试
 * @author: 全栈者也
 * @create: 2020 - 10 - 21 15:40
 **/
public class PriorityUse {

    /**
     * 线程调度器按照优先级决定应该调度哪个线程来执行
     *  用数字 表示  1 - 10
     *
     *  getPriority() 获取优先级
     *  setPriority() 设置优先级
     *
     *  优先级的设定建议在 start 方法之前
     *  优先级的高低只是代表了概率，并不一定
     */

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName() + " ---- "+Thread.currentThread().getPriority());

        MyPriority myPriority = new MyPriority();

        Thread t0 = new Thread(myPriority);
        Thread t1 = new Thread(myPriority);
        Thread t2 = new Thread(myPriority);
        Thread t3 = new Thread(myPriority);
        Thread t4 = new Thread(myPriority);
        Thread t5 = new Thread(myPriority);
        Thread t6 = new Thread(myPriority);

        t0.start();
        t1.start();

        t2.setPriority(1);
        t2.start();

        t3.setPriority(10);
        t3.start();

        t4.start();
        t5.start();
        t6.start();

    }
}

class  MyPriority implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " ---- "+Thread.currentThread().getPriority());
    }
}