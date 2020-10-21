package thread;

/**
 * @program: basicTest
 * @description: join 方法使用：合并线程，只有此线程执行完毕后，才能执行其它的线程
 * @author: 全栈者也
 * @create: 2020 - 10 - 21 14:31
 **/
public class JoinUSe implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
              
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("vip===="+i);
        }
    }

    public static void main(String[] args) {

        JoinUSe joinUSe = new JoinUSe();
        Thread thread = new Thread(joinUSe);
        thread.start();

        for (int i = 0; i < 20; i++) {
            System.out.println("normal==="+i);
            if(i == 10){
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
