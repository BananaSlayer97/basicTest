package stream;

import java.util.stream.Stream;

/**
 * @program: basicTest
 * @description: reduce 主要作用是把 Stream 元素组合起来进行操作。
 * @author: 全栈者也
 * @create: 2020 - 10 - 05 16:55
 **/
public class ReduceUse {

    public static void main(String[] args) {

        //字符串连接
        String concat = Stream.of("A", "B", "C", "D").reduce("", String::concat);
        System.out.println("字符串拼接:" + concat);


        //得到最小值
        double minValue = Stream.of(-4.0, 1.0, 3.0, -2.0).reduce(Double.MAX_VALUE, Double::min);
        System.out.println("最小值:" + minValue);

        //得到最大值
        double maxValue = Stream.of(-4.0, 1.0, 3.0, -2.0).reduce(Double.MIN_VALUE, Double::max);
        System.out.println("最大值:" + maxValue);


        //求和
        // 求和, 无起始值
        int sumValue = Stream.of(1, 2, 3, 4).reduce(Integer::sum).get();
        System.out.println("有无起始值求和:" + sumValue);

        // 求和, 有起始值
        sumValue = Stream.of(1, 2, 3, 4).reduce(1, Integer::sum);
        System.out.println("有起始值求和:" + sumValue);


        //过滤拼接
        concat = Stream.of("a", "B", "c", "D", "e", "F").filter(x -> x.compareTo("Z") > 0).reduce("", String::concat);
        System.out.println("过滤和字符串连接:" + concat);


    }



}
