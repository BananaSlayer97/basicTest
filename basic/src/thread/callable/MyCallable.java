package thread.callable;

import org.apache.commons.io.FileUtils;
import thread.thread.DownloadImages;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.*;

/**
 * @program: basicTest
 * @description:    第三种定义线程
 * @author: 全栈者也
 * @create: 2020 - 10 - 21 08:32
 **/
public class MyCallable implements Callable<Boolean> {

    /**
     * 实现 Callable 接口需要 返回值类型
     * 重写 call 方法，需要抛出异常
     * 创建目标对象
     * 创建执行服务： ExecutorService ser = Executors.newFixedThreadPool(1);
     * 提交服务 : Future<Boolean> result = ser.submit(1);
     * 获取结果 ：boolean rust =  result.get();
     * 关闭服务 ： ser.shutdownNow();
     * @return
     * @throws Exception
     */
    private String url;
    private String name;

    public MyCallable(String url, String name) {
        this.url = url;
        this.name = name;
    }

    @Override
    public Boolean call() throws Exception {
        Util util = new Util();
        util.download(url,name);
        System.out.println("下载的文件名为："+name);

        return  true;
    }

}


class  Main6{

    public static void main(String[] args) {
        //创建三个线程
        MyCallable downloadImages1 = new MyCallable("https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=2033496142,4034319822&fm=26&gp=0.jpg","lyf.jpg");
        MyCallable downloadImages2 = new MyCallable("https://dss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=3304059237,2085613036&fm=26&gp=0.jpg","dlrb-1.jpg");
        MyCallable downloadImages3 = new MyCallable("https://dss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=1555620250,991762746&fm=26&gp=0.jpg","dlrb-2.jpg");

        //创建执行服务
        ExecutorService ser = Executors.newFixedThreadPool(3);

        //提交执行
        Future<Boolean> r1 = ser.submit(downloadImages1);
        Future<Boolean> r2 = ser.submit(downloadImages2);
        Future<Boolean> r3 = ser.submit(downloadImages3);

        //获取结果
        try {
            boolean rr1 = r1.get();
            boolean rr2 =r2.get();
            boolean rr3  =r3.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        //关闭服务
        ser.shutdownNow();
    }

}


/**
 * 下载工具类
 */
class Util{
    public void download(String url,String name){
        try {
            FileUtils.copyURLToFile(new URL(url),new File(name));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}