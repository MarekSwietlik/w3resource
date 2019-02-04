import java.util.Scanner;

public class Zad37 {
//    Write a Java program to reverse a string.
//    Input Data:
//    Input a string: The quick brown fox

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wypisz stringa: ");
        char[] znaki = scanner.nextLine().toCharArray();
        System.out.print("Odwrócony string: ");
        for (int i = znaki.length - 1; i >=0 ; i--) {
            System.out.print(znaki[i]);
        }
//        System.out.print("\n");
    }
}
