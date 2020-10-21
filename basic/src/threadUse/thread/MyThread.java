package threadUse.thread;

/**
 * @program: basicTest
 * @description:
 * @author: 全栈者也
 * @create: 2020 - 10 - 15 19:32
 **/
public class MyThread  extends Thread{

    /**
     *  创建类 继承 Thread 类
     *  重写 run 方法
     *  创建 类对象
     *  调用 start（） 方法
     *  线程不一定立即执行，由cup 调度安排
     *  不建议使用， 避免单继承 的局限性
     * @param
     */


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

class Main1{
    public static void main(String[] args) {
        new MyThread("线程 A").start();
        new MyThread("线程 B").start();
    }
}