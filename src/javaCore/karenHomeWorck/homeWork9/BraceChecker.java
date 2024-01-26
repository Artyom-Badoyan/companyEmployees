package javaCore.karenHomeWorck.homeWork9;

public class BraceChecker {
    private String text;

    public BraceChecker(String text) {
        this.text = text;
    }

    public void check() {
        Stack stack = new Stack();
        int lastElement;
        char element;
        for (int i = 0; i < text.length(); i++) {
            char elements = text.charAt(i);

            switch (elements) {
                case '(':
                case '{':
                case '[':
                    stack.push(elements);
                    break;
                case ')':
                    lastElement = stack.pop();
                    if (lastElement == 0) {
                        System.out.println("Error at " + i + " closed " + elements + " but not open");
                    } else {
                        element = (char) lastElement;
                        if (element != '(') {
                            System.out.println("Error at " + i + " opened " + element + " but closed " + elements);
                        }
                    }
                    break;
                case '}':
                    lastElement = stack.pop();
                    if (lastElement == 0) {
                        System.out.println("Error at " + i + " closed " + elements + " but not open");
                    } else {
                        element = (char) lastElement;
                        if (element != '{') {
                            System.out.println("Error at " + i + " opened " + element + " but closed " + elements);
                        }
                    }
                    break;
                case ']':
                    lastElement = stack.pop();
                    if (lastElement == 0) {
                        System.out.println("Error at " + i + " closed " + elements + " but not open");
                    } else {
                        element = (char) lastElement;
                        if (element != '[') {
                            System.out.println("Error at " + i + " opened " + element + " but closed " + elements);
                        }
                    }
                    break;
            }
        }

        while ((element = (char) stack.pop()) != 0) {
            System.out.println("Error: opened " + element + " but not closed");
        }
    }
}
