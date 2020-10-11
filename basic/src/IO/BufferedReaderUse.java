package IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @program: basicTest
 * @description:
 * @author: 全栈者也
 * @create: 2020 - 10 - 11 17:25
 **/
public class BufferedReaderUse {

    /**
     * BufferedReader可以用来读取文件或者接收来自键盘（控制台）的信息。
     * 它比Scanner更加快捷，能够大幅度缩短程序运行时间。它下面的readline()方法可以一次性读取一行文字（String），非常方便。
     * 需要注意的是，使用BufferedReader对象的readLine()方法必须处理java.io.IOException异常(Exception)。
     * 以及，在使用完BufferredReader以后，需要用close()方法关闭流。
     * @param args
     */
    public static void main(String[] args) throws IOException {

        //接受控制台信息
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        //按行输入
        System.out.println(input.readLine());


    }

}
