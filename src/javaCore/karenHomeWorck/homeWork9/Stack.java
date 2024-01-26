package javaCore.karenHomeWorck.homeWork9;

public class Stack {
    public Stack() {
        tos = -1;
    }

    private int[] numbers = new int[10];
    private int tos;

    public void push(int number) {
        if (tos == 9) {
            System.out.println("в массиве мест нету");
        }
        numbers[++tos] = number;
    }

    public int pop() {
        if (tos == -1) {
            return 0;
        }
        return numbers[tos--];
    }
}
