import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        /**
         * part 2 of String Exercises
         *
         * Bob is a lackadaisical teenager. In conversation, his responses are very limited.
         *
         * Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
         * He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
         * He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
         * He answers 'Whatever.' to anything else.
         *
         * Write the Java code necessary so that a user of your command line application can have a conversation with Bob.
         */

        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        String userInput = "";
        boolean keepGoing = true;

        System.out.println("Talk with Bob, if you want to quit, just input q, or quit");
        do {
            System.out.println("You:");
            userInput = scanner.nextLine();
            getBobsResponse(userInput);
            if(userInput.equalsIgnoreCase("q") || userInput.equalsIgnoreCase("quit")){
                keepGoing = false;
            }
        } while(keepGoing);
    }

    public static void getBobsResponse(String input){
        String resp = "";
        if(input.equals("")){
            resp = "Fine. Be that way!";
        }else if(input.endsWith("?")){
            resp = "Sure.";
        } else if(input.endsWith("!")){
            resp = "Whoa, chill out!";
        } else {
            resp = "Whatever.";
        }
        System.out.println(resp);
    }
}