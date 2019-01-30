package BasicPartI;

//Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
//        Test Data:
//        Input first number: 125
//        Input second number: 24

import java.util.Scanner;

public class Zad6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj pierwszą liczbę: ");
        int num1 = scanner.nextInt();
        System.out.print("Podaj drugą liczbę: ");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        int multiply = num1*num2;
        int substract = num1-num2;
        int divide = num1/num2;
        int reminder =num1%num2;

        System.out.println("Sum: " + sum);
        System.out.println("Multiply: " + multiply);
        System.out.println("Substract: " + substract);
        System.out.println("Divide: " + divide);
        System.out.println("Reminder: " + reminder);


    }
}
