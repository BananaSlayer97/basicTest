package thread.method;

/**
 * @program: basicTest
 * @description: 线程状态观察
 * @author: 全栈者也
 * @create: 2020 - 10 - 21 15:02
 **/
public class StateUse {


    public static void main(String[] args) {

        Thread thread = new Thread(() ->{
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(10);
                    System.out.println("=============================="+i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("///");
        });

        Thread.State state = thread.getState();
        System.out.println(state);

        thread.start();

        state = thread.getState();
        System.out.println(state);

        while (state != Thread.State.TERMINATED){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            state = thread.getState();
            System.out.println(state);
        }
    }
}
