package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @program: basicTest
 * @description: 线程池
 * @author: 全栈者也
 * @create: 2020 - 10 - 23 16:56
 **/
public class ThreadPool {

    public static void main(String[] args) {
        //1.创建服务，创建线程池
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        executorService.execute(new MyThread());
        executorService.execute(new MyThread());
        executorService.execute(new MyThread());
        executorService.execute(new MyThread());
        executorService.execute(new MyThread());
        executorService.execute(new MyThread());
        executorService.execute(new MyThread());
        executorService.execute(new MyThread());
        executorService.execute(new MyThread());
        executorService.execute(new MyThread());
        executorService.execute(new MyThread());
        executorService.execute(new MyThread());

        //2. 关闭
        executorService.shutdown();

    }

}

class MyThread implements Runnable{

    @Override
    public void run() {
            System.out.println(Thread.currentThread().getName());
    }
}