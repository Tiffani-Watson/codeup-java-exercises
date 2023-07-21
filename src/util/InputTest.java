package util;

public class InputTest {

    public static void main(String[] args) {
        Input testInput = new Input();

        System.out.println("Enter a string!");
        System.out.println(testInput.getString());

        System.out.println(testInput.yesNo());

        System.out.println(testInput.getInt(5, 10));
        System.out.println(testInput.getInt(-5, 10));

        System.out.println("Enter an Integer!");
        System.out.println(testInput.getInt());

        System.out.println(testInput.getDouble(10.5, 25.999));
        System.out.println(testInput.getDouble(-10.5, 25.999));

        System.out.println("Enter a Double Number!");
        System.out.println(testInput.getDouble());

        System.out.println("Enter a Binary Number!");
        System.out.println(testInput.getBinary());

        System.out.println("Enter a Hex Number!");
        System.out.println(testInput.getHex());

    }
}
