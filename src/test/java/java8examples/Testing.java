package java8examples;

import java.util.ArrayList;
import java.util.List;

public class Testing {
    public static void main(String[] args) {
//        String firstname, String lname, int stdId, String standard
        List<Student> students = new ArrayList<>();
        students.add(new Student("you", "g", 1, "10"));
        students.add(new Student("pqr", "d", 6, "1"));
        students.add(new Student("abc", "s", 2, "4"));
        students.add(new Student("rst", "h", 74, "6"));
        students.add(new Student("cba", "u", 23, "3"));

        System.out.println(students);

    }
}
