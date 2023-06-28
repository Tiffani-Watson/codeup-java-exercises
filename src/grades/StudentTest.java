package grades;

public class StudentTest {
    public static void main(String[] args) {
        // Create Student objects
        Student student1 = new Student("John");
        Student student2 = new Student("Jane");

        // Add grades to each student
        student1.addGrade(85);
        student1.addGrade(90);
        student1.addGrade(92);

        student2.addGrade(78);
        student2.addGrade(88);
        student2.addGrade(95);

        // Print student information and grade average
        System.out.println("Student 1: " + student1.getName());
        System.out.println("Grades: " + student1.getGradeAverage());

        System.out.println("Student 2: " + student2.getName());
        System.out.println("Grades: " + student2.getGradeAverage());
    }
}
