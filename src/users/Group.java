package users;

import java.util.List;
import java.util.Objects;

public class Group {
    private  int id;
    private List<User> department;
    private String position;

    public Group() {
    }

    public Group(int id, List<User> department, String position) {
        this.id = id;
        this.department = department;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<User> getDepartment() {
        return department;
    }

    public void setDepartment(List<User> department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return id == group.id && Objects.equals(department, group.department) && Objects.equals(position, group.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, department, position);
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", department=" + department +
                ", position='" + position + '\'' +
                '}';
    }
}
