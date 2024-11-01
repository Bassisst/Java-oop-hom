package funs;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Group {
    private List<Student> students;

    public Group(List<Student> students) {
        this.students = students;
    }

    public boolean hasNoEquivalentStudents() {
        Set<Student> uniqueStudents = new HashSet<>();
        for (Student student : students) {
            if (!uniqueStudents.add(student)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return Objects.equals(students, group.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(students);
    }
}

