package javaCore.karenHomeWorck.homeWork2.arrayUtil;

public class Array {

    public static void main(String[] args) {

        int[] array = {5, 10, 25, 48, 62, 75, 80, 42, 96, -30};

        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();


        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();


        int maxValue = array[0];
        for (int element : array) {
            if (element > maxValue) {
                maxValue = element;
            }
        }
        System.out.println("maxValur = " + maxValue);


        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Maximum value in the array: " + max);


        int minValue = array[0];
        for (int element : array) {
            if (element < minValue) {
                minValue = element;
            }
        }
        System.out.println("minValue = " + minValue);


        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Minimum value in the array: " + min);
    }
}
