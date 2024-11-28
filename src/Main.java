import cats.Cat;
import cats.CatListGenerator;
import cats.VetBook;
import shawarma.Shawarma;
import shawarma.ShawarmaMaker;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {

        /* Задачи с котиками */
        List<Cat> cats = new CatListGenerator().randomCats(1000);
        List<Shawarma> shawarmas = new ShawarmaMaker().generateShawarma(50);
//        cats.stream()
//                .forEach(System.out::println);

//        //TODO вывести всех котов с определённым окрасом
//        cats.stream()
//                .filter(x->x.getColor().equals("Чёрный"))
//                .distinct()
//                .forEach(System.out::println);

        //TODO найти кота с конкретным именем и возрастом
//        Optional<Cat> cat = cats.stream()
//                .filter(x -> x.getName().equals("Вася") && x.getAge() == 3)
//                .findAny();
//
//        if (cat.isPresent()) {
//            System.out.println(cat.get());
//        } else {
//            System.out.println("Cat isn't exist!");
//        }


        //TODO найти одного кота с датой вакицинации за семь дней до текущей

//        LocalDate date = LocalDate.now();
//        LocalDate beforeNow = date.minusWeeks(1);
//
//        Optional<Cat> cat = cats.stream()
//                .filter(x -> x.getVetBook().getLastVaccination().equals(beforeNow))
//                .findAny();
//        if (cat.isPresent()) {
//            System.out.println(cat.get());
//        } else {
//            System.out.println("Cat isn't exist!");
//        }

        //TODO вывести всех котов, у которых день рождения в определённую дату
//
//        LocalDate date = LocalDate.of(2021, 12, 7);
//
//        List<Cat> cat = cats.stream()
//                .filter(x -> x.getBirthDate().equals(date))
//                .toList();
//        if (!cat.isEmpty()) {
//            cat.forEach(System.out::println);
//        } else {
//            System.out.println("Cat isn't exist!");
//        }

        //TODO сгруппировать котов по датам рождения
//        Map<LocalDate, List<Cat>> catList = cats.stream()
//                .collect(Collectors.groupingBy(Cat::getBirthDate));
//
//        catList.entrySet().forEach(System.out::println);
//        catList.forEach((birthDate, catsList)->{
//            System.out.println(birthDate);
//            catsList.forEach(System.out::println);
//        });

        //TODO сгруппировать котов по породе\окрасу\возрасту

//        Map<String, List<Cat>> catMap1 = cats.stream()
//                .collect(Collectors.groupingBy(Cat::getColor));
//
//        catMap1.entrySet().forEach(System.out::println);
//
//        Map<String, List<Cat>> catMap2 = cats.stream()
//                .collect(Collectors.groupingBy(Cat::getBreed));
//
//        catMap2.entrySet().forEach(System.out::println);

//        Map<Integer, List<Cat>> catMap3 = cats.stream()
//                .collect(Collectors.groupingBy(Cat::getAge));
//
//        catMap3.entrySet().forEach(System.out::println);

        //TODO всем котам установить новый случайный окрас

//        String[] colors = new CatListGenerator().getColors();
//
//        cats.forEach(cat -> {
//            String randomColor = colors[ThreadLocalRandom.current().nextInt(colors.length)];
//
//            cat.setColor(randomColor);
//        });
//        cats.forEach(System.out::println);
//
//        cats.stream()
//                .map(cat -> {
//                    String randomColor = colors[ThreadLocalRandom.current().nextInt(colors.length)];
//
//                    cat.setColor(randomColor);
//                    return cat;
//                })
//                .toList();
//        cats.forEach(System.out::println);
//
//        cats.stream()
//                .peek(cat -> {
//                    String randomColor = colors[ThreadLocalRandom.current().nextInt(colors.length)];
//
//                    cat.setColor(randomColor);
//                })
//                .toList();
//        cats.forEach(System.out::println);


        //TODO получить список веткнижек котов

//        List<VetBook> vetBooks = cats.stream()
//                .map(Cat::getVetBook)
//                .toList();
//
//        vetBooks.forEach(System.out::println);

        //TODO подсчитать сколько котов с указанным именем

//        Long number = cats.stream()
//                .filter(x -> x.getName().equals("Кнопа"))
//                .count();
//        System.out.println(number);

        //TODO удалить котов определёной породы
//        List<Cat> catList = cats.stream()
//                .filter(x -> !x.getBreed().equals("Манчкин"))
//                .limit(10)
//                .toList();
//        catList.forEach(System.out::println);


        //TODO удалять из потока данных котов, пока не будет достигнут кот с определёнными условиями

//      List<Cat>catList=  cats.stream()
//                .dropWhile(x->!x.getName().equals("Боря") || x.getAge()==3)
//                .toList();
//
//        catList.forEach(System.out::println);
//        System.out.println((long) catList.size());


        //TODO подсчитать сколько котов родилось в период между двумя датами

//        LocalDate start = LocalDate.of(2020, 5, 12);
//        LocalDate end = LocalDate.now();
//
//        long count=cats.stream()
//                .filter(cat->!cat.getBirthDate().isBefore(start) && !cat.getBirthDate().isAfter(end))
//                .count();
//        System.out.println(count);


        //TODO вывести котов рождённых в период между двумя датами

//        LocalDate start = LocalDate.of(2020, 5, 12);
//        LocalDate end = LocalDate.now();
//
//        List<Cat> catList = cats.stream()
//                .filter(cat -> !cat.getBirthDate().isBefore(start) && !cat.getBirthDate().isAfter(end))
//                .toList();
//
//        catList.forEach(System.out::println);
//        System.out.println(catList.size());

        //TODO подсчитать средний возраст котов

//        OptionalDouble age = cats.stream()
//                .mapToInt(Cat::getAge)
//                .average();
//        System.out.println(age);

        //TODO подсчитать средний вес котов
//
//        OptionalDouble weight=cats.stream()
//                .mapToInt(Cat::getWeight)
//                .average();
//
//        System.out.println(weight);

        //TODO найти самого взрослого\маленького котика

//        Optional<Cat> youngCat = cats.stream()
//                .min(Comparator.comparing(Cat::getAge));
//
//        System.out.println(youngCat);
//
//        Optional<Cat> oldestCat = cats.stream().max(Comparator.comparing(Cat::getAge));
//        System.out.println(oldestCat);


        //TODO найти котика, который родился в ближайшую от сегодняшней дату

//        LocalDate now = LocalDate.now();
//
//        Optional<Cat> cat=cats.stream()
//                .min(Comparator.comparing(cat1-> ChronoUnit.DAYS.between(cat1.getBirthDate(),now)));
//        System.out.println(cat);

        //TODO найти котика, который родился ровно год назад

//        LocalDate yearAgo = LocalDate.now().minusYears(2);
//
//        cats.stream()
//                .filter(cat1->cat1.getBirthDate().equals(yearAgo))
//                .forEach(System.out::println);

        //TODO всем котам обновить дату вакцинации

//        List<Cat> catList = cats.stream()
//                .peek(cat -> cat.getVetBook().setLastVaccination(LocalDate.now()))
//                .toList();
//        catList.forEach(System.out::println);

        /* задачи с шаурмой */

        //TODO найти самую дорогую шаурму

//        Optional<Shawarma> shawarma = shawarmas.stream()
//                .max(Comparator.comparing(Shawarma::getPrice));
//        shawarmas.forEach(System.out::println);
//        System.out.println(shawarma);

        //TODO найти самую дешёвую шаурму

//        Optional<Shawarma>shawarma=shawarmas.stream()
//                .min(Comparator.comparing(Shawarma::getPrice));
//        System.out.println(shawarma);

        //TODO вычислить среднюю цену шаурмы

//        OptionalDouble cost = shawarmas.stream()
//                .mapToInt(Shawarma::getPrice)
//                .average();
//
//        System.out.println(cost);

        //TODO найти шаурму, у которой самый долгий срок годности

//        Optional<Shawarma>shawarma=shawarmas.stream()
//                .max(Comparator.comparing(Shawarma::getExpiredTime));
//        System.out.println(shawarma);
//
//        Optional<Shawarma>shawarma1=shawarmas.stream()
//                .min(Comparator.comparing(Shawarma::getExpiredTime));
//        System.out.println(shawarma1);

        //TODO сгруппировать шаурму по её типу
//        Map<String,List<Shawarma>>shawarmaMap=shawarmas.stream()
//                .collect(Collectors.groupingBy(Shawarma::getShawarmaType));
//
//        shawarmaMap.entrySet().forEach(System.out::println);

        //TODO найти самый популярный вкус

//        Map<String, Long> listMap = shawarmas.stream()
//                .collect(Collectors.groupingBy(Shawarma::getShawarmaType,Collectors.counting()));
//
//        String taste = listMap.entrySet().stream()
//                .max(Comparator.comparing(Map.Entry::getValue))
//                .map(Map.Entry::getKey)
//                .orElse("None");
//        System.out.println(taste);

        //TODO снизить цену всех шаурм на 10%

//        List<Shawarma> list = shawarmas.stream()
//                .peek(x -> x.setPrice((int) (x.getPrice() * 0.9)))
//                .toList();
//
//        list.forEach(System.out::println);
    }
}
