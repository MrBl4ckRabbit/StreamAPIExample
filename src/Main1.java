import java.util.*;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
}

public class Main1 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 30, 5000));
        employees.add(new Employee("Alice", 25, 4000));
        employees.add(new Employee("Bob", 30, 6000));
        employees.add(new Employee("Eva", 35, 5500));
        employees.add(new Employee("Mike", 25, 4500));


        employees.stream()
                .collect(Collectors.groupingBy(Employee::getAge, Collectors.summarizingDouble(Employee::getSalary)))
                .entrySet()
                .forEach(System.out::println);

    }
}


//Задача:
//У вас
//есть список
//сотрудников компании
//с их
//информацией,
// включая имя, возраст
//и зарплату.
//Необходимо найти
//среднюю зарплату
//сотрудников каждого
//возраста и
//вывести список
//возрастов с
//их средними
//зарплатами в
//порядке возрастания.