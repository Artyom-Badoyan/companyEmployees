package javaCore.karenHomeWorck.homeWork2.figurePointer;

/*
 * * * * *
 * * * *
 * * *
 * *
 *

 *
 * *
 * * *
 * * * *
 * * *
 * *
 *
 */
public class Figure {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 5; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 3; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < i + 1; k++) {
                System.out.print(" ");
            }
            for (int k = 3; k > i; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
