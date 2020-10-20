package threadUse.runnable;

/**
 * @program: basicTest
 * @description: 模拟抢票
 * @author: 全栈者也
 * @create: 2020 - 10 - 20 23:35
 **/
public class Ticket implements Runnable {

    private  int ticketNumbers = 15;

    @Override
    public void run() {

        while (true){
            if (ticketNumbers <= 0){
                break;
            }

            //模拟延时
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName()+"-->抢到了第"+ticketNumbers--+"票");
        }

    }

    public static void main(String[] args) {

        //一个资源，让四个线程去抢
        //这就是并发
        Ticket ticket = new Ticket();

        new Thread(ticket,"骄傲").start();
        new Thread(ticket,"嫉妒").start();
        new Thread(ticket,"暴怒").start();
        new Thread(ticket,"懒惰").start();
        new Thread(ticket,"贪婪").start();
        new Thread(ticket,"暴食").start();
        new Thread(ticket,"色欲").start();


    }
}
