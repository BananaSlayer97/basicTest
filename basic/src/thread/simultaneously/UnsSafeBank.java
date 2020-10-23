package thread.simultaneously;

/**
 * @program: basicTest
 * @description: 并发取钱
 * @author: 全栈者也
 * @create: 2020 - 10 - 22 10:18
 **/
public class UnsSafeBank {

    public static void main(String[] args) {

        Account account = new Account(100,"结婚基金");

        Drawing you = new Drawing(account,50, "你");
        Drawing girlFriend = new Drawing(account,100, "girlFriend");

        you.start();
        girlFriend.start();
    }



}

class Account{
        int money;
        String name;

    public Account(int money, String name) {
        this.money = money;
        this.name = name;
    }
}

class Drawing extends Thread {
    //账户
    Account account;

    //取了多少钱
    int drawingMoney;

    //现在手里有多少钱
    int nowMoney;

    public Drawing(Account account, int drawingMoney, String name) {
        super(name);
        this.account = account;
        this.drawingMoney = drawingMoney;
    }

    //取钱
    @Override
    public void run() {
        //判断有没有钱

        synchronized(account){

            System.out.println("现在剩余"+account.money);
            if (account.money - drawingMoney < 0) {
                    System.out.println(this.getName() + "钱不够，取不了");
                    return;
                }
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                //卡内余额=余额–你取的钱
                account.money = account.money - drawingMoney;

                //你手里的钱
                nowMoney = nowMoney + drawingMoney;

                System.out.println(Thread.currentThread().getName() + "手里有"+nowMoney);
        }

    }
}