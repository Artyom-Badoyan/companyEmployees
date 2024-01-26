package javaCore.karenHomeWorck.homeWork3;

public class CharArrayExample {

    public static void main(String[] args) {

        char[] charArray = {' ', 'j', ' ', 'a', 'v', 'a', 'l', 'o', 'v', 'e', ' ', ' '};
        char c = 'o';

        int count = 0;
        for (char charElement : charArray) {
            if (charElement == c) {
                count++;
            }
        }
        System.out.println("Count of o: " + count);


        System.out.println(charArray[charArray.length - 2] == 'l' && charArray[charArray.length - 1] == 'y');


        System.out.println(charArray[charArray.length / 2] + " " + charArray[(charArray.length / 2) + 1]);


        for (char charElement : charArray) {
            if (charElement != ' ') {
                System.out.print(charElement + " ");
            }
        }
    }
}
