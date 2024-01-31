package javaCore.karenHomeWorck.homeWork17.enumExample;

import java.util.Scanner;

public class UserDem {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        User user = new User();
        user.name = "Poxos";
        user.surname = "Poxosyan";

        System.out.println("Please choose language from:");
        Language[] values = Language.values();
        for (Language value : values) {
            System.out.println(value);
        }
        String langStr = scanner.nextLine();
        try {
            user.language = Language.valueOf(langStr);
            System.out.println(user.language);
            System.out.println("You choose " + user.language.getCountry() + " country");
            System.out.println("Ordinal " + user.language.ordinal());
        } catch (IllegalArgumentException e) {
            System.out.println("Please choose correct language!");
        }
    }
}
