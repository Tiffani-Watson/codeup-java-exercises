package grades;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name, ArrayList<Integer> grades) {
        this.name = name;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getGradeAverage() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }
}

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        // Create Student objects and add them to the map
        ArrayList<Integer> zachGrades = new ArrayList<>();
        zachGrades.add(85);
        zachGrades.add(90);
        zachGrades.add(92);
        Student student1 = new Student("Zach", zachGrades);
        students.put("zgulde", student1);

        ArrayList<Integer> ryanGrades = new ArrayList<>();
        ryanGrades.add(78);
        ryanGrades.add(88);
        ryanGrades.add(95);
        Student student2 = new Student("Ryan", ryanGrades);
        students.put("ryanorsinger", student2);

        ArrayList<Integer> jordanGrades = new ArrayList<>();
        jordanGrades.add(90);
        jordanGrades.add(92);
        jordanGrades.add(88);
        Student student3 = new Student("Jordan", jordanGrades);
        students.put("jreich5", student3);

        ArrayList<Integer> felipeGrades = new ArrayList<>();
        felipeGrades.add(80);
        felipeGrades.add(85);
        felipeGrades.add(90);
        Student student4 = new Student("Felipe", felipeGrades);
        students.put("fmendozaro", student4);

        ArrayList<Integer> luisGrades = new ArrayList<>();
        luisGrades.add(92);
        luisGrades.add(94);
        luisGrades.add(87);
        Student student5 = new Student("Luis", luisGrades);
        students.put("MontealegreLuis", student5);

        Scanner scanner = new Scanner(System.in);
        String input;
        boolean continueLoop = true;

        System.out.println("Welcome to the Grades Application!\n");
        System.out.println("Here are the GitHub usernames of our students:\n");

        for (String username : students.keySet()) {
            System.out.print("|" + username + "| ");
        }
        System.out.println("\n");

        while (continueLoop) {
            System.out.print("What student would you like to see more information on? ");
            input = scanner.nextLine();

            if (students.containsKey(input)) {
                Student student = students.get(input);
                System.out.println("\nName: " + student.getName() + " - GitHub Username: " + input);
                System.out.println("Current Average: " + student.getGradeAverage());
            } else {
                System.out.println("\nSorry, no student found with the GitHub username of \"" + input + "\".");
            }

            System.out.print("\nWould you like to see another student? (yes/no) ");
            input = scanner.nextLine();

            if (!input.equalsIgnoreCase("yes")) {
                continueLoop = false;
            }

            System.out.println();
        }

        System.out.println("Goodbye, and have a wonderful day!");
    }
}
