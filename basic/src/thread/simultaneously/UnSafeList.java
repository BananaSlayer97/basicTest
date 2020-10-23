package thread.simultaneously;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: basicTest
 * @description: 不安全的集合
 * @author: 全栈者也
 * @create: 2020 - 10 - 22 10:39
 **/

public  class UnSafeList{
        public static void main(String[] args) {
            List<String> list = new ArrayList<String>();
            for (int i = 0; i < 100; i++) {
                new Thread(()->{
                    list.add(Thread.currentThread().getName());
                }).start();
            }

            try {
                Thread.sleep(  100);
            } catch (InterruptedException e) {
                   e.printStackTrace();
            }
                System.out.println(list.size());
        }
}