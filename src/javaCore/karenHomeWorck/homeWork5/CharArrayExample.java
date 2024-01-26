package javaCore.karenHomeWorck.homeWork5;

public class CharArrayExample {

    public void trim(char[] charArray) {
        int startIndex = 0;
        int endIndex = charArray.length - 1;

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == ' ') {
                startIndex++;
            } else {
                break;
            }
        }

        for (int i = charArray.length - 1; i >= 0; i--) {
            if (charArray[i] == ' ') {
                endIndex--;
            } else {
                break;
            }
        }

        char[] result = new char[(endIndex - startIndex) + 1];
        int element = 0;
        for (int i = startIndex; i <= endIndex; i++) {
            result[element++] = charArray[i];
        }

        for (char elementsResult : result) {
            System.out.print(elementsResult);
        }
    }
}
