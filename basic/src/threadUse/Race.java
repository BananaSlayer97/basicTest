package threadUse;

/**
 * @program: basicTest
 * @description: 实现龟兔赛跑
 * @author: 全栈者也
 * @create: 2020 - 10 - 21 00:03
 **/
public class Race implements Runnable {

    //胜利者
    private static String winner;

        @Override
        public void run() {
                for (int i = 1; i < 101;i++){

                    if(Thread.currentThread().getName().equals("rabbit") && i%10==0){
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    boolean gameover = gameover(i);
                    if (gameover){break;}

                    System.out.println(Thread.currentThread().getName()+"-->跑了"+i+"米");
                }
        }

    /**
     * 判断是否完成比赛
     */
    private boolean gameover(int steps){
        //判断是否有胜利者
        if (winner!=null){
           return true;
        }{
            if (steps>=100){
                winner = Thread.currentThread().getName();
                System.out.println("Winner is "+winner);
                return true;
            }
        }
        return false;
         }

}

class Mian5{
    public static void main(String[] args) {

        Race race = new Race();
        new Thread(race,"rabbit").start();
        new Thread(race,"tortoise").start();


    }
}