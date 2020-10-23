package thread;

/**
 * @program: basicTest
 * @description: 红绿灯解决 生产者和消费者
 * @author: 全栈者也
 * @create: 2020 - 10 - 23 16:17
 **/
public class TrafficMethod {
    public static void main(String[] args) {
        Tv tv = new Tv();
        new Players(tv).start();
        new Watcher(tv).start();
    }
}

/**
 * 演员
 */
class Players extends Thread{
    Tv tv;
    public Players(Tv tv) {
        this.tv = tv;
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            this.tv.play("播放海绵宝宝！ ");
        }
    }
}

/**
 * 观众
 */
class Watcher extends Thread{
    Tv tv;
    public Watcher(Tv tv) {
        this.tv = tv;
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            tv.watch();
        }
    }
}

/**
 * 节目
 */
class Tv{

    String show;

    boolean flag = true;

    /**
     * 表演
     */
    public  synchronized void play(String show){

        if (!flag){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("演员表演了"+show);

        //通知观众观看
        this.notifyAll();

        this.show = show;
        this.flag = !flag;
    }

    /**
     * 观看
     */
    public synchronized  void watch(){
        if (flag){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("观众观看了"+show);

        this.notifyAll();
        this.flag = !flag;
    }

}