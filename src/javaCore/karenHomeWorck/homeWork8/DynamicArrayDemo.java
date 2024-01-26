package javaCore.karenHomeWorck.homeWork8;

public class DynamicArrayDemo {

    public static void main(String[] args) {

        DynamicArray dynamicArray = new DynamicArray();
        for (int i = 0; i < 1000; i++) {
            dynamicArray.add(i + 1);
        }
        dynamicArray.print();
    }
}
