import cats.Cat;
import cats.CatListGenerator;
import cats.VetBook;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {

        /* Задачи с котиками */
        List<Cat> cats = new CatListGenerator().randomCats(1000);
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

        //TODO подсчитать сколько котов родилось в период между двумя датами

        //TODO вывести котов рождённых в период между двумя датами

        //TODO подсчитать средний возраст котов

        //TODO подсчитать средний вес котов

        //TODO найти самого взрослого\маленького котика

        //TODO найти котика, который родился в ближайшую от сегодняшней дату

        //TODO найти котика, который родился ровно год назад

        //TODO всем котам обновить дату вакцинации

        /* задачи с шаурмой */

        //TODO найти самую дорогую шаурму

        //TODO найти самую дешёвую шаурму

        //TODO вычислить среднюю цену шаурмы

        //TODO найти шаурму, у которой самый долгий срок годности

        //TODO сгруппировать шаурму по её типу

        //TODO найти самый популярный вкус

        //TODO снизить цену всех шаурм на 10%
    }
}
