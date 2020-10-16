package io.input;

import java.io.IOException;
import java.io.InputStream;

/**
 * @program: basicTest
 * @description: 字节输入流
 * @author: 全栈者也
 * @create: 2020 - 10 - 16 13:51
 **/
public class InputStreamUse {

    public static void main(String[] args) {

        InputStream inputStream = new InputStream() {
            @Override
            public int read() throws IOException {
                return 0;
            }
        };
    }

}
