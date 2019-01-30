package BasicPartI;

//Write a Java program that takes three numbers as input to calculate and print the average of the numbers.

import java.util.Scanner;

public class Zad12 {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Podj 1 liczbę: ");
        int num1 = scanner.nextInt();
        System.out.print("Podj 2 liczbę: ");
        int num2 = scanner.nextInt();
        System.out.print("Podj 3 liczbę: ");
        int num3 = scanner.nextInt();

        int average = (num1 + num2 + num3)/3;
        System.out.println("Srednia 3 liczb wynosi: " + average);*/

        double num = 0;
        double x = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number(n) you want to calculate the average: ");
        int n = sc.nextInt();
        while (x <= n) {
            System.out.println("Input number " + "("+ (int) x +")" + ":");
            num += sc.nextInt();
            x += 1;
        }
        double avgn = (num / n);

        System.out.println("Average:" + avgn);
    }
}

