package thread.runnable;

/**
 * @program: basicTest
 * @description:
 * @author: 全栈者也
 * @create: 2020 - 10 - 20 22:38
 **/
public class MyRunnable implements  Runnable{

    String name;

    public MyRunnable(String name) {
        this.name = name;
    }

    /**
     * 定义 MyRunnable 类实现  Runnable 接口
     * 重写 run 方法
     * 创建 MyRunnable 对象
     * 把 创建的 MyRunnable 对象 放入 Thread类，并启动 start
     * 推荐使用，避免单继承局限性，灵活方便
     */

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(name+i);
        }
    }
}


class  Main3{
    public static void main(String[] args) {
        MyRunnable myRunnable1 = new MyRunnable("myRunnable1===========");
        MyRunnable myRunnable2 = new MyRunnable("myRunnable2###########");

        new Thread(myRunnable1).start();
        new Thread(myRunnable2).start();

    }
}
