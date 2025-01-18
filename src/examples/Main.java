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
        List<User> users = Arrays.asList(
                new User("John", 23),
                new User("Jane", 30),
                new User("Jack", 23),
                new User("Doe", 30));


        List<User> usersNAme = Arrays.asList(new User("John"),
                new User("Jane"),
                new User("Jack"),
                new User("Doe"),
                new User("Daisy"));


        List<Person> people = Arrays.asList(
                new Person("John", Arrays.asList("reading", "swimming")),
                new Person("Jane", Arrays.asList("cycling", "hiking")),
                new Person("Jack", Arrays.asList("gaming", "coding")));

        List<Student> students = Arrays.asList(
                new Student("Alice", "Math"),
                new Student("Bob", "Math"),
                new Student("Charlie", "Physics"));

     List<Product> products = Arrays.asList(
             new Product("Laptop", "Electronics"),
             new Product("Shirt", "Clothing"),
             new Product("Phone", "Electronics"));

        Map<String, List<Product>> collect = products.stream()
                .collect(Collectors.groupingBy(Product::getCategory));

        collect.entrySet().forEach(System.out::println);

//        Map<String, List<Student>> collect = students.stream()
//                .collect(Collectors.groupingBy(Student::getCourse));
//
//        collect.entrySet().forEach(System.out::println);

        List<Department> departments = Arrays.asList(
                new Department(Arrays.asList("Alice", "Bob")),
                new Department(Arrays.asList("Charlie", "David")));
//
        List<String> list = departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .toList();

        list.forEach(System.out::println);


//        List<String> list = people.stream()
//                .flatMap(person -> person.getHobbies().stream())
//                .toList();
//
//
//
//        list.forEach(System.out::println);
//        Map<Integer, List<User>> collect = users.stream()
//                .collect(Collectors.groupingBy(User::getAge));
//
//        collect.entrySet().forEach(System.out::println);


//        Map<Character, List<User>> collect = usersNAme.stream()
//                .collect(Collectors.groupingBy(s -> s.getName().charAt(0)));
//
//        collect.entrySet().forEach(System.out::println);


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
