package file;

import java.io.*;

/**
 * @program: basicTest
 * @description:
 * @author: 全栈者也
 * @create: 2020 - 10 - 16 14:11
 **/
public class FileOutputStreamUse {

    public static void main(String[] args) throws IOException {

       // listDir("d:\\data");
        System.out.println(readText());
    }

    /**
     * 读取 java 文件内容, 只能文本文件
     *  2020-10-20  ： 法本面试题
     * @return
     * @throws IOException
     */
    public static String readText() throws IOException {
        File file = new File("d:\\test.txt");

        StringBuilder sb = new StringBuilder();
        BufferedReader br = null;
        br = new BufferedReader(new FileReader(file));
        String temp;
        while ((temp = br.readLine()) != null){
            sb.append(temp);
            System.out.println(temp);
        }
        br.close();
        return sb.toString();
    }



    public  static  void listDir(String dir) throws IOException {
        File file = new File(dir);

        //传进来的可能不是一个目录
        if (!file.isDirectory()) {
            throw new IOException(dir+"不是目录");
        }
        //传进来的可能是一个错误的路径
        if (file == null) {
            throw new IOException("没有此路径");
        }

        File[] files = file.listFiles();
        for (File f : files) {
            //有可能是一个多级目录，递归调用
            if (f.isDirectory()) {
                listDir(f.getAbsolutePath());
                //是文件就直接输出该文件的绝对路径
            }else {
                System.out.println(f.getAbsolutePath());
                System.out.println(f.getName());
            }
        }
    }

}
