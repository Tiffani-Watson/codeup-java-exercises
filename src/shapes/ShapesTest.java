package shapes;

public class ShapesTest {

    public static void main(String[] args) {

        Measurable box1 = new Rectangle(5, 4);

        System.out.println("box1.getArea() = " + box1.getArea());
        System.out.println("box1.getPerimeter() = " + box1.getPerimeter());
//        System.out.println("box1.getLength() = " + box1.getLength()); // only when box1 is a quadrilateral or class that extends from such


        box1 = new Square(5);

        System.out.println("box1.getArea() = " + box1.getArea());
        System.out.println("box1.getPerimeter() = " + box1.getPerimeter());
    }
}