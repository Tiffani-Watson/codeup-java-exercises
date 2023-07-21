package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return this.scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.println("Enter Yes/Y or No/N");
        String yNStr = this.scanner.nextLine();
        boolean yNBool = false;
        if (yNStr.equalsIgnoreCase("yes") || yNStr.equalsIgnoreCase("y")) {
            yNBool = true;
        }
        return yNBool;
    }

    public int getInt(int min, int max) {
        int userInt = 0;
        do {
            System.out.printf("Enter a number between %d and %d\n", min, max);
            userInt = getInt();
        } while (userInt > max || userInt < min);

        return userInt;
    }

    public int getInt() {
        int val = -1;
        String s = getString();
        try {
            val = Integer.valueOf(s);
        } catch (NumberFormatException e) {
            System.err.println("Input is not a valid integer!\nTry Again!\n" + e);
            val = getInt();
        }
        return val;
    }

    public double getDouble(double min, double max) {
        double userDouble = 0;
        do {
            System.out.printf("Enter a number between %f and %f\n", min, max);
            userDouble = getDouble();
        } while (userDouble > max || userDouble < min);

        return userDouble;
    }

    public double getDouble() {
        double val = -1;
        String s = getString();
        try {
            val = Double.valueOf(s);
        } catch (NumberFormatException e) {
            System.err.println("Input is not a valid double number!\nTry Again!\n" + e);
            val = getDouble();
        }
        return val;
    }

    public double getBinary() {
        double val = -1;
        String s = getString();
        try {
            val = Integer.valueOf(s, 2);
        } catch (NumberFormatException e) {
            System.err.println("Nope not a valid Binary Input! Only 0's and 1's can be used.\n" + e);
        }
        return val;
    }

    public double getHex() {
        double val = -1;
        String s = getString();
        try {
            val = Integer.valueOf(s, 16);
        } catch (NumberFormatException e) {
            System.err.println("Nope, not a valid Hexadecimal Input. Only 0-9 and A-F.\n" + e);
        }
        return val;
    }
}