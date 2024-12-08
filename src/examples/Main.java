package examples;

import java.nio.charset.Charset;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class Main {
    public static void main(String[] args) {
//        List<User> list = Arrays.asList(
//                new User("John", 23, 3500),
//                new User("Jane", 30, 4000),
//                new User("Jack", 25, 4500));
//
//        List<User> users = Arrays.asList(
//                new User("John", 23),
//                new User("Jane", 30),
//                new User("Jack", 25));

        List<User> usersNAme = Arrays.asList(new User("John"),
                new User("Jane"),
                new User("Jack"),
                new User("Doe"),
                new User("Daisy"));


        Map<Character, List<User>> collect = usersNAme.stream()
                .collect(Collectors.groupingBy(s -> s.getName().charAt(0)));

        collect.entrySet().forEach(System.out::println);


//        Map<Integer, List<User>> collect = users.stream()
//                .collect(Collectors.groupingBy(User::getAge));
//
//        collect.entrySet().forEach(System.out::println);


//        OptionalDouble averageSalary = list.stream()
//                .mapToDouble(User::getSalary)
//                .average();
//
//        double minSalary = list.stream()
////                .min(Comparator.comparing(User::getSalary));
//                .mapToDouble(User::getSalary)
//                .min()
//                .orElse(0.0);
//
//        System.out.println("minSalary " + minSalary);
//        String result = list.stream()
//                .map(User::getName)
//                .collect(Collectors.joining(" "));
//        System.out.println("result " + result);
//
//        double sumSalary = list.stream()
//                .mapToDouble(User::getSalary)
//                .sum();
//
//        System.out.println("averageSalary " + averageSalary);
//        System.out.println("sumSalary " + sumSalary);
//        System.out.println("**************************");
//
//
//        Map<String, Integer> userMap = users.stream()
//                .collect(Collectors.toMap(User::getName, User::getAge));
//
//        userMap.entrySet().forEach(System.out::println);
    }

}
