import java.util.Scanner;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");


        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f%n", pi);


        System.out.println("Enter an Integer: ");
        int userInt = parseInt(scanner.nextLine()); // if no int is inputted, then an exception is thrown.
        System.out.println("userInt = " + userInt);

        System.out.println("Enter 3 words: "); // if less than 3. system waits for another input. if more only first 3 are printed
        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();
        String word3 = scanner.nextLine();
        System.out.printf("%s%n%s%n%s%n", word1, word2, word3);

        System.out.print("Enter a sentence: ");
        String sentience = scanner.nextLine();
        System.out.println("sentience:\n" + sentience);

        System.out.println("Calculate area of room. Enter Length followed by the width");
        int len = parseInt(scanner.nextLine());
        int width = parseInt(scanner.nextLine());
        int height = parseInt(scanner.nextLine());
        int area = (int)calcArea(len, width);
        int perimeter = (int)calcPerimeter(len, width);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);

        int volume = (int)calcVol(len, width, height);
        System.out.println("volume = " + volume);

    }

    public static double calcArea(double l, double w){
        return l*w;
    }

    public static double calcPerimeter(double l, double w){
        return ((l * 2) + (w * 2));
    }

    public static double calcVol(double l, double w, double h){
        return l*w*h;
    }

}