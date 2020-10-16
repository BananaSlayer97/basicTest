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

    public static void main(String[] args) {
        OutputStream outputStream = new OutputStream() {
            @Override
            public void write(int b) throws IOException {

            }
        };
    }
}
