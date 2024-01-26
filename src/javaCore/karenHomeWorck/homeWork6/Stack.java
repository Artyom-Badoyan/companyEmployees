package javaCore.karenHomeWorck.homeWork6;

public class Stack {
    public Stack() {
        tos = -1;
    }

    int[] numbers = new int[10];
    int tos;

    public void push(int number) {
        if (tos == 9) {
            System.out.println("в массиве мест нету");
        } else {
            numbers[++tos] = number;
        }
    }

    public int pop() {
        if (tos == -1) {
            System.out.println("массив пустой");
            return 0;
        }
            return numbers[tos--];
    }
}
