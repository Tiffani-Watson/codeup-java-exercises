import java.util.Random;
import java.util.Scanner;

/**
 * Game Development 101
 *
 *      * Welcome to the world of game development!
 *
 *      * You are going to build a high-low guessing game. Create a class named HighLow inside of src.
 *
 *      * The specs for the game are:
 *
 *          - Game picks a random number between 1 and 100.
 *          - Prompts user to guess the number.
 *          - All user inputs are validated.
 *          - If user's guess is less than the number, it outputs "HIGHER".
 *          - If user's guess is more than the number, it outputs "LOWER".
 *          - If a user guesses the number, the game should declare "GOOD GUESS!"
 *
 *      * Bonus
 *
 *          - Keep track of how many guesses a user makes.
 *          - Set an upper limit on the number of guesses.
 */

public class HighLow {
    /**
     * Global Variables
     */
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();
    public static int numberToGuess = 0;
    public static int userGuess = 0;
    public static int maxGuesses = 10;
    public static int currentGuess = 1;


    public static void main(String[] args) {
        boolean keepGuessing = false;
        boolean playGame = false;

        do { // play again loop.
            setNumberToGuess(); // get and set new random number for each game.
            currentGuess = 1; // reset guess for each game.
            do { // main game loop
                keepGuessing = runTheGame();
                currentGuess++;
            } while (keepGuessing);

            System.out.println("Would you like to play again?[y/n]");
            String userInputPlayAgain = scanner.nextLine();
            playGame = userInputPlayAgain.equalsIgnoreCase("y");
        }while(playGame);
    }

    /**
     * after getting an input in range from the user, check the guess. if user
     * guessed the number or ran out of attempts return false to stop the game.
     * @return
     */
    public static boolean runTheGame(){
        boolean keepRunning = false;
        boolean inputInRange = false;

        do {
            inputInRange = getAndCheckUserInput();
        } while (!inputInRange);

        String resp = guessResponse(userGuess);
        System.out.println(resp);

        if(resp.startsWith("G") || (currentGuess == maxGuesses)){
            keepRunning = false;
            if(!resp.startsWith("G")){
                System.out.println("Ran out of attempts!");
            }
        } else {
            keepRunning = true;
        }
        return keepRunning;
    }

    /**
     * ask user for a number from 1 to 100 and checks that it is a number
     * and is within the range. return true if it is else false.
     * @return
     */
    public static boolean getAndCheckUserInput(){
        boolean inputInRange = false;
        userGuess = 0;
        System.out.printf("Guess a number between 1 and 100! Guess %d/%d%n", currentGuess, maxGuesses);
        String guess = scanner.nextLine();
        if (checkIfInputIsAnInt(guess) && checkIfInputIsInRange(Integer.parseInt(guess))) {
            inputInRange = true;
            userGuess = Integer.parseInt(guess);
        } else {
            System.out.println("Invalid Guess!");
        }
        return inputInRange;
    }

    /**
     * sets the number to guess to a random number that is
     * generated between 1 and 100
     */
    public static void setNumberToGuess(){
        numberToGuess = getRandomNum();
    }

    /**
     * generate a random number from 1 to 100.
     * @return
     */
    public static int getRandomNum(){
        return random.nextInt(1, 101);
    }

    /**
     * checks if the users input is a valid integer or not. throws
     * an exception if it is not.
     * @param input
     * @return
     */
    public static boolean checkIfInputIsAnInt(String input){
        boolean isValidInt = false;

        try{
            Integer.parseInt(input);
            isValidInt = true;
        }catch (Exception e){
            System.out.println(e);
        }

        return isValidInt;
    }

    /**
     * checks if the users guess is between 1 and 100.
     * @param guess
     * @return
     */
    public static boolean checkIfInputIsInRange(int guess){
        return (guess >= 1  && guess <= 100);
    }

    /**
     * return the correct response depending on user guess compared
     * to the random number. (= GG), (> LOWER), (< HIGHER)
     * @param guess
     * @return
     */
    public static String guessResponse(int guess){
        String resp = "";
        if(guess == numberToGuess){
            resp = "GOOD GUESS!";
        } else {
            if(guess < numberToGuess){
                resp = "HIGHER";
            } else {
                resp = "LOWER";
            }
        }
        return resp;
    }
}
