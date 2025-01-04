package examples;

import java.util.List;

public class Department {
    List<String> employees;

    Department(List<String> employees) {
        this.employees = employees;
    }

    public List<String> getEmployees() {
        return employees;
    }
}
