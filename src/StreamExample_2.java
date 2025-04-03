import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample_2 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "avocado", "blueberry", "apricot", "watermelon");

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("apple", "banana"),
                Arrays.asList("cherry", "date"),
                Arrays.asList("fig", "grape"));

        List<String> sentences = Arrays.asList("This is a test", "Stream API is powerful", "FlatMap is useful");

        List<String> lines = Arrays.asList("Java is awesome", "I love programming", "Stream API is powerful");

        List<List<Integer>> listOfListsAsNumbers = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7));

        List<int[]> listOfArrays = Arrays.asList(
                new int[]{1, 2, 3},
                new int[]{4, 5, 6},
                new int[]{7, 8, 9});

        //Дан список списков целых чисел. Используя flatMap, создать один список, содержащий все числа из всех списков.


        OptionalDouble average = listOfArrays.stream()
                .flatMapToInt(Arrays::stream)
                .average();
        System.out.println(average);
//        listOfArrays.stream()
//                .flatMapToInt(Arrays::stream)
//                .filter(n -> n % 2 == 0)
//                .forEach(System.out::println);
//        listOfArrays.stream()
//                .flatMapToInt(Arrays::stream)
//                .boxed()
//                .forEach(System.out::println);
//        OptionalInt max = listOfListsAsNumbers.stream()
//                .flatMapToInt(list -> list.stream().mapToInt(Integer::intValue))
//                .max();
//        System.out.println(max);
//        int sum = listOfListsAsNumbers.stream()
//                .flatMapToInt(list -> list.stream().mapToInt(Integer::intValue))
//                .sum();
//        System.out.println(sum);
//        listOfListsAsNumbers.stream()
//                .flatMap(List::stream)
//                .forEach(System.out::println);

//        Map<String, Long> collect = lines.stream()
//                .flatMap(s -> Arrays.stream(s.split(" ")))
//                .collect(Collectors.groupingBy(
//                        String::toLowerCase,
//                        Collectors.counting()
//                ));
//        collect.entrySet().forEach(System.out::println);
//        long count = lines.stream()
//                .flatMapToInt(String::chars)
//                .filter(c -> c != ' ')
//                .count();
//
//        System.out.println(count);
//        lines.stream()
//                .filter(s -> s.contains("is"))
//                .forEach(System.out::println);
//        Optional<String> max = sentences.stream()
//                .flatMap(s -> Arrays.stream(s.split(" ")))
//                .max(Comparator.comparing(String::length));
//
//        System.out.println(max);
//        Set<String> collect = sentences.stream()
//                .flatMap(s -> Arrays.stream(s.split(" ")))
//                .collect(Collectors.toSet());
//        collect.forEach(System.out::println);
//        long count = sentences.stream()
//                .flatMap(s -> Arrays.stream(s.split(" ")))
//                .count();
//        System.out.println(count);
//        Map<Character, List<String>> collect = listOfLists.stream()
//                .flatMap(List::stream)
//                .collect(Collectors.groupingBy(s -> s.charAt(0)));
//
//        collect.entrySet().forEach(System.out::println);
//        listOfLists.stream()
//                .flatMap(List::stream)
//                .filter(s -> s.length() > 4)
//                .forEach(System.out::println);
//        listOfLists.stream()
//                .flatMap(List::stream)
//                .forEach(System.out::println);
//        Map<Boolean, List<Integer>> collect = numbers.stream()
//                .collect(Collectors.groupingBy(n -> n % 2 == 0));
//
//        collect.entrySet().forEach(System.out::println);
//        int sum = numbers.stream()
//                .mapToInt(n -> n * n)
//                .sum();
//        System.out.println(sum);

//        numbers.stream()
//                .filter(n -> n % 2 == 0)
//                .map(n -> n * 2)
//                .forEach(System.out::println);
//        Optional<String> max = strings.stream()
//                .filter(s -> s.startsWith("a"))
//                .max(Comparator.comparing(String::length));
//
//        System.out.println(max);
//        strings.stream()
//                .map(String::length)
//                .forEach(System.out::println);
//        strings.stream()
//                .filter(s->s.startsWith("a"))
//                .forEach(System.out::println);
//        lines.stream()
//                .map(String::toUpperCase)
//                .forEach(System.out::println);
//        lines.stream()
//                .filter(s -> s.contains("Stream"))
//                .forEach(System.out::println);
//        sentences.stream()
//                .flatMap(s -> Arrays.stream(s.split(" ")))
//                .filter(s -> s.startsWith("i"))
//                .forEach(System.out::println);
//        List<String> list = sentences.stream()
//                .flatMap(s -> Arrays.stream(s.split(" ")))
//                .toList();
//        list.forEach(System.out::println);
//        listOfLists.stream()
//                .flatMap(List::stream)
//                .filter(s -> s.contains("a"))
//                .forEach(System.out::println);
//        listOfLists.stream()
//                .flatMap(List::stream)
//                .forEach(System.out::println);
//        List<Integer> list = numbers.stream()
//                .map(x -> x * x)
//                .toList();
//        list.forEach(System.out::println);
//        int sum = numbers.stream()
//                .filter(n -> n % 2 == 0)
//                .mapToInt(Integer::intValue)
//                .sum();
//        System.out.println(sum);
//        strings.stream()
//                .filter(s -> s.length() > 6)
//                .forEach(System.out::println);
//        strings.stream()
//                .filter(s -> s.startsWith("a"))
//                .map(String::toUpperCase)
//                .forEach(System.out::println);

//        strings.forEach(System.out::println);
//        String collect = strings.stream()
//                .collect(Collectors.joining(", "));
//        System.out.println(collect);
//        Map<String, Integer> collect = strings.stream()
//                .collect(Collectors.toMap(s -> s, String::length));
//        System.out.println(collect);

//        Map<Integer, List<String>> collect = strings.stream()
//                .collect(Collectors.groupingBy(String::length));
//        collect.entrySet().forEach(System.out::println);
//        Optional<Integer> max = numbers.stream()
//                .max(Integer::compareTo);
//        System.out.println(max);
//        int sum = numbers.stream()
//                .mapToInt(Integer::intValue)
//                .sum();
//        System.out.println(sum);
//        strings.stream()
//                .map(s -> s.toUpperCase())
//                .forEach(System.out::println);

//        strings.stream()
//                .filter(s -> s.length()>7)
//                .sorted()
//                .forEach(System.out::println);

//        List<Integer> list = listOfListsAsNumbers.stream()
//                .flatMap(List::stream)
//                .toList();
//
//        list.forEach(System.out::println);

        /*Дан список строк, каждая из которых содержит несколько слов,
        разделенных пробелами. Используя flatMap, создать список всех слов.*/

//        List<String> list = sentences.stream()
//                .flatMap(s -> Arrays.stream(s.split(",")))
//                .toList();
//
//        list.forEach(System.out::println);

//        List<Integer> list = strings.stream()
//                .map(String::length)
//                .toList();
//
//        System.out.println(list);

//        Map<Integer, List<String>> collect = strings.stream()
//                .collect(Collectors.groupingBy(String::length));
//
//        collect.entrySet().forEach(System.out::println);

//        Optional<Integer> max = numbers.stream()
//                .max(Comparator.naturalOrder());
//
//        System.out.println(max);

//        long count = lines.stream()
//                .flatMap(x -> Arrays.stream(x.split("\\s+")))
//                .count();
//
//        System.out.println(count);


//        String collect = strings.stream()
//                .collect(Collectors.joining("HI"));
//        System.out.println(collect);

//        List<Integer> list = numbers.stream()
//                .filter(x -> x % 2 == 0)
//                .toList();
//
//        Map<Boolean, List<Integer>> collect = numbers.stream()
//                .collect(Collectors.groupingBy(x -> x % 2 == 0));
//
//        collect.entrySet().forEach(System.out::println);
//
//        list.forEach(System.out::println);

//        List<Integer> list = listOfArrays.stream()
//                .flatMapToInt(Arrays::stream)
//                .boxed()
//                .toList();
//
//        list.forEach(System.out::println);

//        List<String> list = sentences.stream()
//                .flatMap(s -> Arrays.stream(s.split(" ")))
//                .toList();
//
//        list.forEach(System.out::println);

//        List<String> list = listOfLists.stream()
//                .flatMap(List::stream)
//                .toList();
//listOfLists.forEach(System.out::println);
//        list.forEach(System.out::println);


//        Map<String, Integer> collect = strings.stream()
//                .collect(Collectors.toMap(s -> s, String::length));
//
//        collect.entrySet().forEach(System.out::println);

//       String max = strings.stream()
//                .max(Comparator.comparing(String::length))
//               .orElse(" ");
//
//        System.out.println(max);
//        Map<Integer, List<String>> collect = strings.stream()
//                .collect(Collectors.groupingBy(String::length));
//
//        collect.entrySet().forEach(System.out::println);


//        Map<Character, List<String>> collect = strings.stream()
//                .collect(Collectors.groupingBy(s -> s.charAt(0)));
//
//        collect.entrySet().forEach(System.out::println);


//        Map<Boolean, List<Integer>> collect = numbers.stream()
//                .collect(Collectors.groupingBy(n -> n % 2 == 0));
//        collect.entrySet().forEach(System.out::println);


//        Map<Integer, List<String>> collect = strings.stream()
//                .collect(Collectors.groupingBy(String::length));
//
//        collect.entrySet().forEach(System.out::println);
//

//        var allAStrings = strings.stream()
//                .filter(s -> s.startsWith("a"))
//                .map(String::toUpperCase)
//                .collect(Collectors.joining(" "));
//        System.out.println(allAStrings);
//
//        System.out.println("**************************");
//
//        List<String> sentences1 = Arrays.asList("This is a test", "This test is only a test", "Hello world");
//        var uniqueSentences = sentences1.stream()
//                .flatMap(s -> Arrays.stream(s.split(" ")))
//                .distinct()
//                .collect(Collectors.joining(" "));
//        System.out.println(uniqueSentences);
////
//        System.out.println("**************************");
//
//        List<Integer> numbers = Arrays.asList(3, 5, 7, 2, 8, 6, 4);
//        Integer nums = numbers.stream()
//                .max(Comparator.naturalOrder())
//                .orElse(0);
//        System.out.println(nums);
//
//        System.out.println("**************************");
//        List<String> words = Arrays.asList("apple", "banana", "watermelon", "blueberry");
//
//        String longWord = words.stream()
//                .max(Comparator.comparingInt(String::length))
//                .orElse("");
//        System.out.println(longWord);
//
//        System.out.println("**************************");
//        List<String> wordz = Arrays.asList("apple", "banana", "avocado", "blueberry", "apricot");
//        long count = wordz.stream()
//                .filter(s -> s.startsWith("b"))
//                .map(String::toUpperCase)
//                .count();
//        System.out.println(count);
//
//        System.out.println("**************************");
//
//        List<String> anotherStrings = Arrays.asList("apple", "banana", "avocado", "blueberry", "apricot");
//
//        long lettersCount = anotherStrings.stream()
//                .flatMapToInt(String::chars)
//                .distinct()
//                .count();
//
//        System.out.println(lettersCount);
//
//        System.out.println("**************************");
//        List<String> stringsWithComma = Arrays.asList("apple", "banana", "avocado", "blueberry", "apricot");
//
//        String newString = stringsWithComma.stream()
//                .collect(Collectors.joining(","));
//
//        System.out.println(newString);
//        System.out.println("**************************");
//
//        List<String> stringsFirstLetter = Arrays.asList("apple", "banana", "avocado", "blueberry", "apricot", "coconut", "kiwi");
//
//        Map<Character, List<String>> stringMap = stringsFirstLetter.stream()
//                .collect(Collectors.groupingBy(s -> s.charAt(0)));
//
//        stringMap.entrySet().forEach(System.out::println);
//
//        System.out.println("**************************");
//        List<Integer> numbersAverage = Arrays.asList(3, 5, 7, 2, 8, 6, 4);
//
//        OptionalDouble averageResult = numbersAverage.stream()
//                .mapToInt(Integer::intValue)
//                .average();
//        System.out.println(averageResult);
//
//        System.out.println("**************************");
//        List<String> stringsReversed = Arrays.asList("apple", "banana", "avocado", "blueberry", "apricot");
//        stringsReversed.stream()
//                .sorted(Comparator.reverseOrder())
//                .forEach(System.out::println);
//        System.out.println("**************************");
//        strings.stream()
//                .filter(s -> s.length() == 5)
//                .forEach(System.out::println);
//        System.out.println("**************************");
//        List<Integer> numbersBiggerThanFive = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        Integer num = numbersBiggerThanFive.stream()
//                .filter(n -> n > 5)
//                .findFirst()
//                .orElse(0);
//        System.out.println(num);
//        System.out.println("**************************");
//        List<Integer> list = numbersBiggerThanFive.stream()
//                .map(n -> n * 2)
//                .toList();
//
//        for (Integer integer : list) {
//            System.out.print(integer + " ");
//        }
//
//        System.out.println("**************************");
//        List<String> stringsWithA = Arrays.asList("apple", "banana", "avocado", "blueberry", "apricot");
//        boolean str2 = stringsWithA.stream()
//                .allMatch(s -> s.contains("a"));
//        System.out.println(str2);
//        System.out.println("**************************");
//        Map<String, Integer> collect = stringsWithA.stream()
//                .collect(Collectors.toMap(s -> s, String::length));
//        for (Map.Entry<String, Integer> entry : collect.entrySet()) {
//            System.out.println(entry);
//        }
//        System.out.println("**************************");
//
//        stringsWithA.stream()
//                .filter(s->s.startsWith("a"))
//                .map(String::toUpperCase)
//                .forEach(System.out::println);
//        System.out.println("**************************");
//        String collect1 = numbersBiggerThanFive.stream()
//                .map(Object::toString)
//                .collect(Collectors.joining("-"));
//
//        System.out.println(collect1);
//        System.out.println("**************************");
//        List<String> strings2 = Arrays.asList("apple", "banana", "avocado", "blueberry", "apricot");
//        int sum = strings2.stream()
//                .mapToInt(String::length)
//                .sum();
//
//        System.out.println(sum);
    }


}
