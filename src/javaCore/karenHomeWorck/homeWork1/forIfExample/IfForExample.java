package javaCore.karenHomeWorck.homeWork1.forIfExample;

public class IfForExample {

    public static void main(String[] args) {

        int a = 40;
        int b = 70;

        if (a > b) {
            System.out.println(a);
            for (int i = b; i <= a; i++) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println(b);
            for (int i = a; i <= b; i++) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println((char) a);
        System.out.println((char) b);
        
        if (a == b) {
            System.out.println("a == b");
        } else {
            System.out.println("a != b");
        }
    }
}
