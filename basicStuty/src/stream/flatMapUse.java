package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @program: basicTest
 * @description: Stream流的flatMap使用
 * @author: 全栈者也
 * @create: 2020 - 10 - 05 16:19
 **/
public class flatMapUse {


    public static void main(String[] args) {
        //flatMap 方法用于映射每个元素到对应的结果，一对多。

        String worlds = "The way of the future";
        List<String> list7 = new ArrayList<>();
        list7.add(worlds);

        //通过空格进行分割
        Stream<String> stringStream = list7.stream().flatMap(str -> Stream.of(str.split(" ")));

       //stringStream.forEach(System.out::println);

        //收集单词长度大于0的单词
        List<String> collect = stringStream.filter(world -> world.length() > 0).collect(Collectors.toList());

        collect.forEach(System.out::println);
    }

}
