package stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

/**
 * @program: basicTest
 * @description: IntSummaryStatistics 用于收集统计信息(如count、min、max、sum和average)的状态对象。
 * @author: 全栈者也
 * @create: 2020 - 10 - 05 17:32
 **/
public class SummaryStatistics {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 5, 7, 3, 9);

        IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();

        System.out.println("列表中最大的数 : " + stats.getMax());
        System.out.println("列表中最小的数 : " + stats.getMin());
        System.out.println("所有数之和 : " + stats.getSum());
        System.out.println("平均数 : " + stats.getAverage());


    }

}
