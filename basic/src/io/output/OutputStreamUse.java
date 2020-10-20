package io.output;

import java.io.IOException;
import java.io.OutputStream;

/**
 * @program: basicTest
 * @description: 字节输出流
 * @author: 全栈者也
 * @create: 2020 - 10 - 16 13:52
 **/
public class OutputStreamUse
{
    /**
     * OutputStream提供了3个write方法来做数据的输出，这个是和InputStream是相对应的.
     * （1） public void write(byte b[ ])：将参数b中的字节写到输出流。
     *
     * 　　（2）public void write(byte b[ ], int off, int len) ：将参数b的从偏移量off开始的len个字节写到输出流。
     *
     * 　　（3） public abstract void write(int b) ：先将int转换为byte类型，把低字节写入到输出流中。
     *
     * 　　（4）public void flush( ) : 将数据缓冲区中数据全部输出，并清空缓冲区。
     *
     * 　　（5） public void close( ) : 关闭输出流并释放与流相关的系统资源。
     *
     * 主要的子类：
     *
     *  1) ByteArrayOutputStream：把信息存入内存中的一个缓冲区中
     *
     *  2) FileOutputStream：把信息存入文件中
     *
     *  3) PipedOutputStream：实现了pipe的概念，主要在线程中使用
     *
     *  4) SequenceOutputStream：把多个OutStream合并为一个OutStream
     * @param args
     */
    public static void main(String[] args) {
        OutputStream outputStream = new OutputStream() {
            @Override
            public void write(int b) throws IOException {

            }
        };
    }
}
