package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @program: basicTest
 * @description: Stream流的map使用
 * @author: 全栈者也
 * @create: 2020 - 10 - 05 15:30
 **/
public class MapUse {


    public static void main(String[] args) {

        //转换大小写
        List<String> list3 = Arrays.asList("zhangSan", "liSi", "wangWu");
        System.out.println("转换之前的数据:" + list3);

        List<String> list4 = list3.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("转换之后的数据:" + list4);

        //转换成数据类型
        List<String> list31 = Arrays.asList("1", "2", "3");
        System.out.println("转换之前的数据:" + list31);
        List<Integer> list41 = list31.stream().map(Integer::valueOf).collect(Collectors.toList());
        System.out.println("转换之后的数据:" + list41);

        //获取平方
        List<Integer> list5 = Arrays.asList(new Integer[] { 1, 2, 3, 4, 5 });
        List<Integer> list6 = list5.stream().map(n -> n * n).collect(Collectors.toList());
        System.out.println("平方的数据:" + list6);



    }
}
