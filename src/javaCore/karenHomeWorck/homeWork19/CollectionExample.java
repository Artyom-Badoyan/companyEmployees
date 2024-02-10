package javaCore.karenHomeWorck.homeWork19;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionExample {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Artyom");
        names.add("Poxos");
        names.add("Petros");
        names.add("Simon");
        names.add("Karen");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя для проверки: ");
        String nameToCheck = scanner.nextLine();
        if (names.contains(nameToCheck)) {
            System.out.println("Имя " + nameToCheck + " есть в списке.");
        } else {
            System.out.println("Имя " + nameToCheck + " нет в списке.");
        }

        System.out.println("Введите имя для удаления: ");
        String nameToRemove = scanner.nextLine();
        if (names.remove(nameToRemove)) {
            System.out.println("Имя " + nameToRemove + " было удалено из списка.");
        } else {
            System.out.println("Имя " + nameToRemove + " не найдено в списке.");
        }
        System.out.println("Список после удаления: " + names);

        System.out.println("Введите имя для добавления: ");
        String nameToAdd = scanner.nextLine();
        System.out.println("Введите индекс для добавления: ");
        int indexToAdd = scanner.nextInt();
        scanner.nextLine();
        if (indexToAdd >= 0 && indexToAdd <= names.size()) {
            names.add(indexToAdd, nameToAdd);
            System.out.println("Имя " + nameToAdd + " добавлено в список под индексом " + indexToAdd + ".");
        } else {
            System.out.println("Некорректный индекс.");
        }
        System.out.println("Список после добавления: " + names);

        scanner.close();
    }
}

