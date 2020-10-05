package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @program: basicTest
 * @description: Stream流的之间的转换
 * @author: 全栈者也
 * @create: 2020 - 10 - 05 15:28
 **/
public class Transform {

    public static void main(String[] args) {
        try {
            Stream<String> stream2 = Stream.of("a", "b", "c");
            // 转换成 Array
            String[] strArray1 = stream2.toArray(String[]::new);

            // 转换成 Collection
            List<String> list1 = stream2.collect(Collectors.toList());

            List<String> list2 = stream2.collect(Collectors.toCollection(ArrayList::new));

            Set set1 = stream2.collect(Collectors.toSet());

            Stack stack1 = stream2.collect(Collectors.toCollection(Stack::new));

            // 转换成 String
            String str = stream2.collect(Collectors.joining()).toString();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
