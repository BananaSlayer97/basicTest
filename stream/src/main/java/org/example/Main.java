package org.example;

import cn.hutool.core.lang.Console;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("Java 8", "Lambdas", "In", "Action");

        Optional<Integer> min = stringList.stream()
                .map(String::length)
                .reduce(Integer::min);

        Optional<Integer> max = stringList.stream()
                .map(String::length)
                .reduce(Integer::max);

        Console.log(max.get());
        Console.log(min.get());

    }
}