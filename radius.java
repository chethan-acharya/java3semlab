import java.util.Scanner;

public class radius {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter radius of the circle: ");
        double circleRadius = keyboard.nextDouble();

        double circleArea = Math.PI * circleRadius * circleRadius;

        System.out.printf("Area of the circle = %.2f%n", circleArea);

        keyboard.close();
    }
}