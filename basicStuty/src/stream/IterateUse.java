package stream;

import java.util.stream.Stream;

/**
 * @program: basicTest
 * @description: iterate 跟 reduce 操作很像，接受一个种子值，和一个UnaryOperator（例如 f）。
 *              然后种子值成为 Stream 的第一个元素，f(seed) 为第二个，f(f(seed)) 第三个，以此类推。
 *              在 iterate 时候管道必须有 limit 这样的操作来限制 Stream 大小。
 * @author: 全栈者也
 * @create: 2020 - 10 - 05 17:04
 **/
public class IterateUse {

    public static void main(String[] args) {

        System.out.println("从2开始生成一个等差队列:");
        Stream.iterate(2, n -> n + 2).limit(5).forEach(x -> System.out.print(x + " "));
        System.out.println();

        System.out.println("乘 2");
        Stream.iterate(9, n -> n * 2).limit(5).forEach(x -> System.out.print(x + " "));
        System.out.println();


    }
}
