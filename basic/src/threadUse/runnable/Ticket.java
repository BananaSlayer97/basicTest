package threadUse.runnable;

/**
 * @program: basicTest
 * @description: 模拟抢票
 * @author: 全栈者也
 * @create: 2020 - 10 - 20 23:35
 **/
public class Ticket implements Runnable {

    private int ticketNumbers = 10;

    @Override
    public void run() {

        while (true){
            if (ticketNumbers <= 0){
                break;
            }
            System.out.println(Thread.currentThread().getName()+"-->抢到了第"+ticketNumbers--+"票");
        }

    }
}

class  Main4{
    public static void main(String[] args) {

        new Thread(new Ticket(),"骄傲").start();
        new Thread(new Ticket(),"嫉妒").start();
        new Thread(new Ticket(),"贪婪").start();
        new Thread(new Ticket(),"暴食").start();

    }
}
