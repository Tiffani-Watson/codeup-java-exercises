package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        System.out.println("Type a String...");
        return this.scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.println("Yes or No?");

        String userInput = this.scanner.nextLine();

        userInput = userInput.toLowerCase();

        switch (userInput) {
            case "no":
            case "n":
            case "nope":
            case "denied":
            case "uh uh":
                return false;
            case "yes":
            case "y":
            case "yep":
            case "sure":
            case "si":
            case "uh huh":
            case "approved":
                return true;
            case "maybe":
                System.out.println("Ain't you cute?");
                return yesNo();
            default:
                System.out.println("Input is unacceptable");
                return yesNo();
        }
    }

    public int getInt() {
        try {
            String input = getString();
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter an integer.");
            return getInt();
        }
    }

    public int getInt(int min, int max) {
        System.out.println("Please enter a number within the range");
        int userInput = getInt();
        if (userInput >= min && userInput <= max) {
            return userInput;
        } else {
            System.out.println("Number is out of range.");
            return getInt(min, max);
        }
    }

    public double getDouble() {
        try {
            String input = getString();
            return Double.parseDouble(input);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a double.");
            return getDouble();
        }
    }

    public double getDouble(double min, double max) {
        System.out.println("Please enter a number within the range");
        double userInput = getDouble();
        if (userInput >= min && userInput <= max) {
            return userInput;
        } else {
            System.out.println("Number is out of range.");
            return getDouble(min, max);
        }
    }

}
