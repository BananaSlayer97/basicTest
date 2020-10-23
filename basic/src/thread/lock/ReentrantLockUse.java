package thread.lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @program: basicTest
 * @description: 可重入锁
 * @author: 全栈者也
 * @create: 2020 - 10 - 23 13:38
 **/
public class ReentrantLockUse {

    public static void main(String[] args) {
        ReentrantLockUseTest reentrantLockUseTest = new ReentrantLockUseTest();
        new Thread(reentrantLockUseTest).start();
        new Thread(reentrantLockUseTest).start();
        new Thread(reentrantLockUseTest).start();

    }

}

class ReentrantLockUseTest implements Runnable{

    int ticketNums = 10;

    private final ReentrantLock reentrantLock = new ReentrantLock();

    @Override
    public void run() {

            while (true){
                reentrantLock.lock();
                try {
                     if(ticketNums > 0){
                         System.out.println(ticketNums--);
                    }else{
                         break;
                     }
                } finally {
                    reentrantLock.unlock();
                }
            }
    }
}