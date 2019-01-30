package BasicPartI;

/*Write a Java program to print 'Hello' on screen and then print your name on a separate line.*/

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("Marek");

        String Hello = "Hello";
        String imie = "Marek";

        System.out.println(Hello + "\n" + imie);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj imie: ");
        String firstname = scanner.next();
        System.out.print("Podaj nazwisko: ");
        String lastname = scanner.next();
        System.out.println();
        System.out.println("Hello " + firstname + " " + lastname);

    }
}
