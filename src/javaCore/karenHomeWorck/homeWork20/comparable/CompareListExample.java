package javaCore.karenHomeWorck.homeWork20.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareListExample {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Poxos", "Poxosyan", 18));
        studentList.add(new Student("Simon", "Simonyan", 25));
        studentList.add(new Student("Karen", "Grigoryan", 30));
        studentList.add(new Student("Lilit", "Minasyan", 22));
        Collections.sort(studentList, new StudentAgeComparator());
        System.out.println(studentList);
    }
}
