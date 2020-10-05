package stream;

import java.util.Arrays;
import java.util.List;

/**
 * @program: basicTest
 * @description: parallelStream 是流并行处理程序的代替方法。
 * @author: 全栈者也
 * @create: 2020 - 10 - 05 16:45
 **/
public class ParallelUse {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("a", "", "c", "", "e","", " ");
        // 获取空字符串的数量
        long count =  strings.parallelStream().filter(string -> string.isEmpty()).count();

        System.out.println("空字符串的个数:"+count);
    }
}
