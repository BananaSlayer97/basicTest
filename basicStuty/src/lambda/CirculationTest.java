package lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: basicTest
 * @description: 循环测试
 * @author: 全栈者也
 * @create: 2020 - 10 - 05 14:53
 **/
public class CirculationTest {


    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("a", "a");
        map.put("b", "b");
        map.put("c", "c");
        map.put("d", "d");

        System.out.println("map普通方式遍历:");
        for (String key : map.keySet()) {
            System.out.println("k=" + key + "，v=" + map.get(key));
        }


        System.out.println("map拉姆达表达式遍历:");
        map.forEach((k, v) -> {
            System.out.println("k=" + k + "，v=" + v);
        });


        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("bb");
        list.add("ccc");
        list.add("dddd");

        System.out.println("list拉姆达表达式遍历:");
        list.forEach(v -> {
            System.out.println(v);
        });

        System.out.println("list双冒号运算符遍历:");
        list.forEach(System.out::println);


    }

}
