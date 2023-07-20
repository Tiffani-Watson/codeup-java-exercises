package shapes;
import util.Input;

public class CircleApp {
    private static int circlesCreated = 0;

    public static void main(String[] args) {
        Input userInput = new Input();

        do {
            System.out.println("What is the radius of the circle?");
            double radius = userInput.getDouble();
            Circle newCircle = new Circle(radius);
            System.out.printf("The area is %.2f\n", newCircle.getArea());
            System.out.printf("The circumference is %.2f\n", newCircle.getCircumference());
            System.out.println("Would you like to create another circle?");
            circlesCreated++;
        }while (userInput.yesNo());
        displayNumCircles();
    }

    public static void displayNumCircles(){
        System.out.printf("\n\n%d circles have been created\n",circlesCreated);
    }
}