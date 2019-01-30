package BasicPartI;

/*Write a Java program to divide two numbers and print on the screen.*/

import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {
        System.out.println("1 sposób");
        System.out.println("Wynik dzielenia 2 liczb wynosi: " + (50/3));
        System.out.println();
        System.out.println("2 sposób");

        int liczba1 = 50;
        int liczba2 = 3;

        System.out.println("Wynik dzielenia 2 liczb wynosi: " + (liczba1/liczba2));
        System.out.println();
        System.out.println("3 sposób");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj pierwszą liczbę: ");
        int num1 = scanner.nextInt();
        System.out.print("Podaj drugą liczbę: ");
        int num2 = scanner.nextInt();
        int result = num1/num2;
        System.out.println("Wynik dzielenia 2 liczb wynosi: " + result);
    }
}
