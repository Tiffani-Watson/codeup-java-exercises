import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        /**
         * Part 1 a, b, and c
         */

//        int i = 5;
//        while(i <= 15){
//            System.out.print(i + " ");
//            i++;
//        }

//        int i = 100;
//        do{
//            System.out.println("i = " + i);
//            i -= 5;
//        } while(i >= -10);

//        int i = 2;
//        do{
//            System.out.println(i);
//            i = (int)Math.pow(i,2);
//        }while(i < 1000000);

//        for(int i = 5; i <= 15; i++){
//            System.out.print(i + " ");
//        }

//        for(int i = 0; i <= 100; i += 2){
//            System.out.println(i);
//        }

//        for(int i = 100; i >= -10; i-=5){
//            System.out.println(i);
//        }

//        for(int i = 2; i < 1000000; i = (int)Math.pow(i,2)){
//            System.out.println(i);
//        }

        /**
         * Part 2 FizzBuzz
         */

//        for(int i = 1; i <= 100; i++){
//            if(i % 5 == 0){
//                if(i % 3 == 0){
//                    System.out.println("FizzBuzz");
//                } else {
//                    System.out.println("Buzz");
//                }
//            } else if(i % 3 == 0){
//                System.out.println("Fizz");
//            } else {
//                System.out.println(i);
//            }
//        }


        /**
         * part 3
         */
        String ans = "";
//
        do {
            System.out.println("What number would you like to go up to?");
            int num = Integer.parseInt(scanner.nextLine());

            displaySqAndCubeTable(num);

            System.out.println("Would you like to go again? (y/n)");
            ans = scanner.nextLine();
        } while(ans.equals("y"));

        /**
         * part 4
         */

//        do {
//            System.out.println("Enter a grade from 0 to 100");
//            int gradeNum = Integer.parseInt(scanner.nextLine());
//
//            displayLetterGrade(gradeNum);
//
//            System.out.println("Would you like to go again? (y/n)");
//            ans = scanner.nextLine();
//        }while (ans.equals("y"));

    }

    /**
     * helper function for part 3 of exercises.
     * takes in a number and displays a table from
     * 1 to that number and its square and cubed values
     * @param num
     */
    public static void displaySqAndCubeTable(int num){
        System.out.println("Here is your table! ");
        System.out.printf("%-7s| %-8s| %-6s%n", "number", "squared", "cubed");
        System.out.println("------ | ------- | -----");

        for(int i = 1; i <= num ; i++){
            int sqNum = (int)Math.pow(i, 2);
            int cubedNum = (int)Math.pow(i, 3);
            System.out.printf("%-7d| %-8d| %-6d%n", i, sqNum, cubedNum);
        }

    }

    /**
     * helper function for part 4 of the exercises. converts a
     * number grade into a letter grade with + or - for each range.
     * @param gradeNum
     */
    public static void displayLetterGrade(int gradeNum){
        String letterGrade = "";
        if(gradeNum >= 88 && gradeNum <= 100){
            letterGrade = "A";
            if(gradeNum > 97){
                letterGrade = "+" + letterGrade;
            }
            if(gradeNum < 92){
                letterGrade = "-" + letterGrade;
            }
        } else if(gradeNum >= 80 && gradeNum <= 87){
            letterGrade = "B";
            if(gradeNum > 85){
                letterGrade = "+" + letterGrade;
            }
            if(gradeNum < 83){
                letterGrade = "-" + letterGrade;
            }
        }else if(gradeNum >= 67 && gradeNum <= 79){
            letterGrade = "C";
            if(gradeNum > 77){
                letterGrade = "+" + letterGrade;
            }
            if(gradeNum < 70){
                letterGrade = "-" + letterGrade;
            }
        }else if(gradeNum >= 60 && gradeNum <= 66){
            letterGrade = "D";
            if(gradeNum > 65){
                letterGrade = "+" + letterGrade;
            }
            if(gradeNum < 62){
                letterGrade = "-" + letterGrade;
            }
        }else if(gradeNum <= 59){
            letterGrade = "F";
        }else{
            letterGrade = "(outside of grade scope)";
        }
        System.out.printf("A grade of %d yields a letter grade of %s%n", gradeNum, letterGrade);
    }
}