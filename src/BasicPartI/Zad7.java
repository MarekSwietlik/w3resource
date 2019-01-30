package BasicPartI;

//Write a Java program that takes a number as input and prints its multiplication table upto 10
//Test Data:
//Input a number: 8

import java.util.Scanner;

public class Zad7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int number = scanner.nextInt();

        for (int i = 0; i < 10; i++) {
            System.out.println(number + " x " + (i+1) + " = " + number*(i+1));

        }
    }
}
