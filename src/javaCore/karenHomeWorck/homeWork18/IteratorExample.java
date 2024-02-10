package javaCore.karenHomeWorck.homeWork18;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {

        List<String> name = new ArrayList<>();
        name.add("Pogos");
        name.add("Petros");
        name.add("Martiros");

        Iterator<String> iterator = name.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }
    }
}
