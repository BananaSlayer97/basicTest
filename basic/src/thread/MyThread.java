package thread;

/**
 * @program: basicTest
 * @description:
 * @author: 全栈者也
 * @create: 2020 - 10 - 15 19:32
 **/
public class MyThread  extends Thread{

    public MyThread(String name){
        System.out.println(name);
    }

    @Override
    public void run() {
        for (int i =0; i<6; i++){
            System.out.println(getName());
            try {
                sleep(2000);
            }catch (InterruptedException e){}
        }
    }
}
