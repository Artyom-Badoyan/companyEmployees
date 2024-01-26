package javaCore.karenHomeWorck.homework10;

import java.util.Scanner;

public class BookDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookStorage bookStorage = new BookStorage();

        boolean isRun = true;
        while (isRun) {
            System.out.println("please input 0 for exit");
            System.out.println("please input 1 add book");
            System.out.println("please input 2 for print all books");
            System.out.println("please input 3 for search book by name");

            String commands = scanner.nextLine();
            switch (commands) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    System.out.println("Please input book title");
                    String title = scanner.nextLine();
                    System.out.println("Please input book price");
                    String price = scanner.nextLine();
                    System.out.println("Please input book author");
                    String author = scanner.nextLine();
                    Book book = new Book(title, Double.parseDouble(price), author);
                    bookStorage.add(book);
                    System.out.println("Book is created!");
                    break;
                case "2":
                    bookStorage.print();
                    break;
                case "3":
                    System.out.println("Please input book name");
                    String bookName = scanner.nextLine();
                    bookStorage.searchBookName(bookName);
                    break;
                default:
                    System.out.println("Wrong commands. Please try again!");

            }
        }
    }
}
