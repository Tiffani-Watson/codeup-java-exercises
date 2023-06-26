import java.util.Arrays;
public class ArraysExercises {
    public static void main(String[] args) {
        // Code for the first task
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);
        // This outputs: [I@<some hexadecimal value>
        // This doesn't display the contents of the array elements that I initial expected.

        // Below is the code for the second task for problem 1
        Person[] persons = new Person[3];
        persons[0] = new Person("John");
        persons[1] = new Person("Jane");
        persons[2] = new Person("Alice");

        for (Person person : persons) {
            System.out.println(person.getName());
        }
    }
}

