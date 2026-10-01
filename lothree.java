import java.util.Scanner;

public class lothree {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double numX = keyboard.nextDouble();

        System.out.print("Enter second number: ");
        double numY = keyboard.nextDouble();

        System.out.print("Enter third number: ");
        double numZ = keyboard.nextDouble();

        double biggest = numX;
        if (numY > biggest) {
            biggest = numY;
        }
        if (numZ > biggest) {
            biggest = numZ;
        }

        System.out.println("Largest number = " + biggest);

        keyboard.close();
    }
}