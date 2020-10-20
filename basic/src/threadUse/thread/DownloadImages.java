package threadUse.thread;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * @program: basicTest
 * @description:  实现多线程下载图片
 * @author: 全栈者也
 * @create: 2020 - 10 - 20 22:09
 **/
public class DownloadImages extends Thread{

    private String url;
    private String name;

    public DownloadImages(String url, String name) {
        this.url = url;
        this.name = name;
    }

    @Override
    public void run() {
        Util util = new Util();
        util.download(url,name);
        System.out.println("下载的文件名为："+name);
    }
}


class Main2{
    public static void main(String[] args) {
        //创建三个线程
        DownloadImages downloadImages1 = new DownloadImages("https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=2033496142,4034319822&fm=26&gp=0.jpg","lyf.jpg");
        DownloadImages downloadImages2 = new DownloadImages("https://dss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=3304059237,2085613036&fm=26&gp=0.jpg","dlrb-1.jpg");
        DownloadImages downloadImages3 = new DownloadImages("https://dss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=1555620250,991762746&fm=26&gp=0.jpg","dlrb-2.jpg");


        downloadImages1.start();
        downloadImages2.start();
        downloadImages3.start();
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

