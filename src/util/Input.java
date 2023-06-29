package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
    }

    public String getString(){
        System.out.println("Type a String...");
        return this.scanner.nextLine();
    }

    public Boolean yesNo(){
        System.out.println("Yes or No?");

        String userInput = this.scanner.nextLine();

        userInput = userInput.toLowerCase();

        switch(userInput) {
            case ("no"):
                return false;
            case ("n"):
                return false;
            case ("nope"):
                return false;
            case ("denied"):
                return false;
            case ("uh uh"):
                return false;
            case ("yes"):
                return true;
            case ("y"):
                return true;
            case ("yep"):
                return true;
            case ("sure"):
                return true;
            case ("si"):
                return true;
            case ("uh huh"):
                return true;
            case ("approved"):
                return true;
            case ("maybe"):
                System.out.println("Ain't you cute?");
                return yesNo();
            default:
                System.out.println("Input is unacceptable");
                return yesNo();
        }
    }

    public int getInt(){
        System.out.println("Please enter an Int");
        return this.scanner.nextInt();
    }

    public int getInt(int min, int max){
        System.out.println("Please enter an a number within the range");
        int userInput = this.scanner.nextInt();
        if(userInput >= min && userInput <= max ){
            return userInput;
        } else {
            return getInt(min, max);
        }
    }


    public double getDouble(){
        System.out.println("Please enter an Double");
        return this.scanner.nextDouble();
    }

    public double getDouble(int min, int max){
        System.out.println("Please enter an a number within the range");
        double userInput = this.scanner.nextDouble();
        if(userInput >= min && userInput <= max ){
            return userInput;
        } else {
            return getDouble(min, max);
        }
    }



}