package javaCore.karenHomeWorck.homeWork7;

public class CalculatorDemo {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        System.out.println(calculator.plus(10.5, 20.2));
        System.out.println(calculator.minus(20, 1.3));
        System.out.println(calculator.divide(10, 0));
        System.out.println(calculator.multiply(10, 10));

    }
}


