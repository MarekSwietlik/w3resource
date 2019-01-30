package BasicPartI;

/*Write a Java program to print the sum of two numbers.*/

import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {
        System.out.println("1 sposób");
        System.out.println("Suma 2 liczba wynosi: " + (74+36));
        System.out.println();
        System.out.println("2 sposób");

        int liczba1 = 74;
        int liczba2 = 36;

        System.out.println("Suma 2 liczb wynosi: " + (liczba1+liczba2));
        System.out.println();
        System.out.println("3 sposób");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj pierwszą liczbę: ");
        int num1 = scanner.nextInt();
        System.out.print("Podaj drugą liczbę: ");
        int num2 = scanner.nextInt();
        int sum = num1+num2;
        System.out.println("Suma 2 liczb wynosi: " + sum);


    }
}
