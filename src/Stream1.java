import users.Group;
import users.User;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream1 {
    private List<User> usersIt = Arrays.asList(

            new User(1, "john", "doe", 23, 3500),
            new User(2, "scott", "mc lesley", 45, 3300),
            new User(3, "jason", "phillips", 43, 3400),
            new User(4, "ander", "wolfram", 30, 5999)
    );
    private List<User> usersRecruiters = Arrays.asList(
            new User(5, "lana", "candwell", 23, 2500),
            new User(6, "clara", "grimmer", 18, 2300),
            new User(7, "helga", "marcot", 19, 1400),
            new User(8, "yana", "secman", 33, 4999)
    );
    private List<User> usersInterns = Arrays.asList(
            new User(9, "alex", "bronson", 23, 1950),
            new User(10, "xiang", "wu", 18, 2500),
            new User(11, "peter", "howard", 19, 1100),
            new User(12, "grdich", "balkovski", 17, 2799)
    );
    public List<Group> groups = Arrays.asList(
            new Group(1, usersIt, "IT"),
            new Group(2, usersRecruiters, "HR"),
            new Group(3, usersInterns, "INTERNS"));

    /*
    нужны стримы, предоставляющие информацию из групп (groups):

средний возраст по отделам
средняя зп по отделам
средний возраст в целом по конторе
средняя зп по конторе
челы с наибольшей зарплатой в своем отделе
челы с наименьшей зарплатой в своем отделе

    на каждый из пунктов по методу
     */
    public Map<String, Integer> getAverageAgeByGroups(List<Group> groups) {
        Map<String, Integer> averageAgeByGroups = new HashMap<>();
        for (Group group : groups) {
            int averageAge = (int) group.getDepartment().stream()
                    .collect(Collectors.averagingInt(User::getAge)).doubleValue();
            averageAgeByGroups.put(group.getPosition(), averageAge);
        }
        return averageAgeByGroups;
    }

    public Map<String, Integer> getAverageSalaryByGroups(List<Group> groups) {
        Map<String, Integer> averageSalaryByGroups = new HashMap<>();

        for (Group group : groups) {
            int average = (int) group.getDepartment().stream()
                    .collect(Collectors.averagingInt(User::getSalary)).doubleValue();
            averageSalaryByGroups.put(group.getPosition(), average);
        }
        return averageSalaryByGroups;
    }

    public Integer getAverageAgeByOrganization(List<Group> groups) {
        return (int) groups.stream()
                .flatMap(group -> group.getDepartment().stream())
                .mapToInt(User::getAge)
                .average()
                .orElse(0.0);
    }

    public Integer getAverageSalaryByOrganization(List<Group> groups) {
        return (int) groups.stream()
                .flatMap(group -> group.getDepartment().stream())
                .mapToInt(User::getSalary)
                .average()
                .orElse(0.0);
    }

}