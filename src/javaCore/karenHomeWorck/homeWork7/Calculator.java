package javaCore.karenHomeWorck.homeWork7;

public class Calculator {

    public double plus(double a, double b) {
        return a + b;
    }

    public double minus(double a, double b) {
        return a - b;
    }

    public double divide(double a, double b) {
        if (a == 0 || b == 0) {
            System.out.println("дельние на 0 не возможно");
            return -1;
        } else {
            return a / b;
        }
    }

    public double multiply(double a, double b) {
        return a * b;
    }
}
