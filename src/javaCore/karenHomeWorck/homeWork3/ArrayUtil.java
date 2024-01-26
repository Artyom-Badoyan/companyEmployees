package javaCore.karenHomeWorck.homeWork3;

public class ArrayUtil {

    public static void main(String[] args) {

        int[] elements = {2, 15, 456, 25, 56, -21, -85, 89, 21, -89, 60, 20, 100, 852, 63};

        for (int element : elements) {
            if (element % 2 == 0) {
                System.out.print(element + " ");
            }
        }
        System.out.println();


        for (int element : elements) {
            if (element % 2 != 0) {
                System.out.print(element + " ");
            }
        }
        System.out.println();


        int evenCount = 0;
        for (int element : elements) {
            if (element % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println(evenCount);


        int addCount = 0;
        for (int element : elements) {
            if (element % 2 != 0) {
                addCount++;
            }
        }
        System.out.println(addCount);

        int arithmeticMean = 0;
        for (int element : elements) {
            arithmeticMean += element;
        }
        System.out.println(arithmeticMean / elements.length);


        int sum = 0;
        for (int element : elements) {
            sum += element;
        }
        System.out.println(sum);


        System.out.println(elements[0]);
        System.out.println(elements[elements.length / 2]);
        System.out.println(elements[elements.length - 1]);
    }
}
