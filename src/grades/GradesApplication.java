package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name, int[] grades) {
        this.name = name;
        this.grades = new ArrayList<>();
        for (int grade : grades) {
            this.grades.add(grade);
        }
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
