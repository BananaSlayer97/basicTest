package stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @program: basicTest
 * @description:  peek对每个元素执行操作并返回一个新的Stream
 * @author: 全栈者也
 * @create: 2020 - 10 - 05 16:36
 **/
public class PeekUse {


    public static void main(String[] args) {

        //双重操作
        System.out.println("peek使用:");

        //创建四个数据，并过滤出长度大于 3的
        Stream<String> stringStream = Stream.of("one", "two", "three", "four").filter(e -> e.length() > 3);

        Stream<String>  peekStream = stringStream.peek(e -> System.out.println("转换之前: " + e));

        peekStream.map(String::toUpperCase).peek(e -> System.out.println("转换之后: " + e)).collect(Collectors.toList());


    }

}
