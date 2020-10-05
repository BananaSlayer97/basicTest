package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @program: basicTest
 * @description: 创建Stream 流的几种方式
 * @author: 全栈者也
 * @create: 2020 - 10 - 05 15:17
 **/
public class CreateStreamWay {


    public static void main(String[] args) {

        //直接创建
        Stream stream = Stream.of("a", "b", "c");

        String[] strArray = new String[] { "a", "b", "c" };

        //通过数组转换
        stream = Stream.of(strArray);

        //通过数组工具类转换
        stream = Arrays.stream(strArray);

        List<String> list = Arrays.asList(strArray);
        //通过 list 转换
        stream = list.stream();

    }

}
