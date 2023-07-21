import java.util.Random;
import java.util.Scanner;

public class MethodsExercises {
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {

        // part 1
        System.out.println("Addition(5,10) = " + Addition(5, 10));
        System.out.println("Subtraction(10, 5) = " + Subtraction(10, 5));
        System.out.println("Multiplication(5, 5) = " + Multiplication(5, 5));
        System.out.println("Multiplication(25,5) = " + Multiplication(25, 5));
        System.out.println("Multiplication(-25,5) = " + Multiplication(-25, 5));
        System.out.println("Multiplication(25,-5) = " + Multiplication(25, -5));
        System.out.println("Division(25, 5) = " + Division(25, 5));
        System.out.println("Modulus(5, 5) = " + Modulus(5, 5));


        // part 2
        int userInput = getInteger(1, 10);
        System.out.println("userInput = " + userInput);

        // part 3
        int numToFactor = 0;
        boolean continueFactoring = false;
        do {
            do {
                System.out.println("Enter a number to factor between 1 and 20");
                numToFactor = Integer.parseInt(scanner.nextLine());
            } while (numToFactor < 1 || numToFactor > 20); // max input is 20 with an output of 2432902008176640000, 21 we get our first overflow.

            for(int i = 1; i <= numToFactor; i++) {
                long factoredNumber = factorial(i);
                String factorStr = factorialString(factoredNumber, i);
                System.out.println(factorStr);
            }
            System.out.println("Would you like to factor another number?[y/n]");
            String userAnswer = scanner.nextLine();
            continueFactoring = userAnswer.equalsIgnoreCase("y");
        } while(continueFactoring);

        // part 4
        boolean tryAgain = false;
        do{
            diceRollSim();
            System.out.println("Would you like to try new dice?[y/n]");
            String input = scanner.nextLine();
            tryAgain = input.equalsIgnoreCase("y");
        }while(tryAgain);

    }

    /**
     * methods for part 1
     */

    /**
     * returns the sum of (a) and (b)
     * @param a
     * @param b
     * @return
     */
    public static int Addition(int a, int b){
        return a + b;
    }

    /**
     * returns an integer that is (b) taken away from (a)
     * @param a
     * @param b
     * @return
     */
    public static int Subtraction(int a, int b){
        return a - b;
    }

    /**
     * returns the product of 2 integers.
     * @param a
     * @param b
     * @return
     */
    public static int Multiplication(int a, int b){
        return a * b;
    }
//    public static int Multiplication(int a, int b){
//        int result = 0;
//        for(int i = 0; i < b; i++){
//            result += a;
//        }
//        return result;
//    }
//    public static int Multiplication(int a, int b){
//        if(b > 0){
//            if(--b != 0){
//                a += Multiplication(a, b);
//            }
//        } else if(b < 0 && a > 0){
//            if(++b != 0){
//                a += Multiplication(a, b);
//            }
//        }
//
//        return a;
//    }

    /**
     * returns the integer of (a)/(b) so long as (b) is not zero
     * @param a
     * @param b
     * @return
     */
    public static int Division(int a, int b){
        int result = 0;
        try{
            result = a / b;
        } catch (Exception e){
            System.out.println("Can not divide by Zero (0) \ne = " + e);
        }
        return result;
    }

    /**
     * Modulus taks in 2 integers and returns the remainder of first number
     * divided by second number so long a second number is not zero
     * @param a
     * @param b
     * @return
     */
    public static int Modulus(int a, int b){
        int result = 0;
        try{
            result = a % b;
        } catch (Exception e){
            System.out.println("Can not divide by Zero (0) \ne = " + e);
        }
        return result;
    }

    /**
     * method for part 2
     */

    /**
     * getInteger recursively asks the user for an input
     * so long as the input is not in the range.
     * @param min
     * @param max
     * @return
     */
    public static int getInteger(int min, int max){
        System.out.printf("Enter a number between %d and %d%n", min, max);
        int userInput = Integer.parseInt(scanner.nextLine());

        if(userInput < min || userInput > max){
            userInput = getInteger(min, max);
        }

        return userInput;
    }

    /**
     * methods for part 3
     */

    /**
     * recursively gets the factorial of a number.
     * @param num
     * @return
     */
    public static long factorial(int num){
        long fact = num;
        if(num == 1){
            return 1;
        } else {
            fact = fact * factorial(--num);
        }
        return fact;
    }

    /**
     * returns a string of the factorial number amd its result
     * @param ans
     * @param num
     * @return
     */
    public static String factorialString(long ans, int num){
        String factStr = String.format("%d! = ", num);
        for(int i = 1; i <= num; i++){
            if(i == num){
                String appendStr = String.format("%d = %d", i, ans);
                factStr += appendStr;
            } else {
                String appendStr = String.format("%d x ", i);
                factStr += appendStr;
            }
        }

        return factStr;
    }


    /**
     * methods for part 4
     */

    /**
     * asks user for num sides of dice. Get and display dice rolls
     * so long as user wants to keep rolling the dice.
     */
    public static void diceRollSim(){
        boolean rollDice = false;
        System.out.println("Enter the number of sides for your dice.");
        int nNumDiceSides = Integer.parseInt(scanner.nextLine());
        do{
            rollDice = askToRollDice("Would you like to roll the dice now?[y,n]");
        } while(!rollDice);

        do{
            rollDice(nNumDiceSides);
            rollDice = askToRollDice("Would you like to roll the dice now?[y,n]");
        } while (rollDice);

    }

    /**
     * used to get and display both dice rolls.
     * @param sides
     */
    public static void rollDice(int sides){
        int firstDice = diceRoll(sides + 1);
        int secondDice = diceRoll(sides + 1);

        System.out.println("firstDice = " + firstDice);
        System.out.println("secondDice = " + secondDice);

    }

    /**
     * gets a random number from 1 to the number of sides on the dice.
     * @param maxNum
     * @return
     */
    public static int diceRoll(int maxNum){
        return random.nextInt(1, maxNum);
    }

    /**
     * helper method used to get users response for rolling the dice.
     * @param question
     * @return
     */
    public static boolean askToRollDice(String question){
        System.out.println(question);
        String userInputForDiceRoll = scanner.nextLine();
        return userInputForDiceRoll.equalsIgnoreCase("y");
    }
}
