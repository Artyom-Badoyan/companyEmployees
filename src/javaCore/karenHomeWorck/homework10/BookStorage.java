package javaCore.karenHomeWorck.homework10;

public class BookStorage {
    private Book[] books = new Book[10];
    private int size = 0;

    public void add(Book value) {
        if (size == books.length) {
            extend();
        } else {
            books[size++] = value;
        }
    }

    private void extend() {
        Book[] temp = new Book[books.length + 10];
        for (int i = 0; i < size; i++) {
            temp[i] = books[i];
        }
        books = temp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i] + " ");
        }
    }

    public void searchBookName(String bookName) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Book book = books[i];
            if (book.getTitle().contains(bookName)) {
                found = true;
                System.out.println(books[i]);
            }
        }
        if (!found) {
            System.out.println("Book with " + bookName + " does not exists!");
        }
    }
}

