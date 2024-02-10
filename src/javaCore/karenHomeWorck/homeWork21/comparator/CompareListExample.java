package javaCore.karenHomeWorck.homeWork21.comparator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareListExample {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Poxos", "Poxosyan", 18));
        studentList.add(new Student("Simon", "Simonyan", 25));
        studentList.add(new Student("Karen", "Grigoryan", 30));
        studentList.add(new Student("Lilit", "Minasyan", 22));
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println(studentList);
    }
}
