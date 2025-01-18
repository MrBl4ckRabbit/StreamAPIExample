package examples;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ExampleClass {
    public static void main(String[] args) {
        Stream.of(1,2,3)
                .peek(System.out::println)
                .filter(x->x!=2)
                .peek(System.out::println)
                .forEach(System.out::println);

        System.out.println("******************");

        Stream.of(1,2,3)
                .peek(System.out::println)
                .sorted()
                .filter(x->x!=2)
                .peek(System.out::println)
                .forEach(System.out::println);

    }
}
