public class HelloWorld {
    public static void main(String[] args){
//        System.out.println("Hello, World!");
//
//        // Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
//        int myFavoriteNumber = 24;
//        System.out.println("myFavoriteNumber = " + myFavoriteNumber);
//
//        //Create a String variable named myString and assign a string value to it, then print the variable out to the console.
//        String myString = "I love Codeup!";
//        System.out.println(myString);

        //Change your code to assign a character value to myString. What do you notice? (myString can not be assigned a char value and can not contain multiple char charters to make a string.)
        //myString = 'j';

        //Change your code to assign the value 3.14159 to myString. What happens? (Cannot )
//        myString = 3.14159;

        //Declare a long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?
        //I cannot run the code because myNumber has not been initialized. get a warning when it is run
//        long myNumber;
//        System.out.println("myNumber = " + myNumber);

        //Change your code to assign the value 3.14 to myNumber. What do you notice?(I get an error. Long does not contain decimal point precision. inorder to fix I have to cast 3.14 to a (long) or change myNumber to a float or double.)
//        long myNumber = 3.14;

        //Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
//        long myNumber = 123L;
//        System.out.println("myNumber = " + myNumber);
//
//
//        //Change your code to assign the value 123 to myNumber.
//        myNumber = 123;
//        System.out.println("myNumber = " + myNumber);

        //Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?
        //You can always cast higher but never lower. float and doubles are higher precision then long. while in is a lower precision then long.

        //Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this? (either make the variable into a double or place an f after the number.)
//        float myNumber = 3.14f;


        //Copy and paste the following code blocks one at a time and execute them
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);
        //What is the difference between the above code blocks? Explain why the code outputs what it does.
        //first one increments x after the print statement and the second one increments before the print.


        //Try to create a variable named class. What happens? (the program requires me to place {} after the class variable name.)
//        class myClass{
//
//        }


        //Object is the most generic type in Java. You can assign any value to a variable of type Object. What do you think will happen when the following code is run?
        // no warning right away but you can not cast an object to an int. will get an error
        //
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;

        //Copy and paste the code above and then run it. Does the result match with your expectation?
        //
        //How is the above example different from the code block below?
        // above we can turn the variable with a string of "three" into an object. but below we are tyring to cast a String into an int. can not be done.
        //
//        int three = (int) "three";

        //What are the two different types of errors we are observing?
        //string can not be cast to int from a string and the object of String can not be cast into an object of Integer.

        //Rewrite the following expressions using the relevant shorthand assignment operators:
        //
        //
        //int x = 4;
        //x = x + 5;
//        int x = 4;
//        x += 5;
//        System.out.println("x = " + x);

        //int x = 3;
        //int y = 4;
        //y = y * x;
//        int x = 3;
//        int y = 4;
//        y *= x;
//        System.out.println("y = " + y);


        //int x = 10;
        //int y = 2;
        //x = x / y;
        //y = y - x;
//        int x = 10;
//        int y = 2;
//        x /= y;
//        y -= x;
//
//        System.out.println("x = " + x);
//        System.out.println("y = " + y);


        //What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold? What happens if you increment a numeric variable past the type's capacity?
        // if you assign value greater than what can be held, you get an error that asks you to cast you value to that type you are assigning. when you do that, it will roll the value over to stay within the size of the type your variable is.
        //when you reach the max and increase by one you get to the lowest value available. value rolls over.
        //Hint: Integer.MAX_VALUE is a class constant (we'll learn more about these later) that holds the maximum value for the int type.
//        byte myX = (byte) 257;
//        System.out.println("myX = " + myX);
        int myInt = Integer.MAX_VALUE;
        myInt++;
        System.out.println("myInt = " + myInt);

    }
}