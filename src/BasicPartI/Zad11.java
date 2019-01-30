package BasicPartI;

//Write a Java program to print the area and perimeter of a circle.
//        Test Data:
//        Radius = 7.5
//        Expected Output
//        Perimeter is = 47.12388980384689
//        Area is = 176.71458676442586

public class Zad11 {
    public static void main(String[] args) {
        final double radius = 7.5;

        double parimeter = 2* Math.PI*radius;
        double area = Math.PI*radius*radius;

        System.out.println("Obwód koła wynosi: " + parimeter);
        System.out.println("Pole koła wynosi: " + area);
    }
}
