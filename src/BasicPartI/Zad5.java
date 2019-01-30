package BasicPartI;

//Write a Java program that takes two numbers as input and display the product of two numbers.
//Test Data:
//Input first number: 25
//Input second number: 5

import java.util.Scanner;

public class Zad5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj pierwszą liczbę: ");
        int num1 = scanner.nextInt();
        System.out.print("Podaj drugą liczbę: ");
        int num2 = scanner.nextInt();
        int result = num1*num2;
        System.out.println("Wynik: " + result);
    }

}
