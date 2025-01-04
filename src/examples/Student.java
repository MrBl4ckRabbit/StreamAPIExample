package examples;

public class Student {
    String name;
    String course;

    Student(String name, String course) {
        this.name = name;
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course='" + course + '\'' +
                '}';
    }
}
